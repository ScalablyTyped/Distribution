package typings.canvg

import typings.canvg.anon.CreateImage
import typings.canvg.typesMod.DOMParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("canvg/dist/presets/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def node(hasDOMParserCanvasFetch: IConfig): CreateImage = ^.asInstanceOf[js.Dynamic].applyDynamic("node")(hasDOMParserCanvasFetch.asInstanceOf[js.Any]).asInstanceOf[CreateImage]
  
  /**
    * WHATWG-compatible `fetch` function.
    */
  type Fetch = js.Function2[/* input */ Any, /* config */ js.UndefOr[Any], js.Promise[Any]]
  
  /**
    * `node-canvas` exports.
    */
  trait ICanvas extends StObject {
    
    def createCanvas(width: Double, height: Double): Any
    
    def loadImage(src: String): js.Promise[Any]
  }
  object ICanvas {
    
    inline def apply(createCanvas: (Double, Double) => Any, loadImage: String => js.Promise[Any]): ICanvas = {
      val __obj = js.Dynamic.literal(createCanvas = js.Any.fromFunction2(createCanvas), loadImage = js.Any.fromFunction1(loadImage))
      __obj.asInstanceOf[ICanvas]
    }
    
    extension [Self <: ICanvas](x: Self) {
      
      inline def setCreateCanvas(value: (Double, Double) => Any): Self = StObject.set(x, "createCanvas", js.Any.fromFunction2(value))
      
      inline def setLoadImage(value: String => js.Promise[Any]): Self = StObject.set(x, "loadImage", js.Any.fromFunction1(value))
    }
  }
  
  trait IConfig extends StObject {
    
    /**
      * XML/HTML parser from string into DOM Document.
      */
    var DOMParser: typings.canvg.typesMod.DOMParser
    
    /**
      * `node-canvas` exports.
      */
    var canvas: ICanvas
    
    /**
      * WHATWG-compatible `fetch` function.
      */
    def fetch(input: Any): js.Promise[Any]
    def fetch(input: Any, config: Any): js.Promise[Any]
    /**
      * WHATWG-compatible `fetch` function.
      */
    @JSName("fetch")
    var fetch_Original: Fetch
  }
  object IConfig {
    
    inline def apply(
      DOMParser: DOMParser,
      canvas: ICanvas,
      fetch: (/* input */ Any, /* config */ js.UndefOr[Any]) => js.Promise[Any]
    ): IConfig = {
      val __obj = js.Dynamic.literal(DOMParser = DOMParser.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], fetch = js.Any.fromFunction2(fetch))
      __obj.asInstanceOf[IConfig]
    }
    
    extension [Self <: IConfig](x: Self) {
      
      inline def setCanvas(value: ICanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setDOMParser(value: DOMParser): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setFetch(value: (/* input */ Any, /* config */ js.UndefOr[Any]) => js.Promise[Any]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    }
  }
}
