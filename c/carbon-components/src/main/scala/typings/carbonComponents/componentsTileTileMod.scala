package typings.carbonComponents

import typings.carbonComponents.carbonComponentsStrings.clickable
import typings.carbonComponents.carbonComponentsStrings.expandable
import typings.carbonComponents.carbonComponentsStrings.selectable
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTileTileMod {
  
  @JSImport("carbon-components/components/tile/tile", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Tile {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: TileOptions) = this()
    
    /* CompleteClass */
    override def _getClass(`type`: expandable | clickable | selectable): String = js.native
    
    /* CompleteClass */
    override def _hookActions(tileClass: String): Unit = js.native
    
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
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Tile extends StObject {
    
    def _getClass(`type`: expandable | clickable | selectable): String
    
    def _hookActions(tileClass: String): Unit
    
    def _setTileHeight(): Unit
    
    def release(): Unit
  }
  object Tile {
    
    inline def apply(
      _getClass: expandable | clickable | selectable => String,
      _hookActions: String => Unit,
      _setTileHeight: () => Unit,
      release: () => Unit
    ): Tile = {
      val __obj = js.Dynamic.literal(_getClass = js.Any.fromFunction1(_getClass), _hookActions = js.Any.fromFunction1(_hookActions), _setTileHeight = js.Any.fromFunction0(_setTileHeight), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[Tile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
      
      inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      inline def set_getClass(value: expandable | clickable | selectable => String): Self = StObject.set(x, "_getClass", js.Any.fromFunction1(value))
      
      inline def set_hookActions(value: String => Unit): Self = StObject.set(x, "_hookActions", js.Any.fromFunction1(value))
      
      inline def set_setTileHeight(value: () => Unit): Self = StObject.set(x, "_setTileHeight", js.Any.fromFunction0(value))
    }
  }
  
  trait TileOptions extends StObject {
    
    var classClickableTile: String
    
    var classExpandedTile: String
    
    var classSelectableTile: String
    
    var selectorAboveTheFold: String
    
    var selectorInit: String
    
    var selectorTileInput: String
  }
  object TileOptions {
    
    inline def apply(
      classClickableTile: String,
      classExpandedTile: String,
      classSelectableTile: String,
      selectorAboveTheFold: String,
      selectorInit: String,
      selectorTileInput: String
    ): TileOptions = {
      val __obj = js.Dynamic.literal(classClickableTile = classClickableTile.asInstanceOf[js.Any], classExpandedTile = classExpandedTile.asInstanceOf[js.Any], classSelectableTile = classSelectableTile.asInstanceOf[js.Any], selectorAboveTheFold = selectorAboveTheFold.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorTileInput = selectorTileInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileOptions] (val x: Self) extends AnyVal {
      
      inline def setClassClickableTile(value: String): Self = StObject.set(x, "classClickableTile", value.asInstanceOf[js.Any])
      
      inline def setClassExpandedTile(value: String): Self = StObject.set(x, "classExpandedTile", value.asInstanceOf[js.Any])
      
      inline def setClassSelectableTile(value: String): Self = StObject.set(x, "classSelectableTile", value.asInstanceOf[js.Any])
      
      inline def setSelectorAboveTheFold(value: String): Self = StObject.set(x, "selectorAboveTheFold", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorTileInput(value: String): Self = StObject.set(x, "selectorTileInput", value.asInstanceOf[js.Any])
    }
  }
}
