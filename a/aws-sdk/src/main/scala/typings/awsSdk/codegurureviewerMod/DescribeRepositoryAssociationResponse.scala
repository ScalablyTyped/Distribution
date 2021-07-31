package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRepositoryAssociationResponse extends StObject {
  
  /**
    * Information about the repository association.
    */
  var RepositoryAssociation: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryAssociation] = js.undefined
  
  /**
    *  An array of key-value pairs used to tag an associated repository. A tag is a custom attribute label with two parts:    A tag key (for example, CostCenter, Environment, Project, or Secret). Tag keys are case sensitive.   An optional field known as a tag value (for example, 111122223333, Production, or a team name). Omitting the tag value is the same as using an empty string. Like tag keys, tag values are case sensitive.  
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeRepositoryAssociationResponse {
  
  @scala.inline
  def apply(): DescribeRepositoryAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoryAssociationResponse]
  }
  
  @scala.inline
  implicit class DescribeRepositoryAssociationResponseMutableBuilder[Self <: DescribeRepositoryAssociationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryAssociation(value: RepositoryAssociation): Self = StObject.set(x, "RepositoryAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryAssociationUndefined: Self = StObject.set(x, "RepositoryAssociation", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
