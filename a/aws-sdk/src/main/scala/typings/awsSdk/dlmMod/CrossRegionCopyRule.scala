package typings.awsSdk.dlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossRegionCopyRule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used.
    */
  var CmkArn: js.UndefOr[typings.awsSdk.dlmMod.CmkArn] = js.undefined
  
  /**
    * Copy all user-defined tags from the source snapshot to the copied snapshot.
    */
  var CopyTags: js.UndefOr[CopyTagsNullable] = js.undefined
  
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
    */
  var Encrypted: typings.awsSdk.dlmMod.Encrypted
  
  /**
    * The retention rule.
    */
  var RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.undefined
  
  /**
    * The target Region.
    */
  var TargetRegion: typings.awsSdk.dlmMod.TargetRegion
}
object CrossRegionCopyRule {
  
  @scala.inline
  def apply(Encrypted: Encrypted, TargetRegion: TargetRegion): CrossRegionCopyRule = {
    val __obj = js.Dynamic.literal(Encrypted = Encrypted.asInstanceOf[js.Any], TargetRegion = TargetRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyRule]
  }
  
  @scala.inline
  implicit class CrossRegionCopyRuleMutableBuilder[Self <: CrossRegionCopyRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmkArn(value: CmkArn): Self = StObject.set(x, "CmkArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmkArnUndefined: Self = StObject.set(x, "CmkArn", js.undefined)
    
    @scala.inline
    def setCopyTags(value: CopyTagsNullable): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Encrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainRule(value: CrossRegionCopyRetainRule): Self = StObject.set(x, "RetainRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainRuleUndefined: Self = StObject.set(x, "RetainRule", js.undefined)
    
    @scala.inline
    def setTargetRegion(value: TargetRegion): Self = StObject.set(x, "TargetRegion", value.asInstanceOf[js.Any])
  }
}
