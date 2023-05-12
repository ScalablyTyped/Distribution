package typings.awsSdk.clientsTimestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBatchLoadTaskResponse extends StObject {
  
  /**
    * Description of the batch load task.
    */
  var BatchLoadTaskDescription: typings.awsSdk.clientsTimestreamwriteMod.BatchLoadTaskDescription
}
object DescribeBatchLoadTaskResponse {
  
  inline def apply(BatchLoadTaskDescription: BatchLoadTaskDescription): DescribeBatchLoadTaskResponse = {
    val __obj = js.Dynamic.literal(BatchLoadTaskDescription = BatchLoadTaskDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBatchLoadTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBatchLoadTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchLoadTaskDescription(value: BatchLoadTaskDescription): Self = StObject.set(x, "BatchLoadTaskDescription", value.asInstanceOf[js.Any])
  }
}
