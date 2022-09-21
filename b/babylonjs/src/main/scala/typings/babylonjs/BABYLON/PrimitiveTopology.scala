package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrimitiveTopology extends StObject
@JSGlobal("BABYLON.PrimitiveTopology")
@js.native
object PrimitiveTopology extends StObject {
  
  @js.native
  sealed trait LineList
    extends StObject
       with PrimitiveTopology
  
  @js.native
  sealed trait LineStrip
    extends StObject
       with PrimitiveTopology
  
  @js.native
  sealed trait PointList
    extends StObject
       with PrimitiveTopology
  
  @js.native
  sealed trait TriangleList
    extends StObject
       with PrimitiveTopology
  
  @js.native
  sealed trait TriangleStrip
    extends StObject
       with PrimitiveTopology
}
