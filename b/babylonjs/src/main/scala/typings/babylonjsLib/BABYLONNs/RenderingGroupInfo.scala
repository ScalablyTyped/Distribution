package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used by the onRenderingGroupObservable
  */
@JSGlobal("BABYLON.RenderingGroupInfo")
@js.native
class RenderingGroupInfo () extends js.Object {
  /**
    * The camera currently used for the rendering pass
    */
  var camera: Nullable[Camera] = js.native
  /**
    * The ID of the renderingGroup being processed
    */
  var renderingGroupId: scala.Double = js.native
  /**
    * The Scene that being rendered
    */
  var scene: Scene = js.native
}

