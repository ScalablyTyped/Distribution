package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossRegionCopyRule extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used.
    */
  var CmkArn: js.UndefOr[typings.awsSdk.dlmMod.CmkArn] = js.native
  
  /**
    * Copy all user-defined tags from the source snapshot to the copied snapshot.
    */
  var CopyTags: js.UndefOr[CopyTagsNullable] = js.native
  
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
    */
  var Encrypted: typings.awsSdk.dlmMod.Encrypted = js.native
  
  /**
    * The retention rule.
    */
  var RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.native
  
  /**
    * The target Region.
    */
  var TargetRegion: typings.awsSdk.dlmMod.TargetRegion = js.native
}
object CrossRegionCopyRule {
  
  @scala.inline
  def apply(Encrypted: Encrypted, TargetRegion: TargetRegion): CrossRegionCopyRule = {
    val __obj = js.Dynamic.literal(Encrypted = Encrypted.asInstanceOf[js.Any], TargetRegion = TargetRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyRule]
  }
  
  @scala.inline
  implicit class CrossRegionCopyRuleOps[Self <: CrossRegionCopyRule] (val x: Self) extends AnyVal {
    
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
    def setEncrypted(value: Encrypted): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRegion(value: TargetRegion): Self = this.set("TargetRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmkArn(value: CmkArn): Self = this.set("CmkArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmkArn: Self = this.set("CmkArn", js.undefined)
    
    @scala.inline
    def setCopyTags(value: CopyTagsNullable): Self = this.set("CopyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTags: Self = this.set("CopyTags", js.undefined)
    
    @scala.inline
    def setRetainRule(value: CrossRegionCopyRetainRule): Self = this.set("RetainRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainRule: Self = this.set("RetainRule", js.undefined)
  }
}
