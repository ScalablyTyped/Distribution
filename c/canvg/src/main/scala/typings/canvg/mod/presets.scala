package typings.canvg.mod

import typings.canvg.anon.CreateCanvas
import typings.canvg.anon.CreateImage
import typings.canvg.nodeMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presets {
  
  @JSImport("canvg", "presets")
  @js.native
  val ^ : js.Any = js.native
  
  inline def node(hasDOMParserCanvasFetch: IConfig): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("node")(hasDOMParserCanvasFetch.asInstanceOf[js.Any]).asInstanceOf[CreateImage]
  
  inline def offscreen(): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")().asInstanceOf[CreateCanvas]
  inline def offscreen(hasDOMParserFallback: typings.canvg.offscreenMod.IConfig): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")(hasDOMParserFallback.asInstanceOf[js.Any]).asInstanceOf[CreateCanvas]
}
