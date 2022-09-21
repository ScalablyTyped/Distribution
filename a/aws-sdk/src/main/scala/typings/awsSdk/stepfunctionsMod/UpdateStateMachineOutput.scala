package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStateMachineOutput extends StObject {
  
  /**
    * The date and time the state machine was updated.
    */
  var updateDate: js.Date
}
object UpdateStateMachineOutput {
  
  inline def apply(updateDate: js.Date): UpdateStateMachineOutput = {
    val __obj = js.Dynamic.literal(updateDate = updateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStateMachineOutput]
  }
  
  extension [Self <: UpdateStateMachineOutput](x: Self) {
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "updateDate", value.asInstanceOf[js.Any])
  }
}
