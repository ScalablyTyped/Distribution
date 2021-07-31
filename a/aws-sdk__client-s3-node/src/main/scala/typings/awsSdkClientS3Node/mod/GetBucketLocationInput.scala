package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLocationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetBucketLocationInputMod.GetBucketLocationInput
object GetBucketLocationInput {
  
  @scala.inline
  def apply(Bucket: String): GetBucketLocationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLocationInput]
  }
}
