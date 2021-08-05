package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesAnalyticsConfigurationMod.AnalyticsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketAnalyticsConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
object PutBucketAnalyticsConfigurationInput {
  
  inline def apply(AnalyticsConfiguration: AnalyticsConfiguration, Bucket: String, Id: String): PutBucketAnalyticsConfigurationInput = {
    val __obj = js.Dynamic.literal(AnalyticsConfiguration = AnalyticsConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAnalyticsConfigurationInput]
  }
}
