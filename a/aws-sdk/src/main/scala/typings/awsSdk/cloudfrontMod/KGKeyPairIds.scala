package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KGKeyPairIds extends js.Object {
  
  /**
    * The identifier of the key group that contains the public keys.
    */
  var KeyGroupId: js.UndefOr[String] = js.native
  
  var KeyPairIds: js.UndefOr[typings.awsSdk.cloudfrontMod.KeyPairIds] = js.native
}
object KGKeyPairIds {
  
  @scala.inline
  def apply(): KGKeyPairIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KGKeyPairIds]
  }
  
  @scala.inline
  implicit class KGKeyPairIdsOps[Self <: KGKeyPairIds] (val x: Self) extends AnyVal {
    
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
    def setKeyGroupId(value: String): Self = this.set("KeyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyGroupId: Self = this.set("KeyGroupId", js.undefined)
    
    @scala.inline
    def setKeyPairIds(value: KeyPairIds): Self = this.set("KeyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairIds: Self = this.set("KeyPairIds", js.undefined)
  }
}
