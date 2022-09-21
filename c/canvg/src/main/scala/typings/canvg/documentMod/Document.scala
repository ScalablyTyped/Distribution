package typings.canvg.documentMod

import typings.canvg.canvgMod.Canvg
import typings.canvg.documentDocumentMod.IDocumentOptions
import typings.canvg.elementsMod.AnyElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg/dist/Document", "Document")
@js.native
open class Document protected ()
  extends typings.canvg.documentDocumentMod.Document {
  def this(canvg: Canvg) = this()
  def this(canvg: Canvg, hasRootEmSizeEmSizeCreateCanvasCreateImageAnonymousCrossOrigin: IDocumentOptions) = this()
}
/* static members */
object Document {
  
  @JSImport("canvg/dist/Document", "Document")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCanvas(width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  inline def createImage(src: String): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
  inline def createImage(src: String, anonymousCrossOrigin: Boolean): js.Promise[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(src.asInstanceOf[js.Any], anonymousCrossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLImageElement]]
  
  @JSImport("canvg/dist/Document", "Document.elementTypes")
  @js.native
  val elementTypes: Record[String, AnyElement] = js.native
}
