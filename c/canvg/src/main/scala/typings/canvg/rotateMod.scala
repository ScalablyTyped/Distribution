package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentMod.Document
import typings.canvg.pointMod.Point
import typings.canvg.propertyMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotateMod {
  
  @JSImport("canvg/dist/Transform/Rotate", "Rotate")
  @js.native
  open class Rotate protected () extends StObject {
    def this(document: Document, rotate: String, transformOrigin: js.Tuple2[Property[String], Property[String]]) = this()
    
    /* private */ val angle: Any = js.native
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D): Unit = js.native
    
    def applyToPoint(point: Point): Unit = js.native
    
    /* private */ val cx: Any = js.native
    
    /* private */ val cy: Any = js.native
    
    /* private */ val originX: Any = js.native
    
    /* private */ val originY: Any = js.native
    
    var `type`: String = js.native
    
    def unapply(ctx: RenderingContext2D): Unit = js.native
  }
}
