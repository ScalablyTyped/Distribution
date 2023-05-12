package typings.cyclonedx.anon

import typings.cyclonedx.mod.ComponentV13
import typings.cyclonedx.mod.Contact
import typings.cyclonedx.mod.ContactPerson
import typings.cyclonedx.mod.LicenseOrExpression
import typings.cyclonedx.mod.Properties
import typings.cyclonedx.mod.Timestamp
import typings.cyclonedx.mod.ToolV13
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cyclonedx.cyclonedx.MetadataBase<cyclonedx.cyclonedx.ToolV1_3, cyclonedx.cyclonedx.ComponentV1_3> & {  licenses :std.Array<cyclonedx.cyclonedx.LicenseOrExpression> | undefined,   properties :cyclonedx.cyclonedx.Properties | undefined} */
trait MetadataBaseToolV13Compon extends StObject {
  
  var authors: js.UndefOr[js.Array[ContactPerson]] = js.undefined
  
  var component: js.UndefOr[ComponentV13] = js.undefined
  
  var licenses: js.UndefOr[js.Array[LicenseOrExpression]] = js.undefined
  
  var manufacture: js.UndefOr[Contact] = js.undefined
  
  var properties: js.UndefOr[Properties] = js.undefined
  
  var supplier: js.UndefOr[Contact] = js.undefined
  
  var timestamp: js.UndefOr[Timestamp] = js.undefined
  
  var tools: js.UndefOr[js.Array[ToolV13]] = js.undefined
}
object MetadataBaseToolV13Compon {
  
  inline def apply(): MetadataBaseToolV13Compon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataBaseToolV13Compon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetadataBaseToolV13Compon] (val x: Self) extends AnyVal {
    
    inline def setAuthors(value: js.Array[ContactPerson]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: ContactPerson*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setComponent(value: ComponentV13): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setLicenses(value: js.Array[LicenseOrExpression]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseOrExpression*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setManufacture(value: Contact): Self = StObject.set(x, "manufacture", value.asInstanceOf[js.Any])
    
    inline def setManufactureUndefined: Self = StObject.set(x, "manufacture", js.undefined)
    
    inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: Name*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSupplier(value: Contact): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTools(value: js.Array[ToolV13]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: ToolV13*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
