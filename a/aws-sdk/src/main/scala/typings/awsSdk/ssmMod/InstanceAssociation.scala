package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAssociation extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.undefined
  
  /**
    * Version information for the association on the instance.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.undefined
  
  /**
    * The content of the association document for the instance(s).
    */
  var Content: js.UndefOr[DocumentContent] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
}
object InstanceAssociation {
  
  @scala.inline
  def apply(): InstanceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociation]
  }
  
  @scala.inline
  implicit class InstanceAssociationMutableBuilder[Self <: InstanceAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    @scala.inline
    def setContent(value: DocumentContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
