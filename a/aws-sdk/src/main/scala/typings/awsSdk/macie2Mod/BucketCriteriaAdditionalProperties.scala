package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCriteriaAdditionalProperties extends StObject {
  
  /**
    * The value for the property matches (equals) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
    */
  @JSName("eq")
  var eq_FBucketCriteriaAdditionalProperties: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The value for the property is greater than the specified value.
    */
  var gt: js.UndefOr[long] = js.undefined
  
  /**
    * The value for the property is greater than or equal to the specified value.
    */
  var gte: js.UndefOr[long] = js.undefined
  
  /**
    * The value for the property is less than the specified value.
    */
  var lt: js.UndefOr[long] = js.undefined
  
  /**
    * The value for the property is less than or equal to the specified value.
    */
  var lte: js.UndefOr[long] = js.undefined
  
  /**
    * The value for the property doesn't match (doesn't equal) the specified value. If you specify multiple values, Amazon Macie uses OR logic to join the values.
    */
  var neq: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The name of the bucket begins with the specified value.
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
    
    inline def setEq_Varargs(value: string*): Self = StObject.set(x, "eq", js.Array(value*))
    
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
    
    inline def setNeqVarargs(value: string*): Self = StObject.set(x, "neq", js.Array(value*))
    
    inline def setPrefix(value: string): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
