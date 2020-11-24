package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketPolicy extends js.Object {
  
  /**
    * Specifies whether the bucket policy allows the general public to have read access to the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether the bucket policy allows the general public to have write access to the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.native
}
object BucketPolicy {
  
  @scala.inline
  def apply(): BucketPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketPolicy]
  }
  
  @scala.inline
  implicit class BucketPolicyOps[Self <: BucketPolicy] (val x: Self) extends AnyVal {
    
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
    def setAllowsPublicReadAccess(value: boolean): Self = this.set("allowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsPublicReadAccess: Self = this.set("allowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: boolean): Self = this.set("allowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsPublicWriteAccess: Self = this.set("allowsPublicWriteAccess", js.undefined)
  }
}
