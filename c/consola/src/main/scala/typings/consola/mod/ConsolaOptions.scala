package typings.consola.mod

import typings.consola.anon.typeinlogTypeConsolaLogOb
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaOptions extends StObject {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var defaults: js.UndefOr[ConsolaLogObject] = js.native
  
  var level: js.UndefOr[LogLevel] = js.native
  
  var mockFn: js.UndefOr[ConsolaMockFn] = js.native
  
  var reporters: js.UndefOr[js.Array[ConsolaReporter]] = js.native
  
  var stderr: js.UndefOr[WritableStream] = js.native
  
  var stdout: js.UndefOr[WritableStream] = js.native
  
  var throttle: js.UndefOr[Double] = js.native
  
  var types: js.UndefOr[typeinlogTypeConsolaLogOb] = js.native
}
object ConsolaOptions {
  
  @scala.inline
  def apply(): ConsolaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsolaOptions]
  }
  
  @scala.inline
  implicit class ConsolaOptionsMutableBuilder[Self <: ConsolaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setDefaults(value: ConsolaLogObject): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMockFn(value: (/* type */ logType, /* defaults */ ConsolaLogObject) => ConsolaMock): Self = StObject.set(x, "mockFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMockFnUndefined: Self = StObject.set(x, "mockFn", js.undefined)
    
    @scala.inline
    def setReporters(value: js.Array[ConsolaReporter]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
    
    @scala.inline
    def setReportersVarargs(value: ConsolaReporter*): Self = StObject.set(x, "reporters", js.Array(value :_*))
    
    @scala.inline
    def setStderr(value: WritableStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    @scala.inline
    def setStdout(value: WritableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    @scala.inline
    def setTypes(value: typeinlogTypeConsolaLogOb): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
