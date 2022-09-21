package typings.blackEngine

import typings.blackEngine.rectangleMod.Rectangle
import typings.blackEngine.vectorMod.Vector
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textureMod {
  
  @JSImport("black-engine/textures/Texture", "Texture")
  @js.native
  open class Texture protected () extends StObject {
    def this(
      nativeElement: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement,
      region: js.UndefOr[Rectangle],
      untrimmedRegion: js.UndefOr[Rectangle],
      scale: js.UndefOr[Double],
      registrationPoint: js.UndefOr[Vector],
      slice9borders: js.UndefOr[Rectangle]
    ) = this()
    
    def displayHeight: Double = js.native
    
    def displayWidth: Double = js.native
    
    def height: Double = js.native
    
    def id: Double = js.native
    
    def isValid: Boolean = js.native
    
    /* private */ var mDisplayHeight: Any = js.native
    
    /* private */ var mDisplayWidth: Any = js.native
    
    var mId: Double = js.native
    
    /* private */ var mNative: Any = js.native
    
    /* private */ var mNativeHeight: Any = js.native
    
    /* private */ var mNativeWidth: Any = js.native
    
    /* private */ var mRegion: Any = js.native
    
    /* private */ var mRegistrationPoint: Any = js.native
    
    /* private */ var mRenderHeight: Any = js.native
    
    /* private */ var mRenderWidth: Any = js.native
    
    /* private */ var mScale: Any = js.native
    
    /* private */ var mSlice9borders: Any = js.native
    
    /* private */ var mUntrimmedRegion: Any = js.native
    
    /* private */ var mValid: Any = js.native
    
    def native: HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    def nativeHeight: Double = js.native
    
    def nativeWidth: Double = js.native
    
    def region: Rectangle = js.native
    
    def registrationPoint: Any = js.native
    
    def renderHeight: Double = js.native
    
    def renderWidth: Double = js.native
    
    def scale: Double = js.native
    
    def set(nativeElement: HTMLCanvasElement): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Unit, untrimmedRegion: Unit, scale: Double): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Unit, untrimmedRegion: Rectangle): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Unit, untrimmedRegion: Rectangle, scale: Double): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Rectangle): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Rectangle, untrimmedRegion: Unit, scale: Double): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Rectangle, untrimmedRegion: Rectangle): Unit = js.native
    def set(nativeElement: HTMLCanvasElement, region: Rectangle, untrimmedRegion: Rectangle, scale: Double): Unit = js.native
    def set(nativeElement: HTMLImageElement): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Unit, untrimmedRegion: Unit, scale: Double): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Unit, untrimmedRegion: Rectangle): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Unit, untrimmedRegion: Rectangle, scale: Double): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Rectangle): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Rectangle, untrimmedRegion: Unit, scale: Double): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Rectangle, untrimmedRegion: Rectangle): Unit = js.native
    def set(nativeElement: HTMLImageElement, region: Rectangle, untrimmedRegion: Rectangle, scale: Double): Unit = js.native
    def set(nativeElement: HTMLVideoElement): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Unit, untrimmedRegion: Unit, scale: Double): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Unit, untrimmedRegion: Rectangle): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Unit, untrimmedRegion: Rectangle, scale: Double): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Rectangle): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Rectangle, untrimmedRegion: Unit, scale: Double): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Rectangle, untrimmedRegion: Rectangle): Unit = js.native
    def set(nativeElement: HTMLVideoElement, region: Rectangle, untrimmedRegion: Rectangle, scale: Double): Unit = js.native
    
    def slice9borders: Rectangle = js.native
    
    def untrimmedRegion: Rectangle = js.native
    
    def width: Double = js.native
  }
  /* static members */
  object Texture {
    
    @JSImport("black-engine/textures/Texture", "Texture")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBase64String(string: String): Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(string.asInstanceOf[js.Any]).asInstanceOf[Texture]
    
    inline def fromCanvas(canvas: HTMLCanvasElement): Texture | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvas")(canvas.asInstanceOf[js.Any]).asInstanceOf[Texture | Null]
    
    inline def fromCanvasAsImage(canvas: Element): Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any]).asInstanceOf[Texture]
    inline def fromCanvasAsImage(canvas: Element, `type`: String): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Texture]
    inline def fromCanvasAsImage(canvas: Element, `type`: String, quality: Double): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Texture]
    inline def fromCanvasAsImage(canvas: Element, `type`: Unit, quality: Double): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvasAsImage")(canvas.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Texture]
    
    inline def getScaleFactorFromName(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFactorFromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def removeScaleFactorFromName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeScaleFactorFromName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
