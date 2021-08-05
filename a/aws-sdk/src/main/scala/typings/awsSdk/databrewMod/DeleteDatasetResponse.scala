package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetResponse extends StObject {
  
  /**
    * The name of the dataset that you deleted.
    */
  var Name: DatasetName
}
object DeleteDatasetResponse {
  
  inline def apply(Name: DatasetName): DeleteDatasetResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetResponse]
  }
  
  extension [Self <: DeleteDatasetResponse](x: Self) {
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
