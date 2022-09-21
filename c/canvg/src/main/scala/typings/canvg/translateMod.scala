package typings.canvg

import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.documentMod.Document
import typings.canvg.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translateMod {
  
  @JSImport("canvg/dist/Transform/Translate", "Translate")
  @js.native
  open class Translate protected () extends StObject {
    def this(_underscore: Document, point: String) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D): Unit = js.native
    
    def applyToPoint(point: Point): Unit = js.native
    
    /* private */ val point: Any = js.native
    
    var `type`: String = js.native
    
    def unapply(ctx: RenderingContext2D): Unit = js.native
  }
}
