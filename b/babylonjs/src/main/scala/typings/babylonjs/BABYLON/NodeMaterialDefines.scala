package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NodeMaterialDefines")
@js.native
class NodeMaterialDefines ()
  extends MaterialDefines
     with IImageProcessingConfigurationDefines {
  var BONETEXTURE: Boolean = js.native
  /** MISC. */
  var BUMPDIRECTUV: Double = js.native
  var BonesPerMesh: Double = js.native
  /* CompleteClass */
  override var COLORCURVES: Boolean = js.native
  /* CompleteClass */
  override var COLORGRADING: Boolean = js.native
  /* CompleteClass */
  override var COLORGRADING3D: Boolean = js.native
  /* CompleteClass */
  override var CONTRAST: Boolean = js.native
  /* CompleteClass */
  override var EXPOSURE: Boolean = js.native
  /* CompleteClass */
  override var IMAGEPROCESSING: Boolean = js.native
  /* CompleteClass */
  override var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
  /** MORPH TARGETS */
  var MORPHTARGETS: Boolean = js.native
  var MORPHTARGETS_NORMAL: Boolean = js.native
  var MORPHTARGETS_TANGENT: Boolean = js.native
  var MORPHTARGETS_UV: Boolean = js.native
  var NORMAL: Boolean = js.native
  /** BONES */
  var NUM_BONE_INFLUENCERS: Double = js.native
  var NUM_MORPH_INFLUENCERS: Double = js.native
  /* CompleteClass */
  override var SAMPLER3DBGRMAP: Boolean = js.native
  /* CompleteClass */
  override var SAMPLER3DGREENDEPTH: Boolean = js.native
  var TANGENT: Boolean = js.native
  /* CompleteClass */
  override var TONEMAPPING: Boolean = js.native
  /* CompleteClass */
  override var TONEMAPPING_ACES: Boolean = js.native
  var UV1: Boolean = js.native
  /* CompleteClass */
  override var VIGNETTE: Boolean = js.native
  /* CompleteClass */
  override var VIGNETTEBLENDMODEMULTIPLY: Boolean = js.native
  /* CompleteClass */
  override var VIGNETTEBLENDMODEOPAQUE: Boolean = js.native
  def setValue(name: String, value: Boolean): Unit = js.native
}

