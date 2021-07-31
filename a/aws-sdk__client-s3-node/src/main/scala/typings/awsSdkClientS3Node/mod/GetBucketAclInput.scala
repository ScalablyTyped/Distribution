package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAclInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetBucketAclInputMod.GetBucketAclInput
object GetBucketAclInput {
  
  @scala.inline
  def apply(Bucket: String): GetBucketAclInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAclInput]
  }
}
