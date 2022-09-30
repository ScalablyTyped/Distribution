package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointsGroup extends StObject {
  
  /**
    * density per facet for surface points
    * @internal
    */
  var _groupDensity: js.Array[Double] = js.native
  
  /**
    * image data for group (internal use)
    * @internal
    */
  var _groupImageData: Nullable[js.typedarray.ArrayBufferView] = js.native
  
  /**
    * Image Height (internal use)
    * @internal
    */
  var _groupImgHeight: Double = js.native
  
  /**
    * Image Width (internal use)
    * @internal
    */
  var _groupImgWidth: Double = js.native
  
  /**
    * Custom position function (internal use)
    * @internal
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
    * @internal
    */
  var _textureNb: Double = js.native
  
  /**
    * Get or set the groupId
    * @deprecated Please use groupId instead
    */
  def groupID: Double = js.native
  def groupID_=(groupID: Double): Unit = js.native
  
  /**
    * The group id
    * @internal
    */
  var groupId: Double = js.native
}
