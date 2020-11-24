package typings.cfb.mod

import typings.cfb.cfbStrings.cfb
import typings.cfb.cfbStrings.mad
import typings.cfb.cfbStrings.zip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CFBWritingOptions extends CFBCommonOptions {
  
  /** Enable compression (ZIP only) */
  var compression: js.UndefOr[Boolean] = js.native
  
  /** Output file type */
  var fileType: js.UndefOr[cfb | zip | mad] = js.native
  
  /** Override default root entry name (CFB only) */
  var root: js.UndefOr[String] = js.native
}
object CFBWritingOptions {
  
  @scala.inline
  def apply(): CFBWritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFBWritingOptions]
  }
  
  @scala.inline
  implicit class CFBWritingOptionsOps[Self <: CFBWritingOptions] (val x: Self) extends AnyVal {
    
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
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setFileType(value: cfb | zip | mad): Self = this.set("fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
