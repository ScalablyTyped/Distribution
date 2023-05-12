package typings.consola.distConsola3fef035aMod

import typings.consola.anon.FnCall
import typings.consola.anon.RecordLogTypeInputLogObje
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsolaOptions extends StObject {
  
  var defaults: InputLogObject
  
  var formatOptions: FormatOptions
  
  var level: LogLevel
  
  var mockFn: js.UndefOr[
    js.Function2[
      /* type */ LogType, 
      /* defaults */ InputLogObject, 
      js.Function1[/* args */ Any, Unit]
    ]
  ] = js.undefined
  
  var prompt: js.UndefOr[FnCall] = js.undefined
  
  var reporters: js.Array[ConsolaReporter]
  
  var stderr: js.UndefOr[WriteStream] = js.undefined
  
  var stdout: js.UndefOr[WriteStream] = js.undefined
  
  var throttle: Double
  
  var throttleMin: Double
  
  var types: RecordLogTypeInputLogObje
}
object ConsolaOptions {
  
  inline def apply(
    defaults: InputLogObject,
    formatOptions: FormatOptions,
    level: LogLevel,
    reporters: js.Array[ConsolaReporter],
    throttle: Double,
    throttleMin: Double,
    types: RecordLogTypeInputLogObje
  ): ConsolaOptions = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], formatOptions = formatOptions.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], reporters = reporters.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], throttleMin = throttleMin.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsolaOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaults(value: InputLogObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMockFn(value: (/* type */ LogType, /* defaults */ InputLogObject) => js.Function1[/* args */ Any, Unit]): Self = StObject.set(x, "mockFn", js.Any.fromFunction2(value))
    
    inline def setMockFnUndefined: Self = StObject.set(x, "mockFn", js.undefined)
    
    inline def setPrompt(value: FnCall): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setReporters(value: js.Array[ConsolaReporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    inline def setReportersVarargs(value: ConsolaReporter*): Self = StObject.set(x, "reporters", js.Array(value*))
    
    inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleMin(value: Double): Self = StObject.set(x, "throttleMin", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: RecordLogTypeInputLogObje): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
