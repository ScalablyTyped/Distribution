package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketDefinitionForJob extends StObject {
  
  /**
    * The unique identifier for the AWS account that owns the buckets. If you specify this value and don't specify a value for the buckets array, the job analyzes objects in all the buckets that are owned by the account and meet other conditions specified for the job.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * An array that lists the names of the buckets.
    */
  var buckets: js.UndefOr[listOfString] = js.undefined
}
object S3BucketDefinitionForJob {
  
  @scala.inline
  def apply(): S3BucketDefinitionForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketDefinitionForJob]
  }
  
  @scala.inline
  implicit class S3BucketDefinitionForJobMutableBuilder[Self <: S3BucketDefinitionForJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setBuckets(value: listOfString): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: string*): Self = StObject.set(x, "buckets", js.Array(value :_*))
  }
}
