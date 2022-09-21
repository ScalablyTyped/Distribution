package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Join extends StObject {
  
  /**
    * A list of the two columns to be joined.
    */
  var Columns: JoinColumns
  
  /**
    * The data inputs identified by their node names.
    */
  var Inputs: TwoInputs
  
  /**
    * Specifies the type of join to be performed on the datasets.
    */
  var JoinType: typings.awsSdk.glueMod.JoinType
  
  /**
    * The name of the transform node.
    */
  var Name: NodeName
}
object Join {
  
  inline def apply(Columns: JoinColumns, Inputs: TwoInputs, JoinType: JoinType, Name: NodeName): Join = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], JoinType = JoinType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Join]
  }
  
  extension [Self <: Join](x: Self) {
    
    inline def setColumns(value: JoinColumns): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: JoinColumn*): Self = StObject.set(x, "Columns", js.Array(value*))
    
    inline def setInputs(value: TwoInputs): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setJoinType(value: JoinType): Self = StObject.set(x, "JoinType", value.asInstanceOf[js.Any])
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
