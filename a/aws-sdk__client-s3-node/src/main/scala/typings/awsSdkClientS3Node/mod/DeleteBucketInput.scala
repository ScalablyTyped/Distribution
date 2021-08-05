package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketInput
  extends StObject
     with typings.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
object DeleteBucketInput {
  
  inline def apply(Bucket: String): DeleteBucketInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketInput]
  }
}
