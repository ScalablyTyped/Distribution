package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceId extends StObject {
  
  var faceId: Double = js.native
  
  var idx: Double = js.native
}
object FaceId {
  
  @scala.inline
  def apply(faceId: Double, idx: Double): FaceId = {
    val __obj = js.Dynamic.literal(faceId = faceId.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceId]
  }
  
  @scala.inline
  implicit class FaceIdMutableBuilder[Self <: FaceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceId(value: Double): Self = StObject.set(x, "faceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
  }
}
