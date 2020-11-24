package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableSolutionStacksResultMessage extends js.Object {
  
  /**
    *  A list of available solution stacks and their SolutionStackDescription. 
    */
  var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.native
  
  /**
    * A list of available solution stacks.
    */
  var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.native
}
object ListAvailableSolutionStacksResultMessage {
  
  @scala.inline
  def apply(): ListAvailableSolutionStacksResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableSolutionStacksResultMessage]
  }
  
  @scala.inline
  implicit class ListAvailableSolutionStacksResultMessageOps[Self <: ListAvailableSolutionStacksResultMessage] (val x: Self) extends AnyVal {
    
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
    def setSolutionStackDetailsVarargs(value: SolutionStackDescription*): Self = this.set("SolutionStackDetails", js.Array(value :_*))
    
    @scala.inline
    def setSolutionStackDetails(value: AvailableSolutionStackDetailsList): Self = this.set("SolutionStackDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackDetails: Self = this.set("SolutionStackDetails", js.undefined)
    
    @scala.inline
    def setSolutionStacksVarargs(value: SolutionStackName*): Self = this.set("SolutionStacks", js.Array(value :_*))
    
    @scala.inline
    def setSolutionStacks(value: AvailableSolutionStackNamesList): Self = this.set("SolutionStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStacks: Self = this.set("SolutionStacks", js.undefined)
  }
}
