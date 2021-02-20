package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutObjectTaggingOutputMod {
  
  @js.native
  trait PutObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  object PutObjectTaggingOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutObjectTaggingOutput]
    }
    
    @scala.inline
    implicit class PutObjectTaggingOutputMutableBuilder[Self <: PutObjectTaggingOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
