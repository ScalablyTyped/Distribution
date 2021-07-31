package typings.canvasRenderer

import org.scalablytyped.runtime.StringDictionary
import typings.canvasRenderer.canvasContextMod.CanvasContext
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @js.native
  trait Canvas extends StObject {
    
    /**
      * Specifies the background color. Default is fully transparent. Allowed values are:
      * - 32 bit integers on the format `0xRRGGBBAA`
      * - strings on the format `"#RGB"`
      * - strings on the format `"#RGBA"`
      * - strings on the format `"#RRGGBB"`
      * - strings on the format `"#RRGGBBAA"`
      * - strings on the format `"rgb(255, 255, 255)"`
      * - strings on the format `"rgb(255, 255, 255, 0.5)"`
      * - strings on the format `"rgb(255, 255, 255, 50%)"`
      * - strings on the format `"rgba(255, 255, 255, 0.5)"`
      * - strings on the format `"rgba(255, 255, 255, 50%)"`
      * - strings on the format `"hsl(134, 50%, 50%)"`
      * - strings on the format `"hsl(134, 50%, 50%, 0.5)"`
      * - strings on the format `"hsl(134, 50%, 50%, 50%)"`
      * - strings on the format `"hsla(134, 50%, 50%, 0.5)"`
      * - strings on the format `"hsla(134, 50%, 50%, 50%)"`
      * - strings on the format `"hwb(134, 50%, 50%)"`
      * - strings on the format `"hwb(134, 50%, 50%, 0.5)"`
      * - strings on the format `"hwb(134, 50%, 50%, 50%)"`
      */
    var backColor: Double | String = js.native
    
    /**
      * Gets a context used to draw polygons on this canvas.
      * @param contextId Type of context. Only `"2d"` is supported, and also the default value.
      * @param contextAttributes Options passed to the context. Currently no options are supported. Provided for compatibility with `HTMLCanvasElement`.
      */
    def getContext(): CanvasContext = js.native
    def getContext(contextId: String): CanvasContext = js.native
    def getContext(contextId: String, contextAttributes: js.Object): CanvasContext = js.native
    def getContext(contextId: Unit, contextAttributes: js.Object): CanvasContext = js.native
    
    /**
      * The height of the canvas in pixels.
      */
    var height: Double = js.native
    
    /**
      * Renders the canvas as a data URI.
      * @param type Content type of returned image. Only `"image/png"` is supported, and also the default value.
      * @param encoderOptions Options passed to the image encoder. Currently no options are recognized. Provided for compatibility with `HTMLCanvasElement`.
      */
    def toDataURL(): String = js.native
    def toDataURL(`type`: String): String = js.native
    def toDataURL(`type`: String, encoderOptions: js.Any): String = js.native
    def toDataURL(`type`: Unit, encoderOptions: js.Any): String = js.native
    
    /**
      * Renders the canvas as a PNG data stream.
      * @param keywords Keywords to be written to the PNG stream. See https://www.w3.org/TR/PNG/#11keywords.
      */
    def toPng(): Buffer = js.native
    def toPng(keywords: StringDictionary[String]): Buffer = js.native
    
    /**
      * The width of the canvas in pixels.
      */
    var width: Double = js.native
  }
}
