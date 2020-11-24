package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterInstanceTagAttributeRequest extends js.Object {
  
  /**
    * Indicates whether to register all tag keys in the current Region. Specify true to register all tag keys.
    */
  var IncludeAllTagsOfInstance: js.UndefOr[Boolean] = js.native
  
  /**
    * The tag keys to register.
    */
  var InstanceTagKeys: js.UndefOr[InstanceTagKeySet] = js.native
}
object RegisterInstanceTagAttributeRequest {
  
  @scala.inline
  def apply(): RegisterInstanceTagAttributeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterInstanceTagAttributeRequest]
  }
  
  @scala.inline
  implicit class RegisterInstanceTagAttributeRequestOps[Self <: RegisterInstanceTagAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setIncludeAllTagsOfInstance(value: Boolean): Self = this.set("IncludeAllTagsOfInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAllTagsOfInstance: Self = this.set("IncludeAllTagsOfInstance", js.undefined)
    
    @scala.inline
    def setInstanceTagKeysVarargs(value: String*): Self = this.set("InstanceTagKeys", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTagKeys(value: InstanceTagKeySet): Self = this.set("InstanceTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTagKeys: Self = this.set("InstanceTagKeys", js.undefined)
  }
}
