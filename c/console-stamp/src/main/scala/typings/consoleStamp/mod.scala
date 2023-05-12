package typings.consoleStamp

import typings.consoleStamp.anon.Extend
import typings.consoleStamp.mod.global.Console
import typings.node.nodeColonttyMod.WriteStream
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
  
  @js.native
  trait SpyStream extends WriteStream {
    
    var asArray: js.Array[String] = js.native
    
    def flush(): Unit = js.native
    
    var last: String = js.native
    
    var length: Double = js.native
  }
  
  type Token = js.Function1[/* payload */ TokenPayload, String | Double]
  
  trait TokenPayload extends StObject {
    
    var defaultTokens: Record[String, Token]
    
    var method: String
    
    var msg: String
    
    var params: js.Array[String | Double]
    
    var tokens: Record[String, Token]
  }
  object TokenPayload {
    
    inline def apply(
      defaultTokens: Record[String, Token],
      method: String,
      msg: String,
      params: js.Array[String | Double],
      tokens: Record[String, Token]
    ): TokenPayload = {
      val __obj = js.Dynamic.literal(defaultTokens = defaultTokens.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenPayload] (val x: Self) extends AnyVal {
      
      inline def setDefaultTokens(value: Record[String, Token]): Self = StObject.set(x, "defaultTokens", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[String | Double]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: (String | Double)*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTokens(value: Record[String, Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Console extends StObject {
      
      @JSName("org")
      var org_ : Console
      
      def reset(): Unit
    }
    object Console {
      
      inline def apply(org_ : Console, reset: () => Unit): Console = {
        val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
        __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
        __obj.asInstanceOf[Console]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Console] (val x: Self) extends AnyVal {
        
        inline def setOrg_(value: Console): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
        
        inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      }
    }
  }
}
