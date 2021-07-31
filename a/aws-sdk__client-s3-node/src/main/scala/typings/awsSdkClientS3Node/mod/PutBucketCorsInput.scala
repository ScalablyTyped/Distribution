package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesCorsconfigurationMod.CORSConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketCorsInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
object PutBucketCorsInput {
  
  @scala.inline
  def apply(Bucket: String, CORSConfiguration: CORSConfiguration): PutBucketCorsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CORSConfiguration = CORSConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketCorsInput]
  }
}
