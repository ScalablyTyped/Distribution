package typings.babylonjs

import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.lightMod.Light
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.standardMaterialMod.StandardMaterial
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightGizmoMod {
  
  @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo")
  @js.native
  /**
    * Creates a LightGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    */
  class LightGizmo () extends Gizmo {
    def this(gizmoLayer: UtilityLayerRenderer) = this()
    
    var _attachedMeshParent: js.Any = js.native
    
    var _cachedForward: js.Any = js.native
    
    var _cachedPosition: js.Any = js.native
    
    var _light: js.Any = js.native
    
    var _lightMesh: js.Any = js.native
    
    var _material: js.Any = js.native
    
    var _pointerObserver: js.Any = js.native
    
    def light: Nullable[Light] = js.native
    /**
      * The light that the gizmo is attached to
      */
    def light_=(light: Nullable[Light]): Unit = js.native
    
    /**
      * Gets the material used to render the light gizmo
      */
    def material: StandardMaterial = js.native
    
    /**
      * Event that fires each time the gizmo is clicked
      */
    var onClickedObservable: Observable[Light] = js.native
  }
  /* static members */
  object LightGizmo {
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateDirectionalLightMesh")
    @js.native
    def _CreateDirectionalLightMesh: js.Any = js.native
    @scala.inline
    def _CreateDirectionalLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateDirectionalLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateHemisphericLightMesh")
    @js.native
    def _CreateHemisphericLightMesh: js.Any = js.native
    @scala.inline
    def _CreateHemisphericLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateHemisphericLightMesh")(x.asInstanceOf[js.Any])
    
    /**
      * Creates the lines for a light mesh
      */
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateLightLines")
    @js.native
    def _CreateLightLines: js.Any = js.native
    @scala.inline
    def _CreateLightLines_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateLightLines")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreatePointLightMesh")
    @js.native
    def _CreatePointLightMesh: js.Any = js.native
    @scala.inline
    def _CreatePointLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreatePointLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._CreateSpotLightMesh")
    @js.native
    def _CreateSpotLightMesh: js.Any = js.native
    @scala.inline
    def _CreateSpotLightMesh_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateSpotLightMesh")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Gizmos/lightGizmo", "LightGizmo._Scale")
    @js.native
    def _Scale: js.Any = js.native
    @scala.inline
    def _Scale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Scale")(x.asInstanceOf[js.Any])
  }
}
