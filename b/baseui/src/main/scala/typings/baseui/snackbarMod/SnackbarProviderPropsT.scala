package typings.baseui.snackbarMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarProviderPropsT extends js.Object {
  
  var children: js.UndefOr[Node] = js.native
  
  var defaultDuration: js.UndefOr[DurationT] = js.native
  
  var overrides: js.UndefOr[typings.baseui.anon.SnackbarElementOverridesT] = js.native
  
  var placement: js.UndefOr[PlacementT] = js.native
}
object SnackbarProviderPropsT {
  
  @scala.inline
  def apply(): SnackbarProviderPropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnackbarProviderPropsT]
  }
  
  @scala.inline
  implicit class SnackbarProviderPropsTOps[Self <: SnackbarProviderPropsT] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: Node): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultDuration(value: DurationT): Self = this.set("defaultDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDuration: Self = this.set("defaultDuration", js.undefined)
    
    @scala.inline
    def setOverrides(value: typings.baseui.anon.SnackbarElementOverridesT): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlacement(value: PlacementT): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
  }
}
