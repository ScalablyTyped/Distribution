package typings.blueprintjsCore

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", "hide")
  @js.native
  def hide(): Unit = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", "isOpen")
  @js.native
  def isOpen(): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", "show")
  @js.native
  def show(menu: Element, offset: IOffset): Unit = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", "show")
  @js.native
  def show(menu: Element, offset: IOffset, onClose: js.UndefOr[scala.Nothing], isDarkTheme: Boolean): Unit = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", "show")
  @js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = js.native
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", "show")
  @js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = js.native
  
  @js.native
  trait IOffset extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object IOffset {
    
    @scala.inline
    def apply(left: Double, top: Double): IOffset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOffset]
    }
    
    @scala.inline
    implicit class IOffsetMutableBuilder[Self <: IOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
