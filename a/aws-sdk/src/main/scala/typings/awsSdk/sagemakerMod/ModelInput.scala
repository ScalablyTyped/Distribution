package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInput extends StObject {
  
  /**
    * The input configuration object for the model.
    */
  var DataInputConfig: typings.awsSdk.sagemakerMod.DataInputConfig
}
object ModelInput {
  
  inline def apply(DataInputConfig: DataInputConfig): ModelInput = {
    val __obj = js.Dynamic.literal(DataInputConfig = DataInputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelInput]
  }
  
  extension [Self <: ModelInput](x: Self) {
    
    inline def setDataInputConfig(value: DataInputConfig): Self = StObject.set(x, "DataInputConfig", value.asInstanceOf[js.Any])
  }
}
