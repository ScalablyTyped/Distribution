package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcCidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Information about the state of the CIDR block.
    */
  var CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
}
object VpcCidrBlockAssociation {
  
  @scala.inline
  def apply(): VpcCidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcCidrBlockAssociation]
  }
  
  @scala.inline
  implicit class VpcCidrBlockAssociationMutableBuilder[Self <: VpcCidrBlockAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: String): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockState(value: VpcCidrBlockState): Self = StObject.set(x, "CidrBlockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockStateUndefined: Self = StObject.set(x, "CidrBlockState", js.undefined)
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
  }
}
