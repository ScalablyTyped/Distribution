package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesBucketMod.UnmarshalledBucket
import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListBucketsOutputMod {
  
  trait ListBucketsOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _Buckets shape
      */
    var Buckets: js.UndefOr[js.Array[UnmarshalledBucket]] = js.undefined
    
    /**
      * _Owner shape
      */
    var Owner: js.UndefOr[UnmarshalledOwner] = js.undefined
  }
  object ListBucketsOutput {
    
    inline def apply($metadata: ResponseMetadata): ListBucketsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListBucketsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
      
      inline def setBuckets(value: js.Array[UnmarshalledBucket]): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
      
      inline def setBucketsVarargs(value: UnmarshalledBucket*): Self = StObject.set(x, "Buckets", js.Array(value*))
      
      inline def setOwner(value: UnmarshalledOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    }
  }
}
