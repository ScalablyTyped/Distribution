package typings.canvg

import typings.canvg.anon.FnCall
import typings.canvg.canvgMod.Canvg
import typings.canvg.distTypesMod.RenderingContext2D
import typings.canvg.elementMod.Element
import typings.canvg.elementsMod.AnyElement
import typings.canvg.imageElementMod.ImageElement
import typings.canvg.propertyMod.Property
import typings.canvg.screenMod.Screen
import typings.canvg.svgelementMod.SVGElement
import typings.canvg.svgfontloaderMod.SVGFontLoader
import typings.canvg.textNodeMod.TextNode
import typings.offscreencanvas.OffscreenCanvas
import typings.std.CanvasImageSource
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentDocumentMod {
  
  @JSImport("canvg/dist/Document/Document", "Document")
  @js.native
  open class Document protected () extends StObject {
    def this(canvg: Canvg) = this()
    def this(canvg: Canvg, hasRootEmSizeEmSizeCreateCanvasCreateImageAnonymousCrossOrigin: IDocumentOptions) = this()
    
    /* private */ var bindCreateImage: Any = js.native
    
    val canvg: Canvg = js.native
    
    def createCanvas(width: Double, height: Double): HTMLCanvasElement | OffscreenCanvas = js.native
    
    def createDocumentElement(document: DOMDocument): SVGElement = js.native
    
    def createElement[T /* <: Element */](node: HTMLElement): T = js.native
    
    def createImage(src: String): js.Promise[CanvasImageSource] = js.native
    def createImage(src: String, anonymousCrossOrigin: Boolean): js.Promise[CanvasImageSource] = js.native
    
    def createTextNode(node: HTMLElement): TextNode = js.native
    
    def ctx: RenderingContext2D = js.native
    
    val definitions: Record[String, Element] = js.native
    
    var documentElement: js.UndefOr[SVGElement] = js.native
    
    def emSize: Double = js.native
    
    /* private */ val emSizeStack: Any = js.native
    
    def emSize_=(value: Double): Unit = js.native
    
    def fetch: FnCall = js.native
    
    val fonts: js.Array[SVGFontLoader] = js.native
    
    def getUniqueId(): String = js.native
    
    val images: js.Array[ImageElement] = js.native
    
    def isFontsLoaded(): Boolean = js.native
    
    def isImagesLoaded(): Boolean = js.native
    
    def popEmSize(): Unit = js.native
    
    var rootEmSize: Double = js.native
    
    val screen: Screen = js.native
    
    def setViewBox(config: IViewBoxConfig): Unit = js.native
    
    val styles: Record[String, Record[String, Property[Any]]] = js.native
    
    val stylesSpecificity: Record[String, String] = js.native
    
    /* private */ var uniqueId: Any = js.native
    
    def window: Window = js.native
  }
  /* static members */
  object Document {
    
    @JSImport("canvg/dist/Document/Document", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createCanvas(width: Double, height: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createCanvas")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
    
    inline def createImage(src: String): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
    inline def createImage(src: String, anonymousCrossOrigin: Boolean): js.Promise[HTMLImageElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImage")(src.asInstanceOf[js.Any], anonymousCrossOrigin.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLImageElement]]
    
    @JSImport("canvg/dist/Document/Document", "Document.elementTypes")
    @js.native
    val elementTypes: Record[String, AnyElement] = js.native
  }
  
  type CreateCanvas = js.Function2[/* width */ Double, /* height */ Double, HTMLCanvasElement | OffscreenCanvas]
  
  type CreateImage = js.Function2[
    /* src */ String, 
    /* anonymousCrossOrigin */ js.UndefOr[Boolean], 
    js.Promise[CanvasImageSource]
  ]
  
  type DOMDocument = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.document */ Any
  
  trait IDocumentOptions extends StObject {
    
    /**
      * Load images anonymously.
      */
    var anonymousCrossOrigin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to create new canvas.
      */
    var createCanvas: js.UndefOr[CreateCanvas] = js.undefined
    
    /**
      * Function to create new image.
      */
    var createImage: js.UndefOr[CreateImage] = js.undefined
    
    /**
      * Default `em` size.
      */
    var emSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Default `rem` size.
      */
    var rootEmSize: js.UndefOr[Double] = js.undefined
  }
  object IDocumentOptions {
    
    inline def apply(): IDocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDocumentOptions]
    }
    
    extension [Self <: IDocumentOptions](x: Self) {
      
      inline def setAnonymousCrossOrigin(value: Boolean): Self = StObject.set(x, "anonymousCrossOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnonymousCrossOriginUndefined: Self = StObject.set(x, "anonymousCrossOrigin", js.undefined)
      
      inline def setCreateCanvas(value: (/* width */ Double, /* height */ Double) => HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "createCanvas", js.Any.fromFunction2(value))
      
      inline def setCreateCanvasUndefined: Self = StObject.set(x, "createCanvas", js.undefined)
      
      inline def setCreateImage(
        value: (/* src */ String, /* anonymousCrossOrigin */ js.UndefOr[Boolean]) => js.Promise[CanvasImageSource]
      ): Self = StObject.set(x, "createImage", js.Any.fromFunction2(value))
      
      inline def setCreateImageUndefined: Self = StObject.set(x, "createImage", js.undefined)
      
      inline def setEmSize(value: Double): Self = StObject.set(x, "emSize", value.asInstanceOf[js.Any])
      
      inline def setEmSizeUndefined: Self = StObject.set(x, "emSize", js.undefined)
      
      inline def setRootEmSize(value: Double): Self = StObject.set(x, "rootEmSize", value.asInstanceOf[js.Any])
      
      inline def setRootEmSizeUndefined: Self = StObject.set(x, "rootEmSize", js.undefined)
    }
  }
  
  /* Inlined std.Omit<canvg.canvg/dist/Screen.IScreenViewBoxConfig, 'document'> */
  trait IViewBoxConfig extends StObject {
    
    var aspectRatio: String
    
    var clip: js.UndefOr[Boolean] = js.undefined
    
    var clipX: js.UndefOr[Double] = js.undefined
    
    var clipY: js.UndefOr[Double] = js.undefined
    
    var ctx: RenderingContext2D
    
    var desiredHeight: Double
    
    var desiredWidth: Double
    
    var height: Double
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var refX: js.UndefOr[Double] = js.undefined
    
    var refY: js.UndefOr[Double] = js.undefined
    
    var width: Double
  }
  object IViewBoxConfig {
    
    inline def apply(
      aspectRatio: String,
      ctx: RenderingContext2D,
      desiredHeight: Double,
      desiredWidth: Double,
      height: Double,
      width: Double
    ): IViewBoxConfig = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], desiredHeight = desiredHeight.asInstanceOf[js.Any], desiredWidth = desiredWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IViewBoxConfig]
    }
    
    extension [Self <: IViewBoxConfig](x: Self) {
      
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
