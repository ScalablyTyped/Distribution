package typings.chromeApps.chrome.webViewRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFilter extends StObject {
  
  /** Matches if the header name contains all of the specified strings. */
  var nameContains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Matches if the header name is equal to the specified string. */
  var nameEquals: js.UndefOr[String] = js.undefined
  
  /** Matches if the header name starts with the specified string. */
  var namePrefix: js.UndefOr[String] = js.undefined
  
  /** Matches if the header name ends with the specified string. */
  var nameSuffix: js.UndefOr[String] = js.undefined
  
  /** Matches if the header value contains all of the specified strings. */
  var valueContains: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Matches if the header value is equal to the specified string. */
  var valueEquals: js.UndefOr[String] = js.undefined
  
  /** Matches if the header value starts with the specified string. */
  var valuePrefix: js.UndefOr[String] = js.undefined
  
  /** Matches if the header value ends with the specified string. */
  var valueSuffix: js.UndefOr[String] = js.undefined
}
object HeaderFilter {
  
  inline def apply(): HeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFilter]
  }
  
  extension [Self <: HeaderFilter](x: Self) {
    
    inline def setNameContains(value: String | js.Array[String]): Self = StObject.set(x, "nameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "nameContains", js.undefined)
    
    inline def setNameContainsVarargs(value: String*): Self = StObject.set(x, "nameContains", js.Array(value*))
    
    inline def setNameEquals(value: String): Self = StObject.set(x, "nameEquals", value.asInstanceOf[js.Any])
    
    inline def setNameEqualsUndefined: Self = StObject.set(x, "nameEquals", js.undefined)
    
    inline def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    inline def setNameSuffix(value: String): Self = StObject.set(x, "nameSuffix", value.asInstanceOf[js.Any])
    
    inline def setNameSuffixUndefined: Self = StObject.set(x, "nameSuffix", js.undefined)
    
    inline def setValueContains(value: String | js.Array[String]): Self = StObject.set(x, "valueContains", value.asInstanceOf[js.Any])
    
    inline def setValueContainsUndefined: Self = StObject.set(x, "valueContains", js.undefined)
    
    inline def setValueContainsVarargs(value: String*): Self = StObject.set(x, "valueContains", js.Array(value*))
    
    inline def setValueEquals(value: String): Self = StObject.set(x, "valueEquals", value.asInstanceOf[js.Any])
    
    inline def setValueEqualsUndefined: Self = StObject.set(x, "valueEquals", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
    
    inline def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    
    inline def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
  }
}
