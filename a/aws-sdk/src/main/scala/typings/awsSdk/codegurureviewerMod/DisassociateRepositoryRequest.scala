package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateRepositoryRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling  ListRepositoryAssociations . 
    */
  var AssociationArn: typings.awsSdk.codegurureviewerMod.AssociationArn = js.native
}
object DisassociateRepositoryRequest {
  
  @scala.inline
  def apply(AssociationArn: AssociationArn): DisassociateRepositoryRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRepositoryRequest]
  }
  
  @scala.inline
  implicit class DisassociateRepositoryRequestMutableBuilder[Self <: DisassociateRepositoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationArn(value: AssociationArn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
  }
}
