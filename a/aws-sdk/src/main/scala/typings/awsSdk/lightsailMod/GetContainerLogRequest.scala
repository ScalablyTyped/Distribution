package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerLogRequest extends StObject {
  
  /**
    * The name of the container that is either running or previously ran on the container service for which to return a log.
    */
  var containerName: String
  
  /**
    * The end of the time interval for which to get log data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify 1538427600 as the end time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var endTime: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * The pattern to use to filter the returned log events to a specific term. The following are a few examples of filter patterns that you can specify:   To return all log events, specify a filter pattern of "".   To exclude log events that contain the ERROR term, and return all other log events, specify a filter pattern of "-ERROR".   To return log events that contain the ERROR term, specify a filter pattern of "ERROR".   To return log events that contain both the ERROR and Exception terms, specify a filter pattern of "ERROR Exception".   To return log events that contain the ERROR or the Exception term, specify a filter pattern of "?ERROR ?Exception".  
    */
  var filterPattern: js.UndefOr[String] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetContainerLog request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container service for which to get a container log.
    */
  var serviceName: ContainerServiceName
  
  /**
    * The start of the time interval for which to get log data. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify 1538424000 as the start time.   You can convert a human-friendly time to Unix time format using a converter like Epoch converter.
    */
  var startTime: js.UndefOr[IsoDate] = js.undefined
}
object GetContainerLogRequest {
  
  inline def apply(containerName: String, serviceName: ContainerServiceName): GetContainerLogRequest = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerLogRequest]
  }
  
  extension [Self <: GetContainerLogRequest](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: IsoDate): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFilterPattern(value: String): Self = StObject.set(x, "filterPattern", value.asInstanceOf[js.Any])
    
    inline def setFilterPatternUndefined: Self = StObject.set(x, "filterPattern", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: IsoDate): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
