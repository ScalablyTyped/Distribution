package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeModel extends StObject {
  
  /**
    * The timestamp of the last inference that was made.
    */
  var LatestInference: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the last data sample taken.
    */
  var LatestSampleTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelName: EntityName
  
  /**
    * The model version.
    */
  var ModelVersion: EdgeVersion
}
object EdgeModel {
  
  inline def apply(ModelName: EntityName, ModelVersion: EdgeVersion): EdgeModel = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any], ModelVersion = ModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeModel]
  }
  
  extension [Self <: EdgeModel](x: Self) {
    
    inline def setLatestInference(value: js.Date): Self = StObject.set(x, "LatestInference", value.asInstanceOf[js.Any])
    
    inline def setLatestInferenceUndefined: Self = StObject.set(x, "LatestInference", js.undefined)
    
    inline def setLatestSampleTime(value: js.Date): Self = StObject.set(x, "LatestSampleTime", value.asInstanceOf[js.Any])
    
    inline def setLatestSampleTimeUndefined: Self = StObject.set(x, "LatestSampleTime", js.undefined)
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelVersion(value: EdgeVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
  }
}
