package typings.contentfulManagement.anon

import typings.contentfulManagement.entryFieldsMod.EntryFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldTypes extends StObject {
  
  /**
    * Field types where an extension can be used
    */
  var fieldTypes: js.Array[EntryFields] = js.native
  
  /**
    * Extension name
    */
  var name: String = js.native
  
  /**
    * Controls the location of the extension. If true it will be rendered on the sidebar instead of replacing the field's editing control
    */
  var sidebar: Boolean = js.native
  
  /**
    * URL where the root HTML document of the extension can be found
    */
  var src: js.UndefOr[String] = js.native
  
  /**
    * String representation of the extension (e.g. inline HTML code)
    */
  var srcdoc: js.UndefOr[String] = js.native
}
object FieldTypes {
  
  @scala.inline
  def apply(fieldTypes: js.Array[EntryFields], name: String, sidebar: Boolean): FieldTypes = {
    val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldTypes]
  }
  
  @scala.inline
  implicit class FieldTypesMutableBuilder[Self <: FieldTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldTypes(value: js.Array[EntryFields]): Self = StObject.set(x, "fieldTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTypesVarargs(value: EntryFields*): Self = StObject.set(x, "fieldTypes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar(value: Boolean): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
  }
}
