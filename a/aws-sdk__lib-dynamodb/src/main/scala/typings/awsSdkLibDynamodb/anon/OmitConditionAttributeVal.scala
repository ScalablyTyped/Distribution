package typings.awsSdkLibDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ComparisonOperator
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Condition, 'AttributeValueList'> & {  AttributeValueList :std.Array<@aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitConditionAttributeVal extends StObject {
  
  var AttributeValueList: js.UndefOr[js.Array[NativeAttributeValue]] = js.undefined
  
  var ComparisonOperator: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ComparisonOperator | String
  ] = js.undefined
}
object OmitConditionAttributeVal {
  
  inline def apply(): OmitConditionAttributeVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitConditionAttributeVal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitConditionAttributeVal] (val x: Self) extends AnyVal {
    
    inline def setAttributeValueList(value: js.Array[NativeAttributeValue]): Self = StObject.set(x, "AttributeValueList", value.asInstanceOf[js.Any])
    
    inline def setAttributeValueListUndefined: Self = StObject.set(x, "AttributeValueList", js.undefined)
    
    inline def setAttributeValueListVarargs(value: NativeAttributeValue*): Self = StObject.set(x, "AttributeValueList", js.Array(value*))
    
    inline def setComparisonOperator(value: ComparisonOperator | String): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
  }
}
