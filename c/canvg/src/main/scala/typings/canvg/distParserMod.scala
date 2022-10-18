package typings.canvg

import typings.canvg.distTypesMod.Fetch
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserMod {
  
  @JSImport("canvg/dist/Parser", "Parser")
  @js.native
  open class Parser () extends StObject {
    def this(hasFetchDOMParser: IParserOptions) = this()
    
    /* private */ val DOMParser: Any = js.native
    
    /* private */ var checkDocument: Any = js.native
    
    /* private */ val fetch: Any = js.native
    
    def load(url: String): js.Promise[Document] = js.native
    
    def parse(resource: String): js.Promise[Document] = js.native
    
    def parseFromString(xml: String): Document = js.native
  }
  
  type DOMParserConstructor = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DOMParser */ Any
  
  trait IParserOptions extends StObject {
    
    /**
      * XML/HTML parser from string into DOM Document.
      */
    var DOMParser: js.UndefOr[DOMParserConstructor] = js.undefined
    
    /**
      * WHATWG-compatible `fetch` function.
      */
    var fetch: js.UndefOr[Fetch] = js.undefined
  }
  object IParserOptions {
    
    inline def apply(): IParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParserOptions]
    }
    
    extension [Self <: IParserOptions](x: Self) {
      
      inline def setDOMParser(value: DOMParserConstructor): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setDOMParserUndefined: Self = StObject.set(x, "DOMParser", js.undefined)
      
      inline def setFetch(value: Fetch): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    }
  }
}
