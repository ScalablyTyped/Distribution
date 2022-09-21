package typings.consoleUi

import typings.consoleUi.mod.WriteLevel
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ci extends StObject {
    
    var ci: js.UndefOr[Boolean] = js.undefined
    
    var errorStream: js.UndefOr[WritableStream[Any]] = js.undefined
    
    var inputStream: js.UndefOr[ReadableStream[Any]] = js.undefined
    
    var outputStream: js.UndefOr[WritableStream[Any]] = js.undefined
    
    var writeLevel: js.UndefOr[WriteLevel] = js.undefined
  }
  object Ci {
    
    inline def apply(): Ci = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ci]
    }
    
    extension [Self <: Ci](x: Self) {
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      inline def setErrorStream(value: WritableStream[Any]): Self = StObject.set(x, "errorStream", value.asInstanceOf[js.Any])
      
      inline def setErrorStreamUndefined: Self = StObject.set(x, "errorStream", js.undefined)
      
      inline def setInputStream(value: ReadableStream[Any]): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
      
      inline def setInputStreamUndefined: Self = StObject.set(x, "inputStream", js.undefined)
      
      inline def setOutputStream(value: WritableStream[Any]): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      inline def setWriteLevel(value: WriteLevel): Self = StObject.set(x, "writeLevel", value.asInstanceOf[js.Any])
      
      inline def setWriteLevelUndefined: Self = StObject.set(x, "writeLevel", js.undefined)
    }
  }
}
