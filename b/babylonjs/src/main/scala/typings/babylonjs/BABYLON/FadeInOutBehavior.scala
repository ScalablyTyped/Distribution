package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FadeInOutBehavior
  extends StObject
     with Behavior[Mesh] {
  
  /* private */ var _attachObserver: Any = js.native
  
  /* private */ var _delay: Any = js.native
  
  /* private */ var _detachObserver: Any = js.native
  
  /* private */ var _hoverValue: Any = js.native
  
  /* private */ var _hovered: Any = js.native
  
  /* private */ var _millisecondsPerFrame: Any = js.native
  
  /* private */ var _onBeforeRenderObserver: Any = js.native
  
  /* private */ var _ownerNode: Any = js.native
  
  /* private */ var _setAllVisibility: Any = js.native
  
  /* private */ var _time: Any = js.native
  
  /* private */ var _update: Any = js.native
  
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    * Will set both fade in and out delay to the same value
    */
  def delay: Double = js.native
  def delay_=(value: Double): Unit = js.native
  
  /**
    * Triggers the mesh to begin fading in (or out)
    * @param fadeIn if the object should fade in or out (true to fade in)
    */
  def fadeIn(): Unit = js.native
  def fadeIn(fadeIn: Boolean): Unit = js.native
  
  /**
    * Time in milliseconds to delay before fading in (Default: 0)
    */
  var fadeInDelay: Double = js.native
  
  /**
    * Time in milliseconds for the mesh to fade in (Default: 300)
    */
  var fadeInTime: Double = js.native
  
  /**
    * Triggers the mesh to begin fading out
    */
  def fadeOut(): Unit = js.native
  
  /**
    * Time in milliseconds to delay before fading out (Default: 0)
    */
  var fadeOutDelay: Double = js.native
  
  /**
    * Time in milliseconds for the mesh to fade out (Default: 300)
    */
  var fadeOutTime: Double = js.native
  
  /**
    *  The name of the behavior
    */
  @JSName("name")
  def name_MFadeInOutBehavior: String = js.native
}
