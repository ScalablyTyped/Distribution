package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BucketDefinitionForJob extends js.Object {
  
  /**
    * The unique identifier for the AWS account that owns the buckets. If you specify this value and don't specify a value for the buckets array, the job analyzes objects in all the buckets that are owned by the account and meet other conditions specified for the job.
    */
  var accountId: js.UndefOr[string] = js.native
  
  /**
    * An array that lists the names of the buckets.
    */
  var buckets: js.UndefOr[listOfString] = js.native
}
object S3BucketDefinitionForJob {
  
  @scala.inline
  def apply(): S3BucketDefinitionForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketDefinitionForJob]
  }
  
  @scala.inline
  implicit class S3BucketDefinitionForJobOps[Self <: S3BucketDefinitionForJob] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: string): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: string*): Self = this.set("buckets", js.Array(value :_*))
    
    @scala.inline
    def setBuckets(value: listOfString): Self = this.set("buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
  }
}
