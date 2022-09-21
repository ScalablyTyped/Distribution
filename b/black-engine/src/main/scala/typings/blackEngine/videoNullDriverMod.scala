package typings.blackEngine

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.blackEngine.blendModeMod.BlendMode
import typings.blackEngine.canvasRenderTextureMod.CanvasRenderTexture
import typings.blackEngine.gameObjectMod.GameObject
import typings.blackEngine.matrixMod.Matrix
import typings.blackEngine.messageMod.Message
import typings.blackEngine.objectPoolMod.ObjectPool
import typings.blackEngine.rectangleMod.Rectangle
import typings.blackEngine.renderSessionMod.RenderSession
import typings.blackEngine.rendererMod.Renderer
import typings.blackEngine.textureMod.Texture
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoNullDriverMod {
  
  @JSImport("black-engine/drivers/VideoNullDriver", "VideoNullDriver")
  @js.native
  open class VideoNullDriver protected () extends StObject {
    def this(containerElement: HTMLElement, width: Double, height: Double) = this()
    
    /* protected */ def __collectParentRenderables(session: RenderSession, gameObject: GameObject, parentRenderer: Renderer): Unit = js.native
    
    /* protected */ def __onResize(msg: Message, rect: Rectangle): Unit = js.native
    
    /* private */ var __restoreSession: Any = js.native
    
    /* private */ var __saveSession: Any = js.native
    
    /* protected */ def beginClip(clipRect: Rectangle, px: Double, py: Double): Unit = js.native
    
    /* protected */ def beginFrame(): Unit = js.native
    
    /* protected */ def clear(): Unit = js.native
    
    def context: Any = js.native
    
    def dispose(): Unit = js.native
    
    def drawTexture(texture: Texture): Unit = js.native
    
    def drawTextureWithOffset(texture: Texture, ox: Double, oy: Double): Unit = js.native
    
    /* protected */ def endClip(): Unit = js.native
    
    /* protected */ def endFrame(): Unit = js.native
    
    /* protected */ def getGlobalAlpha(): Double = js.native
    
    def getGlobalBlendMode(): BlendMode | Null = js.native
    
    def getRenderer(`type`: String, owner: GameObject): Renderer = js.native
    
    def getTextureFromCanvas(canvas: HTMLCanvasElement): Texture = js.native
    
    /* protected */ var mActiveSession: RenderSession = js.native
    
    /* protected */ var mClientHeight: Double = js.native
    
    /* protected */ var mClientWidth: Double = js.native
    
    /* protected */ var mContainerElement: HTMLElement = js.native
    
    /* protected */ var mDevicePixelRatio: Double = js.native
    
    /* protected */ var mGlobalAlpha: Double = js.native
    
    /* protected */ var mGlobalBlendMode: BlendMode | Null = js.native
    
    /* protected */ var mIdentityMatrix: Matrix = js.native
    
    /* protected */ var mLastRenderTexture: Any = js.native
    
    /* protected */ var mRendererMap: StringDictionary[Instantiable0[Renderer]] = js.native
    
    /* protected */ var mSessions: js.Array[RenderSession] = js.native
    
    /* protected */ var mSnapToPixels: Boolean = js.native
    
    /* protected */ var mStageRenderer: Renderer = js.native
    
    /* protected */ var mTransform: Matrix = js.native
    
    def render(gameObject: GameObject): Unit = js.native
    def render(gameObject: GameObject, renderTexture: Unit, customTransform: Matrix): Unit = js.native
    def render(gameObject: GameObject, renderTexture: CanvasRenderTexture): Unit = js.native
    def render(gameObject: GameObject, renderTexture: CanvasRenderTexture, customTransform: Matrix): Unit = js.native
    
    def renderScaleFactor: Double = js.native
    
    def setGlobalAlpha(value: Double): Unit = js.native
    
    def setGlobalBlendMode(): Unit = js.native
    def setGlobalBlendMode(value: BlendMode): Unit = js.native
    
    def setSnapToPixels(value: Boolean): Unit = js.native
    
    def setTransform(m: Matrix): Unit = js.native
    
    /* protected */ def start(): Unit = js.native
  }
  object VideoNullDriver {
    
    @JSImport("black-engine/drivers/VideoNullDriver", "VideoNullDriver.sessionPool")
    @js.native
    val sessionPool: ObjectPool = js.native
  }
}
