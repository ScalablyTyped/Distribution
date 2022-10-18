package typings.babylonjs.anon

import typings.babylonjs.xRFeaturesWebXRHandTrackingMod.XRHandMeshRigMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Right extends StObject {
  
  var left: XRHandMeshRigMapping
  
  var right: XRHandMeshRigMapping
}
object Right {
  
  inline def apply(left: XRHandMeshRigMapping, right: XRHandMeshRigMapping): Right = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Right]
  }
  
  extension [Self <: Right](x: Self) {
    
    inline def setLeft(value: XRHandMeshRigMapping): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: XRHandMeshRigMapping): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
