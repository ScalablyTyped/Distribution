package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesTaggingMod.Tagging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketTaggingInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketTaggingInputMod.PutBucketTaggingInput
object PutBucketTaggingInput {
  
  @scala.inline
  def apply(Bucket: String, Tagging: Tagging): PutBucketTaggingInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketTaggingInput]
  }
}
