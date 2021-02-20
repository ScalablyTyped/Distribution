package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassConfiguration")
@js.native
class PrePassConfiguration ()
  extends typings.babylonjs.BABYLON.PrePassConfiguration
/* static members */
object PrePassConfiguration {
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  @JSGlobal("BABYLON.PrePassConfiguration.AddSamplers")
  @js.native
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  @JSGlobal("BABYLON.PrePassConfiguration.AddUniforms")
  @js.native
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
}
