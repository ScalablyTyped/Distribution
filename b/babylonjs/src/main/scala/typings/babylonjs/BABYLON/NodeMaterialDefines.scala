package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMaterialDefines
  extends StObject
     with MaterialDefines
     with IImageProcessingConfigurationDefines {
  
  var BONETEXTURE: Boolean = js.native
  
  /** MISC. */
  var BUMPDIRECTUV: Double = js.native
  
  var BonesPerMesh: Double = js.native
  
  /** MORPH TARGETS */
  var MORPHTARGETS: Boolean = js.native
  
  var MORPHTARGETS_NORMAL: Boolean = js.native
  
  var MORPHTARGETS_TANGENT: Boolean = js.native
  
  var MORPHTARGETS_TEXTURE: Boolean = js.native
  
  var MORPHTARGETS_UV: Boolean = js.native
  
  var NORMAL: Boolean = js.native
  
  /** BONES */
  var NUM_BONE_INFLUENCERS: Double = js.native
  
  var NUM_MORPH_INFLUENCERS: Double = js.native
  
  var TANGENT: Boolean = js.native
  
  var UV1: Boolean = js.native
  
  var UV2: Boolean = js.native
  
  var UV3: Boolean = js.native
  
  var UV4: Boolean = js.native
  
  var UV5: Boolean = js.native
  
  var UV6: Boolean = js.native
  
  def setValue(name: String, value: Any): Unit = js.native
  def setValue(name: String, value: Any, markAsUnprocessedIfDirty: Boolean): Unit = js.native
}
