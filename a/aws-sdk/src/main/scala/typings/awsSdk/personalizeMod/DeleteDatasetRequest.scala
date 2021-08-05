package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset to delete.
    */
  var datasetArn: Arn
}
object DeleteDatasetRequest {
  
  inline def apply(datasetArn: Arn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  extension [Self <: DeleteDatasetRequest](x: Self) {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "datasetArn", value.asInstanceOf[js.Any])
  }
}
