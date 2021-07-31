package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ALERT extends StObject {
  
  var ALERT: String
  
  var CRITICAL: String
  
  var DEBUG: String
  
  var EMERGENCY: String
  
  var ERROR: String
  
  var INFO: String
  
  var NOTICE: String
  
  var WARNING: String
}
object ALERT {
  
  @scala.inline
  def apply(
    ALERT: String,
    CRITICAL: String,
    DEBUG: String,
    EMERGENCY: String,
    ERROR: String,
    INFO: String,
    NOTICE: String,
    WARNING: String
  ): ALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], CRITICAL = CRITICAL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], EMERGENCY = EMERGENCY.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], NOTICE = NOTICE.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALERT]
  }
  
  @scala.inline
  implicit class ALERTMutableBuilder[Self <: ALERT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setALERT(value: String): Self = StObject.set(x, "ALERT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCRITICAL(value: String): Self = StObject.set(x, "CRITICAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDEBUG(value: String): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEMERGENCY(value: String): Self = StObject.set(x, "EMERGENCY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: String): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOTICE(value: String): Self = StObject.set(x, "NOTICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWARNING(value: String): Self = StObject.set(x, "WARNING", value.asInstanceOf[js.Any])
  }
}
