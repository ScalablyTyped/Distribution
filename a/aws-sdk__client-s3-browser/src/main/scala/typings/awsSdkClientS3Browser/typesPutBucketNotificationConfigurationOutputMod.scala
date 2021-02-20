package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutBucketNotificationConfigurationOutputMod {
  
  @js.native
  trait PutBucketNotificationConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion
  object PutBucketNotificationConfigurationOutput {
    
    @scala.inline
    def apply($metadata: ResponseMetadata): PutBucketNotificationConfigurationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutBucketNotificationConfigurationOutput]
    }
  }
}
