package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompareFacesMatch extends StObject {
  
  /**
    * Provides face metadata (bounding box and confidence that the bounding box actually contains a face).
    */
  var Face: js.UndefOr[ComparedFace] = js.undefined
  
  /**
    * Level of confidence that the faces match.
    */
  var Similarity: js.UndefOr[Percent] = js.undefined
}
object CompareFacesMatch {
  
  inline def apply(): CompareFacesMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesMatch]
  }
  
  extension [Self <: CompareFacesMatch](x: Self) {
    
    inline def setFace(value: ComparedFace): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    inline def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    inline def setSimilarity(value: Percent): Self = StObject.set(x, "Similarity", value.asInstanceOf[js.Any])
    
    inline def setSimilarityUndefined: Self = StObject.set(x, "Similarity", js.undefined)
  }
}
