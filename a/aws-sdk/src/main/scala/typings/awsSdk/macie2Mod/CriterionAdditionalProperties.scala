package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CriterionAdditionalProperties extends StObject {
  
  /**
    * A condition that requires an array field to exactly match the specified property values. You can use this operator with the following properties: customDataIdentifiers.detections.arn, customDataIdentifiers.detections.name, resourcesAffected.s3Bucket.tags.key, resourcesAffected.s3Bucket.tags.value, resourcesAffected.s3Object.tags.key, resourcesAffected.s3Object.tags.value, sensitiveData.category, and sensitiveData.detections.type.
    */
  var eqExactMatch: js.UndefOr[listOfString] = js.native
  
  /**
    * An equal to condition to apply to a specified property value for findings.
    */
  @JSName("eq")
  var eq_FCriterionAdditionalProperties: js.UndefOr[listOfString] = js.native
  
  /**
    * A greater than condition to apply to a specified property value for findings.
    */
  var gt: js.UndefOr[long] = js.native
  
  /**
    * A greater than or equal to condition to apply to a specified property value for findings.
    */
  var gte: js.UndefOr[long] = js.native
  
  /**
    * A less than condition to apply to a specified property value for findings.
    */
  var lt: js.UndefOr[long] = js.native
  
  /**
    * A less than or equal to condition to apply to a specified property value for findings.
    */
  var lte: js.UndefOr[long] = js.native
  
  /**
    * A not equal to condition to apply to a specified property value for findings.
    */
  var neq: js.UndefOr[listOfString] = js.native
}
object CriterionAdditionalProperties {
  
  @scala.inline
  def apply(): CriterionAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriterionAdditionalProperties]
  }
  
  @scala.inline
  implicit class CriterionAdditionalPropertiesMutableBuilder[Self <: CriterionAdditionalProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEqExactMatch(value: listOfString): Self = StObject.set(x, "eqExactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqExactMatchUndefined: Self = StObject.set(x, "eqExactMatch", js.undefined)
    
    @scala.inline
    def setEqExactMatchVarargs(value: string*): Self = StObject.set(x, "eqExactMatch", js.Array(value :_*))
    
    @scala.inline
    def setEq_(value: listOfString): Self = StObject.set(x, "eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEq_Undefined: Self = StObject.set(x, "eq", js.undefined)
    
    @scala.inline
    def setEq_Varargs(value: string*): Self = StObject.set(x, "eq", js.Array(value :_*))
    
    @scala.inline
    def setGt(value: long): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
    
    @scala.inline
    def setGte(value: long): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
    
    @scala.inline
    def setLt(value: long): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
    
    @scala.inline
    def setLte(value: long): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    
    @scala.inline
    def setNeq(value: listOfString): Self = StObject.set(x, "neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeqUndefined: Self = StObject.set(x, "neq", js.undefined)
    
    @scala.inline
    def setNeqVarargs(value: string*): Self = StObject.set(x, "neq", js.Array(value :_*))
  }
}
