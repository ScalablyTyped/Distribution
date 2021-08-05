package typings.awsSdkClientS3Node

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
    
    inline def apply(): RequestProgress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestProgress]
    }
    
    extension [Self <: RequestProgress](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    }
  }
  
  type UnmarshalledRequestProgress = RequestProgress
}
