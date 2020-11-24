package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterLogEventsResponse extends js.Object {
  
  /**
    * The matched events.
    */
  var events: js.UndefOr[FilteredLogEvents] = js.native
  
  /**
    * The token to use when requesting the next set of items. The token expires after 24 hours.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    *  IMPORTANT Starting on May 15, 2020, this parameter will be deprecated. This parameter will be an empty list after the deprecation occurs. Indicates which log streams have been searched and whether each has been searched completely.
    */
  var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.native
}
object FilterLogEventsResponse {
  
  @scala.inline
  def apply(): FilterLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterLogEventsResponse]
  }
  
  @scala.inline
  implicit class FilterLogEventsResponseOps[Self <: FilterLogEventsResponse] (val x: Self) extends AnyVal {
    
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
    def setEventsVarargs(value: FilteredLogEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: FilteredLogEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSearchedLogStreamsVarargs(value: SearchedLogStream*): Self = this.set("searchedLogStreams", js.Array(value :_*))
    
    @scala.inline
    def setSearchedLogStreams(value: SearchedLogStreams): Self = this.set("searchedLogStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchedLogStreams: Self = this.set("searchedLogStreams", js.undefined)
  }
}
