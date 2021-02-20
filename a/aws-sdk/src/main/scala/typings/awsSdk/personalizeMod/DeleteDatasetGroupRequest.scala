package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDatasetGroupRequest extends StObject {
  
  /**
    * The ARN of the dataset group to delete.
    */
  var datasetGroupArn: Arn = js.native
}
object DeleteDatasetGroupRequest {
  
  @scala.inline
  def apply(datasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteDatasetGroupRequestMutableBuilder[Self <: DeleteDatasetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
  }
}
