package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectFromCollection extends StObject {
  
  /**
    * The index for the DynamicFrame to be selected.
    */
  var Index: NonNegativeInt
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object SelectFromCollection {
  
  inline def apply(Index: NonNegativeInt, Inputs: OneInput, Name: NodeName): SelectFromCollection = {
    val __obj = js.Dynamic.literal(Index = Index.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectFromCollection]
  }
  
  extension [Self <: SelectFromCollection](x: Self) {
    
    inline def setIndex(value: NonNegativeInt): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
