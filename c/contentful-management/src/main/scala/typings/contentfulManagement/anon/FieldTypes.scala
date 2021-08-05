package typings.contentfulManagement.anon

import typings.contentfulManagement.entryFieldsMod.EntryFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldTypes extends StObject {
  
  /**
    * Field types where an extension can be used
    */
  var fieldTypes: js.Array[EntryFields]
  
  /**
    * Extension name
    */
  var name: String
  
  /**
    * Controls the location of the extension. If true it will be rendered on the sidebar instead of replacing the field's editing control
    */
  var sidebar: Boolean
  
  /**
    * URL where the root HTML document of the extension can be found
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * String representation of the extension (e.g. inline HTML code)
    */
  var srcdoc: js.UndefOr[String] = js.undefined
}
object FieldTypes {
  
  inline def apply(fieldTypes: js.Array[EntryFields], name: String, sidebar: Boolean): FieldTypes = {
    val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTypes]
  }
  
  extension [Self <: FieldTypes](x: Self) {
    
    inline def setFieldTypes(value: js.Array[EntryFields]): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
    
    inline def setFieldTypesVarargs(value: EntryFields*): Self = StObject.set(x, "fieldTypes", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSidebar(value: Boolean): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
    
    inline def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
  }
}
