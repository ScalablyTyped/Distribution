package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAvailableSolutionStacksResultMessage extends StObject {
  
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
  implicit class ListAvailableSolutionStacksResultMessageMutableBuilder[Self <: ListAvailableSolutionStacksResultMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSolutionStackDetails(value: AvailableSolutionStackDetailsList): Self = StObject.set(x, "SolutionStackDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionStackDetailsUndefined: Self = StObject.set(x, "SolutionStackDetails", js.undefined)
    
    @scala.inline
    def setSolutionStackDetailsVarargs(value: SolutionStackDescription*): Self = StObject.set(x, "SolutionStackDetails", js.Array(value :_*))
    
    @scala.inline
    def setSolutionStacks(value: AvailableSolutionStackNamesList): Self = StObject.set(x, "SolutionStacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionStacksUndefined: Self = StObject.set(x, "SolutionStacks", js.undefined)
    
    @scala.inline
    def setSolutionStacksVarargs(value: SolutionStackName*): Self = StObject.set(x, "SolutionStacks", js.Array(value :_*))
  }
}
