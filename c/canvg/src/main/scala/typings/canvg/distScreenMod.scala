package typings.canvg

import typings.canvg.distDocumentMod.AnimateElement
import typings.canvg.distDocumentMod.Document
import typings.canvg.distDocumentMod.Element
import typings.canvg.distMouseMod.Mouse
import typings.canvg.distTypesMod.Fetch
import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.distViewPortMod.ViewPort
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distScreenMod {
  
  @JSImport("canvg/dist/Screen", "Screen")
  @js.native
  open class Screen protected () extends StObject {
    def this(ctx: RenderingContext2D) = this()
    def this(ctx: RenderingContext2D, param1: IScreenOptions) = this()
    
    val animations: js.Array[AnimateElement] = js.native
    
    val ctx: RenderingContext2D = js.native
    
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def fetch(input: URL): js.Promise[Response] = js.native
    def fetch(input: URL, init: RequestInit): js.Promise[Response] = js.native
    
    /* private */ var frameDuration: Any = js.native
    
    /* private */ var intervalId: Any = js.native
    
    /* private */ var isFirstRender: Any = js.native
    
    def isReady(): Boolean = js.native
    
    /* private */ var isReadyLock: Any = js.native
    
    val mouse: Mouse = js.native
    
    def ready(): js.Promise[Unit] = js.native
    
    /* private */ var readyPromise: Any = js.native
    
    /* private */ var render: Any = js.native
    
    /* private */ var resolveReady: Any = js.native
    
    def setDefaults(ctx: RenderingContext2D): Unit = js.native
    
    def setViewBox(param0: IScreenViewBoxConfig): Unit = js.native
    
    /* private */ var shouldUpdate: Any = js.native
    
    def start(element: Element): Unit = js.native
    def start(element: Element, param1: IScreenStartOptions): Unit = js.native
    
    def stop(): Unit = js.native
    
    val viewPort: ViewPort = js.native
    
    def wait(checker: js.Function0[Boolean]): Unit = js.native
    
    /* private */ var waits: Any = js.native
    
    val window: Window | Null = js.native
  }
  /* static members */
  object Screen {
    
    @JSImport("canvg/dist/Screen", "Screen")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvg/dist/Screen", "Screen.FRAMERATE")
    @js.native
    def FRAMERATE: Double = js.native
    inline def FRAMERATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAMERATE")(x.asInstanceOf[js.Any])
    
    @JSImport("canvg/dist/Screen", "Screen.MAX_VIRTUAL_PIXELS")
    @js.native
    def MAX_VIRTUAL_PIXELS: Double = js.native
    inline def MAX_VIRTUAL_PIXELS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VIRTUAL_PIXELS")(x.asInstanceOf[js.Any])
    
    inline def defaultFetch(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    inline def defaultFetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    inline def defaultFetch(input: URL): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
    inline def defaultFetch(input: URL, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
    
    @JSImport("canvg/dist/Screen", "Screen.defaultWindow")
    @js.native
    val defaultWindow: Window & (/* globalThis */ Any) = js.native
  }
  
  trait IScreenOptions extends StObject {
    
    /**
      * WHATWG-compatible `fetch` function.
      */
    var fetch: js.UndefOr[Fetch] = js.undefined
    
    /**
      * Window object.
      */
    var window: js.UndefOr[Window | Null] = js.undefined
  }
  object IScreenOptions {
    
    inline def apply(): IScreenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScreenOptions]
    }
    
    extension [Self <: IScreenOptions](x: Self) {
      
      inline def setFetch(value: Fetch): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowNull: Self = StObject.set(x, "window", null)
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait IScreenStartOptions extends StObject {
    
    /**
      * Whether enable the redraw.
      */
    var enableRedraw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will call the function on every frame, if it returns true, will redraw.
      */
    var forceRedraw: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /**
      * Ignore animations.
      */
    var ignoreAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Does not clear canvas.
      */
    var ignoreClear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Does not try to resize canvas.
      */
    var ignoreDimensions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ignore mouse events.
      */
    var ignoreMouse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Draws at a x offset.
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /**
      * Draws at a y offset.
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /**
      * Scales vertically to height.
      */
    var scaleHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Scales horizontally to width.
      */
    var scaleWidth: js.UndefOr[Double] = js.undefined
  }
  object IScreenStartOptions {
    
    inline def apply(): IScreenStartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScreenStartOptions]
    }
    
    extension [Self <: IScreenStartOptions](x: Self) {
      
      inline def setEnableRedraw(value: Boolean): Self = StObject.set(x, "enableRedraw", value.asInstanceOf[js.Any])
      
      inline def setEnableRedrawUndefined: Self = StObject.set(x, "enableRedraw", js.undefined)
      
      inline def setForceRedraw(value: () => Boolean): Self = StObject.set(x, "forceRedraw", js.Any.fromFunction0(value))
      
      inline def setForceRedrawUndefined: Self = StObject.set(x, "forceRedraw", js.undefined)
      
      inline def setIgnoreAnimation(value: Boolean): Self = StObject.set(x, "ignoreAnimation", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAnimationUndefined: Self = StObject.set(x, "ignoreAnimation", js.undefined)
      
      inline def setIgnoreClear(value: Boolean): Self = StObject.set(x, "ignoreClear", value.asInstanceOf[js.Any])
      
      inline def setIgnoreClearUndefined: Self = StObject.set(x, "ignoreClear", js.undefined)
      
      inline def setIgnoreDimensions(value: Boolean): Self = StObject.set(x, "ignoreDimensions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDimensionsUndefined: Self = StObject.set(x, "ignoreDimensions", js.undefined)
      
      inline def setIgnoreMouse(value: Boolean): Self = StObject.set(x, "ignoreMouse", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMouseUndefined: Self = StObject.set(x, "ignoreMouse", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setScaleHeight(value: Double): Self = StObject.set(x, "scaleHeight", value.asInstanceOf[js.Any])
      
      inline def setScaleHeightUndefined: Self = StObject.set(x, "scaleHeight", js.undefined)
      
      inline def setScaleWidth(value: Double): Self = StObject.set(x, "scaleWidth", value.asInstanceOf[js.Any])
      
      inline def setScaleWidthUndefined: Self = StObject.set(x, "scaleWidth", js.undefined)
    }
  }
  
  trait IScreenViewBoxConfig extends StObject {
    
    var aspectRatio: String
    
    var clip: js.UndefOr[Boolean] = js.undefined
    
    var clipX: js.UndefOr[Double] = js.undefined
    
    var clipY: js.UndefOr[Double] = js.undefined
    
    var ctx: RenderingContext2D
    
    var desiredHeight: Double
    
    var desiredWidth: Double
    
    var document: Document
    
    var height: Double
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var refX: js.UndefOr[Double] = js.undefined
    
    var refY: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object IScreenViewBoxConfig {
    
    inline def apply(
      aspectRatio: String,
      ctx: RenderingContext2D,
      desiredHeight: Double,
      desiredWidth: Double,
      document: Document,
      height: Double,
      width: Double
    ): IScreenViewBoxConfig = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], desiredHeight = desiredHeight.asInstanceOf[js.Any], desiredWidth = desiredWidth.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewBoxConfig]
    }
    
    extension [Self <: IScreenViewBoxConfig](x: Self) {
      
      inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setClipX(value: Double): Self = StObject.set(x, "clipX", value.asInstanceOf[js.Any])
      
      inline def setClipXUndefined: Self = StObject.set(x, "clipX", js.undefined)
      
      inline def setClipY(value: Double): Self = StObject.set(x, "clipY", value.asInstanceOf[js.Any])
      
      inline def setClipYUndefined: Self = StObject.set(x, "clipY", js.undefined)
      
      inline def setCtx(value: RenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setDesiredHeight(value: Double): Self = StObject.set(x, "desiredHeight", value.asInstanceOf[js.Any])
      
      inline def setDesiredWidth(value: Double): Self = StObject.set(x, "desiredWidth", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setRefX(value: Double): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      inline def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      inline def setRefY(value: Double): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      inline def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
