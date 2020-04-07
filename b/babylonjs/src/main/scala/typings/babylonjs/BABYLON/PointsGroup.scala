package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointsGroup")
@js.native
class PointsGroup protected () extends js.Object {
  /**
    * Creates a points group object. This is an internal reference to produce particles for the PCS.
    * PCS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    posFunction: Nullable[
        js.Function3[
          /* particle */ CloudPoint, 
          /* i */ js.UndefOr[Double], 
          /* s */ js.UndefOr[Double], 
          Unit
        ]
      ]
  ) = this()
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

