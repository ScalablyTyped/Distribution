package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListArchivesRequest extends js.Object {
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  
  /**
    * A name prefix to filter the archives returned. Only archives with name that match the prefix are returned.
    */
  var NamePrefix: js.UndefOr[ArchiveName] = js.native
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.native
}
object ListArchivesRequest {
  
  @scala.inline
  def apply(): ListArchivesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArchivesRequest]
  }
  
  @scala.inline
  implicit class ListArchivesRequestOps[Self <: ListArchivesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitMax100): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: ArchiveName): Self = this.set("NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("NamePrefix", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setState(value: ArchiveState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
