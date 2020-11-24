package typings.contentfulManagement.appDefinitionMod

import typings.contentfulManagement.contentfulManagementStrings.`entry-field`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntryFieldLocationDefinition extends LocationDefinition {
  
  var fieldTypes: js.Array[FieldType] = js.native
  
  var location: `entry-field` = js.native
}
object EntryFieldLocationDefinition {
  
  @scala.inline
  def apply(fieldTypes: js.Array[FieldType], location: `entry-field`): EntryFieldLocationDefinition = {
    val __obj = js.Dynamic.literal(fieldTypes = fieldTypes.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryFieldLocationDefinition]
  }
  
  @scala.inline
  implicit class EntryFieldLocationDefinitionOps[Self <: EntryFieldLocationDefinition] (val x: Self) extends AnyVal {
    
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
    def setFieldTypesVarargs(value: FieldType*): Self = this.set("fieldTypes", js.Array(value :_*))
    
    @scala.inline
    def setFieldTypes(value: js.Array[FieldType]): Self = this.set("fieldTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: `entry-field`): Self = this.set("location", value.asInstanceOf[js.Any])
  }
}
