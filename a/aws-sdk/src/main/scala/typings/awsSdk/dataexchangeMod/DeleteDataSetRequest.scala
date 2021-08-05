package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataSetRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string
}
object DeleteDataSetRequest {
  
  inline def apply(DataSetId: string): DeleteDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSetRequest]
  }
  
  extension [Self <: DeleteDataSetRequest](x: Self) {
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
  }
}
