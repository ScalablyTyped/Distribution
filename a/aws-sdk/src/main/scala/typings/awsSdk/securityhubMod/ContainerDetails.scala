package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDetails extends js.Object {
  
  /**
    * The identifier of the image related to a finding.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the image related to a finding.
    */
  var ImageName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Indicates when the container started. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the container related to a finding.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
}
object ContainerDetails {
  
  @scala.inline
  def apply(): ContainerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDetails]
  }
  
  @scala.inline
  implicit class ContainerDetailsOps[Self <: ContainerDetails] (val x: Self) extends AnyVal {
    
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
    def setImageId(value: NonEmptyString): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    
    @scala.inline
    def setImageName(value: NonEmptyString): Self = this.set("ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageName: Self = this.set("ImageName", js.undefined)
    
    @scala.inline
    def setLaunchedAt(value: NonEmptyString): Self = this.set("LaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchedAt: Self = this.set("LaunchedAt", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
