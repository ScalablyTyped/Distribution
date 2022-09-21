package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandPart extends StObject
@JSGlobal("BABYLON.HandPart")
@js.native
object HandPart extends StObject {
  
  /**
    * HandPart - Index finger
    */
  @js.native
  sealed trait INDEX
    extends StObject
       with HandPart
  
  /**
    * HandPart - Little finger
    */
  @js.native
  sealed trait LITTLE
    extends StObject
       with HandPart
  
  /**
    * HandPart - Middle finger
    */
  @js.native
  sealed trait MIDDLE
    extends StObject
       with HandPart
  
  /**
    * HandPart - Ring finger
    */
  @js.native
  sealed trait RING
    extends StObject
       with HandPart
  
  /**
    * HandPart - The thumb
    */
  @js.native
  sealed trait THUMB
    extends StObject
       with HandPart
  
  /**
    * HandPart - Wrist
    */
  @js.native
  sealed trait WRIST
    extends StObject
       with HandPart
}
