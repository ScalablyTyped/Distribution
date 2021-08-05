package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketLocationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetBucketLocationInputMod.GetBucketLocationInput
object GetBucketLocationInput {
  
  inline def apply(Bucket: String): GetBucketLocationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLocationInput]
  }
}
