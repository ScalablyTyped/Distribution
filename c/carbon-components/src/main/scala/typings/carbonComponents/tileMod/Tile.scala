package typings.carbonComponents.tileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Tile extends js.Object {
  
  def _getClass(`type`: js.Any): js.Any = js.native
  
  def _hookActions(tileClass: js.Any): Unit = js.native
  
  def _setTileHeight(): Unit = js.native
  
  def release(): Unit = js.native
}
object Tile {
  
  @scala.inline
  def apply(
    _getClass: js.Any => js.Any,
    _hookActions: js.Any => Unit,
    _setTileHeight: () => Unit,
    release: () => Unit
  ): Tile = {
    val __obj = js.Dynamic.literal(_getClass = js.Any.fromFunction1(_getClass), _hookActions = js.Any.fromFunction1(_hookActions), _setTileHeight = js.Any.fromFunction0(_setTileHeight), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[Tile]
  }
  
  @scala.inline
  implicit class TileOps[Self <: Tile] (val x: Self) extends AnyVal {
    
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
    def set_getClass(value: js.Any => js.Any): Self = this.set("_getClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_hookActions(value: js.Any => Unit): Self = this.set("_hookActions", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_setTileHeight(value: () => Unit): Self = this.set("_setTileHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
  }
}
