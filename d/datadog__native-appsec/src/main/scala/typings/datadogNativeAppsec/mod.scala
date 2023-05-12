package typings.datadogNativeAppsec

import typings.datadogNativeAppsec.anon.Errors
import typings.datadogNativeAppsec.anon.ObfuscatorKeyRegex
import typings.datadogNativeAppsec.datadogNativeAppsecStrings.`match`
import typings.std.Set
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
    
    val requiredAddresses: Set[String] = js.native
    
    val rulesInfo: Errors = js.native
    
    def update(rules: typings.datadogNativeAppsec.mod.rules): Unit = js.native
  }
  /* static members */
  object DDWAF {
    
    @JSImport("@datadog/native-appsec", "DDWAF")
    @js.native
    val ^ : js.Any = js.native
    
    inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
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
    
    // TODO: remove this if new statuses are never added
    var actions: js.UndefOr[js.Array[String]] = js.undefined
    
    var data: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[`match`] = js.undefined
    
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
      
      inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setStatus(value: `match`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeout(value: Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTotalRuntime(value: Double): Self = StObject.set(x, "totalRuntime", value.asInstanceOf[js.Any])
      
      inline def setTotalRuntimeUndefined: Self = StObject.set(x, "totalRuntime", js.undefined)
    }
  }
  
  type rules = js.Object
}
