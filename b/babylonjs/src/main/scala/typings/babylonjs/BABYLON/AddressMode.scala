package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AddressMode extends StObject
@JSGlobal("BABYLON.AddressMode")
@js.native
object AddressMode extends StObject {
  
  @js.native
  sealed trait ClampToEdge
    extends StObject
       with AddressMode
  
  @js.native
  sealed trait MirrorRepeat
    extends StObject
       with AddressMode
  
  @js.native
  sealed trait Repeat
    extends StObject
       with AddressMode
}
