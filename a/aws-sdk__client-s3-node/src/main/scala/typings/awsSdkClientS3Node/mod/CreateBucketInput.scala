package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketInput
  extends StObject
     with typings.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
object CreateBucketInput {
  
  @scala.inline
  def apply(Bucket: String): CreateBucketInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketInput]
  }
}
