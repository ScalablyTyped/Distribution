package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketOwnershipControlsOutput extends js.Object {
  
  /**
    * The OwnershipControls (BucketOwnerPreferred or ObjectWriter) currently in effect for this Amazon S3 bucket.
    */
  var OwnershipControls: js.UndefOr[typings.awsSdk.s3Mod.OwnershipControls] = js.native
}
object GetBucketOwnershipControlsOutput {
  
  @scala.inline
  def apply(): GetBucketOwnershipControlsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketOwnershipControlsOutput]
  }
  
  @scala.inline
  implicit class GetBucketOwnershipControlsOutputOps[Self <: GetBucketOwnershipControlsOutput] (val x: Self) extends AnyVal {
    
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
    def setOwnershipControls(value: OwnershipControls): Self = this.set("OwnershipControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnershipControls: Self = this.set("OwnershipControls", js.undefined)
  }
}
