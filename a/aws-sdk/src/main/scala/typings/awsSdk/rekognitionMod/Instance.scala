package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The position of the label instance on the image.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
  
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
}
object Instance {
  
  @scala.inline
  def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
  }
}
