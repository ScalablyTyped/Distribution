package typings.cordovaPluginOuralabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DEBUG extends StObject {
    
    var DEBUG: Double
    
    var ERROR: Double
    
    var FATAL: Double
    
    var INFO: Double
    
    var TRACE: Double
    
    var WARN: Double
  }
  object DEBUG {
    
    @scala.inline
    def apply(DEBUG: Double, ERROR: Double, FATAL: Double, INFO: Double, TRACE: Double, WARN: Double): DEBUG = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[DEBUG]
    }
    
    @scala.inline
    implicit class DEBUGMutableBuilder[Self <: DEBUG] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDEBUG(value: Double): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: Double): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFATAL(value: Double): Self = StObject.set(x, "FATAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINFO(value: Double): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRACE(value: Double): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWARN(value: Double): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
}
