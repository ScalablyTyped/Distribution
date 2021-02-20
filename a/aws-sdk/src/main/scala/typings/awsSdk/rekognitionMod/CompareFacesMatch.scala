package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompareFacesMatch extends StObject {
  
  /**
    * Provides face metadata (bounding box and confidence that the bounding box actually contains a face).
    */
  var Face: js.UndefOr[ComparedFace] = js.native
  
  /**
    * Level of confidence that the faces match.
    */
  var Similarity: js.UndefOr[Percent] = js.native
}
object CompareFacesMatch {
  
  @scala.inline
  def apply(): CompareFacesMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompareFacesMatch]
  }
  
  @scala.inline
  implicit class CompareFacesMatchMutableBuilder[Self <: CompareFacesMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: ComparedFace): Self = StObject.set(x, "Face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "Face", js.undefined)
    
    @scala.inline
    def setSimilarity(value: Percent): Self = StObject.set(x, "Similarity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilarityUndefined: Self = StObject.set(x, "Similarity", js.undefined)
  }
}
