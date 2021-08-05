package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCriteriaAdditionalProperties extends StObject {
  
  /**
    * An equal to condition to apply to a specified attribute value for buckets.
    */
  @JSName("eq")
  var eq_FBucketCriteriaAdditionalProperties: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A greater than condition to apply to a specified attribute value for buckets.
    */
  var gt: js.UndefOr[long] = js.undefined
  
  /**
    * A greater than or equal to condition to apply to a specified attribute value for buckets.
    */
  var gte: js.UndefOr[long] = js.undefined
  
  /**
    * A less than condition to apply to a specified attribute value for buckets.
    */
  var lt: js.UndefOr[long] = js.undefined
  
  /**
    * A less than or equal to condition to apply to a specified attribute value for buckets.
    */
  var lte: js.UndefOr[long] = js.undefined
  
  /**
    * A not equal to condition to apply to a specified attribute value for buckets.
    */
  var neq: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The prefix of the buckets to include in the results.
    */
  var prefix: js.UndefOr[string] = js.undefined
}
object BucketCriteriaAdditionalProperties {
  
  inline def apply(): BucketCriteriaAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCriteriaAdditionalProperties]
  }
  
  extension [Self <: BucketCriteriaAdditionalProperties](x: Self) {
    
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
    
    inline def setPrefix(value: string): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
