package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectParameters extends StObject {
  
  /**
    * The expression that is used to select the object.
    */
  var Expression: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the provided expression, for example SQL.
    */
  var ExpressionType: js.UndefOr[typings.awsSdk.glacierMod.ExpressionType] = js.undefined
  
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: js.UndefOr[typings.awsSdk.glacierMod.InputSerialization] = js.undefined
  
  /**
    * Describes how the results of the select job are serialized.
    */
  var OutputSerialization: js.UndefOr[typings.awsSdk.glacierMod.OutputSerialization] = js.undefined
}
object SelectParameters {
  
  inline def apply(): SelectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectParameters]
  }
  
  extension [Self <: SelectParameters](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    inline def setExpressionTypeUndefined: Self = StObject.set(x, "ExpressionType", js.undefined)
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
    
    inline def setInputSerializationUndefined: Self = StObject.set(x, "InputSerialization", js.undefined)
    
    inline def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    
    inline def setOutputSerializationUndefined: Self = StObject.set(x, "OutputSerialization", js.undefined)
  }
}
