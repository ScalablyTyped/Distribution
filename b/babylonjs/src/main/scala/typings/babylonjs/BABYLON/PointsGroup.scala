package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointsGroup extends StObject {
  
  /**
    * density per facet for surface points
    * @hidden
    */
  var _groupDensity: js.Array[Double] = js.native
  
  /**
    * image data for group (internal use)
    * @hidden
    */
  var _groupImageData: Nullable[ArrayBufferView] = js.native
  
  /**
    * Image Height (internal use)
    * @hidden
    */
  var _groupImgHeight: Double = js.native
  
  /**
    * Image Width (internal use)
    * @hidden
    */
  var _groupImgWidth: Double = js.native
  
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
  ] = js.native
  
  /**
    * Only when points are colored by texture carries pointer to texture list array
    * @hidden
    */
  var _textureNb: Double = js.native
  
  /**
    * The group id
    * @hidden
    */
  var groupID: Double = js.native
}
object PointsGroup {
  
  @scala.inline
  def apply(
    _groupDensity: js.Array[Double],
    _groupImgHeight: Double,
    _groupImgWidth: Double,
    _textureNb: Double,
    groupID: Double
  ): PointsGroup = {
    val __obj = js.Dynamic.literal(_groupDensity = _groupDensity.asInstanceOf[js.Any], _groupImgHeight = _groupImgHeight.asInstanceOf[js.Any], _groupImgWidth = _groupImgWidth.asInstanceOf[js.Any], _textureNb = _textureNb.asInstanceOf[js.Any], groupID = groupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointsGroup]
  }
  
  @scala.inline
  implicit class PointsGroupMutableBuilder[Self <: PointsGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupID(value: Double): Self = StObject.set(x, "groupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupDensity(value: js.Array[Double]): Self = StObject.set(x, "_groupDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupDensityVarargs(value: Double*): Self = StObject.set(x, "_groupDensity", js.Array(value :_*))
    
    @scala.inline
    def set_groupImageData(value: Nullable[ArrayBufferView]): Self = StObject.set(x, "_groupImageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupImageDataNull: Self = StObject.set(x, "_groupImageData", null)
    
    @scala.inline
    def set_groupImgHeight(value: Double): Self = StObject.set(x, "_groupImgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupImgWidth(value: Double): Self = StObject.set(x, "_groupImgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_positionFunction(value: (/* particle */ CloudPoint, /* i */ js.UndefOr[Double], /* s */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "_positionFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_positionFunctionNull: Self = StObject.set(x, "_positionFunction", null)
    
    @scala.inline
    def set_textureNb(value: Double): Self = StObject.set(x, "_textureNb", value.asInstanceOf[js.Any])
  }
}
