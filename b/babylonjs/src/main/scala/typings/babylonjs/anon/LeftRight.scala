package typings.babylonjs.anon

import typings.babylonjs.BABYLON.AbstractMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftRight extends StObject {
  
  var left: AbstractMesh
  
  var right: AbstractMesh
}
object LeftRight {
  
  inline def apply(left: AbstractMesh, right: AbstractMesh): LeftRight = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftRight]
  }
  
  extension [Self <: LeftRight](x: Self) {
    
    inline def setLeft(value: AbstractMesh): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: AbstractMesh): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
