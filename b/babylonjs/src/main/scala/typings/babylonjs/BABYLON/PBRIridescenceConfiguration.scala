package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRIridescenceConfiguration
  extends StObject
     with MaterialPluginBase {
  
  /** @internal */
  /* private */ var _internalMarkAllSubMeshesAsTexturesDirty: Any = js.native
  
  /* private */ var _isEnabled: Any = js.native
  
  /** @internal */
  def _markAllSubMeshesAsTexturesDirty(): Unit = js.native
  
  /* protected */ @JSName("_material")
  var _material_PBRIridescenceConfiguration: PBRBaseMaterial = js.native
  
  /* private */ var _texture: Any = js.native
  
  /* private */ var _thicknessTexture: Any = js.native
  
  def addFallbacks(defines: MaterialIridescenceDefines, fallbacks: EffectFallbacks, currentRank: Double): Double = js.native
  
  /**
    * Defines the maximum thickness of the thin-film layer given in nanometers (nm).
    */
  var indexOfRefraction: Double = js.native
  
  /**
    * Defines the iridescence layer strength (between 0 and 1) it defaults to 1.
    */
  var intensity: Double = js.native
  
  /**
    * Defines if the iridescence is enabled in the material.
    */
  var isEnabled: Boolean = js.native
  
  def isReadyForSubMesh(defines: MaterialIridescenceDefines, scene: Scene): Boolean = js.native
  
  /**
    * Defines the maximum thickness of the thin-film layer given in nanometers (nm). This will be the thickness used if not thickness texture has been set.
    */
  var maximumThickness: Double = js.native
  
  /**
    * Defines the minimum thickness of the thin-film layer given in nanometers (nm).
    */
  var minimumThickness: Double = js.native
  
  def prepareDefinesBeforeAttributes(defines: MaterialIridescenceDefines, scene: Scene): Unit = js.native
  
  /**
    * Stores the iridescence intensity in a texture (red channel)
    */
  var texture: Nullable[BaseTexture] = js.native
  
  /**
    * Stores the iridescence thickness in a texture (green channel)
    */
  var thicknessTexture: Nullable[BaseTexture] = js.native
}
