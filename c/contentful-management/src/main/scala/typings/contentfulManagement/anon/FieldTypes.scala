package typings.contentfulManagement.anon

import typings.contentfulManagement.entryFieldsMod.EntryFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldTypes extends js.Object {
  
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
  implicit class FieldTypesOps[Self <: FieldTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldTypesVarargs(value: EntryFields*): Self = this.set("fieldTypes", js.Array(value :_*))
    
    @scala.inline
    def setFieldTypes(value: js.Array[EntryFields]): Self = this.set("fieldTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar(value: Boolean): Self = this.set("sidebar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setSrcdoc(value: String): Self = this.set("srcdoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcdoc: Self = this.set("srcdoc", js.undefined)
  }
}
