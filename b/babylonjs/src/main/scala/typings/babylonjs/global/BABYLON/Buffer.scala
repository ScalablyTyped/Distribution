package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Buffer")
@js.native
open class Buffer protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Buffer {
  /**
    * Constructor
    * @param engine the engine
    * @param data the data to use for this buffer
    * @param updatable whether the data is updatable
    * @param stride the stride (optional)
    * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
    * @param instanced whether the buffer is instanced (optional)
    * @param useBytes set to true if the stride in in bytes (optional)
    * @param divisor sets an optional divisor for instances (1 by default)
    */
  def this(
    engine: Any,
    data: DataArray | typings.babylonjs.BABYLON.DataBuffer,
    updatable: Boolean,
    stride: js.UndefOr[Double],
    postponeInternalCreation: js.UndefOr[Boolean],
    instanced: js.UndefOr[Boolean],
    useBytes: js.UndefOr[Boolean],
    divisor: js.UndefOr[Double]
  ) = this()
}
