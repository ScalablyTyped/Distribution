package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentBase extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var `bom-ref`: js.UndefOr[String] = js.undefined
  
  var copyright: js.UndefOr[String] = js.undefined
  
  var cpe: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var externalReferences: js.UndefOr[js.Array[ExternalReference]] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var hashes: js.UndefOr[js.Array[Hash]] = js.undefined
  
  var licenses: js.UndefOr[js.Array[LicenseOrExpression]] = js.undefined
  
  var `mime-type`: js.UndefOr[String] = js.undefined
  
  var modified: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var publisher: js.UndefOr[String] = js.undefined
  
  var purl: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[Scope] = js.undefined
  
  var supplier: js.UndefOr[Contact] = js.undefined
  
  var swid: js.UndefOr[SWID] = js.undefined
  
  var `type`: ComponentType
}
object ComponentBase {
  
  inline def apply(name: String, `type`: ComponentType): ComponentBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentBase] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def `setBom-ref`(value: String): Self = StObject.set(x, "bom-ref", value.asInstanceOf[js.Any])
    
    inline def `setBom-refUndefined`: Self = StObject.set(x, "bom-ref", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCpe(value: String): Self = StObject.set(x, "cpe", value.asInstanceOf[js.Any])
    
    inline def setCpeUndefined: Self = StObject.set(x, "cpe", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalReferences(value: js.Array[ExternalReference]): Self = StObject.set(x, "externalReferences", value.asInstanceOf[js.Any])
    
    inline def setExternalReferencesUndefined: Self = StObject.set(x, "externalReferences", js.undefined)
    
    inline def setExternalReferencesVarargs(value: ExternalReference*): Self = StObject.set(x, "externalReferences", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHashes(value: js.Array[Hash]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setHashesVarargs(value: Hash*): Self = StObject.set(x, "hashes", js.Array(value*))
    
    inline def setLicenses(value: js.Array[LicenseOrExpression]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseOrExpression*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def `setMime-type`(value: String): Self = StObject.set(x, "mime-type", value.asInstanceOf[js.Any])
    
    inline def `setMime-typeUndefined`: Self = StObject.set(x, "mime-type", js.undefined)
    
    inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    
    inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setPurl(value: String): Self = StObject.set(x, "purl", value.asInstanceOf[js.Any])
    
    inline def setPurlUndefined: Self = StObject.set(x, "purl", js.undefined)
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSupplier(value: Contact): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setSwid(value: SWID): Self = StObject.set(x, "swid", value.asInstanceOf[js.Any])
    
    inline def setSwidUndefined: Self = StObject.set(x, "swid", js.undefined)
    
    inline def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
