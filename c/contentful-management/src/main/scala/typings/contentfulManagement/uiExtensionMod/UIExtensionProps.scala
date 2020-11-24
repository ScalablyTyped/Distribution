package typings.contentfulManagement.uiExtensionMod

import typings.contentfulManagement.anon.FieldTypes
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIExtensionProps extends js.Object {
  
  var extension: FieldTypes = js.native
  
  var sys: MetaSysProps = js.native
}
object UIExtensionProps {
  
  @scala.inline
  def apply(extension: FieldTypes, sys: MetaSysProps): UIExtensionProps = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIExtensionProps]
  }
  
  @scala.inline
  implicit class UIExtensionPropsOps[Self <: UIExtensionProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
