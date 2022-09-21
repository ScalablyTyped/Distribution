package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformTypesMod {
  
  trait ITransform extends StObject {
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D): Unit
    
    def applyToPoint(point: Point): Unit
    
    var `type`: String
    
    def unapply(ctx: RenderingContext2D): Unit
  }
  object ITransform {
    
    inline def apply(
      apply: RenderingContext2D => Unit,
      applyToPoint: Point => Unit,
      `type`: String,
      unapply: RenderingContext2D => Unit
    ): ITransform = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), applyToPoint = js.Any.fromFunction1(applyToPoint), unapply = js.Any.fromFunction1(unapply))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransform]
    }
    
    extension [Self <: ITransform](x: Self) {
      
      inline def setApply(value: RenderingContext2D => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyToPoint(value: Point => Unit): Self = StObject.set(x, "applyToPoint", js.Any.fromFunction1(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnapply(value: RenderingContext2D => Unit): Self = StObject.set(x, "unapply", js.Any.fromFunction1(value))
    }
  }
}
