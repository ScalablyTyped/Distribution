package typings.contentfulManagement.uploadMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadProps extends js.Object {
  
  /**
    * System metadata
    */
  var sys: MetaSysProps = js.native
}
object UploadProps {
  
  @scala.inline
  def apply(sys: MetaSysProps): UploadProps = {
    val __obj = js.Dynamic.literal(sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadProps]
  }
  
  @scala.inline
  implicit class UploadPropsOps[Self <: UploadProps] (val x: Self) extends AnyVal {
    
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
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
