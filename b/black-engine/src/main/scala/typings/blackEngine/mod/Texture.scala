package typings.blackEngine.mod

import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Texture")
@js.native
open class Texture protected ()
  extends typings.blackEngine.texturesTextureMod.Texture {
  def this(
    nativeElement: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
    region: js.UndefOr[typings.blackEngine.geomRectangleMod.Rectangle],
    untrimmedRegion: js.UndefOr[typings.blackEngine.geomRectangleMod.Rectangle],
    scale: js.UndefOr[Double],
    registrationPoint: js.UndefOr[typings.blackEngine.geomVectorMod.Vector],
    slice9borders: js.UndefOr[typings.blackEngine.geomRectangleMod.Rectangle]
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("black-engine", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromBase64String(string: String): typings.blackEngine.texturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(string.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  
  inline def fromCanvas(canvas: HTMLCanvasElement): typings.blackEngine.texturesTextureMod.Texture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture | Null]
  
  inline def fromCanvasAsImage(canvas: Element): typings.blackEngine.texturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  inline def fromCanvasAsImage(canvas: Element, `type`: String): typings.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  inline def fromCanvasAsImage(canvas: Element, `type`: String, quality: Double): typings.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  inline def fromCanvasAsImage(canvas: Element, `type`: Unit, quality: Double): typings.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  
  inline def getScaleFactorFromName(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFactorFromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def removeScaleFactorFromName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeScaleFactorFromName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
