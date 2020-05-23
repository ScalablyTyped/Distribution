package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointsGroup extends js.Object {
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
  @scala.inline
  def apply(
    _groupDensity: js.Array[Double],
    _groupImgHeight: Double,
    _groupImgWidth: Double,
    _textureNb: Double,
    groupID: Double,
    _groupImageData: Nullable[ArrayBufferView] = null,
    _positionFunction: (/* particle */ CloudPoint, /* i */ js.UndefOr[Double], /* s */ js.UndefOr[Double]) => Unit = null
  ): PointsGroup = {
    val __obj = js.Dynamic.literal(_groupDensity = _groupDensity.asInstanceOf[js.Any], _groupImgHeight = _groupImgHeight.asInstanceOf[js.Any], _groupImgWidth = _groupImgWidth.asInstanceOf[js.Any], _textureNb = _textureNb.asInstanceOf[js.Any], groupID = groupID.asInstanceOf[js.Any], _groupImageData = _groupImageData.asInstanceOf[js.Any], _positionFunction = js.Any.fromFunction3(_positionFunction))
    __obj.asInstanceOf[PointsGroup]
  }
}

