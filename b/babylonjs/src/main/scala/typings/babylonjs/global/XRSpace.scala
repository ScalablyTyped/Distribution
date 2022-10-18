package typings.babylonjs.global

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a virtual coordinate system with an origin that corresponds to a physical location.
  * Spatial data that is requested from the API or given to the API is always expressed in relation
  * to a specific XRSpace at the time of a specific XRFrame. Numeric values such as pose positions
  * are coordinates in that space relative to its origin. The interface is intentionally opaque.
  *
  * ref: https://immersive-web.github.io/webxr/#xrspace-interface
  */
// tslint:disable-next-line no-empty-interface
/* note: abstract class */ @JSGlobal("XRSpace")
@js.native
open class XRSpace ()
  extends StObject
     with EventTarget
