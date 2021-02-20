package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesCompletedPartMod.CompletedPart
import typings.awsSdkClientS3Node.typesCompletedPartMod.UnmarshalledCompletedPart
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompletedMultipartUploadMod {
  
  @js.native
  trait CompletedMultipartUpload extends StObject {
    
    /**
      * _CompletedPartList shape
      */
    var Parts: js.UndefOr[js.Array[CompletedPart] | Iterable[CompletedPart]] = js.native
  }
  object CompletedMultipartUpload {
    
    @scala.inline
    def apply(): CompletedMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletedMultipartUpload]
    }
    
    @scala.inline
    implicit class CompletedMultipartUploadMutableBuilder[Self <: CompletedMultipartUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParts(value: js.Array[CompletedPart] | Iterable[CompletedPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      @scala.inline
      def setPartsVarargs(value: CompletedPart*): Self = StObject.set(x, "Parts", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledCompletedMultipartUpload extends CompletedMultipartUpload {
    
    /**
      * _CompletedPartList shape
      */
    @JSName("Parts")
    var Parts_UnmarshalledCompletedMultipartUpload: js.UndefOr[js.Array[UnmarshalledCompletedPart]] = js.native
  }
  object UnmarshalledCompletedMultipartUpload {
    
    @scala.inline
    def apply(): UnmarshalledCompletedMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCompletedMultipartUpload]
    }
    
    @scala.inline
    implicit class UnmarshalledCompletedMultipartUploadMutableBuilder[Self <: UnmarshalledCompletedMultipartUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParts(value: js.Array[UnmarshalledCompletedPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      @scala.inline
      def setPartsVarargs(value: UnmarshalledCompletedPart*): Self = StObject.set(x, "Parts", js.Array(value :_*))
    }
  }
}
