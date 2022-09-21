package typings.consola.mod

import typings.consola.anon.typeinlogTypeConsolaLogOb
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaOptions extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var defaults: js.UndefOr[ConsolaLogObject] = js.undefined
  
  var level: js.UndefOr[LogLevel] = js.undefined
  
  var mockFn: js.UndefOr[ConsolaMockFn] = js.undefined
  
  var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.undefined
  
  var stderr: js.UndefOr[WritableStream[Any]] = js.undefined
  
  var stdout: js.UndefOr[WritableStream[Any]] = js.undefined
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var types: js.UndefOr[typeinlogTypeConsolaLogOb] = js.undefined
}
object ConsolaOptions {
  
  inline def apply(): ConsolaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolaOptions]
  }
  
  extension [Self <: ConsolaOptions](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setDefaults(value: ConsolaLogObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMockFn(value: (/* type */ logType, /* defaults */ ConsolaLogObject) => ConsolaMock): Self = StObject.set(x, "mockFn", js.Any.fromFunction2(value))
    
    inline def setMockFnUndefined: Self = StObject.set(x, "mockFn", js.undefined)
    
    inline def setReporters(value: js.Array[ConsolaReporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    inline def setReportersVarargs(value: ConsolaReporter*): Self = StObject.set(x, "reporters", js.Array(value*))
    
    inline def setStderr(value: WritableStream[Any]): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdout(value: WritableStream[Any]): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setTypes(value: typeinlogTypeConsolaLogOb): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
