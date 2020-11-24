package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchedLogStream extends js.Object {
  
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  
  /**
    * Indicates whether all the events in this log stream were searched.
    */
  var searchedCompletely: js.UndefOr[LogStreamSearchedCompletely] = js.native
}
object SearchedLogStream {
  
  @scala.inline
  def apply(): SearchedLogStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchedLogStream]
  }
  
  @scala.inline
  implicit class SearchedLogStreamOps[Self <: SearchedLogStream] (val x: Self) extends AnyVal {
    
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
    def setLogStreamName(value: LogStreamName): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreamName: Self = this.set("logStreamName", js.undefined)
    
    @scala.inline
    def setSearchedCompletely(value: LogStreamSearchedCompletely): Self = this.set("searchedCompletely", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchedCompletely: Self = this.set("searchedCompletely", js.undefined)
  }
}
