package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FadeInOutBehavior
  extends StObject
     with Behavior[Mesh] {
  
  /* private */ var _hoverValue: Any = js.native
  
  /* private */ var _hovered: Any = js.native
  
  /* private */ var _millisecondsPerFrame: Any = js.native
  
  /* private */ var _ownerNode: Any = js.native
  
  /* private */ var _setAllVisibility: Any = js.native
  
  /* private */ var _update: Any = js.native
  
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    */
  var delay: Double = js.native
  
  /**
    * Triggers the mesh to begin fading in or out
    * @param value if the object should fade in or out (true to fade in)
    */
  def fadeIn(value: Boolean): Unit = js.native
  
  /**
    * Time in milliseconds for the mesh to fade in (Default: 300)
    */
  var fadeInTime: Double = js.native
  
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MFadeInOutBehavior: String = js.native
}
