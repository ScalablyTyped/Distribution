package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDatasetResponse extends StObject {
  
  /**
    * The name of the dataset that you updated.
    */
  var Name: DatasetName = js.native
}
object UpdateDatasetResponse {
  
  @scala.inline
  def apply(Name: DatasetName): UpdateDatasetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetResponse]
  }
  
  @scala.inline
  implicit class UpdateDatasetResponseMutableBuilder[Self <: UpdateDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
