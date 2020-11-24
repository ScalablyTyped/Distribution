package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastCrawlInfo extends js.Object {
  
  /**
    * If an error occurred, the error information about the last crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The log group for the last crawl.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.glueMod.LogGroup] = js.native
  
  /**
    * The log stream for the last crawl.
    */
  var LogStream: js.UndefOr[typings.awsSdk.glueMod.LogStream] = js.native
  
  /**
    * The prefix for a message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typings.awsSdk.glueMod.MessagePrefix] = js.native
  
  /**
    * The time at which the crawl started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Status of the last crawl.
    */
  var Status: js.UndefOr[LastCrawlStatus] = js.native
}
object LastCrawlInfo {
  
  @scala.inline
  def apply(): LastCrawlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastCrawlInfo]
  }
  
  @scala.inline
  implicit class LastCrawlInfoOps[Self <: LastCrawlInfo] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: DescriptionString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setLogGroup(value: LogGroup): Self = this.set("LogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogGroup: Self = this.set("LogGroup", js.undefined)
    
    @scala.inline
    def setLogStream(value: LogStream): Self = this.set("LogStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStream: Self = this.set("LogStream", js.undefined)
    
    @scala.inline
    def setMessagePrefix(value: MessagePrefix): Self = this.set("MessagePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessagePrefix: Self = this.set("MessagePrefix", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatus(value: LastCrawlStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
