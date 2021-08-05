package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChangeSetOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the change set.
    */
  var Id: js.UndefOr[ChangeSetId] = js.undefined
  
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.cloudformationMod.StackId] = js.undefined
}
object CreateChangeSetOutput {
  
  inline def apply(): CreateChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChangeSetOutput]
  }
  
  extension [Self <: CreateChangeSetOutput](x: Self) {
    
    inline def setId(value: ChangeSetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
