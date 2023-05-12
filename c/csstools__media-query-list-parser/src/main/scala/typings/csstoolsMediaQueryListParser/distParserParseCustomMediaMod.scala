package typings.csstoolsMediaQueryListParser

import typings.csstoolsCssTokenizer.distInterfacesTokenMod.CSSToken
import typings.csstoolsCssTokenizer.mod.ParseError
import typings.csstoolsMediaQueryListParser.csstoolsMediaQueryListParserBooleans.`false`
import typings.csstoolsMediaQueryListParser.distNodesCustomMediaMod.CustomMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserParseCustomMediaMod {
  
  @JSImport("@csstools/media-query-list-parser/dist/parser/parse-custom-media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCustomMedia(source: String): CustomMedia | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMedia")(source.asInstanceOf[js.Any]).asInstanceOf[CustomMedia | `false`]
  inline def parseCustomMedia(source: String, options: Options): CustomMedia | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMedia")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomMedia | `false`]
  
  inline def parseCustomMediaFromTokens(tokens: js.Array[CSSToken]): CustomMedia | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMediaFromTokens")(tokens.asInstanceOf[js.Any]).asInstanceOf[CustomMedia | `false`]
  inline def parseCustomMediaFromTokens(tokens: js.Array[CSSToken], options: Options): CustomMedia | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCustomMediaFromTokens")(tokens.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CustomMedia | `false`]
  
  trait Options extends StObject {
    
    var onParseError: js.UndefOr[js.Function1[/* error */ ParseError, Unit]] = js.undefined
    
    var preserveInvalidMediaQueries: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setPreserveInvalidMediaQueries(value: Boolean): Self = StObject.set(x, "preserveInvalidMediaQueries", value.asInstanceOf[js.Any])
      
      inline def setPreserveInvalidMediaQueriesUndefined: Self = StObject.set(x, "preserveInvalidMediaQueries", js.undefined)
    }
  }
}
