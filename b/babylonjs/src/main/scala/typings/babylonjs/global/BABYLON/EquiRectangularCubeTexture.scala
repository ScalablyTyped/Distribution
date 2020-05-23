package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EquiRectangularCubeTexture")
@js.native
class EquiRectangularCubeTexture protected ()
  extends typings.babylonjs.BABYLON.EquiRectangularCubeTexture {
  /**
    * Instantiates an EquiRectangularCubeTexture from the following parameters.
    * @param url The location of the image
    * @param scene The scene the texture will be used in
    * @param size The cubemap desired size (the more it increases the longer the generation will be)
    * @param noMipmap Forces to not generate the mipmap if true
    * @param gammaSpace Specifies if the texture will be used in gamma or linear space
    * (the PBR material requires those textures in linear space, but the standard material would require them in Gamma space)
    * @param onLoad — defines a callback called when texture is loaded
    * @param onError — defines a callback called if there is an error
    */
  def this(url: String, scene: typings.babylonjs.BABYLON.Scene, size: Double) = this()
  def this(url: String, scene: typings.babylonjs.BABYLON.Scene, size: Double, noMipmap: Boolean) = this()
  def this(
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean
  ) = this()
  def this(
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  def this(
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    size: Double,
    noMipmap: Boolean,
    gammaSpace: Boolean,
    onLoad: Nullable[js.Function0[Unit]],
    onError: Nullable[
        js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[_], Unit]
      ]
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.EquiRectangularCubeTexture")
@js.native
object EquiRectangularCubeTexture extends js.Object {
  /** The six faces of the cube. */
  var _FacesMapping: js.Any = js.native
}

