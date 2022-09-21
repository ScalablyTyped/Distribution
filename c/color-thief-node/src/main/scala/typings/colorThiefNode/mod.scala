package typings.colorThiefNode

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-thief-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getColor(sourceImage: HTMLImageElement): js.Promise[Palette] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(sourceImage.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Palette]]
  inline def getColor(sourceImage: HTMLImageElement, quality: Double): js.Promise[Palette] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(sourceImage.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Palette]]
  
  inline def getColorFromURL(imageURL: String): js.Promise[Palette] = ^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromURL")(imageURL.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Palette]]
  inline def getColorFromURL(imageURL: String, quality: Double): js.Promise[Palette] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorFromURL")(imageURL.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Palette]]
  
  inline def getPaletteFromURL(URL: String): js.Promise[js.Array[Palette]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaletteFromURL")(URL.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Palette]]]
  inline def getPaletteFromURL(URL: String, colorCount: Double): js.Promise[js.Array[Palette]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaletteFromURL")(URL.asInstanceOf[js.Any], colorCount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Palette]]]
  inline def getPaletteFromURL(URL: String, colorCount: Double, quality: Double): js.Promise[js.Array[Palette]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaletteFromURL")(URL.asInstanceOf[js.Any], colorCount.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Palette]]]
  inline def getPaletteFromURL(URL: String, colorCount: Unit, quality: Double): js.Promise[js.Array[Palette]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPaletteFromURL")(URL.asInstanceOf[js.Any], colorCount.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Palette]]]
  
  type Palette = js.Tuple3[/* red */ Double, /* green */ Double, /* blue */ Double]
}
