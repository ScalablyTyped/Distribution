package typings.awsSdkClientS3Node.typesGetBucketRequestPaymentOutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketOwner
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Requester
import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketRequestPaymentOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>Specifies who pays for the download and request fees.</p>
    */
  var Payer: js.UndefOr[Requester | BucketOwner | String] = js.native
}
object GetBucketRequestPaymentOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
  
  @scala.inline
  implicit class GetBucketRequestPaymentOutputOps[Self <: GetBucketRequestPaymentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayer(value: Requester | BucketOwner | String): Self = this.set("Payer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayer: Self = this.set("Payer", js.undefined)
  }
}
