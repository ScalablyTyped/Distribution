package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutObjectTaggingOutputMod {
  
  trait PutObjectTaggingOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object PutObjectTaggingOutput {
    
    inline def apply($metadata: ResponseMetadata): PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutObjectTaggingOutput]
    }
    
    extension [Self <: PutObjectTaggingOutput](x: Self) {
      
      inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
