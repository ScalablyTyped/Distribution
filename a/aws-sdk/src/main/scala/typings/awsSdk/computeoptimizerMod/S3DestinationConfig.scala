package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3DestinationConfig extends js.Object {
  
  /**
    * The name of the Amazon S3 bucket to use as the destination for an export job.
    */
  var bucket: js.UndefOr[DestinationBucket] = js.native
  
  /**
    * The Amazon S3 bucket prefix for an export job.
    */
  var keyPrefix: js.UndefOr[DestinationKeyPrefix] = js.native
}
object S3DestinationConfig {
  
  @scala.inline
  def apply(): S3DestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3DestinationConfig]
  }
  
  @scala.inline
  implicit class S3DestinationConfigOps[Self <: S3DestinationConfig] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: DestinationBucket): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: DestinationKeyPrefix): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
  }
}
