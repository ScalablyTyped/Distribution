package typings.blueprintjsCore.menuMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait IMenuProps extends HTMLAttributes[HTMLUListElement] {
  
  /** Whether the menu items in this menu should use a large appearance. */
  var large: js.UndefOr[Boolean] = js.native
  
  /** Ref handler that receives the HTML `<ul>` element backing this component. */
  var ulRef: js.UndefOr[js.Function1[/* ref */ HTMLUListElement | Null, _]] = js.native
}
object IMenuProps {
  
  @scala.inline
  def apply(): IMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuProps]
  }
  
  @scala.inline
  implicit class IMenuPropsOps[Self <: IMenuProps] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setUlRef(value: /* ref */ HTMLUListElement | Null => _): Self = this.set("ulRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUlRef: Self = this.set("ulRef", js.undefined)
  }
}
