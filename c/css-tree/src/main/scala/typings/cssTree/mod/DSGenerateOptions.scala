package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSGenerateOptions extends js.Object {
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var decorate: js.UndefOr[js.Function2[/* result */ String, /* node */ DSNode, Unit]] = js.native
  
  var forceBraces: js.UndefOr[Boolean] = js.native
}
object DSGenerateOptions {
  
  @scala.inline
  def apply(): DSGenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSGenerateOptions]
  }
  
  @scala.inline
  implicit class DSGenerateOptionsOps[Self <: DSGenerateOptions] (val x: Self) extends AnyVal {
    
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
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    
    @scala.inline
    def setDecorate(value: (/* result */ String, /* node */ DSNode) => Unit): Self = this.set("decorate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDecorate: Self = this.set("decorate", js.undefined)
    
    @scala.inline
    def setForceBraces(value: Boolean): Self = this.set("forceBraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceBraces: Self = this.set("forceBraces", js.undefined)
  }
}
