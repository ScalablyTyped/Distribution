package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * XRInputSourcesChangeEvents are fired to indicate changes to the XRInputSources that are
  * available to an XRSession.
  * ref: https://immersive-web.github.io/webxr/#xrinputsourceschangeevent-interface
  */
@js.native
trait XRInputSourceChangeEvent
  extends StObject
     with XRSessionEvent {
  
  val added: js.Array[XRInputSource] = js.native
  
  val removed: js.Array[XRInputSource] = js.native
}
