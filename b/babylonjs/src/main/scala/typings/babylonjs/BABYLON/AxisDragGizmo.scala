package typings.babylonjs.BABYLON

import typings.babylonjs.anon.SnapDistance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisDragGizmo
  extends StObject
     with Gizmo {
  
  /* private */ var _coloredMaterial: js.Any = js.native
  
  /* private */ var _disableMaterial: js.Any = js.native
  
  /* private */ var _dragging: js.Any = js.native
  
  /* private */ var _gizmoMesh: js.Any = js.native
  
  /* private */ var _hoverMaterial: js.Any = js.native
  
  /* private */ var _isEnabled: js.Any = js.native
  
  /* private */ var _parent: js.Any = js.native
  
  /* private */ var _pointerObserver: js.Any = js.native
  
  /**
    * Drag behavior responsible for the gizmos dragging interactions
    */
  var dragBehavior: PointerDragBehavior = js.native
  
  def isEnabled: Boolean = js.native
  /**
    * If the gizmo is enabled
    */
  def isEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Event that fires each time the gizmo snaps to a new location.
    * * snapDistance is the the change in distance
    */
  var onSnapObservable: Observable[SnapDistance] = js.native
  
  /**
    * Drag distance in babylon units that the gizmo will snap to when dragged (Default: 0)
    */
  var snapDistance: Double = js.native
}
