package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectParameters extends StObject {
  
  /**
    * The expression that is used to select the object.
    */
  var Expression: js.UndefOr[String] = js.native
  
  /**
    * The type of the provided expression, for example SQL.
    */
  var ExpressionType: js.UndefOr[typings.awsSdk.glacierMod.ExpressionType] = js.native
  
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: js.UndefOr[typings.awsSdk.glacierMod.InputSerialization] = js.native
  
  /**
    * Describes how the results of the select job are serialized.
    */
  var OutputSerialization: js.UndefOr[typings.awsSdk.glacierMod.OutputSerialization] = js.native
}
object SelectParameters {
  
  @scala.inline
  def apply(): SelectParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectParameters]
  }
  
  @scala.inline
  implicit class SelectParametersMutableBuilder[Self <: SelectParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionTypeUndefined: Self = StObject.set(x, "ExpressionType", js.undefined)
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    @scala.inline
    def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSerializationUndefined: Self = StObject.set(x, "InputSerialization", js.undefined)
    
    @scala.inline
    def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSerializationUndefined: Self = StObject.set(x, "OutputSerialization", js.undefined)
  }
}
