package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateKeyGroupResult extends js.Object {
  
  /**
    * The identifier for this version of the key group.
    */
  var ETag: js.UndefOr[String] = js.native
  
  /**
    * The key group that was just created.
    */
  var KeyGroup: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyGroup] = js.native
  
  /**
    * The URL of the key group.
    */
  var Location: js.UndefOr[String] = js.native
}
object CreateKeyGroupResult {
  
  @scala.inline
  def apply(): CreateKeyGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyGroupResult]
  }
  
  @scala.inline
  implicit class CreateKeyGroupResultOps[Self <: CreateKeyGroupResult] (val x: Self) extends AnyVal {
    
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setKeyGroup(value: KeyGroup): Self = this.set("KeyGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyGroup: Self = this.set("KeyGroup", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
  }
}
