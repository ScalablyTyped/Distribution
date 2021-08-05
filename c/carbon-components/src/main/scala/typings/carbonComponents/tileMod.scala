package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileMod {
  
  @JSImport("carbon-components/components/tile/tile", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Tile {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _getClass(`type`: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def _hookActions(tileClass: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def _setTileHeight(): Unit = js.native
    
    /* CompleteClass */
    override def release(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/tile/tile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/tile/tile", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Tile extends StObject {
    
    def _getClass(`type`: js.Any): js.Any
    
    def _hookActions(tileClass: js.Any): Unit
    
    def _setTileHeight(): Unit
    
    def release(): Unit
  }
  object Tile {
    
    inline def apply(
      _getClass: js.Any => js.Any,
      _hookActions: js.Any => Unit,
      _setTileHeight: () => Unit,
      release: () => Unit
    ): Tile = {
      val __obj = js.Dynamic.literal(_getClass = js.Any.fromFunction1(_getClass), _hookActions = js.Any.fromFunction1(_hookActions), _setTileHeight = js.Any.fromFunction0(_setTileHeight), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[Tile]
    }
    
    extension [Self <: Tile](x: Self) {
      
      inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      inline def set_getClass(value: js.Any => js.Any): Self = StObject.set(x, "_getClass", js.Any.fromFunction1(value))
      
      inline def set_hookActions(value: js.Any => Unit): Self = StObject.set(x, "_hookActions", js.Any.fromFunction1(value))
      
      inline def set_setTileHeight(value: () => Unit): Self = StObject.set(x, "_setTileHeight", js.Any.fromFunction0(value))
    }
  }
}
