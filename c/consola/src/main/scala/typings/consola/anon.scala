package typings.consola

import typings.consola.mod.ConsolaLogObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {[ type in consola.consola.logType ]: consola.consola.ConsolaLogObject} */
  trait typeinlogTypeConsolaLogOb extends StObject {
    
    var debug: ConsolaLogObject
    
    var error: ConsolaLogObject
    
    var fatal: ConsolaLogObject
    
    var info: ConsolaLogObject
    
    var log: ConsolaLogObject
    
    var ready: ConsolaLogObject
    
    var silent: ConsolaLogObject
    
    var start: ConsolaLogObject
    
    var success: ConsolaLogObject
    
    var trace: ConsolaLogObject
    
    var verbose: ConsolaLogObject
    
    var warn: ConsolaLogObject
  }
  object typeinlogTypeConsolaLogOb {
    
    inline def apply(
      debug: ConsolaLogObject,
      error: ConsolaLogObject,
      fatal: ConsolaLogObject,
      info: ConsolaLogObject,
      log: ConsolaLogObject,
      ready: ConsolaLogObject,
      silent: ConsolaLogObject,
      start: ConsolaLogObject,
      success: ConsolaLogObject,
      trace: ConsolaLogObject,
      verbose: ConsolaLogObject,
      warn: ConsolaLogObject
    ): typeinlogTypeConsolaLogOb = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typeinlogTypeConsolaLogOb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typeinlogTypeConsolaLogOb] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: ConsolaLogObject): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: ConsolaLogObject): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: ConsolaLogObject): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: ConsolaLogObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ConsolaLogObject): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setReady(value: ConsolaLogObject): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: ConsolaLogObject): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: ConsolaLogObject): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: ConsolaLogObject): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: ConsolaLogObject): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: ConsolaLogObject): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: ConsolaLogObject): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
