package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityKey extends js.Object {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.connectMod.AssociationId] = js.native
  
  /**
    * When the security key was created.
    */
  var CreationTime: js.UndefOr[timestamp] = js.native
  
  /**
    * The key of the security key.
    */
  var Key: js.UndefOr[PEM] = js.native
}
object SecurityKey {
  
  @scala.inline
  def apply(): SecurityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityKey]
  }
  
  @scala.inline
  implicit class SecurityKeyOps[Self <: SecurityKey] (val x: Self) extends AnyVal {
    
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
    def setAssociationId(value: AssociationId): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setKey(value: PEM): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
  }
}
