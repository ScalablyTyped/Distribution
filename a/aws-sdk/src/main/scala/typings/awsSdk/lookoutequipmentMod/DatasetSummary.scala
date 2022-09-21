package typings.awsSdk.lookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetSummary extends StObject {
  
  /**
    * The time at which the dataset was created in Amazon Lookout for Equipment. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified dataset. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.lookoutequipmentMod.DatasetArn] = js.undefined
  
  /**
    * The name of the dataset. 
    */
  var DatasetName: js.UndefOr[typings.awsSdk.lookoutequipmentMod.DatasetName] = js.undefined
  
  /**
    * Indicates the status of the dataset. 
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
}
object DatasetSummary {
  
  inline def apply(): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetSummary]
  }
  
  extension [Self <: DatasetSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "DatasetName", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
