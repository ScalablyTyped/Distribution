package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XRHitTestTrackableType extends StObject
@JSGlobal("XRHitTestTrackableType")
@js.native
object XRHitTestTrackableType extends StObject {
  
  @js.native
  sealed trait mesh
    extends StObject
       with XRHitTestTrackableType
  
  @js.native
  sealed trait plane
    extends StObject
       with XRHitTestTrackableType
  
  @js.native
  sealed trait point
    extends StObject
       with XRHitTestTrackableType
}
