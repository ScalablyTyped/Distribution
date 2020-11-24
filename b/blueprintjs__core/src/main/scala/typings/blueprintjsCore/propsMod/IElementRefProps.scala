package typings.blueprintjsCore.propsMod

import typings.blueprintjsCore.refsMod.IRef
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElementRefProps[E /* <: HTMLElement */] extends js.Object {
  
  /** A ref handler or a ref object that receives the native HTML element rendered by this component. */
  var elementRef: js.UndefOr[IRef[E]] = js.native
}
object IElementRefProps {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): IElementRefProps[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementRefProps[E]]
  }
  
  @scala.inline
  implicit class IElementRefPropsOps[Self <: IElementRefProps[_], E /* <: HTMLElement */] (val x: Self with IElementRefProps[E]) extends AnyVal {
    
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
    def setElementRefFunction1(value: /* ref */ E | Null => js.Any): Self = this.set("elementRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementRef(value: IRef[E]): Self = this.set("elementRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
  }
}
