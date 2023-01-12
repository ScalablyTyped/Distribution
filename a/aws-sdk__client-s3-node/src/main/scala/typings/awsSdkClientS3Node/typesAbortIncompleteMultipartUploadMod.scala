package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbortIncompleteMultipartUploadMod {
  
  trait AbortIncompleteMultipartUpload extends StObject {
    
    /**
      * <p>Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.</p>
      */
    var DaysAfterInitiation: js.UndefOr[Double] = js.undefined
  }
  object AbortIncompleteMultipartUpload {
    
    inline def apply(): AbortIncompleteMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortIncompleteMultipartUpload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
      
      inline def setDaysAfterInitiation(value: Double): Self = StObject.set(x, "DaysAfterInitiation", value.asInstanceOf[js.Any])
      
      inline def setDaysAfterInitiationUndefined: Self = StObject.set(x, "DaysAfterInitiation", js.undefined)
    }
  }
  
  type UnmarshalledAbortIncompleteMultipartUpload = AbortIncompleteMultipartUpload
}
