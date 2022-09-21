package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesCompletedPartMod.CompletedPart
import typings.awsSdkClientS3Browser.typesCompletedPartMod.UnmarshalledCompletedPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCompletedMultipartUploadMod {
  
  trait CompletedMultipartUpload extends StObject {
    
    /**
      * _CompletedPartList shape
      */
    var Parts: js.UndefOr[js.Array[CompletedPart] | js.Iterable[CompletedPart]] = js.undefined
  }
  object CompletedMultipartUpload {
    
    inline def apply(): CompletedMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletedMultipartUpload]
    }
    
    extension [Self <: CompletedMultipartUpload](x: Self) {
      
      inline def setParts(value: js.Array[CompletedPart] | js.Iterable[CompletedPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      inline def setPartsVarargs(value: CompletedPart*): Self = StObject.set(x, "Parts", js.Array(value*))
    }
  }
  
  trait UnmarshalledCompletedMultipartUpload
    extends StObject
       with CompletedMultipartUpload {
    
    /**
      * _CompletedPartList shape
      */
    @JSName("Parts")
    var Parts_UnmarshalledCompletedMultipartUpload: js.UndefOr[js.Array[UnmarshalledCompletedPart]] = js.undefined
  }
  object UnmarshalledCompletedMultipartUpload {
    
    inline def apply(): UnmarshalledCompletedMultipartUpload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledCompletedMultipartUpload]
    }
    
    extension [Self <: UnmarshalledCompletedMultipartUpload](x: Self) {
      
      inline def setParts(value: js.Array[UnmarshalledCompletedPart]): Self = StObject.set(x, "Parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "Parts", js.undefined)
      
      inline def setPartsVarargs(value: UnmarshalledCompletedPart*): Self = StObject.set(x, "Parts", js.Array(value*))
    }
  }
}
