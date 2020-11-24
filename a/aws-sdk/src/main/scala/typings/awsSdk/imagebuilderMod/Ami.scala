package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ami extends js.Object {
  
  /**
    *  The account ID of the owner of the AMI. 
    */
  var accountId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The description of the EC2 AMI. Minimum and maximum length are in characters.
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AMI ID of the EC2 AMI. 
    */
  var image: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the EC2 AMI. 
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AWS Region of the EC2 AMI. 
    */
  var region: js.UndefOr[NonEmptyString] = js.native
  
  var state: js.UndefOr[ImageState] = js.native
}
object Ami {
  
  @scala.inline
  def apply(): Ami = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ami]
  }
  
  @scala.inline
  implicit class AmiOps[Self <: Ami] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: NonEmptyString): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setImage(value: NonEmptyString): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegion(value: NonEmptyString): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setState(value: ImageState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
