package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyrightControl extends Control {
  
  def addCopyright(copyright: Copyright): Unit = js.native
  
  def getCopyright(id: Double): Copyright = js.native
  
  def getCopyrightCollection(): js.Array[Copyright] = js.native
  
  def removeCopyright(id: Double): Unit = js.native
}
object CopyrightControl {
  
  @scala.inline
  def apply(
    addCopyright: Copyright => Unit,
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getCopyright: Double => Copyright,
    getCopyrightCollection: () => js.Array[Copyright],
    getOffset: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    removeCopyright: Double => Unit,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    show: () => Unit
  ): CopyrightControl = {
    val __obj = js.Dynamic.literal(addCopyright = js.Any.fromFunction1(addCopyright), defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getCopyright = js.Any.fromFunction1(getCopyright), getCopyrightCollection = js.Any.fromFunction0(getCopyrightCollection), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), removeCopyright = js.Any.fromFunction1(removeCopyright), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[CopyrightControl]
  }
  
  @scala.inline
  implicit class CopyrightControlOps[Self <: CopyrightControl] (val x: Self) extends AnyVal {
    
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
    def setAddCopyright(value: Copyright => Unit): Self = this.set("addCopyright", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCopyright(value: Double => Copyright): Self = this.set("getCopyright", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCopyrightCollection(value: () => js.Array[Copyright]): Self = this.set("getCopyrightCollection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveCopyright(value: Double => Unit): Self = this.set("removeCopyright", js.Any.fromFunction1(value))
  }
}
