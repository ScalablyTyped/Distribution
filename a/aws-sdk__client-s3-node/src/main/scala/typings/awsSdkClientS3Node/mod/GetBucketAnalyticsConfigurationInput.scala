package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAnalyticsConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
object GetBucketAnalyticsConfigurationInput {
  
  @scala.inline
  def apply(Bucket: String, Id: String): GetBucketAnalyticsConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationInput]
  }
}
