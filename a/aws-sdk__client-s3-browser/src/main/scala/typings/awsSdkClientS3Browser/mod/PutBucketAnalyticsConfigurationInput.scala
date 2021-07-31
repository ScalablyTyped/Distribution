package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketAnalyticsConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
object PutBucketAnalyticsConfigurationInput {
  
  @scala.inline
  def apply(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): PutBucketAnalyticsConfigurationInput = {
    val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationInput]
  }
}
