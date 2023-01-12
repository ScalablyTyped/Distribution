package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackendConnectionErrorsMod {
  
  trait BackendConnectionErrors extends StObject {
    
    /**
      * <p/>
      */
    var ConnectionRefusedCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var HTTPCode4XXCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var HTTPCode5XXCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var OtherCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var TimeoutCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var UnknownHostCount: js.UndefOr[Double] = js.undefined
  }
  object BackendConnectionErrors {
    
    inline def apply(): BackendConnectionErrors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackendConnectionErrors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackendConnectionErrors] (val x: Self) extends AnyVal {
      
      inline def setConnectionRefusedCount(value: Double): Self = StObject.set(x, "ConnectionRefusedCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRefusedCountUndefined: Self = StObject.set(x, "ConnectionRefusedCount", js.undefined)
      
      inline def setHTTPCode4XXCount(value: Double): Self = StObject.set(x, "HTTPCode4XXCount", value.asInstanceOf[js.Any])
      
      inline def setHTTPCode4XXCountUndefined: Self = StObject.set(x, "HTTPCode4XXCount", js.undefined)
      
      inline def setHTTPCode5XXCount(value: Double): Self = StObject.set(x, "HTTPCode5XXCount", value.asInstanceOf[js.Any])
      
      inline def setHTTPCode5XXCountUndefined: Self = StObject.set(x, "HTTPCode5XXCount", js.undefined)
      
      inline def setOtherCount(value: Double): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
      
      inline def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
      
      inline def setTimeoutCount(value: Double): Self = StObject.set(x, "TimeoutCount", value.asInstanceOf[js.Any])
      
      inline def setTimeoutCountUndefined: Self = StObject.set(x, "TimeoutCount", js.undefined)
      
      inline def setUnknownHostCount(value: Double): Self = StObject.set(x, "UnknownHostCount", value.asInstanceOf[js.Any])
      
      inline def setUnknownHostCountUndefined: Self = StObject.set(x, "UnknownHostCount", js.undefined)
    }
  }
  
  type UnmarshalledBackendConnectionErrors = BackendConnectionErrors
}
