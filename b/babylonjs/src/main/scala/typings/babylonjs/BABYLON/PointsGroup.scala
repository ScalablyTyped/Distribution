package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointsGroup extends js.Object {
  
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
  implicit class PointsGroupOps[Self <: PointsGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_groupDensityVarargs(value: Double*): Self = this.set("_groupDensity", js.Array(value :_*))
    
    @scala.inline
    def set_groupDensity(value: js.Array[Double]): Self = this.set("_groupDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupImgHeight(value: Double): Self = this.set("_groupImgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupImgWidth(value: Double): Self = this.set("_groupImgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textureNb(value: Double): Self = this.set("_textureNb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupID(value: Double): Self = this.set("groupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupImageData(value: Nullable[ArrayBufferView]): Self = this.set("_groupImageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_groupImageDataNull: Self = this.set("_groupImageData", null)
    
    @scala.inline
    def set_positionFunction(value: (/* particle */ CloudPoint, /* i */ js.UndefOr[Double], /* s */ js.UndefOr[Double]) => Unit): Self = this.set("_positionFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def set_positionFunctionNull: Self = this.set("_positionFunction", null)
  }
}
