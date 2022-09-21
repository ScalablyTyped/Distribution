package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMeshoptCompressionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MeshoptCompression")
@js.native
/**
  * Constructor
  */
open class MeshoptCompression ()
  extends StObject
     with typings.babylonjs.BABYLON.MeshoptCompression {
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object MeshoptCompression {
  
  @JSGlobal("BABYLON.MeshoptCompression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The configuration. Defaults to the following:
    * ```javascript
    * decoder: {
    *   url: "https://preview.babylonjs.com/meshopt_decoder.js"
    * }
    * ```
    */
  @JSGlobal("BABYLON.MeshoptCompression.Configuration")
  @js.native
  def Configuration: IMeshoptCompressionConfiguration = js.native
  inline def Configuration_=(x: IMeshoptCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshoptCompression._Default")
  @js.native
  def _Default: Any = js.native
  inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
}
