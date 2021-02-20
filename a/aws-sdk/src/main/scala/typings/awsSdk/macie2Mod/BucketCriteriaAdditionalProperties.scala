package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketCriteriaAdditionalProperties extends StObject {
  
  /**
    * An equal to condition to apply to a specified attribute value for buckets.
    */
  @JSName("eq")
  var eq_FBucketCriteriaAdditionalProperties: js.UndefOr[listOfString] = js.native
  
  /**
    * A greater than condition to apply to a specified attribute value for buckets.
    */
  var gt: js.UndefOr[long] = js.native
  
  /**
    * A greater than or equal to condition to apply to a specified attribute value for buckets.
    */
  var gte: js.UndefOr[long] = js.native
  
  /**
    * A less than condition to apply to a specified attribute value for buckets.
    */
  var lt: js.UndefOr[long] = js.native
  
  /**
    * A less than or equal to condition to apply to a specified attribute value for buckets.
    */
  var lte: js.UndefOr[long] = js.native
  
  /**
    * A not equal to condition to apply to a specified attribute value for buckets.
    */
  var neq: js.UndefOr[listOfString] = js.native
  
  /**
    * The prefix of the buckets to include in the results.
    */
  var prefix: js.UndefOr[string] = js.native
}
object BucketCriteriaAdditionalProperties {
  
  @scala.inline
  def apply(): BucketCriteriaAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCriteriaAdditionalProperties]
  }
  
  @scala.inline
  implicit class BucketCriteriaAdditionalPropertiesMutableBuilder[Self <: BucketCriteriaAdditionalProperties] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setPrefix(value: string): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
