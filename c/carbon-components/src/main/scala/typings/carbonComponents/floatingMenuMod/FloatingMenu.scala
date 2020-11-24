package typings.carbonComponents.floatingMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait FloatingMenu extends js.Object {
  
  def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
  
  def _getContainer(): js.Any = js.native
  
  def _getPos(): js.Any = js.native
  
  def _handleKeydown(event: js.Any): Unit = js.native
  
  def _place(): Unit = js.native
  
  def _testStyles(): Unit = js.native
  
  def handleBlur(event: js.Any): Unit = js.native
  
  def release(): Unit = js.native
  
  def shouldStateBeChanged(state: js.Any): Boolean = js.native
}
object FloatingMenu {
  
  @scala.inline
  def apply(
    _changeState: (js.Any, js.Any, js.Any) => Unit,
    _getContainer: () => js.Any,
    _getPos: () => js.Any,
    _handleKeydown: js.Any => Unit,
    _place: () => Unit,
    _testStyles: () => Unit,
    handleBlur: js.Any => Unit,
    release: () => Unit,
    shouldStateBeChanged: js.Any => Boolean
  ): FloatingMenu = {
    val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction3(_changeState), _getContainer = js.Any.fromFunction0(_getContainer), _getPos = js.Any.fromFunction0(_getPos), _handleKeydown = js.Any.fromFunction1(_handleKeydown), _place = js.Any.fromFunction0(_place), _testStyles = js.Any.fromFunction0(_testStyles), handleBlur = js.Any.fromFunction1(handleBlur), release = js.Any.fromFunction0(release), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
    __obj.asInstanceOf[FloatingMenu]
  }
  
  @scala.inline
  implicit class FloatingMenuOps[Self <: FloatingMenu] (val x: Self) extends AnyVal {
    
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
    def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("_changeState", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_getContainer(value: () => js.Any): Self = this.set("_getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_getPos(value: () => js.Any): Self = this.set("_getPos", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_handleKeydown(value: js.Any => Unit): Self = this.set("_handleKeydown", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_place(value: () => Unit): Self = this.set("_place", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_testStyles(value: () => Unit): Self = this.set("_testStyles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleBlur(value: js.Any => Unit): Self = this.set("handleBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldStateBeChanged(value: js.Any => Boolean): Self = this.set("shouldStateBeChanged", js.Any.fromFunction1(value))
  }
}
