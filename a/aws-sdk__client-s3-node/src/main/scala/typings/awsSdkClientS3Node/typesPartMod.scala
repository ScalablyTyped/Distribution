package typings.awsSdkClientS3Node

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPartMod {
  
  @js.native
  trait Part extends StObject {
    
    /**
      * <p>Entity tag returned when the part was uploaded.</p>
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * <p>Date and time at which the part was uploaded.</p>
      */
    var LastModified: js.UndefOr[Date | String | Double] = js.native
    
    /**
      * <p>Part number identifying the part. This is a positive integer between 1 and 10,000.</p>
      */
    var PartNumber: js.UndefOr[Double] = js.native
    
    /**
      * <p>Size of the uploaded part data.</p>
      */
    var Size: js.UndefOr[Double] = js.native
  }
  object Part {
    
    @scala.inline
    def apply(): Part = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Part]
    }
    
    @scala.inline
    implicit class PartMutableBuilder[Self <: Part] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setLastModified(value: Date | String | Double): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
      
      @scala.inline
      def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledPart extends Part {
    
    /**
      * <p>Date and time at which the part was uploaded.</p>
      */
    @JSName("LastModified")
    var LastModified_UnmarshalledPart: js.UndefOr[Date] = js.native
  }
  object UnmarshalledPart {
    
    @scala.inline
    def apply(): UnmarshalledPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledPart]
    }
    
    @scala.inline
    implicit class UnmarshalledPartMutableBuilder[Self <: UnmarshalledPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    }
  }
}
