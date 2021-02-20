package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAffectedEntitiesForOrganizationResponse extends StObject {
  
  /**
    * A JSON set of elements including the awsAccountId and its entityArn, entityValue and its entityArn, lastUpdatedTime, and statusCode.
    */
  var entities: js.UndefOr[EntityList] = js.native
  
  /**
    * A JSON set of elements of the failed response, including the awsAccountId, errorMessage, errorName, and eventArn.
    */
  var failedSet: js.UndefOr[DescribeAffectedEntitiesForOrganizationFailedSet] = js.native
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
}
object DescribeAffectedEntitiesForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeAffectedEntitiesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedEntitiesForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeAffectedEntitiesForOrganizationResponseMutableBuilder[Self <: DescribeAffectedEntitiesForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: EntityList): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: AffectedEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setFailedSet(value: DescribeAffectedEntitiesForOrganizationFailedSet): Self = StObject.set(x, "failedSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedSetUndefined: Self = StObject.set(x, "failedSet", js.undefined)
    
    @scala.inline
    def setFailedSetVarargs(value: OrganizationAffectedEntitiesErrorItem*): Self = StObject.set(x, "failedSet", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
