package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/ui-extension.UIExtensionProps, 'sys'> */
@js.native
trait OmitUIExtensionPropssys extends js.Object {
  
  var extension: FieldTypes = js.native
}
object OmitUIExtensionPropssys {
  
  @scala.inline
  def apply(extension: FieldTypes): OmitUIExtensionPropssys = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitUIExtensionPropssys]
  }
  
  @scala.inline
  implicit class OmitUIExtensionPropssysOps[Self <: OmitUIExtensionPropssys] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: FieldTypes): Self = this.set("extension", value.asInstanceOf[js.Any])
  }
}
