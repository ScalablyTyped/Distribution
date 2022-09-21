package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableSolutionStacksResultMessage extends StObject {
  
  /**
    *  A list of available solution stacks and their SolutionStackDescription. 
    */
  var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.undefined
  
  /**
    * A list of available solution stacks.
    */
  var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.undefined
}
object ListAvailableSolutionStacksResultMessage {
  
  inline def apply(): ListAvailableSolutionStacksResultMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableSolutionStacksResultMessage]
  }
  
  extension [Self <: ListAvailableSolutionStacksResultMessage](x: Self) {
    
    inline def setSolutionStackDetails(value: AvailableSolutionStackDetailsList): Self = StObject.set(x, "SolutionStackDetails", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackDetailsUndefined: Self = StObject.set(x, "SolutionStackDetails", js.undefined)
    
    inline def setSolutionStackDetailsVarargs(value: SolutionStackDescription*): Self = StObject.set(x, "SolutionStackDetails", js.Array(value*))
    
    inline def setSolutionStacks(value: AvailableSolutionStackNamesList): Self = StObject.set(x, "SolutionStacks", value.asInstanceOf[js.Any])
    
    inline def setSolutionStacksUndefined: Self = StObject.set(x, "SolutionStacks", js.undefined)
    
    inline def setSolutionStacksVarargs(value: SolutionStackName*): Self = StObject.set(x, "SolutionStacks", js.Array(value*))
  }
}
