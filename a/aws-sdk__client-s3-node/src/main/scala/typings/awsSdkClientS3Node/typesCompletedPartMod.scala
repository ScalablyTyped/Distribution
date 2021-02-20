package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompletedPartMod {
  
  @js.native
  trait CompletedPart extends StObject {
    
    /**
      * <p>Entity tag returned when the part was uploaded.</p>
      */
    var ETag: js.UndefOr[String] = js.native
    
    /**
      * <p>Part number that identifies the part. This is a positive integer between 1 and 10,000.</p>
      */
    var PartNumber: js.UndefOr[Double] = js.native
  }
  object CompletedPart {
    
    @scala.inline
    def apply(): CompletedPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletedPart]
    }
    
    @scala.inline
    implicit class CompletedPartMutableBuilder[Self <: CompletedPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
      
      @scala.inline
      def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
    }
  }
  
  type UnmarshalledCompletedPart = CompletedPart
}
