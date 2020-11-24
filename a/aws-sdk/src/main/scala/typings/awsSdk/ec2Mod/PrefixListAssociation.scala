package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixListAssociation extends js.Object {
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  
  /**
    * The owner of the resource.
    */
  var ResourceOwner: js.UndefOr[String] = js.native
}
object PrefixListAssociation {
  
  @scala.inline
  def apply(): PrefixListAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListAssociation]
  }
  
  @scala.inline
  implicit class PrefixListAssociationOps[Self <: PrefixListAssociation] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceOwner(value: String): Self = this.set("ResourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOwner: Self = this.set("ResourceOwner", js.undefined)
  }
}
