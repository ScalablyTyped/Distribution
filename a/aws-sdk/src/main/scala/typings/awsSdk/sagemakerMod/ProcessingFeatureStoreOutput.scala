package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingFeatureStoreOutput extends StObject {
  
  /**
    * The name of the Amazon SageMaker FeatureGroup to use as the destination for processing job output. Note that your processing script is responsible for putting records into your Feature Store.
    */
  var FeatureGroupName: typings.awsSdk.sagemakerMod.FeatureGroupName
}
object ProcessingFeatureStoreOutput {
  
  inline def apply(FeatureGroupName: FeatureGroupName): ProcessingFeatureStoreOutput = {
    val __obj = js.Dynamic.literal(FeatureGroupName = FeatureGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingFeatureStoreOutput]
  }
  
  extension [Self <: ProcessingFeatureStoreOutput](x: Self) {
    
    inline def setFeatureGroupName(value: FeatureGroupName): Self = StObject.set(x, "FeatureGroupName", value.asInstanceOf[js.Any])
  }
}
