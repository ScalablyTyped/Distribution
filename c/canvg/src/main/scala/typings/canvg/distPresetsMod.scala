package typings.canvg

import typings.canvg.anon.CreateCanvas
import typings.canvg.anon.CreateImage
import typings.canvg.distPresetsNodeMod.IConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPresetsMod {
  
  @JSImport("canvg/dist/presets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def node(param0: IConfig): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("node")(param0.asInstanceOf[js.Any]).asInstanceOf[CreateImage]
  
  inline def offscreen(): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")().asInstanceOf[CreateCanvas]
  inline def offscreen(param0: typings.canvg.distPresetsOffscreenMod.IConfig): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")(param0.asInstanceOf[js.Any]).asInstanceOf[CreateCanvas]
}
