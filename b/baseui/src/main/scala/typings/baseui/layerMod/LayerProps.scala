package typings.baseui.layerMod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var host: js.UndefOr[HTMLElement] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var mountNode: js.UndefOr[HTMLElement] = js.native
  
  var onMount: js.UndefOr[js.Function0[_]] = js.native
  
  var onUnmount: js.UndefOr[js.Function0[_]] = js.native
}
object LayerProps {
  
  @scala.inline
  def apply(): LayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerProps]
  }
  
  @scala.inline
  implicit class LayerPropsOps[Self <: LayerProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setMountNode(value: HTMLElement): Self = this.set("mountNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountNode: Self = this.set("mountNode", js.undefined)
    
    @scala.inline
    def setOnMount(value: () => _): Self = this.set("onMount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMount: Self = this.set("onMount", js.undefined)
    
    @scala.inline
    def setOnUnmount(value: () => _): Self = this.set("onUnmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnUnmount: Self = this.set("onUnmount", js.undefined)
  }
}
