package typings.consoleStamp

import typings.consoleStamp.mod.SpyStream
import typings.consoleStamp.mod.Token
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Extend extends StObject {
    
    var extend: js.UndefOr[Record[String, Double]] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var stderr: js.UndefOr[WriteStream | SpyStream] = js.undefined
    
    var stdout: js.UndefOr[WriteStream | SpyStream] = js.undefined
    
    var tokens: js.UndefOr[Record[String, Token]] = js.undefined
    
    var use_custom_message: js.UndefOr[Boolean] = js.undefined
  }
  object Extend {
    
    inline def apply(): Extend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extend] (val x: Self) extends AnyVal {
      
      inline def setExtend(value: Record[String, Double]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStderr(value: WriteStream | SpyStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream | SpyStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setTokens(value: Record[String, Token]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setUse_custom_message(value: Boolean): Self = StObject.set(x, "use_custom_message", value.asInstanceOf[js.Any])
      
      inline def setUse_custom_messageUndefined: Self = StObject.set(x, "use_custom_message", js.undefined)
    }
  }
}
