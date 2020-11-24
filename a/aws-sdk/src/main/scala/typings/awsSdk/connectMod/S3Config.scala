package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Config extends js.Object {
  
  /**
    * The S3 bucket name.
    */
  var BucketName: typings.awsSdk.connectMod.BucketName = js.native
  
  /**
    * The S3 bucket prefix.
    */
  var BucketPrefix: Prefix = js.native
  
  /**
    * The S3 encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.connectMod.EncryptionConfig] = js.native
}
object S3Config {
  
  @scala.inline
  def apply(BucketName: BucketName, BucketPrefix: Prefix): S3Config = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], BucketPrefix = BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
  
  @scala.inline
  implicit class S3ConfigOps[Self <: S3Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: BucketName): Self = this.set("BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: Prefix): Self = this.set("BucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionConfig(value: EncryptionConfig): Self = this.set("EncryptionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfig: Self = this.set("EncryptionConfig", js.undefined)
  }
}
