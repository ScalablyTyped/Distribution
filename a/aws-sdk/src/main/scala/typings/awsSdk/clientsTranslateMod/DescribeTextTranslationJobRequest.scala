package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTextTranslationJobRequest extends StObject {
  
  /**
    * The identifier that Amazon Translate generated for the job. The StartTextTranslationJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.clientsTranslateMod.JobId
}
object DescribeTextTranslationJobRequest {
  
  inline def apply(JobId: JobId): DescribeTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTextTranslationJobRequest]
  }
  
  extension [Self <: DescribeTextTranslationJobRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
