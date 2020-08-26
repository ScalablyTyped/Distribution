package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PostProcessStageComposite")
@js.native
class PostProcessStageComposite protected () extends js.Object {
  def this(stages: js.Array[PostProcessStage]) = this()
  def this(stages: js.Array[PostProcessStage], inputPreviousStageTexture: Boolean) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: js.UndefOr[scala.Nothing],
    name: String
  ) = this()
  def this(stages: js.Array[PostProcessStage], inputPreviousStageTexture: Boolean, name: String) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    uniforms: js.Object
  ) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: js.UndefOr[scala.Nothing],
    name: String,
    uniforms: js.Object
  ) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: Boolean,
    name: js.UndefOr[scala.Nothing],
    uniforms: js.Object
  ) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: Boolean,
    name: String,
    uniforms: js.Object
  ) = this()
  var enabled: Boolean = js.native
  val inputPreviousStageTexture: Boolean = js.native
  val length: Double = js.native
  val name: String = js.native
  val ready: Boolean = js.native
  var select: js.Array[_] = js.native
  var uniforms: js.Object = js.native
  def destroy(): Unit = js.native
  def get(index: Double): PostProcessStage | PostProcessStageComposite = js.native
  def isDestroyed(): Boolean = js.native
}

