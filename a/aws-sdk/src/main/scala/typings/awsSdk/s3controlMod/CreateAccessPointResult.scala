package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessPointResult extends js.Object {
  
  /**
    * The ARN of the access point.  This is only supported by Amazon S3 on Outposts. 
    */
  var AccessPointArn: js.UndefOr[S3AccessPointArn] = js.native
}
object CreateAccessPointResult {
  
  @scala.inline
  def apply(): CreateAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointResult]
  }
  
  @scala.inline
  implicit class CreateAccessPointResultOps[Self <: CreateAccessPointResult] (val x: Self) extends AnyVal {
    
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
    def setAccessPointArn(value: S3AccessPointArn): Self = this.set("AccessPointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPointArn: Self = this.set("AccessPointArn", js.undefined)
  }
}
