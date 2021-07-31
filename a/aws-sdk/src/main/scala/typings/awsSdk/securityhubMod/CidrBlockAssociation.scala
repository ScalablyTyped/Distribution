package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrBlockAssociation extends StObject {
  
  /**
    * The association ID for the IPv4 CIDR block.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the state of the IPv4 CIDR block.
    */
  var CidrBlockState: js.UndefOr[NonEmptyString] = js.undefined
}
object CidrBlockAssociation {
  
  @scala.inline
  def apply(): CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CidrBlockAssociation]
  }
  
  @scala.inline
  implicit class CidrBlockAssociationMutableBuilder[Self <: CidrBlockAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: NonEmptyString): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setCidrBlock(value: NonEmptyString): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockState(value: NonEmptyString): Self = StObject.set(x, "CidrBlockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockStateUndefined: Self = StObject.set(x, "CidrBlockState", js.undefined)
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
  }
}
