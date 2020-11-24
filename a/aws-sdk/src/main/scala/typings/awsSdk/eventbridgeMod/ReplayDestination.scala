package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplayDestination extends js.Object {
  
  /**
    * The ARN of the event bus to replay event to. You can replay events only to the event bus specified to create the archive.
    */
  var Arn: typings.awsSdk.eventbridgeMod.Arn = js.native
  
  /**
    * A list of ARNs for rules to replay events to.
    */
  var FilterArns: js.UndefOr[ReplayDestinationFilters] = js.native
}
object ReplayDestination {
  
  @scala.inline
  def apply(Arn: Arn): ReplayDestination = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplayDestination]
  }
  
  @scala.inline
  implicit class ReplayDestinationOps[Self <: ReplayDestination] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArnsVarargs(value: Arn*): Self = this.set("FilterArns", js.Array(value :_*))
    
    @scala.inline
    def setFilterArns(value: ReplayDestinationFilters): Self = this.set("FilterArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterArns: Self = this.set("FilterArns", js.undefined)
  }
}
