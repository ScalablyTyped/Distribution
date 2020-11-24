package typings.cordovaPluginOuralabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DEBUG extends js.Object {
  
  var DEBUG: Double = js.native
  
  var ERROR: Double = js.native
  
  var FATAL: Double = js.native
  
  var INFO: Double = js.native
  
  var TRACE: Double = js.native
  
  var WARN: Double = js.native
}
object DEBUG {
  
  @scala.inline
  def apply(DEBUG: Double, ERROR: Double, FATAL: Double, INFO: Double, TRACE: Double, WARN: Double): DEBUG = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEBUG]
  }
  
  @scala.inline
  implicit class DEBUGOps[Self <: DEBUG] (val x: Self) extends AnyVal {
    
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
    def setDEBUG(value: Double): Self = this.set("DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: Double): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFATAL(value: Double): Self = this.set("FATAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: Double): Self = this.set("INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRACE(value: Double): Self = this.set("TRACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARN(value: Double): Self = this.set("WARN", value.asInstanceOf[js.Any])
  }
}
