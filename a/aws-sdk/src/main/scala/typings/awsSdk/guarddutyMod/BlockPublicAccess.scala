package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockPublicAccess extends js.Object {
  
  /**
    * Indicates if S3 Block Public Access is set to BlockPublicAcls.
    */
  var BlockPublicAcls: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if S3 Block Public Access is set to BlockPublicPolicy.
    */
  var BlockPublicPolicy: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if S3 Block Public Access is set to IgnorePublicAcls.
    */
  var IgnorePublicAcls: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if S3 Block Public Access is set to RestrictPublicBuckets.
    */
  var RestrictPublicBuckets: js.UndefOr[Boolean] = js.native
}
object BlockPublicAccess {
  
  @scala.inline
  def apply(): BlockPublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockPublicAccess]
  }
  
  @scala.inline
  implicit class BlockPublicAccessOps[Self <: BlockPublicAccess] (val x: Self) extends AnyVal {
    
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
    def setBlockPublicAcls(value: Boolean): Self = this.set("BlockPublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicAcls: Self = this.set("BlockPublicAcls", js.undefined)
    
    @scala.inline
    def setBlockPublicPolicy(value: Boolean): Self = this.set("BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockPublicPolicy: Self = this.set("BlockPublicPolicy", js.undefined)
    
    @scala.inline
    def setIgnorePublicAcls(value: Boolean): Self = this.set("IgnorePublicAcls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePublicAcls: Self = this.set("IgnorePublicAcls", js.undefined)
    
    @scala.inline
    def setRestrictPublicBuckets(value: Boolean): Self = this.set("RestrictPublicBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictPublicBuckets: Self = this.set("RestrictPublicBuckets", js.undefined)
  }
}
