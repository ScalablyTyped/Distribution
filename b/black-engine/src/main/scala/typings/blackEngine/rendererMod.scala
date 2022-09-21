package typings.blackEngine

import typings.blackEngine.blendModeMod.BlendMode
import typings.blackEngine.displayObjectMod.DisplayObject
import typings.blackEngine.mapMapMod.MapMap
import typings.blackEngine.renderSessionMod.RenderSession
import typings.blackEngine.textureMod.Texture
import typings.blackEngine.videoNullDriverMod.VideoNullDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("black-engine/drivers/Renderer", "Renderer")
  @js.native
  open class Renderer () extends StObject {
    
    var alpha: Double = js.native
    
    def begin(driver: VideoNullDriver, session: RenderSession): Unit = js.native
    
    var blendMode: BlendMode = js.native
    
    var color: Double | Null = js.native
    
    def end(driver: VideoNullDriver, session: RenderSession): Unit = js.native
    
    var endPassRequired: Boolean = js.native
    
    var endPassRequiredAt: Double = js.native
    
    var gameObject: DisplayObject | Null = js.native
    
    var parent: Renderer | Null = js.native
    
    def preRender(driver: VideoNullDriver, session: RenderSession): Unit = js.native
    
    def render(driver: VideoNullDriver, session: RenderSession): Unit = js.native
    
    var skipChildren: Boolean = js.native
    
    var skipSelf: Boolean = js.native
    
    def upload(driver: VideoNullDriver, session: RenderSession): Unit = js.native
  }
  /* static members */
  object Renderer {
    
    @JSImport("black-engine/drivers/Renderer", "Renderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/drivers/Renderer", "Renderer.__colorCache")
    @js.native
    val colorCache: MapMap = js.native
    
    @JSImport("black-engine/drivers/Renderer", "Renderer.__dirty")
    @js.native
    val dirty: Boolean = js.native
    
    inline def getColoredTexture(texture: Texture): Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("getColoredTexture")(texture.asInstanceOf[js.Any]).asInstanceOf[Texture]
    inline def getColoredTexture(texture: Texture, color: Double): Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("getColoredTexture")(texture.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Texture]
    
    @JSImport("black-engine/drivers/Renderer", "Renderer.skipUnchangedFrames")
    @js.native
    val skipUnchangedFrames: Boolean = js.native
  }
}
