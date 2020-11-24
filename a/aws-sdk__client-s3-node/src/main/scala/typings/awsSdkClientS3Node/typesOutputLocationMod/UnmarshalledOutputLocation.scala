package typings.awsSdkClientS3Node.typesOutputLocationMod

import typings.awsSdkClientS3Node.typesS3LocationMod.UnmarshalledS3Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledOutputLocation extends OutputLocation {
  
  /**
    * <p>Describes an S3 location that will receive the results of the restore request.</p>
    */
  @JSName("S3")
  var S3_UnmarshalledOutputLocation: js.UndefOr[UnmarshalledS3Location] = js.native
}
object UnmarshalledOutputLocation {
  
  @scala.inline
  def apply(): UnmarshalledOutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledOutputLocation]
  }
  
  @scala.inline
  implicit class UnmarshalledOutputLocationOps[Self <: UnmarshalledOutputLocation] (val x: Self) extends AnyVal {
    
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
    def setS3(value: UnmarshalledS3Location): Self = this.set("S3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3: Self = this.set("S3", js.undefined)
  }
}
