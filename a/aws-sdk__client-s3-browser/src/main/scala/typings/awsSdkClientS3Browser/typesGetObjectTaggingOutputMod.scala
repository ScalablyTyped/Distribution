package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetObjectTaggingOutputMod {
  
  trait GetObjectTaggingOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[UnmarshalledTag]
    
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object GetObjectTaggingOutput {
    
    inline def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetObjectTaggingOutput]
    }
    
    extension [Self <: GetObjectTaggingOutput](x: Self) {
      
      inline def setTagSet(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      inline def setTagSetVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "TagSet", js.Array(value*))
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
