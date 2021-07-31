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
  
  @scala.inline
  def apply(): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendConnectionErrors]
  }
  
  @scala.inline
  implicit class BackendConnectionErrorsMutableBuilder[Self <: BackendConnectionErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionRefusedCount(value: NullableInteger): Self = StObject.set(x, "ConnectionRefusedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionRefusedCountUndefined: Self = StObject.set(x, "ConnectionRefusedCount", js.undefined)
    
    @scala.inline
    def setHTTPCode4XXCount(value: NullableInteger): Self = StObject.set(x, "HTTPCode4XXCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPCode4XXCountUndefined: Self = StObject.set(x, "HTTPCode4XXCount", js.undefined)
    
    @scala.inline
    def setHTTPCode5XXCount(value: NullableInteger): Self = StObject.set(x, "HTTPCode5XXCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHTTPCode5XXCountUndefined: Self = StObject.set(x, "HTTPCode5XXCount", js.undefined)
    
    @scala.inline
    def setOtherCount(value: NullableInteger): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
    
    @scala.inline
    def setTimeoutCount(value: NullableInteger): Self = StObject.set(x, "TimeoutCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutCountUndefined: Self = StObject.set(x, "TimeoutCount", js.undefined)
    
    @scala.inline
    def setUnknownHostCount(value: NullableInteger): Self = StObject.set(x, "UnknownHostCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownHostCountUndefined: Self = StObject.set(x, "UnknownHostCount", js.undefined)
  }
}
