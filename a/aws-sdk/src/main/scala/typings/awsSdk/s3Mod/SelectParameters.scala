package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectParameters extends StObject {
  
  /**
    * The expression that is used to query the object.
    */
  var Expression: typings.awsSdk.s3Mod.Expression
  
  /**
    * The type of the provided expression (for example, SQL).
    */
  var ExpressionType: typings.awsSdk.s3Mod.ExpressionType
  
  /**
    * Describes the serialization format of the object.
    */
  var InputSerialization: typings.awsSdk.s3Mod.InputSerialization
  
  /**
    * Describes how the results of the Select job are serialized.
    */
  var OutputSerialization: typings.awsSdk.s3Mod.OutputSerialization
}
object SelectParameters {
  
  inline def apply(
    Expression: Expression,
    ExpressionType: ExpressionType,
    InputSerialization: InputSerialization,
    OutputSerialization: OutputSerialization
  ): SelectParameters = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ExpressionType = ExpressionType.asInstanceOf[js.Any], InputSerialization = InputSerialization.asInstanceOf[js.Any], OutputSerialization = OutputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectParameters]
  }
  
  extension [Self <: SelectParameters](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: ExpressionType): Self = StObject.set(x, "ExpressionType", value.asInstanceOf[js.Any])
    
    inline def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "InputSerialization", value.asInstanceOf[js.Any])
    
    inline def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "OutputSerialization", value.asInstanceOf[js.Any])
  }
}
