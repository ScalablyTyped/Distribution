package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PrePassConfiguration")
@js.native
class PrePassConfiguration ()
  extends typings.babylonjs.BABYLON.PrePassConfiguration
/* static members */
@JSGlobal("BABYLON.PrePassConfiguration")
@js.native
object PrePassConfiguration extends js.Object {
  
  /**
    * Add the required samplers to the current list.
    * @param samplers defines the current sampler list.
    */
  def AddSamplers(samplers: js.Array[String]): Unit = js.native
  
  /**
    * Add the required uniforms to the current list.
    * @param uniforms defines the current uniform list.
    */
  def AddUniforms(uniforms: js.Array[String]): Unit = js.native
}
