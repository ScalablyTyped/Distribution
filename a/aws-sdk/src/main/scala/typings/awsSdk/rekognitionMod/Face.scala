package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Face extends StObject {
  
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsSdk.rekognitionMod.BoundingBox] = js.undefined
  
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[typings.awsSdk.rekognitionMod.ExternalImageId] = js.undefined
  
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[typings.awsSdk.rekognitionMod.FaceId] = js.undefined
  
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[typings.awsSdk.rekognitionMod.ImageId] = js.undefined
  
  /**
    *  The version of the face detect and storage model that was used when indexing the face vector. 
    */
  var IndexFacesModelVersion: js.UndefOr[typings.awsSdk.rekognitionMod.IndexFacesModelVersion] = js.undefined
}
object Face {
  
  inline def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  
  extension [Self <: Face](x: Self) {
    
    inline def setBoundingBox(value: BoundingBox): Self = StObject.set(x, "BoundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "BoundingBox", js.undefined)
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setExternalImageId(value: ExternalImageId): Self = StObject.set(x, "ExternalImageId", value.asInstanceOf[js.Any])
    
    inline def setExternalImageIdUndefined: Self = StObject.set(x, "ExternalImageId", js.undefined)
    
    inline def setFaceId(value: FaceId): Self = StObject.set(x, "FaceId", value.asInstanceOf[js.Any])
    
    inline def setFaceIdUndefined: Self = StObject.set(x, "FaceId", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setIndexFacesModelVersion(value: IndexFacesModelVersion): Self = StObject.set(x, "IndexFacesModelVersion", value.asInstanceOf[js.Any])
    
    inline def setIndexFacesModelVersionUndefined: Self = StObject.set(x, "IndexFacesModelVersion", js.undefined)
  }
}
