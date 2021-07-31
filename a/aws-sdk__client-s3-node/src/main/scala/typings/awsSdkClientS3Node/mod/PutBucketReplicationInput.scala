package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesReplicationConfigurationMod.ReplicationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketReplicationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
object PutBucketReplicationInput {
  
  @scala.inline
  def apply(Bucket: String, ReplicationConfiguration: ReplicationConfiguration): PutBucketReplicationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ReplicationConfiguration = ReplicationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketReplicationInput]
  }
}
