package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distributors
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of distributors for the plan. Must have at least one entry
    */
  var distributors: js.Array[String]
  
  /**
    * Array of valid Australian post codes that are specifically excluded from the plan.  Each element is a single four digit postcode (e.g. 3000) or a range of postcodes defined by two four digit postcodes and a hyphen (e.g. 3000-3999)
    */
  var excludedPostcodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Array of valid Australian post codes that are included from the plan.  If absent defaults to all non-excluded post codes.  Each element is a single four digit postcode (e.g. 3000) or a range of postcodes defined by two four digit postcodes and a hyphen (e.g. 3000-3999)
    */
  var includedPostcodes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object Distributors {
  
  inline def apply(distributors: js.Array[String]): Distributors = {
    val __obj = js.Dynamic.literal(distributors = distributors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distributors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Distributors] (val x: Self) extends AnyVal {
    
    inline def setDistributors(value: js.Array[String]): Self = StObject.set(x, "distributors", value.asInstanceOf[js.Any])
    
    inline def setDistributorsVarargs(value: String*): Self = StObject.set(x, "distributors", js.Array(value*))
    
    inline def setExcludedPostcodes(value: js.Array[String]): Self = StObject.set(x, "excludedPostcodes", value.asInstanceOf[js.Any])
    
    inline def setExcludedPostcodesNull: Self = StObject.set(x, "excludedPostcodes", null)
    
    inline def setExcludedPostcodesUndefined: Self = StObject.set(x, "excludedPostcodes", js.undefined)
    
    inline def setExcludedPostcodesVarargs(value: String*): Self = StObject.set(x, "excludedPostcodes", js.Array(value*))
    
    inline def setIncludedPostcodes(value: js.Array[String]): Self = StObject.set(x, "includedPostcodes", value.asInstanceOf[js.Any])
    
    inline def setIncludedPostcodesNull: Self = StObject.set(x, "includedPostcodes", null)
    
    inline def setIncludedPostcodesUndefined: Self = StObject.set(x, "includedPostcodes", js.undefined)
    
    inline def setIncludedPostcodesVarargs(value: String*): Self = StObject.set(x, "includedPostcodes", js.Array(value*))
  }
}
