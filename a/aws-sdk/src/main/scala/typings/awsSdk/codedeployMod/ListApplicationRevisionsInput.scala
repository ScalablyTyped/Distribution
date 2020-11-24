package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationRevisionsInput extends js.Object {
  
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
  implicit class ListApplicationRevisionsInputOps[Self <: ListApplicationRevisionsInput] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: ApplicationName): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployed(value: ListStateFilterAction): Self = this.set("deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployed: Self = this.set("deployed", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: S3Bucket): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    
    @scala.inline
    def setS3KeyPrefix(value: S3Key): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
    
    @scala.inline
    def setSortBy(value: ApplicationRevisionSortBy): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
