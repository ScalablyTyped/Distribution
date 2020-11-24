package typings.clampJsMain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClampOptions extends js.Object {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var clamp: js.UndefOr[Double | String] = js.native
  
  var splitOnChars: js.UndefOr[js.Array[String]] = js.native
  
  var truncationChar: js.UndefOr[String] = js.native
  
  var truncationHTML: js.UndefOr[String | Null] = js.native
  
  var useNativeClamp: js.UndefOr[Boolean] = js.native
}
object ClampOptions {
  
  @scala.inline
  def apply(): ClampOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClampOptions]
  }
  
  @scala.inline
  implicit class ClampOptionsOps[Self <: ClampOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setClamp(value: Double | String): Self = this.set("clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClamp: Self = this.set("clamp", js.undefined)
    
    @scala.inline
    def setSplitOnCharsVarargs(value: String*): Self = this.set("splitOnChars", js.Array(value :_*))
    
    @scala.inline
    def setSplitOnChars(value: js.Array[String]): Self = this.set("splitOnChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitOnChars: Self = this.set("splitOnChars", js.undefined)
    
    @scala.inline
    def setTruncationChar(value: String): Self = this.set("truncationChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncationChar: Self = this.set("truncationChar", js.undefined)
    
    @scala.inline
    def setTruncationHTML(value: String): Self = this.set("truncationHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncationHTML: Self = this.set("truncationHTML", js.undefined)
    
    @scala.inline
    def setTruncationHTMLNull: Self = this.set("truncationHTML", null)
    
    @scala.inline
    def setUseNativeClamp(value: Boolean): Self = this.set("useNativeClamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNativeClamp: Self = this.set("useNativeClamp", js.undefined)
  }
}
