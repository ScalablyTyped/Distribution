package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteObjectTaggingOutputMod {
  
  trait DeleteObjectTaggingOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * <p>The versionId of the object the tag-set was removed from.</p>
      */
    var VersionId: js.UndefOr[String] = js.undefined
  }
  object DeleteObjectTaggingOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): DeleteObjectTaggingOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteObjectTaggingOutput]
    }
    
    @scala.inline
    implicit class DeleteObjectTaggingOutputMutableBuilder[Self <: DeleteObjectTaggingOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    }
  }
}
