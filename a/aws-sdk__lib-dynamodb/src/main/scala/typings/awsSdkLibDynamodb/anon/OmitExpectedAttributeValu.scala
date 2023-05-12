package typings.awsSdkLibDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ComparisonOperator
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ExpectedAttributeValue, 'Value' | 'AttributeValueList'> & {  Value :@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue | undefined,   AttributeValueList :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitExpectedAttributeValu extends StObject {
  
  var AttributeValueList: js.UndefOr[js.Array[NativeAttributeValue]] = js.undefined
  
  var ComparisonOperator: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ComparisonOperator | String
  ] = js.undefined
  
  var Exists: js.UndefOr[Boolean] = js.undefined
  
  var Value: js.UndefOr[NativeAttributeValue] = js.undefined
}
object OmitExpectedAttributeValu {
  
  inline def apply(): OmitExpectedAttributeValu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitExpectedAttributeValu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitExpectedAttributeValu] (val x: Self) extends AnyVal {
    
    inline def setAttributeValueList(value: js.Array[NativeAttributeValue]): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
    
    inline def setAttributeValueListVarargs(value: NativeAttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
    
    inline def setComparisonOperator(value: ComparisonOperator | String): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "Exists", js.undefined)
    
    inline def setValue(value: NativeAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "Value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "Value", js.Array(value*))
  }
}
