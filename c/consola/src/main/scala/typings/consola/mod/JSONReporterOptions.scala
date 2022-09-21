package typings.consola.mod

import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONReporterOptions extends StObject {
  
  var stream: js.UndefOr[WritableStream[Any]] = js.undefined
}
object JSONReporterOptions {
  
  inline def apply(): JSONReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONReporterOptions]
  }
  
  extension [Self <: JSONReporterOptions](x: Self) {
    
    inline def setStream(value: WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
