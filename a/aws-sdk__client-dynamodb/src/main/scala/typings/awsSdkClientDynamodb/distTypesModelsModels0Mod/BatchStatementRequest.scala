package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStatementRequest extends StObject {
  
  /**
    * <p> The read consistency of the PartiQL batch request. </p>
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  /**
    * <p> The parameters associated with a PartiQL statement in the batch request. </p>
    */
  var Parameters: js.UndefOr[js.Array[AttributeValue]] = js.undefined
  
  /**
    * <p> A valid PartiQL statement. </p>
    */
  var Statement: js.UndefOr[String] = js.undefined
}
object BatchStatementRequest {
  
  inline def apply(): BatchStatementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setParameters(value: js.Array[AttributeValue]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: AttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
