package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PostProcessStageCollection")
@js.native
class PostProcessStageCollection () extends js.Object {
  val fxaa: PostProcessStage = js.native
  val length: scala.Double = js.native
  val ready: scala.Boolean = js.native
  def add(stage: PostProcessStage): PostProcessStage = js.native
  def contains(stage: PostProcessStage): scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def get(index: scala.Double): PostProcessStage = js.native
  def isDestroyed(): scala.Boolean = js.native
  def remove(stage: PostProcessStage): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
}

