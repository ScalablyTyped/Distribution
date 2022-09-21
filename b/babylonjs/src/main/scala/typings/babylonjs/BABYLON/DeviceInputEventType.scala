package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceInputEventType extends StObject
@JSGlobal("BABYLON.DeviceInputEventType")
@js.native
object DeviceInputEventType extends StObject {
  
  /** PointerDown */
  @js.native
  sealed trait PointerDown
    extends StObject
       with DeviceInputEventType
  
  /** PointerMove */
  @js.native
  sealed trait PointerMove
    extends StObject
       with DeviceInputEventType
  
  /** PointerUp */
  @js.native
  sealed trait PointerUp
    extends StObject
       with DeviceInputEventType
}
