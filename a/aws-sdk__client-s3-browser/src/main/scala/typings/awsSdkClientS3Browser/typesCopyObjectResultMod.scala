package typings.awsSdkClientS3Browser

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCopyObjectResultMod {
  
  trait CopyObjectResult extends StObject {
    
    /**
      * _ETag shape
      */
    var ETag: js.UndefOr[String] = js.undefined
    
    /**
      * _LastModified shape
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.undefined
  }
  object CopyObjectResult {
    
    inline def apply(): CopyObjectResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyObjectResult]
    }
    
    extension [Self <: CopyObjectResult](x: Self) {
      
      inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      inline def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
  
  trait UnmarshalledCopyObjectResult
    extends StObject
       with CopyObjectResult {
    
    /**
      * _LastModified shape
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledCopyObjectResult: js.UndefOr[Date] = js.undefined
  }
  object UnmarshalledCopyObjectResult {
    
    inline def apply(): UnmarshalledCopyObjectResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCopyObjectResult]
    }
    
    extension [Self <: UnmarshalledCopyObjectResult](x: Self) {
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
}
