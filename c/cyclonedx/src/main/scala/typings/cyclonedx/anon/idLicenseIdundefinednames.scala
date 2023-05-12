package typings.cyclonedx.anon

import typings.cyclonedx.mod.LicenseId
import typings.cyclonedx.mod.MimeText
import typings.cyclonedx.mod.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  id :cyclonedx.cyclonedx.LicenseId | undefined,   name :string} & {  text :cyclonedx.cyclonedx.MimeText | undefined,   url :cyclonedx.cyclonedx.URL | undefined} */
trait idLicenseIdundefinednames
  extends StObject
     with typings.cyclonedx.mod.License {
  
  var id: js.UndefOr[LicenseId] = js.undefined
  
  var name: String
  
  var text: js.UndefOr[MimeText] = js.undefined
  
  var url: js.UndefOr[URL] = js.undefined
}
object idLicenseIdundefinednames {
  
  inline def apply(name: String): idLicenseIdundefinednames = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[idLicenseIdundefinednames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: idLicenseIdundefinednames] (val x: Self) extends AnyVal {
    
    inline def setId(value: LicenseId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: MimeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
