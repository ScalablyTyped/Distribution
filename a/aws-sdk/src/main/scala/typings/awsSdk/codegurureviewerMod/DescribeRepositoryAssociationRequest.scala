package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRepositoryAssociationRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling  ListRepositoryAssociations . 
    */
  var AssociationArn: typings.awsSdk.codegurureviewerMod.AssociationArn = js.native
}
object DescribeRepositoryAssociationRequest {
  
  @scala.inline
  def apply(AssociationArn: AssociationArn): DescribeRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
  }
  
  @scala.inline
  implicit class DescribeRepositoryAssociationRequestMutableBuilder[Self <: DescribeRepositoryAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationArn(value: AssociationArn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
  }
}
