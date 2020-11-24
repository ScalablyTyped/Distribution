package typings.babylonjs.miscIndexMod

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("babylonjs/Misc/index", "babylonjs/Engines/thinEngine")
@js.native
object babylonjsEnginesThinEngineAugmentingMod extends js.Object {
  
  @js.native
  trait ThinEngine extends js.Object {
    
    /**
      * Create a cube texture from prefiltered data (ie. the mipmaps contain ready to use data for PBR reflection)
      * @param rootUrl defines the url where the file to load is located
      * @param scene defines the current scene
      * @param lodScale defines scale to apply to the mip map selection
      * @param lodOffset defines offset to apply to the mip map selection
      * @param onLoad defines an optional callback raised when the texture is loaded
      * @param onError defines an optional callback raised if there is an issue to load the texture
      * @param format defines the format of the data
      * @param forcedExtension defines the extension to use to pick the right loader
      * @param createPolynomials defines wheter or not to create polynomails harmonics for the texture
      * @returns the cube texture as an InternalTexture
      */
    def createPrefilteredCubeTexture(rootUrl: String, scene: Nullable[Scene], lodScale: Double, lodOffset: Double): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.UndefOr[scala.Nothing],
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: js.UndefOr[scala.Nothing],
      forcedExtension: js.Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: Double
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: Double,
      forcedExtension: js.UndefOr[scala.Nothing],
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: Double,
      forcedExtension: js.Any
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]],
      format: Double,
      forcedExtension: js.Any,
      createPolynomials: Boolean
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: js.UndefOr[Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]],
      onError: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[_], Unit]]
    ): InternalTexture = js.native
    def createPrefilteredCubeTexture(
      rootUrl: String,
      scene: Nullable[Scene],
      lodScale: Double,
      lodOffset: Double,
      onLoad: Nullable[js.Function1[/* internalTexture */ Nullable[InternalTexture], Unit]]
    ): InternalTexture = js.native
  }
}
