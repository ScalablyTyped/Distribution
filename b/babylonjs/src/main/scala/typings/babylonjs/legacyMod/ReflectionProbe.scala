package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ReflectionProbe")
@js.native
open class ReflectionProbe protected ()
  extends typings.babylonjs.indexMod.ReflectionProbe {
  /**
    * Creates a new reflection probe
    * @param name defines the name of the probe
    * @param size defines the texture resolution (for each face)
    * @param scene defines the hosting scene
    * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
    * @param useFloat defines if HDR data (float data) should be used to store colors (false by default)
    * @param linearSpace defines if the probe should be generated in linear space or not (false by default)
    */
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    useFloat: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Unit,
    useFloat: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    useFloat: Boolean,
    linearSpace: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    useFloat: Unit,
    linearSpace: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Unit,
    useFloat: Boolean,
    linearSpace: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Unit,
    useFloat: Unit,
    linearSpace: Boolean
  ) = this()
}
/* static members */
object ReflectionProbe {
  
  @JSImport("babylonjs/Legacy/legacy", "ReflectionProbe")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parse the JSON representation of a reflection probe in order to recreate the reflection probe in the given scene.
    * @param parsedReflectionProbe Define the JSON representation of the reflection probe
    * @param scene Define the scene the parsed reflection probe should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed reflection probe if successful
    */
  inline def Parse(parsedReflectionProbe: Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.reflectionProbeMod.ReflectionProbe] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedReflectionProbe.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.reflectionProbeMod.ReflectionProbe]]
}
