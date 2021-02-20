package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxMin extends StObject {
  
  var max: Vector3 = js.native
  
  var min: Vector3 = js.native
}
object MaxMin {
  
  @scala.inline
  def apply(max: Vector3, min: Vector3): MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMin]
  }
  
  @scala.inline
  implicit class MaxMinMutableBuilder[Self <: MaxMin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Vector3): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Vector3): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
