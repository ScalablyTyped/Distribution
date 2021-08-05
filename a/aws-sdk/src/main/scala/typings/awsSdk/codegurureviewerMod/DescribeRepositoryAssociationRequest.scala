package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRepositoryAssociationRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  object. You can retrieve this ARN by calling  ListRepositoryAssociations . 
    */
  var AssociationArn: typings.awsSdk.codegurureviewerMod.AssociationArn
}
object DescribeRepositoryAssociationRequest {
  
  inline def apply(AssociationArn: AssociationArn): DescribeRepositoryAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationArn = AssociationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryAssociationRequest]
  }
  
  extension [Self <: DescribeRepositoryAssociationRequest](x: Self) {
    
    inline def setAssociationArn(value: AssociationArn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
  }
}
