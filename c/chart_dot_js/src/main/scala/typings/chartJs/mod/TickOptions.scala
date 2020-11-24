package typings.chartJs.mod

import typings.chartJs.chartJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickOptions extends NestedTickOptions {
  
  var major: js.UndefOr[MajorTickOptions | `false`] = js.native
  
  var minor: js.UndefOr[NestedTickOptions | `false`] = js.native
}
object TickOptions {
  
  @scala.inline
  def apply(): TickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickOptions]
  }
  
  @scala.inline
  implicit class TickOptionsOps[Self <: TickOptions] (val x: Self) extends AnyVal {
    
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
    def setMajor(value: MajorTickOptions | `false`): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    
    @scala.inline
    def setMinor(value: NestedTickOptions | `false`): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
  }
}
