package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CriterionAdditionalProperties extends StObject {
  
  /**
    * A condition that requires an array field to exactly match the specified property values. You can use this operator with the following properties: customDataIdentifiers.detections.arn, customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key, resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key, resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
    */
  var eqExactMatch: js.UndefOr[listOfString] = js.undefined
  
  /**
    * An equal to condition to apply to a specified property value for findings.
    */
  @JSName("eq")
  var eq_FCriterionAdditionalProperties: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A greater than condition to apply to a specified property value for findings.
    */
  var gt: js.UndefOr[long] = js.undefined
  
  /**
    * A greater than or equal to condition to apply to a specified property value for findings.
    */
  var gte: js.UndefOr[long] = js.undefined
  
  /**
    * A less than condition to apply to a specified property value for findings.
    */
  var lt: js.UndefOr[long] = js.undefined
  
  /**
    * A less than or equal to condition to apply to a specified property value for findings.
    */
  var lte: js.UndefOr[long] = js.undefined
  
  /**
    * A not equal to condition to apply to a specified property value for findings.
    */
  var neq: js.UndefOr[listOfString] = js.undefined
}
object CriterionAdditionalProperties {
  
  inline def apply(): CriterionAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriterionAdditionalProperties]
  }
  
  extension [Self <: CriterionAdditionalProperties](x: Self) {
    
    inline def setEqExactMatch(value: listOfString): Self = StObject.set(x, "eqExactMatch", value.asInstanceOf[js.Any])
    
    inline def setEqExactMatchUndefined: Self = StObject.set(x, "eqExactMatch", js.undefined)
    
    inline def setEqExactMatchVarargs(value: string*): Self = StObject.set(x, "eqExactMatch", js.Array(value :_*))
    
    inline def setEq_(value: listOfString): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    inline def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    inline def setEq_Varargs(value: string*): Self = StObject.set(x, "eq", js.Array(value :_*))
    
    inline def setGt(value: long): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    inline def setGte(value: long): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    inline def setLt(value: long): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    inline def setLte(value: long): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    
    inline def setNeq(value: listOfString): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    inline def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
    
    inline def setNeqVarargs(value: string*): Self = StObject.set(x, "neq", js.Array(value :_*))
  }
}
