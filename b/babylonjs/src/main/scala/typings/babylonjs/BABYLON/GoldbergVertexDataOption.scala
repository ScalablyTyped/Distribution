package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoldbergVertexDataOption extends StObject {
  
  /**
    * optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    */
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  /**
    * the size of the Goldberg, optional default 1
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * allows stretching in the x direction, optional, default size
    */
  var sizeX: js.UndefOr[Double] = js.undefined
  
  /**
    * allows stretching in the y direction, optional, default size
    */
  var sizeY: js.UndefOr[Double] = js.undefined
  
  /**
    * allows stretching in the z direction, optional, default size
    */
  var sizeZ: js.UndefOr[Double] = js.undefined
}
object GoldbergVertexDataOption {
  
  inline def apply(): GoldbergVertexDataOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoldbergVertexDataOption]
  }
  
  extension [Self <: GoldbergVertexDataOption](x: Self) {
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    inline def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    inline def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
    
    inline def setSizeZ(value: Double): Self = StObject.set(x, "sizeZ", value.asInstanceOf[js.Any])
    
    inline def setSizeZUndefined: Self = StObject.set(x, "sizeZ", js.undefined)
  }
}
