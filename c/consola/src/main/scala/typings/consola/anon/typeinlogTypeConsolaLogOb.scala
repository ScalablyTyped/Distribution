package typings.consola.anon

import typings.consola.mod.ConsolaLogObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ type in consola.consola.logType ]: consola.consola.ConsolaLogObject} */
@js.native
trait typeinlogTypeConsolaLogOb extends js.Object {
  
  var debug: ConsolaLogObject = js.native
  
  var error: ConsolaLogObject = js.native
  
  var fatal: ConsolaLogObject = js.native
  
  var info: ConsolaLogObject = js.native
  
  var log: ConsolaLogObject = js.native
  
  var ready: ConsolaLogObject = js.native
  
  var silent: ConsolaLogObject = js.native
  
  var start: ConsolaLogObject = js.native
  
  var success: ConsolaLogObject = js.native
  
  var trace: ConsolaLogObject = js.native
  
  var verbose: ConsolaLogObject = js.native
  
  var warn: ConsolaLogObject = js.native
}
object typeinlogTypeConsolaLogOb {
  
  @scala.inline
  def apply(
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
  implicit class typeinlogTypeConsolaLogObOps[Self <: typeinlogTypeConsolaLogOb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebug(value: ConsolaLogObject): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ConsolaLogObject): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: ConsolaLogObject): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ConsolaLogObject): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: ConsolaLogObject): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: ConsolaLogObject): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: ConsolaLogObject): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: ConsolaLogObject): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ConsolaLogObject): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: ConsolaLogObject): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: ConsolaLogObject): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: ConsolaLogObject): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
