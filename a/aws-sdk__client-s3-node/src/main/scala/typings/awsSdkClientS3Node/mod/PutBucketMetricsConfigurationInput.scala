package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesMetricsConfigurationMod.MetricsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketMetricsConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketMetricsConfigurationInputMod.PutBucketMetricsConfigurationInput
object PutBucketMetricsConfigurationInput {
  
  @scala.inline
  def apply(Bucket: String, Id: String, MetricsConfiguration: MetricsConfiguration): PutBucketMetricsConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketMetricsConfigurationInput]
  }
}
