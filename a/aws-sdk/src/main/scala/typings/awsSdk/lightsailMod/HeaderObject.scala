package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderObject extends StObject {
  
  /**
    * The specific headers to forward to your distribution's origin.
    */
  var headersAllowList: js.UndefOr[HeaderForwardList] = js.undefined
  
  /**
    * The headers that you want your distribution to forward to your origin and base caching on. You can configure your distribution to do one of the following:     all  - Forward all headers to your origin.     none  - Forward only the default headers.     allow-list  - Forward only the headers you specify using the headersAllowList parameter.  
    */
  var option: js.UndefOr[ForwardValues] = js.undefined
}
object HeaderObject {
  
  inline def apply(): HeaderObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderObject]
  }
  
  extension [Self <: HeaderObject](x: Self) {
    
    inline def setHeadersAllowList(value: HeaderForwardList): Self = StObject.set(x, "headersAllowList", value.asInstanceOf[js.Any])
    
    inline def setHeadersAllowListUndefined: Self = StObject.set(x, "headersAllowList", js.undefined)
    
    inline def setHeadersAllowListVarargs(value: HeaderEnum*): Self = StObject.set(x, "headersAllowList", js.Array(value*))
    
    inline def setOption(value: ForwardValues): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
  }
}
