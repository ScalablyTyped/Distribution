package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerLogRequest extends js.Object {
  
  /**
    * The name of the container that is either running or previously ran on the container service for which to return a log.
    */
  var containerName: String = js.native
  
  /**
    * The end of the time interval for which to get log data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify 1538427600 as the end time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var endTime: js.UndefOr[IsoDate] = js.native
  
  /**
    * The pattern to use to filter the returned log events to a specific term. The following are a few examples of filter patterns that you can specify:   To return all log events, specify a filter pattern of "".   To exclude log events that contain the ERROR term, and return all other log events, specify a filter pattern of "-ERROR".   To return log events that contain the ERROR term, specify a filter pattern of "ERROR".   To return log events that contain both the ERROR and Exception terms, specify a filter pattern of "ERROR Exception".   To return log events that contain the ERROR or the Exception term, specify a filter pattern of "?ERROR ?Exception".  
    */
  var filterPattern: js.UndefOr[String] = js.native
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetContainerLog request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the container service for which to get a container log.
    */
  var serviceName: ContainerServiceName = js.native
  
  /**
    * The start of the time interval for which to get log data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify 1538424000 as the start time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var startTime: js.UndefOr[IsoDate] = js.native
}
object GetContainerLogRequest {
  
  @scala.inline
  def apply(containerName: String, serviceName: ContainerServiceName): GetContainerLogRequest = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerLogRequest]
  }
  
  @scala.inline
  implicit class GetContainerLogRequestOps[Self <: GetContainerLogRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: ContainerServiceName): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: IsoDate): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFilterPattern(value: String): Self = this.set("filterPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPattern: Self = this.set("filterPattern", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: IsoDate): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
