package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EquipmentDetection extends StObject {
  
  /**
    * A bounding box surrounding the item of detected PPE.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.native
  
  /**
    * The confidence that Amazon Rekognition has that the bounding box (BoundingBox) contains an item of PPE.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * Information about the body part covered by the detected PPE.
    */
  var CoversBodyPart: js.UndefOr[typings.awsSdk.rekognitionMod.CoversBodyPart] = js.native
  
  /**
    * The type of detected PPE.
    */
  var Type: js.UndefOr[ProtectiveEquipmentType] = js.native
}
object EquipmentDetection {
  
  @scala.inline
  def apply(): EquipmentDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EquipmentDetection]
  }
  
  @scala.inline
  implicit class EquipmentDetectionMutableBuilder[Self <: EquipmentDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setCoversBodyPart(value: CoversBodyPart): Self = StObject.set(x, "CoversBodyPart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoversBodyPartUndefined: Self = StObject.set(x, "CoversBodyPart", js.undefined)
    
    @scala.inline
    def setType(value: ProtectiveEquipmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
