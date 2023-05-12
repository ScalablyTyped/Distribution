package typings.csstoolsCascadeLayerNameParser

import typings.csstoolsCascadeLayerNameParser.distNodesLayerNameMod.LayerName
import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.mod.ParseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserParseMod {
  
  @JSImport("@csstools/cascade-layer-name-parser/dist/parser/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(source: String): js.Array[LayerName] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[LayerName]]
  inline def parse(source: String, options: Options): js.Array[LayerName] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[LayerName]]
  
  inline def parseFromTokens(tokens: js.Array[CSSToken]): js.Array[LayerName] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[js.Array[LayerName]]
  inline def parseFromTokens(tokens: js.Array[CSSToken], options: Options): js.Array[LayerName] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromTokens")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[LayerName]]
  
  trait Options extends StObject {
    
    var onParseError: js.UndefOr[js.Function1[/* error */ ParseError, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOnParseError(value: /* error */ ParseError => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
    }
  }
}
