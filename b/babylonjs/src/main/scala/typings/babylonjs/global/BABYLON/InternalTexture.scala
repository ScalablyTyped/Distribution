package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.InternalTexture")
@js.native
open class InternalTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    engine: typings.babylonjs.BABYLON.ThinEngine,
    source: typings.babylonjs.BABYLON.InternalTextureSource
  ) = this()
  def this(
    engine: typings.babylonjs.BABYLON.ThinEngine,
    source: typings.babylonjs.BABYLON.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}
/* static members */
object InternalTexture {
  
  @JSGlobal("BABYLON.InternalTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  @JSGlobal("BABYLON.InternalTexture._Counter")
  @js.native
  def _Counter: Double = js.native
  inline def _Counter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
}
