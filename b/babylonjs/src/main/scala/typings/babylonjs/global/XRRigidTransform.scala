package typings.babylonjs.global

import typings.std.DOMPointInit
import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRRigidTransform")
@js.native
open class XRRigidTransform ()
  extends StObject
     with typings.babylonjs.XRRigidTransform {
  def this(position: DOMPointInit) = this()
  def this(position: Unit, direction: DOMPointInit) = this()
  def this(position: DOMPointInit, direction: DOMPointInit) = this()
  
  /* CompleteClass */
  var inverse: typings.babylonjs.XRRigidTransform = js.native
  
  /* CompleteClass */
  var matrix: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var orientation: DOMPointReadOnly = js.native
  
  /* CompleteClass */
  var position: DOMPointReadOnly = js.native
}
