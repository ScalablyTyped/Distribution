package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackendConnectionErrorsMod {
  
  @js.native
  trait BackendConnectionErrors extends StObject {
    
    /**
      * <p/>
      */
    var ConnectionRefusedCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var HTTPCode4XXCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var HTTPCode5XXCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var OtherCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var TimeoutCount: js.UndefOr[Double] = js.native
    
    /**
      * <p/>
      */
    var UnknownHostCount: js.UndefOr[Double] = js.native
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
      def setConnectionRefusedCount(value: Double): Self = StObject.set(x, "ConnectionRefusedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionRefusedCountUndefined: Self = StObject.set(x, "ConnectionRefusedCount", js.undefined)
      
      @scala.inline
      def setHTTPCode4XXCount(value: Double): Self = StObject.set(x, "HTTPCode4XXCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTTPCode4XXCountUndefined: Self = StObject.set(x, "HTTPCode4XXCount", js.undefined)
      
      @scala.inline
      def setHTTPCode5XXCount(value: Double): Self = StObject.set(x, "HTTPCode5XXCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTTPCode5XXCountUndefined: Self = StObject.set(x, "HTTPCode5XXCount", js.undefined)
      
      @scala.inline
      def setOtherCount(value: Double): Self = StObject.set(x, "OtherCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherCountUndefined: Self = StObject.set(x, "OtherCount", js.undefined)
      
      @scala.inline
      def setTimeoutCount(value: Double): Self = StObject.set(x, "TimeoutCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutCountUndefined: Self = StObject.set(x, "TimeoutCount", js.undefined)
      
      @scala.inline
      def setUnknownHostCount(value: Double): Self = StObject.set(x, "UnknownHostCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownHostCountUndefined: Self = StObject.set(x, "UnknownHostCount", js.undefined)
    }
  }
  
  type UnmarshalledBackendConnectionErrors = BackendConnectionErrors
}
