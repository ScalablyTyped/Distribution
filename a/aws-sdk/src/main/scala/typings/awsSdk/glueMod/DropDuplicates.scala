package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDuplicates extends StObject {
  
  /**
    * The name of the columns to be merged or removed if repeating.
    */
  var Columns: js.UndefOr[LimitedPathList] = js.undefined
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: OneInput
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object DropDuplicates {
  
  inline def apply(Inputs: OneInput, Name: NodeName): DropDuplicates = {
    val __obj = js.Dynamic.literal(Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDuplicates]
  }
  
  extension [Self <: DropDuplicates](x: Self) {
    
    inline def setColumns(value: LimitedPathList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
    
    inline def setColumnsVarargs(value: LimitedStringList*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
