package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "Renderer")
@js.native
open class Renderer ()
  extends typings.blackEngine.driversRendererMod.Renderer
/* static members */
object Renderer {
  
  @JSImport("black-engine", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("black-engine", "Renderer.__colorCache")
  @js.native
  val colorCache: typings.blackEngine.utilsMapMapMod.MapMap = js.native
  
  @JSImport("black-engine", "Renderer.__dirty")
  @js.native
  val dirty: Boolean = js.native
  
  inline def getColoredTexture(texture: typings.blackEngine.texturesTextureMod.Texture): typings.blackEngine.texturesTextureMod.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("getColoredTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  inline def getColoredTexture(texture: typings.blackEngine.texturesTextureMod.Texture, color: Double): typings.blackEngine.texturesTextureMod.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("getColoredTexture")(texture.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.texturesTextureMod.Texture]
  
  @JSImport("black-engine", "Renderer.skipUnchangedFrames")
  @js.native
  val skipUnchangedFrames: Boolean = js.native
}
