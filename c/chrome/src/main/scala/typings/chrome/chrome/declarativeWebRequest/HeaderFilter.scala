package typings.chrome.chrome.declarativeWebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFilter extends StObject {
  
  var nameContains: js.UndefOr[js.Any] = js.undefined
  
  var nameEquals: js.UndefOr[String] = js.undefined
  
  var namePrefix: js.UndefOr[String] = js.undefined
  
  var nameSuffix: js.UndefOr[String] = js.undefined
  
  var valueContains: js.UndefOr[js.Any] = js.undefined
  
  var valueEquals: js.UndefOr[String] = js.undefined
  
  var valuePrefix: js.UndefOr[String] = js.undefined
  
  var valueSuffix: js.UndefOr[String] = js.undefined
}
object HeaderFilter {
  
  @scala.inline
  def apply(): HeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFilter]
  }
  
  @scala.inline
  implicit class HeaderFilterMutableBuilder[Self <: HeaderFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameContains(value: js.Any): Self = StObject.set(x, "nameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "nameContains", js.undefined)
    
    @scala.inline
    def setNameEquals(value: String): Self = StObject.set(x, "nameEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameEqualsUndefined: Self = StObject.set(x, "nameEquals", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
    
    @scala.inline
    def setNameSuffix(value: String): Self = StObject.set(x, "nameSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameSuffixUndefined: Self = StObject.set(x, "nameSuffix", js.undefined)
    
    @scala.inline
    def setValueContains(value: js.Any): Self = StObject.set(x, "valueContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueContainsUndefined: Self = StObject.set(x, "valueContains", js.undefined)
    
    @scala.inline
    def setValueEquals(value: String): Self = StObject.set(x, "valueEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEqualsUndefined: Self = StObject.set(x, "valueEquals", js.undefined)
    
    @scala.inline
    def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
    
    @scala.inline
    def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
  }
}
