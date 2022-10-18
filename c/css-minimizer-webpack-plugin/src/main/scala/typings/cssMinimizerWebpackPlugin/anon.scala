package typings.cssMinimizerWebpackPlugin

import typings.cssMinimizerWebpackPlugin.mod.MinimizerImplementation
import typings.cssMinimizerWebpackPlugin.mod.MinimizerOptions
import typings.cssMinimizerWebpackPlugin.mod.Parser
import typings.cssMinimizerWebpackPlugin.mod.RawSourceMap
import typings.cssMinimizerWebpackPlugin.mod.Stringifier
import typings.cssMinimizerWebpackPlugin.mod.Syntax
import typings.postcss.anon.PickProcessOptionsmapfrom
import typings.postcss.anon.ToString
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libRootMod.default
import typings.postcss.mod.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: String
    
    var map: js.UndefOr[RawSourceMap] = js.undefined
  }
  object Code {
    
    inline def apply(code: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  /* Inlined std.Error & {  plugin :string | undefined,   text :string | undefined,   source :string | undefined} */
  trait Errorpluginstringundefine extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    var plugin: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Errorpluginstringundefine {
    
    inline def apply(message: String, name: String): Errorpluginstringundefine = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errorpluginstringundefine]
    }
    
    extension [Self <: Errorpluginstringundefine](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var parser: js.UndefOr[String | Syntax | Parser] = js.undefined
    
    var stringifier: js.UndefOr[String | Syntax | Stringifier] = js.undefined
    
    var syntax: js.UndefOr[String | Syntax] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object From {
    
    inline def apply(): From = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setParser(value: String | Syntax | Parser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserFunction2(
        value: (/* css */ String | ToString, /* opts */ js.UndefOr[PickProcessOptionsmapfrom]) => default | typings.postcss.libDocumentMod.default
      ): Self = StObject.set(x, "parser", js.Any.fromFunction2(value))
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setStringifier(value: String | Syntax | Stringifier): Self = StObject.set(x, "stringifier", value.asInstanceOf[js.Any])
      
      inline def setStringifierFunction2(value: (/* node */ AnyNode, /* builder */ Builder) => Unit): Self = StObject.set(x, "stringifier", js.Any.fromFunction2(value))
      
      inline def setStringifierUndefined: Self = StObject.set(x, "stringifier", js.undefined)
      
      inline def setSyntax(value: String | Syntax): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait Implementation[T] extends StObject {
    
    var implementation: MinimizerImplementation[T]
    
    var options: MinimizerOptions[T]
  }
  object Implementation {
    
    inline def apply[T](implementation: MinimizerImplementation[T], options: MinimizerOptions[T]): Implementation[T] = {
      val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Implementation[T]]
    }
    
    extension [Self <: Implementation[?], T](x: Self & Implementation[T]) {
      
      inline def setImplementation(value: MinimizerImplementation[T]): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MinimizerOptions[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
