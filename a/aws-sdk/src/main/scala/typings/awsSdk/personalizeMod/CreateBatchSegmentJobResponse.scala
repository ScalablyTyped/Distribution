package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchSegmentJobResponse extends StObject {
  
  /**
    * The ARN of the batch segment job.
    */
  var batchSegmentJobArn: js.UndefOr[Arn] = js.undefined
}
object CreateBatchSegmentJobResponse {
  
  inline def apply(): CreateBatchSegmentJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBatchSegmentJobResponse]
  }
  
  extension [Self <: CreateBatchSegmentJobResponse](x: Self) {
    
    inline def setBatchSegmentJobArn(value: Arn): Self = StObject.set(x, "batchSegmentJobArn", value.asInstanceOf[js.Any])
    
    inline def setBatchSegmentJobArnUndefined: Self = StObject.set(x, "batchSegmentJobArn", js.undefined)
  }
}
