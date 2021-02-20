package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ReflectionProbe")
@js.native
class ReflectionProbe protected ()
  extends typings.babylonjs.legacyMod.ReflectionProbe {
  /**
    * Creates a new reflection probe
    * @param name defines the name of the probe
    * @param size defines the texture resolution (for each face)
    * @param scene defines the hosting scene
    * @param generateMipMaps defines if mip maps should be generated automatically (true by default)
    * @param useFloat defines if HDR data (flaot data) should be used to store colors (false by default)
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
    generateMipMaps: js.UndefOr[scala.Nothing],
    useFloat: Boolean
  ) = this()
  def this(
    /** defines the name of the probe */
  name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    useFloat: Boolean
  ) = this()
}
/* static members */
object ReflectionProbe {
  
  /**
    * Parse the JSON representation of a reflection probe in order to recreate the reflection probe in the given scene.
    * @param parsedReflectionProbe Define the JSON representation of the reflection probe
    * @param scene Define the scene the parsed reflection probe should be instantiated in
    * @param rootUrl Define the root url of the parsing sequence in the case of relative dependencies
    * @returns The parsed reflection probe if successful
    */
  @JSImport("babylonjs", "ReflectionProbe.Parse")
  @js.native
  def Parse(parsedReflectionProbe: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typings.babylonjs.reflectionProbeMod.ReflectionProbe] = js.native
}
