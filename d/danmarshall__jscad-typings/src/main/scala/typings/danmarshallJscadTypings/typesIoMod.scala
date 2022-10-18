package typings.danmarshallJscadTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIoMod {
  
  object io {
    
    trait Options extends StObject {
      
      def statusCallback(status: Status): Unit
    }
    object Options {
      
      inline def apply(statusCallback: Status => Unit): Options = {
        val __obj = js.Dynamic.literal(statusCallback = js.Any.fromFunction1(statusCallback))
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setStatusCallback(value: Status => Unit): Self = StObject.set(x, "statusCallback", js.Any.fromFunction1(value))
      }
    }
    
    trait Status extends StObject {
      
      var progress: js.UndefOr[Double] = js.undefined
    }
    object Status {
      
      inline def apply(): Status = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Status]
      }
      
      extension [Self <: Status](x: Self) {
        
        inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      }
    }
  }
}
