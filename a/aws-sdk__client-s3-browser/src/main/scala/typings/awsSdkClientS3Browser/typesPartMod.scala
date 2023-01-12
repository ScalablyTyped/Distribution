package typings.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPartMod {
  
  trait Part extends StObject {
    
    /**
      * <p>Entity tag returned when the part was uploaded.</p>
      */
    var ETag: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Date and time at which the part was uploaded.</p>
      */
    var LastModified: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>Part number identifying the part. This is a positive integer between 1 and 10,000.</p>
      */
    var PartNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Size of the uploaded part data.</p>
      */
    var Size: js.UndefOr[Double] = js.undefined
  }
  object Part {
    
    inline def apply(): Part = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Part]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Part] (val x: Self) extends AnyVal {
      
      inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      inline def setLastModified(value: js.Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      inline def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
      
      inline def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    }
  }
  
  trait UnmarshalledPart
    extends StObject
       with Part {
    
    /**
      * <p>Date and time at which the part was uploaded.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledPart: js.UndefOr[js.Date] = js.undefined
  }
  object UnmarshalledPart {
    
    inline def apply(): UnmarshalledPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledPart] (val x: Self) extends AnyVal {
      
      inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
}
