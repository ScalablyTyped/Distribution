package typings.datadogNativeAppsec

import typings.datadogNativeAppsec.anon.Errors
import typings.datadogNativeAppsec.anon.Major
import typings.datadogNativeAppsec.anon.ObfuscatorKeyRegex
import typings.datadogNativeAppsec.datadogNativeAppsecStrings.block
import typings.datadogNativeAppsec.datadogNativeAppsecStrings.monitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@datadog/native-appsec", "DDWAF")
  @js.native
  open class DDWAF protected () extends StObject {
    def this(rules: typings.datadogNativeAppsec.mod.rules) = this()
    def this(rules: typings.datadogNativeAppsec.mod.rules, config: ObfuscatorKeyRegex) = this()
    
    def createContext(): DDWAFContext = js.native
    
    def dispose(): Unit = js.native
    
    val disposed: Boolean = js.native
    
    val rulesInfo: Errors = js.native
  }
  /* static members */
  object DDWAF {
    
    @JSImport("@datadog/native-appsec", "DDWAF")
    @js.native
    val ^ : js.Any = js.native
    
    inline def version(): Major = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[Major]
  }
  
  trait DDWAFContext extends StObject {
    
    def dispose(): Unit
    
    val disposed: Boolean
    
    def run(inputs: js.Object, timeout: Double): result
  }
  object DDWAFContext {
    
    inline def apply(dispose: () => Unit, disposed: Boolean, run: (js.Object, Double) => result): DDWAFContext = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], run = js.Any.fromFunction2(run))
      __obj.asInstanceOf[DDWAFContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DDWAFContext] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDisposed(value: Boolean): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
      
      inline def setRun(value: (js.Object, Double) => result): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
    }
  }
  
  trait result extends StObject {
    
    var action: js.UndefOr[monitor | block] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var timeout: Boolean
    
    var totalRuntime: js.UndefOr[Double] = js.undefined
  }
  object result {
    
    inline def apply(timeout: Boolean): result = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: result] (val x: Self) extends AnyVal {
      
      inline def setAction(value: monitor | block): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTotalRuntime(value: Double): Self = StObject.set(x, "totalRuntime", value.asInstanceOf[js.Any])
      
      inline def setTotalRuntimeUndefined: Self = StObject.set(x, "totalRuntime", js.undefined)
    }
  }
  
  type rules = js.Object
}
