package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XRHitTestTrackableType extends js.Object
@JSGlobal("XRHitTestTrackableType")
@js.native
object XRHitTestTrackableType extends js.Object {
  
  @js.native
  sealed trait mesh extends XRHitTestTrackableType
  
  @js.native
  sealed trait plane extends XRHitTestTrackableType
  
  @js.native
  sealed trait point extends XRHitTestTrackableType
}
