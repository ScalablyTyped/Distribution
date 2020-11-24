package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CidrBlockAssociation extends js.Object {
  
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the state of the IPv4 CIDR block.
    */
  var CidrBlockState: js.UndefOr[NonEmptyString] = js.native
}
object CidrBlockAssociation {
  
  @scala.inline
  def apply(): CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CidrBlockAssociation]
  }
  
  @scala.inline
  implicit class CidrBlockAssociationOps[Self <: CidrBlockAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociationId(value: NonEmptyString): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: NonEmptyString): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    
    @scala.inline
    def setCidrBlockState(value: NonEmptyString): Self = this.set("CidrBlockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlockState: Self = this.set("CidrBlockState", js.undefined)
  }
}
