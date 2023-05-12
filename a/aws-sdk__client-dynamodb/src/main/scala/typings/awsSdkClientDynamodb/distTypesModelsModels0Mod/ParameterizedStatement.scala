package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterizedStatement extends StObject {
  
  /**
    * <p> The parameter values. </p>
    */
  var Parameters: js.UndefOr[js.Array[AttributeValue]] = js.undefined
  
  /**
    * <p> A PartiQL statment that uses parameters. </p>
    */
  var Statement: js.UndefOr[String] = js.undefined
}
object ParameterizedStatement {
  
  inline def apply(): ParameterizedStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterizedStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterizedStatement] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[AttributeValue]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
