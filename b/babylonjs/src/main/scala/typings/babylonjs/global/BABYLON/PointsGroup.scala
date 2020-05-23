package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointsGroup")
@js.native
class PointsGroup protected ()
  extends typings.babylonjs.BABYLON.PointsGroup {
  /**
    * Creates a points group object. This is an internal reference to produce particles for the PCS.
    * PCS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    posFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.BABYLON.CloudPoint, 
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
  /* CompleteClass */
  override var _groupDensity: js.Array[Double] = js.native
  /**
    * image data for group (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _groupImageData: Nullable[ArrayBufferView] = js.native
  /**
    * Image Height (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _groupImgHeight: Double = js.native
  /**
    * Image Width (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _groupImgWidth: Double = js.native
  /**
    * Custom position function (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _positionFunction: Nullable[
    js.Function3[
      /* particle */ typings.babylonjs.BABYLON.CloudPoint, 
      /* i */ js.UndefOr[Double], 
      /* s */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /**
    * Only when points are colored by texture carries pointer to texture list array
    * @hidden
    */
  /* CompleteClass */
  override var _textureNb: Double = js.native
  /**
    * The group id
    * @hidden
    */
  /* CompleteClass */
  override var groupID: Double = js.native
}

