package typings.canvg

import typings.canvg.distDocumentMod.Document
import typings.canvg.distPointMod.Point
import typings.canvg.distPropertyMod.Property
import typings.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformScaleMod {
  
  @JSImport("canvg/dist/Transform/Scale", "Scale")
  @js.native
  open class Scale protected () extends StObject {
    def this(
      _underscore: Document,
      scale: String,
      transformOrigin: js.Tuple2[Property[String], Property[String]]
    ) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D): Unit = js.native
    
    def applyToPoint(point: Point): Unit = js.native
    
    /* private */ val originX: Any = js.native
    
    /* private */ val originY: Any = js.native
    
    /* private */ val scale: Any = js.native
    
    var `type`: String = js.native
    
    def unapply(ctx: RenderingContext2D): Unit = js.native
  }
}
