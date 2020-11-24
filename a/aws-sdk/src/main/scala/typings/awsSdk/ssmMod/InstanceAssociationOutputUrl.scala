package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAssociationOutputUrl extends js.Object {
  
  /**
    * The URL of S3 bucket where you want to store the results of this request.
    */
  var S3OutputUrl: js.UndefOr[typings.awsSdk.ssmMod.S3OutputUrl] = js.native
}
object InstanceAssociationOutputUrl {
  
  @scala.inline
  def apply(): InstanceAssociationOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationOutputUrl]
  }
  
  @scala.inline
  implicit class InstanceAssociationOutputUrlOps[Self <: InstanceAssociationOutputUrl] (val x: Self) extends AnyVal {
    
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
    def setS3OutputUrl(value: S3OutputUrl): Self = this.set("S3OutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3OutputUrl: Self = this.set("S3OutputUrl", js.undefined)
  }
}
