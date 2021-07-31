package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketVersioningInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
object GetBucketVersioningInput {
  
  @scala.inline
  def apply(Bucket: String): GetBucketVersioningInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketVersioningInput]
  }
}
