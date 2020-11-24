package typings.cfb.mod

import typings.cfb.cfbStrings.array
import typings.cfb.cfbStrings.base64
import typings.cfb.cfbStrings.binary
import typings.cfb.cfbStrings.buffer
import typings.cfb.cfbStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CFBCommonOptions extends js.Object {
  
  /** If true, throw errors when features are not understood */
  var WTF: js.UndefOr[Boolean] = js.native
  
  /** Data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array] = js.native
}
object CFBCommonOptions {
  
  @scala.inline
  def apply(): CFBCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFBCommonOptions]
  }
  
  @scala.inline
  implicit class CFBCommonOptionsOps[Self <: CFBCommonOptions] (val x: Self) extends AnyVal {
    
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
    def setWTF(value: Boolean): Self = this.set("WTF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWTF: Self = this.set("WTF", js.undefined)
    
    @scala.inline
    def setType(value: base64 | binary | buffer | file | array): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
