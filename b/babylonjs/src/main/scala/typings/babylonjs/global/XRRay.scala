package typings.babylonjs.global

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Experimental/Draft features
@JSGlobal("XRRay")
@js.native
class XRRay protected ()
  extends StObject
     with typings.babylonjs.XRRay {
  def this(transformOrOrigin: typings.babylonjs.XRRigidTransform) = this()
  def this(transformOrOrigin: DOMPointInit) = this()
  def this(transformOrOrigin: typings.babylonjs.XRRigidTransform, direction: DOMPointInit) = this()
  def this(transformOrOrigin: DOMPointInit, direction: DOMPointInit) = this()
  
  /* CompleteClass */
  var direction: DOMPointReadOnly = js.native
  
  /* CompleteClass */
  var matrix: Float32Array = js.native
  
  /* CompleteClass */
  var origin: DOMPointReadOnly = js.native
}
