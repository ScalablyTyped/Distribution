package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionMod {
  
  trait Session extends StObject {
    
    /**
      * The duration of the session, in milliseconds.
      */
    var Duration: js.UndefOr[Double] = js.undefined
    
    /**
      * A unique identifier for the session.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * The date and time when the session began.
      */
    var StartTimestamp: js.UndefOr[String] = js.undefined
    
    /**
      * The date and time when the session ended.
      */
    var StopTimestamp: js.UndefOr[String] = js.undefined
  }
  object Session {
    
    inline def apply(): Session = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setStartTimestamp(value: String): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
      
      inline def setStopTimestamp(value: String): Self = StObject.set(x, "StopTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStopTimestampUndefined: Self = StObject.set(x, "StopTimestamp", js.undefined)
    }
  }
  
  type UnmarshalledSession = Session
}
