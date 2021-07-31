package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestProgressMod {
  
  trait RequestProgress extends StObject {
    
    /**
      * <p>Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.</p>
      */
    var Enabled: js.UndefOr[Boolean] = js.undefined
  }
  object RequestProgress {
    
    @scala.inline
    def apply(): RequestProgress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestProgress]
    }
    
    @scala.inline
    implicit class RequestProgressMutableBuilder[Self <: RequestProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    }
  }
  
  type UnmarshalledRequestProgress = RequestProgress
}
