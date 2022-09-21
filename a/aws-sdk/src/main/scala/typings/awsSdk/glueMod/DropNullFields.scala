package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropNullFields extends StObject {
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
  
  /**
    * A structure that represents whether certain values are recognized as null values for removal.
    */
  var NullCheckBoxList: js.UndefOr[typings.awsSdk.glueMod.NullCheckBoxList] = js.undefined
  
  /**
    * A structure that specifies a list of NullValueField structures that represent a custom null value such as zero or other value being used as a null placeholder unique to the dataset. The DropNullFields transform removes custom null values only if both the value of the null placeholder and the datatype match the data.
    */
  var NullTextList: js.UndefOr[NullValueFields] = js.undefined
}
object DropNullFields {
  
  inline def apply(Inputs: OneInput, Name: NodeName): DropNullFields = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropNullFields]
  }
  
  extension [Self <: DropNullFields](x: Self) {
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNullCheckBoxList(value: NullCheckBoxList): Self = StObject.set(x, "NullCheckBoxList", value.asInstanceOf[js.Any])
    
    inline def setNullCheckBoxListUndefined: Self = StObject.set(x, "NullCheckBoxList", js.undefined)
    
    inline def setNullTextList(value: NullValueFields): Self = StObject.set(x, "NullTextList", value.asInstanceOf[js.Any])
    
    inline def setNullTextListUndefined: Self = StObject.set(x, "NullTextList", js.undefined)
    
    inline def setNullTextListVarargs(value: NullValueField*): Self = StObject.set(x, "NullTextList", js.Array(value*))
  }
}
