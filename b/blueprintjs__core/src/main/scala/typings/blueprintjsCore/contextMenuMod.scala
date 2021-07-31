package typings.blueprintjsCore

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/context-menu/contextMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  @scala.inline
  def isOpen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[Boolean]
  
  @scala.inline
  def show(menu: Element, offset: IOffset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], isDarkTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(menu: Element, offset: IOffset, onClose: Unit, isDarkTheme: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], isDarkTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IOffset extends StObject {
    
    var left: Double
    
    var top: Double
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
