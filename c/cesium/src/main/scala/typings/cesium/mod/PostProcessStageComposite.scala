package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PostProcessStageComposite")
@js.native
class PostProcessStageComposite protected () extends StObject {
  def this(stages: js.Array[PostProcessStage]) = this()
  def this(stages: js.Array[PostProcessStage], inputPreviousStageTexture: Boolean) = this()
  def this(stages: js.Array[PostProcessStage], inputPreviousStageTexture: Boolean, name: String) = this()
  def this(stages: js.Array[PostProcessStage], inputPreviousStageTexture: Unit, name: String) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: Boolean,
    name: String,
    uniforms: js.Object
  ) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: Boolean,
    name: Unit,
    uniforms: js.Object
  ) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: Unit,
    name: String,
    uniforms: js.Object
  ) = this()
  def this(
    stages: js.Array[PostProcessStage],
    inputPreviousStageTexture: Unit,
    name: Unit,
    uniforms: js.Object
  ) = this()
  
  def destroy(): Unit = js.native
  
  var enabled: Boolean = js.native
  
  def get(index: Double): PostProcessStage | PostProcessStageComposite = js.native
  
  val inputPreviousStageTexture: Boolean = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val length: Double = js.native
  
  val name: String = js.native
  
  val ready: Boolean = js.native
  
  var select: js.Array[js.Any] = js.native
  
  var uniforms: js.Object = js.native
}
