package typings.clampJsMain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClampResponse extends js.Object {
  
  var clamped: String = js.native
  
  var original: String = js.native
}
object ClampResponse {
  
  @scala.inline
  def apply(clamped: String, original: String): ClampResponse = {
    val __obj = js.Dynamic.literal(clamped = clamped.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClampResponse]
  }
  
  @scala.inline
  implicit class ClampResponseOps[Self <: ClampResponse] (val x: Self) extends AnyVal {
    
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
    def setClamped(value: String): Self = this.set("clamped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
  }
}
