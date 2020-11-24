package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketCountBySharedAccessType extends js.Object {
  
  /**
    * The total number of buckets that are shared with an AWS account that isn't part of the same Amazon Macie organization.
    */
  var external: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that are shared with an AWS account that's part of the same Amazon Macie organization.
    */
  var internal: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that aren't shared with other AWS accounts.
    */
  var notShared: js.UndefOr[long] = js.native
  
  /**
    * The total number of buckets that Amazon Macie wasn't able to evaluate shared access settings for. Macie can't determine whether these buckets are shared with other AWS accounts.
    */
  var unknown: js.UndefOr[long] = js.native
}
object BucketCountBySharedAccessType {
  
  @scala.inline
  def apply(): BucketCountBySharedAccessType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountBySharedAccessType]
  }
  
  @scala.inline
  implicit class BucketCountBySharedAccessTypeOps[Self <: BucketCountBySharedAccessType] (val x: Self) extends AnyVal {
    
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
    def setExternal(value: long): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setInternal(value: long): Self = this.set("internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    
    @scala.inline
    def setNotShared(value: long): Self = this.set("notShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotShared: Self = this.set("notShared", js.undefined)
    
    @scala.inline
    def setUnknown(value: long): Self = this.set("unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknown: Self = this.set("unknown", js.undefined)
  }
}
