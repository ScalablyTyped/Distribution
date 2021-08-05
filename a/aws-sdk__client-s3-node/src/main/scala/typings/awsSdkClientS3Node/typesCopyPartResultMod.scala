package typings.awsSdkClientS3Node

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCopyPartResultMod {
  
  trait CopyPartResult extends StObject {
    
    /**
      * <p>Entity tag of the object.</p>
      */
    var ETag: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Date and time at which the object was uploaded.</p>
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.undefined
  }
  object CopyPartResult {
    
    inline def apply(): CopyPartResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyPartResult]
    }
    
    extension [Self <: CopyPartResult](x: Self) {
      
      inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      inline def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
  
  trait UnmarshalledCopyPartResult
    extends StObject
       with CopyPartResult {
    
    /**
      * <p>Date and time at which the object was uploaded.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledCopyPartResult: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledCopyPartResult {
    
    inline def apply(): UnmarshalledCopyPartResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCopyPartResult]
    }
    
    extension [Self <: UnmarshalledCopyPartResult](x: Self) {
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
}
