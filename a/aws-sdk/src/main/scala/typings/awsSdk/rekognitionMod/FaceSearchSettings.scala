package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceSearchSettings extends StObject {
  
  /**
    * The ID of a collection that contains faces that you want to search for.
    */
  var CollectionId: js.UndefOr[typings.awsSdk.rekognitionMod.CollectionId] = js.undefined
  
  /**
    * Minimum face match confidence score that must be met to return a result for a recognized face. The default is 80. 0 is the lowest confidence. 100 is the highest confidence. Values between 0 and 100 are accepted, and values lower than 80 are set to 80.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
}
object FaceSearchSettings {
  
  inline def apply(): FaceSearchSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceSearchSettings]
  }
  
  extension [Self <: FaceSearchSettings](x: Self) {
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setCollectionIdUndefined: Self = StObject.set(x, "CollectionId", js.undefined)
    
    inline def setFaceMatchThreshold(value: Percent): Self = StObject.set(x, "FaceMatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setFaceMatchThresholdUndefined: Self = StObject.set(x, "FaceMatchThreshold", js.undefined)
  }
}
