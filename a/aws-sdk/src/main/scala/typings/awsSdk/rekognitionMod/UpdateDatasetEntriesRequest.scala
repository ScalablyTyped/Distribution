package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetEntriesRequest extends StObject {
  
  /**
    *  The changes that you want to make to the dataset. 
    */
  var Changes: DatasetChanges
  
  /**
    *  The Amazon Resource Name (ARN) of the dataset that you want to update. 
    */
  var DatasetArn: typings.awsSdk.rekognitionMod.DatasetArn
}
object UpdateDatasetEntriesRequest {
  
  inline def apply(Changes: DatasetChanges, DatasetArn: DatasetArn): UpdateDatasetEntriesRequest = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any], DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetEntriesRequest]
  }
  
  extension [Self <: UpdateDatasetEntriesRequest](x: Self) {
    
    inline def setChanges(value: DatasetChanges): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
