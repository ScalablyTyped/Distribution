package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PostProcessStageCollection")
@js.native
class PostProcessStageCollection () extends js.Object {
  val fxaa: PostProcessStage = js.native
  val length: Double = js.native
  val ready: Boolean = js.native
  def add(stage: PostProcessStage): PostProcessStage = js.native
  def contains(stage: PostProcessStage): Boolean = js.native
  def destroy(): Unit = js.native
  def get(index: Double): PostProcessStage = js.native
  def isDestroyed(): Boolean = js.native
  def remove(stage: PostProcessStage): Boolean = js.native
  def removeAll(): Unit = js.native
}

