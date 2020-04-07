package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/index", "UniformBuffer")
@js.native
class UniformBuffer protected ()
  extends typings.babylonjs.materialsIndexMod.UniformBuffer {
  /**
    * Instantiates a new Uniform buffer objects.
    *
    * Handles blocks of uniform on the GPU.
    *
    * If WebGL 2 is not available, this class falls back on traditionnal setUniformXXX calls.
    *
    * For more information, please refer to :
    * @see https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
    * @param engine Define the engine the buffer is associated with
    * @param data Define the data contained in the buffer
    * @param dynamic Define if the buffer is updatable
    */
  def this(engine: typings.babylonjs.engineMod.Engine) = this()
  def this(engine: typings.babylonjs.engineMod.Engine, data: js.Array[Double]) = this()
  def this(engine: typings.babylonjs.engineMod.Engine, data: js.Array[Double], dynamic: Boolean) = this()
}

/* static members */
@JSImport("babylonjs/index", "UniformBuffer")
@js.native
object UniformBuffer extends js.Object {
  var _MAX_UNIFORM_SIZE: js.Any = js.native
  var _tempBuffer: js.Any = js.native
}

