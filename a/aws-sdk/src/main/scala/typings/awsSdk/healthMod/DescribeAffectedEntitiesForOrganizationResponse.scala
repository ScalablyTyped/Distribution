package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAffectedEntitiesForOrganizationResponse extends js.Object {
  
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
  implicit class DescribeAffectedEntitiesForOrganizationResponseOps[Self <: DescribeAffectedEntitiesForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntitiesVarargs(value: AffectedEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: EntityList): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setFailedSetVarargs(value: OrganizationAffectedEntitiesErrorItem*): Self = this.set("failedSet", js.Array(value :_*))
    
    @scala.inline
    def setFailedSet(value: DescribeAffectedEntitiesForOrganizationFailedSet): Self = this.set("failedSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedSet: Self = this.set("failedSet", js.undefined)
    
    @scala.inline
    def setNextToken(value: nextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
