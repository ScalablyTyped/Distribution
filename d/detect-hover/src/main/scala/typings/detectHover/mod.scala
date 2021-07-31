package typings.detectHover

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("detect-hover", JSImport.Default)
  @js.native
  val default: typings.detectHover.mod.detectHover = js.native
  
  type _To = typings.detectHover.mod.detectHover
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.detectHover.mod.detectHover = default
  
  trait detectHover extends StObject {
    
    var anyHover: Boolean
    
    var anyNone: Boolean
    
    var hover: Boolean
    
    var none: Boolean
    
    def update(): Unit
  }
  object detectHover {
    
    @scala.inline
    def apply(anyHover: Boolean, anyNone: Boolean, hover: Boolean, none: Boolean, update: () => Unit): typings.detectHover.mod.detectHover = {
      val __obj = js.Dynamic.literal(anyHover = anyHover.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[typings.detectHover.mod.detectHover]
    }
    
    @scala.inline
    implicit class detectHoverMutableBuilder[Self <: typings.detectHover.mod.detectHover] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnyHover(value: Boolean): Self = StObject.set(x, "anyHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyNone(value: Boolean): Self = StObject.set(x, "anyNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNone(value: Boolean): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
