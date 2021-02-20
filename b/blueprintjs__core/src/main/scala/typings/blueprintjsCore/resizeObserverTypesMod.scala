package typings.blueprintjsCore

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeObserverTypesMod {
  
  @js.native
  trait IDOMRectReadOnly extends StObject {
    
    val bottom: Double = js.native
    
    val height: Double = js.native
    
    val left: Double = js.native
    
    val right: Double = js.native
    
    val top: Double = js.native
    
    val width: Double = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
  object IDOMRectReadOnly {
    
    @scala.inline
    def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): IDOMRectReadOnly = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDOMRectReadOnly]
    }
    
    @scala.inline
    implicit class IDOMRectReadOnlyMutableBuilder[Self <: IDOMRectReadOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResizeEntry extends StObject {
    
    /** Measured dimensions of the target. */
    val contentRect: IDOMRectReadOnly = js.native
    
    /** The resized element. */
    val target: Element = js.native
  }
  object IResizeEntry {
    
    @scala.inline
    def apply(contentRect: IDOMRectReadOnly, target: Element): IResizeEntry = {
      val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResizeEntry]
    }
    
    @scala.inline
    implicit class IResizeEntryMutableBuilder[Self <: IResizeEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentRect(value: IDOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
