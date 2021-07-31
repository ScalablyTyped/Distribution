package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketReplicationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetBucketReplicationInputMod.GetBucketReplicationInput
object GetBucketReplicationInput {
  
  @scala.inline
  def apply(Bucket: String): GetBucketReplicationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketReplicationInput]
  }
}
