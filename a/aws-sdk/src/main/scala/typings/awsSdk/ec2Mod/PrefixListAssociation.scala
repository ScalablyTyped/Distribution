package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixListAssociation extends StObject {
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the resource.
    */
  var ResourceOwner: js.UndefOr[String] = js.undefined
}
object PrefixListAssociation {
  
  @scala.inline
  def apply(): PrefixListAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrefixListAssociation]
  }
  
  @scala.inline
  implicit class PrefixListAssociationMutableBuilder[Self <: PrefixListAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceOwner(value: String): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
  }
}
