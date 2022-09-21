package typings.consoleStamp

import typings.consoleStamp.anon.Extend
import typings.std.Console
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("console-stamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(console: Console): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(console.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(console: Console, options: Extend): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(console.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Token = js.Function1[/* payload */ js.UndefOr[TokenPayload], String | Double]
  
  trait TokenPayload extends StObject {
    
    var defaultTokens: Record[String, Token]
    
    var method: String
    
    var params: js.Array[String | Double]
    
    var tokens: Record[String, Token]
  }
  object TokenPayload {
    
    inline def apply(
      defaultTokens: Record[String, Token],
      method: String,
      params: js.Array[String | Double],
      tokens: Record[String, Token]
    ): TokenPayload = {
      val __obj = js.Dynamic.literal(defaultTokens = defaultTokens.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPayload]
    }
    
    extension [Self <: TokenPayload](x: Self) {
      
      inline def setDefaultTokens(value: Record[String, Token]): Self = StObject.set(x, "defaultTokens", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[String | Double]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: (String | Double)*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTokens(value: Record[String, Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
}
