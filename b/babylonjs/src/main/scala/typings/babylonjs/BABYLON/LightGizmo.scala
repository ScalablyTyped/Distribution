package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LightGizmo
  extends StObject
     with Gizmo {
  
  /* private */ var _attachedMeshParent: js.Any = js.native
  
  /* private */ var _cachedForward: js.Any = js.native
  
  /* private */ var _cachedPosition: js.Any = js.native
  
  /* private */ var _light: js.Any = js.native
  
  /* private */ var _lightMesh: js.Any = js.native
  
  /* private */ var _material: js.Any = js.native
  
  /* private */ var _pointerObserver: js.Any = js.native
  
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
