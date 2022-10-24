package typings.canvg.mod

import typings.canvg.anon.CreateCanvas
import typings.canvg.anon.CreateImage
import typings.canvg.distPresetsNodeMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presets {
  
  @JSImport("canvg", "presets")
  @js.native
  val ^ : js.Any = js.native
  
  inline def node(param0: IConfig): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("node")(param0.asInstanceOf[js.Any]).asInstanceOf[CreateCanvas]
  
  inline def offscreen(): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")().asInstanceOf[CreateImage]
  inline def offscreen(param0: typings.canvg.distPresetsOffscreenMod.IConfig): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")(param0.asInstanceOf[js.Any]).asInstanceOf[CreateImage]
}
