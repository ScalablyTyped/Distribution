package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesWebsiteConfigurationMod.WebsiteConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketWebsiteInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
object PutBucketWebsiteInput {
  
  @scala.inline
  def apply(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): PutBucketWebsiteInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteInput]
  }
}
