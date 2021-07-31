package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketTaggingOutput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetBucketTaggingOutputMod.GetBucketTaggingOutput
object GetBucketTaggingOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
}
