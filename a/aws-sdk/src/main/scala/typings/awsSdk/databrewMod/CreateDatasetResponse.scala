package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetResponse extends StObject {
  
  /**
    * The name of the dataset that you created.
    */
  var Name: DatasetName
}
object CreateDatasetResponse {
  
  @scala.inline
  def apply(Name: DatasetName): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  @scala.inline
  implicit class CreateDatasetResponseMutableBuilder[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
