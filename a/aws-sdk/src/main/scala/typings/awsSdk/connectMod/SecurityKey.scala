package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityKey extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.connectMod.AssociationId] = js.undefined
  
  /**
    * When the security key was created.
    */
  var CreationTime: js.UndefOr[timestamp] = js.undefined
  
  /**
    * The key of the security key.
    */
  var Key: js.UndefOr[PEM] = js.undefined
}
object SecurityKey {
  
  @scala.inline
  def apply(): SecurityKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityKey]
  }
  
  @scala.inline
  implicit class SecurityKeyMutableBuilder[Self <: SecurityKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setKey(value: PEM): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
