package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoldbergCreationOption
  extends StObject
     with GoldbergVertexDataOption {
  
  /**
    * number of horizontal steps along an isogrid
    */
  var m: js.UndefOr[Double] = js.undefined
  
  /**
    * number of angled steps along an isogrid
    */
  var n: js.UndefOr[Double] = js.undefined
  
  /**
    * defines if the mesh must be flagged as updatable
    */
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object GoldbergCreationOption {
  
  inline def apply(): GoldbergCreationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoldbergCreationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoldbergCreationOption] (val x: Self) extends AnyVal {
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
