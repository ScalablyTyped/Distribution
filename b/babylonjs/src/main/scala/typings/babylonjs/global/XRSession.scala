package typings.babylonjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Any interaction with XR hardware is done via an XRSession object, which can only be
  * retrieved by calling requestSession() on the XRSystem object. Once a session has been
  * successfully acquired, it can be used to poll the viewer pose, query information about
  * the user's environment, and present imagery to the user.
  *
  * ref: https://immersive-web.github.io/webxr/#xrsession-interface
  */
/* note: abstract class */ @JSGlobal("XRSession")
@js.native
open class XRSession ()
  extends StObject
     with typings.babylonjs.XRSession
