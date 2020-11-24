package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAssociationOutputLocation extends js.Object {
  
  /**
    * An S3 bucket where you want to store the results of this request.
    */
  var S3Location: js.UndefOr[S3OutputLocation] = js.native
}
object InstanceAssociationOutputLocation {
  
  @scala.inline
  def apply(): InstanceAssociationOutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationOutputLocation]
  }
  
  @scala.inline
  implicit class InstanceAssociationOutputLocationOps[Self <: InstanceAssociationOutputLocation] (val x: Self) extends AnyVal {
    
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
    def setS3Location(value: S3OutputLocation): Self = this.set("S3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Location: Self = this.set("S3Location", js.undefined)
  }
}
