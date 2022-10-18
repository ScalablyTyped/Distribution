package typings.canvg

import typings.canvg.distDocumentDocumentMod.IDocumentOptions
import typings.canvg.distDocumentMod.Document
import typings.canvg.distParserMod.IParserOptions
import typings.canvg.distParserMod.Parser
import typings.canvg.distScreenMod.IScreenStartOptions
import typings.canvg.distScreenMod.Screen
import typings.canvg.distTypesMod.RenderingContext2D
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCanvgMod {
  
  @JSImport("canvg/dist/Canvg", "Canvg")
  @js.native
  open class Canvg protected () extends StObject {
    /**
      * Main constructor.
      * @param ctx - Rendering context.
      * @param svg - SVG Document.
      * @param options - Rendering options.
      */
    def this(ctx: RenderingContext2D, svg: DOMDocument) = this()
    def this(ctx: RenderingContext2D, svg: DOMDocument, options: IOptions) = this()
    
    /**
      * Canvg Document.
      */
    val document: Document = js.native
    
    /* private */ val documentElement: Any = js.native
    
    /**
      * Create new Canvg instance with inherited options.
      * @param ctx - Rendering context.
      * @param svg - SVG source string or URL.
      * @param options - Rendering options.
      * @returns Canvg instance.
      */
    def fork(ctx: RenderingContext2D, svg: String): js.Promise[Canvg] = js.native
    def fork(ctx: RenderingContext2D, svg: String, options: IOptions): js.Promise[Canvg] = js.native
    
    /**
      * Create new Canvg instance with inherited options.
      * @param ctx - Rendering context.
      * @param svg - SVG source string.
      * @param options - Rendering options.
      * @returns Canvg instance.
      */
    def forkString(ctx: RenderingContext2D, svg: String): Canvg = js.native
    def forkString(ctx: RenderingContext2D, svg: String, options: IOptions): Canvg = js.native
    
    /**
      * Document is ready value.
      * @returns Is ready or not.
      */
    def isReady(): Boolean = js.native
    
    /* private */ val options: Any = js.native
    
    /**
      * XML/HTML parser instance.
      */
    val parser: Parser = js.native
    
    /**
      * Document is ready promise.
      * @returns Ready promise.
      */
    def ready(): js.Promise[Unit] = js.native
    
    /**
      * Render only first frame, ignoring animations and mouse.
      * @param options - Rendering options.
      */
    def render(): js.Promise[Unit] = js.native
    def render(options: IScreenStartOptions): js.Promise[Unit] = js.native
    
    /**
      * Resize SVG to fit in given size.
      * @param width
      * @param height
      * @param preserveAspectRatio
      */
    def resize(width: Double): Unit = js.native
    def resize(width: Double, height: Double): Unit = js.native
    def resize(width: Double, height: Double, preserveAspectRatio: String): Unit = js.native
    def resize(width: Double, height: Double, preserveAspectRatio: Boolean): Unit = js.native
    def resize(width: Double, height: Unit, preserveAspectRatio: String): Unit = js.native
    def resize(width: Double, height: Unit, preserveAspectRatio: Boolean): Unit = js.native
    
    /**
      * Screen instance.
      */
    val screen: Screen = js.native
    
    /**
      * Start rendering.
      * @param options - Render options.
      */
    def start(): Unit = js.native
    def start(options: IScreenStartOptions): Unit = js.native
    
    /**
      * Stop rendering.
      */
    def stop(): Unit = js.native
  }
  /* static members */
  object Canvg {
    
    @JSImport("canvg/dist/Canvg", "Canvg")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create Canvg instance from SVG source string or URL.
      * @param ctx - Rendering context.
      * @param svg - SVG source string or URL.
      * @param options - Rendering options.
      * @returns Canvg instance.
      */
    inline def from(ctx: RenderingContext2D, svg: String): js.Promise[Canvg] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Canvg]]
    inline def from(ctx: RenderingContext2D, svg: String, options: IOptions): js.Promise[Canvg] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Canvg]]
    
    /**
      * Create Canvg instance from SVG source string.
      * @param ctx - Rendering context.
      * @param svg - SVG source string.
      * @param options - Rendering options.
      * @returns Canvg instance.
      */
    inline def fromString(ctx: RenderingContext2D, svg: String): Canvg = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[Canvg]
    inline def fromString(ctx: RenderingContext2D, svg: String, options: IOptions): Canvg = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(ctx.asInstanceOf[js.Any], svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Canvg]
  }
  
  type DOMDocument = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.document */ Any
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.canvg.distScreenMod.IScreenOptions because var conflicts: fetch. Inlined window */ trait IOptions
    extends StObject
       with IParserOptions
       with IScreenStartOptions
       with IDocumentOptions {
    
    /**
      * Window object.
      */
    var window: js.UndefOr[Window | Null] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowNull: Self = StObject.set(x, "window", null)
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
