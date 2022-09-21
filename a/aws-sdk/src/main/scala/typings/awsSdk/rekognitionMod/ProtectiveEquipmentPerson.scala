package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectiveEquipmentPerson extends StObject {
  
  /**
    * An array of body parts detected on a person's body (including body parts without PPE). 
    */
  var BodyParts: js.UndefOr[typings.awsSdk.rekognitionMod.BodyParts] = js.undefined
  
  /**
    * A bounding box around the detected person.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
  
  /**
    * The confidence that Amazon Rekognition has that the bounding box contains a person.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The identifier for the detected person. The identifier is only unique for a single call to DetectProtectiveEquipment.
    */
  var Id: js.UndefOr[UInteger] = js.undefined
}
object ProtectiveEquipmentPerson {
  
  inline def apply(): ProtectiveEquipmentPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectiveEquipmentPerson]
  }
  
  extension [Self <: ProtectiveEquipmentPerson](x: Self) {
    
    inline def setBodyParts(value: BodyParts): Self = StObject.set(x, "BodyParts", value.asInstanceOf[js.Any])
    
    inline def setBodyPartsUndefined: Self = StObject.set(x, "BodyParts", js.undefined)
    
    inline def setBodyPartsVarargs(value: ProtectiveEquipmentBodyPart*): Self = StObject.set(x, "BodyParts", js.Array(value*))
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setId(value: UInteger): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
