package typings.cbor.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagnoseOptions extends TransformOptions {
  
  var max_depth: js.UndefOr[Double] = js.native
  
  var separator: js.UndefOr[String] = js.native
  
  var stream_errors: js.UndefOr[Boolean] = js.native
}
object DiagnoseOptions {
  
  @scala.inline
  def apply(): DiagnoseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagnoseOptions]
  }
  
  @scala.inline
  implicit class DiagnoseOptionsOps[Self <: DiagnoseOptions] (val x: Self) extends AnyVal {
    
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
    def setMax_depth(value: Double): Self = this.set("max_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_depth: Self = this.set("max_depth", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setStream_errors(value: Boolean): Self = this.set("stream_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream_errors: Self = this.set("stream_errors", js.undefined)
  }
}
