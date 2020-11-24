package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMaterialDefines
  extends MaterialDefines
     with IImageProcessingConfigurationDefines {
  
  var BONETEXTURE: Boolean = js.native
  
  /** MISC. */
  var BUMPDIRECTUV: Double = js.native
  
  var BonesPerMesh: Double = js.native
  
  /** MORPH TARGETS */
  var MORPHTARGETS: Boolean = js.native
  
  var MORPHTARGETS_NORMAL: Boolean = js.native
  
  var MORPHTARGETS_TANGENT: Boolean = js.native
  
  var MORPHTARGETS_UV: Boolean = js.native
  
  var NORMAL: Boolean = js.native
  
  /** BONES */
  var NUM_BONE_INFLUENCERS: Double = js.native
  
  var NUM_MORPH_INFLUENCERS: Double = js.native
  
  var TANGENT: Boolean = js.native
  
  var UV1: Boolean = js.native
  
  def setValue(name: String, value: js.Any): Unit = js.native
  def setValue(name: String, value: js.Any, markAsUnprocessedIfDirty: Boolean): Unit = js.native
}
