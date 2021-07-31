package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesVersioningConfigurationMod.VersioningConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketVersioningInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
object PutBucketVersioningInput {
  
  @scala.inline
  def apply(Bucket: String, VersioningConfiguration: VersioningConfiguration): PutBucketVersioningInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], VersioningConfiguration = VersioningConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketVersioningInput]
  }
}
