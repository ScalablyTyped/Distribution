package typings.clone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloneOpts extends js.Object {
  
  var circular: js.UndefOr[Boolean] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var includeNonEnumerable: js.UndefOr[Boolean] = js.native
}
object CloneOpts {
  
  @scala.inline
  def apply(): CloneOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloneOpts]
  }
  
  @scala.inline
  implicit class CloneOptsOps[Self <: CloneOpts] (val x: Self) extends AnyVal {
    
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
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setIncludeNonEnumerable(value: Boolean): Self = this.set("includeNonEnumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNonEnumerable: Self = this.set("includeNonEnumerable", js.undefined)
  }
}
