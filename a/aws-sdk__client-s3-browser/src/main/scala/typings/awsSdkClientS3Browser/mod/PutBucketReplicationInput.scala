package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesReplicationConfigurationMod.ReplicationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketReplicationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketReplicationInputMod.PutBucketReplicationInput
object PutBucketReplicationInput {
  
  @scala.inline
  def apply(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): PutBucketReplicationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketReplicationInput]
  }
}
