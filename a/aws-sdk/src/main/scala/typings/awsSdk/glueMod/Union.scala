package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Union extends StObject {
  
  /**
    * The node ID inputs to the transform.
    */
  var Inputs: TwoInputs
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * Indicates the type of Union transform.  Specify ALL to join all rows from data sources to the resulting DynamicFrame. The resulting union does not remove duplicate rows. Specify DISTINCT to remove duplicate rows in the resulting DynamicFrame.
    */
  var UnionType: typings.awsSdk.glueMod.UnionType
}
object Union {
  
  inline def apply(Inputs: TwoInputs, Name: NodeName, UnionType: UnionType): Union = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UnionType = UnionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Union]
  }
  
  extension [Self <: Union](x: Self) {
    
    inline def setInputs(value: TwoInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setUnionType(value: UnionType): Self = StObject.set(x, "UnionType", value.asInstanceOf[js.Any])
  }
}
