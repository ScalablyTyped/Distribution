package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectTaggingOutput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetObjectTaggingOutputMod.GetObjectTaggingOutput
object GetObjectTaggingOutput {
  
  inline def apply($metadata: ResponseMetadata, TagSet: js.Array[UnmarshalledTag]): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
}
