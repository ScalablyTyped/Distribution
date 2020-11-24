package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseLogEventsRequest extends js.Object {
  
  /**
    * The end of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: js.UndefOr[IsoDate] = js.native
  
  /**
    * The name of the log stream. Use the get relational database log streams operation to get a list of available log streams.
    */
  var logStreamName: String = js.native
  
  /**
    * The token to advance to the next or previous page of results from your request. To get a page token, perform an initial GetRelationalDatabaseLogEvents request. If your results are paginated, the response will return a next forward token and/or next backward token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The name of your database for which to get log events.
    */
  var relationalDatabaseName: ResourceName = js.native
  
  /**
    * Parameter to specify if the log should start from head or tail. If true is specified, the log event starts from the head of the log. If false is specified, the log event starts from the tail of the log.  For PostgreSQL, the default value of false is the only option available. 
    */
  var startFromHead: js.UndefOr[Boolean] = js.native
  
  /**
    * The start of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: js.UndefOr[IsoDate] = js.native
}
object GetRelationalDatabaseLogEventsRequest {
  
  @scala.inline
  def apply(logStreamName: String, relationalDatabaseName: ResourceName): GetRelationalDatabaseLogEventsRequest = {
    val __obj = js.Dynamic.literal(logStreamName = logStreamName.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsRequest]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseLogEventsRequestOps[Self <: GetRelationalDatabaseLogEventsRequest] (val x: Self) extends AnyVal {
    
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
    def setLogStreamName(value: String): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: IsoDate): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setStartFromHead(value: Boolean): Self = this.set("startFromHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartFromHead: Self = this.set("startFromHead", js.undefined)
    
    @scala.inline
    def setStartTime(value: IsoDate): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
