package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadBucketInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesHeadBucketInputMod.HeadBucketInput
object HeadBucketInput {
  
  inline def apply(Bucket: String): HeadBucketInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadBucketInput]
  }
}
