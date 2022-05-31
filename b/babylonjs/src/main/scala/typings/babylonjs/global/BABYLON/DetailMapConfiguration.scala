package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DetailMapConfiguration")
@js.native
class DetailMapConfiguration protected ()
  extends StObject
     with typings.babylonjs.BABYLON.DetailMapConfiguration {
  /**
    * Instantiate a new detail map
    * @param markAllSubMeshesAsTexturesDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsTexturesDirty: js.Function0[Unit]) = this()
}
/* static members */
object DetailMapConfiguration {
  
  @JSGlobal("BABYLON.DetailMapConfiguration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  inline def AddSamplers(samplers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddSamplers")(samplers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  inline def AddUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Add the required uniforms to the current buffer.
    * @param uniformBuffer defines the current uniform buffer.
    */
  inline def PrepareUniformBuffer(uniformBuffer: typings.babylonjs.BABYLON.UniformBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformBuffer")(uniformBuffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
