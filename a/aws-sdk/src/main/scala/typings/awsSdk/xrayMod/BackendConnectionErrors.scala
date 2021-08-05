package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendConnectionErrors extends StObject {
  
  /**
    * 
    */
  var ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var OtherCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var TimeoutCount: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * 
    */
  var UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
}
object BackendConnectionErrors {
  
  inline def apply(): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendConnectionErrors]
  }
  
  extension [Self <: BackendConnectionErrors](x: Self) {
    
    inline def setConnectionRefusedCount(value: NullableInteger): Self = StObject.set(x, "ConnectionRefusedCount", value.asInstanceOf[js.Any])
    
    inline def setConnectionRefusedCountUndefined: Self = StObject.set(x, "ConnectionRefusedCount", js.undefined)
    
    inline def setHTTPCode4XXCount(value: NullableInteger): Self = StObject.set(x, "HTTPCode4XXCount", value.asInstanceOf[js.Any])
    
    inline def setHTTPCode4XXCountUndefined: Self = StObject.set(x, "HTTPCode4XXCount", js.undefined)
    
    inline def setHTTPCode5XXCount(value: NullableInteger): Self = StObject.set(x, "HTTPCode5XXCount", value.asInstanceOf[js.Any])
    
    inline def setHTTPCode5XXCountUndefined: Self = StObject.set(x, "HTTPCode5XXCount", js.undefined)
    
    inline def setOtherCount(value: NullableInteger): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
    
    inline def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
    
    inline def setTimeoutCount(value: NullableInteger): Self = StObject.set(x, "TimeoutCount", value.asInstanceOf[js.Any])
    
    inline def setTimeoutCountUndefined: Self = StObject.set(x, "TimeoutCount", js.undefined)
    
    inline def setUnknownHostCount(value: NullableInteger): Self = StObject.set(x, "UnknownHostCount", value.asInstanceOf[js.Any])
    
    inline def setUnknownHostCountUndefined: Self = StObject.set(x, "UnknownHostCount", js.undefined)
  }
}
