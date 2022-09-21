package typings.babylonjs.legacyMod

import typings.babylonjs.meshoptCompressionMod.IMeshoptCompressionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "MeshoptCompression")
@js.native
/**
  * Constructor
  */
open class MeshoptCompression ()
  extends typings.babylonjs.indexMod.MeshoptCompression
/* static members */
object MeshoptCompression {
  
  @JSImport("babylonjs/Legacy/legacy", "MeshoptCompression")
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
  @JSImport("babylonjs/Legacy/legacy", "MeshoptCompression.Configuration")
  @js.native
  def Configuration: IMeshoptCompressionConfiguration = js.native
  inline def Configuration_=(x: IMeshoptCompressionConfiguration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "MeshoptCompression._Default")
  @js.native
  def _Default: Any = js.native
  inline def _Default_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Default")(x.asInstanceOf[js.Any])
}
