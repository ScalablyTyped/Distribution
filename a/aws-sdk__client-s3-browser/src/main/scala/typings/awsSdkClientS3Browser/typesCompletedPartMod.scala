package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompletedPartMod {
  
  trait CompletedPart extends StObject {
    
    /**
      * <p>Entity tag returned when the part was uploaded.</p>
      */
    var ETag: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Part number that identifies the part. This is a positive integer between 1 and 10,000.</p>
      */
    var PartNumber: js.UndefOr[Double] = js.undefined
  }
  object CompletedPart {
    
    inline def apply(): CompletedPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletedPart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompletedPart] (val x: Self) extends AnyVal {
      
      inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      inline def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
      
      inline def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
    }
  }
  
  type UnmarshalledCompletedPart = CompletedPart
}
