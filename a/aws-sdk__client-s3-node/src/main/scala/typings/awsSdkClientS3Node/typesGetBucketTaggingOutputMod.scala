package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketTaggingOutputMod {
  
  trait GetBucketTaggingOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[UnmarshalledTag]
  }
  object GetBucketTaggingOutput {
    
    inline def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetBucketTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketTaggingOutput]
    }
    
    extension [Self <: GetBucketTaggingOutput](x: Self) {
      
      inline def setTagSet(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      inline def setTagSetVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
    }
  }
}
