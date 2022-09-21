package typings.baseui

import typings.baseui.blockTypesMod.BlockProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioBoxTypesMod {
  
  trait AspectRatioBoxProps[T /* <: ElementType[Any] */]
    extends StObject
       with BlockProps[T] {
    
    /** Aspect ratio is width divided by height. */
    val aspectRatio: js.UndefOr[Double] = js.undefined
  }
  object AspectRatioBoxProps {
    
    inline def apply[T /* <: ElementType[Any] */](): AspectRatioBoxProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioBoxProps[T]]
    }
    
    extension [Self <: AspectRatioBoxProps[?], T /* <: ElementType[Any] */](x: Self & AspectRatioBoxProps[T]) {
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    }
  }
}
