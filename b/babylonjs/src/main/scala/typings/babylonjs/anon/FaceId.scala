package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceId extends StObject {
  
  var faceId: Double
  
  var idx: Double
}
object FaceId {
  
  inline def apply(faceId: Double, idx: Double): FaceId = {
    val __obj = js.Dynamic.literal(faceId = faceId.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceId]
  }
  
  extension [Self <: FaceId](x: Self) {
    
    inline def setFaceId(value: Double): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
  }
}
