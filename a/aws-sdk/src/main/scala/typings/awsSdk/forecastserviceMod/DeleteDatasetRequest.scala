package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDatasetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset to delete.
    */
  var DatasetArn: Arn = js.native
}
object DeleteDatasetRequest {
  
  @scala.inline
  def apply(DatasetArn: Arn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  @scala.inline
  implicit class DeleteDatasetRequestMutableBuilder[Self <: DeleteDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
