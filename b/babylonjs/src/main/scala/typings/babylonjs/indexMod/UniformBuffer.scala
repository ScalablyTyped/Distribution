package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(engine: typings.babylonjs.engineMod.Engine, data: Unit, dynamic: Boolean) = this()
}
/* static members */
object UniformBuffer {
  
  @JSImport("babylonjs/index", "UniformBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "UniformBuffer._MAX_UNIFORM_SIZE")
  @js.native
  def _MAX_UNIFORM_SIZE: js.Any = js.native
  inline def _MAX_UNIFORM_SIZE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_UNIFORM_SIZE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "UniformBuffer._tempBuffer")
  @js.native
  def _tempBuffer: js.Any = js.native
  inline def _tempBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tempBuffer")(x.asInstanceOf[js.Any])
}
