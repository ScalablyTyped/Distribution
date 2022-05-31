package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointsGroup extends StObject {
  
  /**
    * density per facet for surface points
    * @hidden
    */
  var _groupDensity: js.Array[Double]
  
  /**
    * image data for group (internal use)
    * @hidden
    */
  var _groupImageData: Nullable[ArrayBufferView]
  
  /**
    * Image Height (internal use)
    * @hidden
    */
  var _groupImgHeight: Double
  
  /**
    * Image Width (internal use)
    * @hidden
    */
  var _groupImgWidth: Double
  
  /**
    * Custom position function (internal use)
    * @hidden
    */
  var _positionFunction: Nullable[
    js.Function3[
      /* particle */ CloudPoint, 
      /* i */ js.UndefOr[Double], 
      /* s */ js.UndefOr[Double], 
      Unit
    ]
  ]
  
  /**
    * Only when points are colored by texture carries pointer to texture list array
    * @hidden
    */
  var _textureNb: Double
  
  /**
    * The group id
    * @hidden
    */
  var groupID: Double
}
object PointsGroup {
  
  inline def apply(
    _groupDensity: js.Array[Double],
    _groupImgHeight: Double,
    _groupImgWidth: Double,
    _textureNb: Double,
    groupID: Double
  ): PointsGroup = {
    val __obj = js.Dynamic.literal(_groupDensity = _groupDensity.asInstanceOf[js.Any], _groupImgHeight = _groupImgHeight.asInstanceOf[js.Any], _groupImgWidth = _groupImgWidth.asInstanceOf[js.Any], _textureNb = _textureNb.asInstanceOf[js.Any], groupID = groupID.asInstanceOf[js.Any], _groupImageData = null, _positionFunction = null)
    __obj.asInstanceOf[PointsGroup]
  }
  
  extension [Self <: PointsGroup](x: Self) {
    
    inline def setGroupID(value: Double): Self = StObject.set(x, "groupID", value.asInstanceOf[js.Any])
    
    inline def set_groupDensity(value: js.Array[Double]): Self = StObject.set(x, "_groupDensity", value.asInstanceOf[js.Any])
    
    inline def set_groupDensityVarargs(value: Double*): Self = StObject.set(x, "_groupDensity", js.Array(value :_*))
    
    inline def set_groupImageData(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "_groupImageData", value.asInstanceOf[js.Any])
    
    inline def set_groupImageDataNull: Self = StObject.set(x, "_groupImageData", null)
    
    inline def set_groupImgHeight(value: Double): Self = StObject.set(x, "_groupImgHeight", value.asInstanceOf[js.Any])
    
    inline def set_groupImgWidth(value: Double): Self = StObject.set(x, "_groupImgWidth", value.asInstanceOf[js.Any])
    
    inline def set_positionFunction(value: (/* particle */ CloudPoint, /* i */ js.UndefOr[Double], /* s */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "_positionFunction", js.Any.fromFunction3(value))
    
    inline def set_positionFunctionNull: Self = StObject.set(x, "_positionFunction", null)
    
    inline def set_textureNb(value: Double): Self = StObject.set(x, "_textureNb", value.asInstanceOf[js.Any])
  }
}
