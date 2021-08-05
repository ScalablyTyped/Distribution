package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketMetricsConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
object DeleteBucketMetricsConfigurationInput {
  
  inline def apply(Bucket: String, Id: String): DeleteBucketMetricsConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketMetricsConfigurationInput]
  }
}
