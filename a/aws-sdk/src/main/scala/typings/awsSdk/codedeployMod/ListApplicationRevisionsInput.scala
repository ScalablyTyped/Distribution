package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationRevisionsInput extends StObject {
  
  /**
    *  The name of an AWS CodeDeploy application associated with the IAM user or AWS account. 
    */
  var applicationName: ApplicationName = js.native
  
  /**
    *  Whether to list revisions based on whether the revision is the target revision of a deployment group:     include: List revisions that are target revisions of a deployment group.    exclude: Do not list revisions that are target revisions of a deployment group.    ignore: List all revisions.  
    */
  var deployed: js.UndefOr[ListStateFilterAction] = js.native
  
  /**
    * An identifier returned from the previous ListApplicationRevisions call. It can be used to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    *  An Amazon S3 bucket name to limit the search for revisions.   If set to null, all of the user's buckets are searched. 
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  
  /**
    *  A key prefix for the set of Amazon S3 objects to limit the search for revisions. 
    */
  var s3KeyPrefix: js.UndefOr[S3Key] = js.native
  
  /**
    * The column name to use to sort the list results:    registerTime: Sort by the time the revisions were registered with AWS CodeDeploy.    firstUsedTime: Sort by the time the revisions were first used in a deployment.    lastUsedTime: Sort by the time the revisions were last used in a deployment.    If not specified or set to null, the results are returned in an arbitrary order. 
    */
  var sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.native
  
  /**
    *  The order in which to sort the list results:     ascending: ascending order.    descending: descending order.   If not specified, the results are sorted in ascending order. If set to null, the results are sorted in an arbitrary order.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.native
}
object ListApplicationRevisionsInput {
  
  @scala.inline
  def apply(applicationName: ApplicationName): ListApplicationRevisionsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationRevisionsInput]
  }
  
  @scala.inline
  implicit class ListApplicationRevisionsInputMutableBuilder[Self <: ListApplicationRevisionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployed(value: ListStateFilterAction): Self = StObject.set(x, "deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUndefined: Self = StObject.set(x, "deployed", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: S3Key): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSortBy(value: ApplicationRevisionSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
