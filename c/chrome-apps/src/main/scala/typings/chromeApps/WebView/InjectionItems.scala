package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type of injection item: code or a set of files. */
@js.native
trait InjectionItems extends js.Object {
  
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.native
  
  /**
    * The list of JavaScript or CSS files to be injected into matching pages.
    * These are injected in the order they appear in this array.
    */
  var files: js.UndefOr[js.Array[_]] = js.native
}
object InjectionItems {
  
  @scala.inline
  def apply(): InjectionItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectionItems]
  }
  
  @scala.inline
  implicit class InjectionItemsOps[Self <: InjectionItems] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: js.Any*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[_]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
}
