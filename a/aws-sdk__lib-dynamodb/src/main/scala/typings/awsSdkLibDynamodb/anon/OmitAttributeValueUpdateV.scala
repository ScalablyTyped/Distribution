package typings.awsSdkLibDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeAction
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.AttributeValueUpdate, 'Value'> & {  Value :@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue | undefined} */
trait OmitAttributeValueUpdateV extends StObject {
  
  var Action: js.UndefOr[AttributeAction | String] = js.undefined
  
  var Value: js.UndefOr[NativeAttributeValue] = js.undefined
}
object OmitAttributeValueUpdateV {
  
  inline def apply(): OmitAttributeValueUpdateV = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitAttributeValueUpdateV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitAttributeValueUpdateV] (val x: Self) extends AnyVal {
    
    inline def setAction(value: AttributeAction | String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setValue(value: NativeAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "Value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "Value", js.Array(value*))
  }
}
