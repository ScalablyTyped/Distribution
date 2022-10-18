package typings.babylonjs.global

import typings.babylonjs.XRSessionEventInit
import typings.babylonjs.XRSessionEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRSessionEvents are fired to indicate changes to the state of an XRSession.
  * ref: https://immersive-web.github.io/webxr/#xrsessionevent-interface
  */
@JSGlobal("XRSessionEvent")
@js.native
open class XRSessionEvent protected ()
  extends StObject
     with typings.babylonjs.XRSessionEvent {
  def this(`type`: XRSessionEventType) = this()
  def this(`type`: XRSessionEventType, eventInitDict: XRSessionEventInit) = this()
}
