package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketCriteriaForJob extends StObject {
  
  /**
    * The property- and tag-based conditions that determine which buckets to exclude from the job.
    */
  var excludes: js.UndefOr[CriteriaBlockForJob] = js.undefined
  
  /**
    * The property- and tag-based conditions that determine which buckets to include in the job.
    */
  var includes: js.UndefOr[CriteriaBlockForJob] = js.undefined
}
object S3BucketCriteriaForJob {
  
  inline def apply(): S3BucketCriteriaForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketCriteriaForJob]
  }
  
  extension [Self <: S3BucketCriteriaForJob](x: Self) {
    
    inline def setExcludes(value: CriteriaBlockForJob): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setIncludes(value: CriteriaBlockForJob): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
  }
}
