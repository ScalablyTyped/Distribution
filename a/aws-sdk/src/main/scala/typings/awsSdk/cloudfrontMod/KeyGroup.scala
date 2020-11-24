package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyGroup extends js.Object {
  
  /**
    * The identifier for the key group.
    */
  var Id: String = js.native
  
  /**
    * The key group configuration.
    */
  var KeyGroupConfig: typings.awsSdk.cloudfrontMod.KeyGroupConfig = js.native
  
  /**
    * The date and time when the key group was last modified.
    */
  var LastModifiedTime: timestamp = js.native
}
object KeyGroup {
  
  @scala.inline
  def apply(Id: String, KeyGroupConfig: KeyGroupConfig, LastModifiedTime: timestamp): KeyGroup = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], KeyGroupConfig = KeyGroupConfig.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroup]
  }
  
  @scala.inline
  implicit class KeyGroupOps[Self <: KeyGroup] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyGroupConfig(value: KeyGroupConfig): Self = this.set("KeyGroupConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTime(value: timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
