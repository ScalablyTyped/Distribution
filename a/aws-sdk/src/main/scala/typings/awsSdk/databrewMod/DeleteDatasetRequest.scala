package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to be deleted.
    */
  var Name: DatasetName = js.native
}
object DeleteDatasetRequest {
  
  @scala.inline
  def apply(Name: DatasetName): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  @scala.inline
  implicit class DeleteDatasetRequestMutableBuilder[Self <: DeleteDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
