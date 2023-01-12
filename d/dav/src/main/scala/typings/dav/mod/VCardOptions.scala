package typings.dav.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined dav.dav.Partial<dav.dav.VCard> */
trait VCardOptions extends StObject {
  
  var addressBook: js.UndefOr[AddressBook] = js.undefined
  
  var addressData: js.UndefOr[String] = js.undefined
  
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], Any]] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object VCardOptions {
  
  inline def apply(): VCardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VCardOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VCardOptions] (val x: Self) extends AnyVal {
    
    inline def setAddressBook(value: AddressBook): Self = StObject.set(x, "addressBook", value.asInstanceOf[js.Any])
    
    inline def setAddressBookUndefined: Self = StObject.set(x, "addressBook", js.undefined)
    
    inline def setAddressData(value: String): Self = StObject.set(x, "addressData", value.asInstanceOf[js.Any])
    
    inline def setAddressDataUndefined: Self = StObject.set(x, "addressData", js.undefined)
    
    inline def setConstructor(value: /* options */ js.UndefOr[VCardOptions] => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
    
    inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
