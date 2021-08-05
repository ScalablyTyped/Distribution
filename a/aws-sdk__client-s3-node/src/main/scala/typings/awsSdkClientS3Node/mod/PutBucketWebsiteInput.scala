package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesWebsiteConfigurationMod.WebsiteConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketWebsiteInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
object PutBucketWebsiteInput {
  
  inline def apply(Bucket: String, WebsiteConfiguration: WebsiteConfiguration): PutBucketWebsiteInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], WebsiteConfiguration = WebsiteConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketWebsiteInput]
  }
}
