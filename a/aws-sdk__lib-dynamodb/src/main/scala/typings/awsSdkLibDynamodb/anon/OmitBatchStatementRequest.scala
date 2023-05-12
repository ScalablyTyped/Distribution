package typings.awsSdkLibDynamodb.anon

import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchStatementRequest, 'Parameters'> & {  Parameters :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitBatchStatementRequest extends StObject {
  
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  var Parameters: js.UndefOr[js.Array[NativeAttributeValue]] = js.undefined
  
  var Statement: js.UndefOr[String] = js.undefined
}
object OmitBatchStatementRequest {
  
  inline def apply(): OmitBatchStatementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitBatchStatementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitBatchStatementRequest] (val x: Self) extends AnyVal {
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setParameters(value: js.Array[NativeAttributeValue]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: NativeAttributeValue*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setStatement(value: String): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "Statement", js.undefined)
  }
}
