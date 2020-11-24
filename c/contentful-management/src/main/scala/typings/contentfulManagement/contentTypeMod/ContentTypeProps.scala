package typings.contentfulManagement.contentTypeMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentTypeFieldsMod.ContentFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTypeProps extends js.Object {
  
  var description: String = js.native
  
  /** Field used as the main display field for Entries */
  var displayField: String = js.native
  
  /** All the fields contained in this Content Type */
  var fields: js.Array[ContentFields] = js.native
  
  var name: String = js.native
  
  var sys: MetaSysProps = js.native
}
object ContentTypeProps {
  
  @scala.inline
  def apply(
    description: String,
    displayField: String,
    fields: js.Array[ContentFields],
    name: String,
    sys: MetaSysProps
  ): ContentTypeProps = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayField = displayField.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProps]
  }
  
  @scala.inline
  implicit class ContentTypePropsOps[Self <: ContentTypeProps] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayField(value: String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ContentFields*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[ContentFields]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
