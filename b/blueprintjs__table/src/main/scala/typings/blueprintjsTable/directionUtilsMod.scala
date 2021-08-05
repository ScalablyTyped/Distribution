package typings.blueprintjsTable

import typings.blueprintjsTable.directionMod.Direction
import typings.blueprintjsTable.movementDeltaMod.IMovementDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/directionUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def directionToDelta(direction: Direction): IMovementDelta = ^.asInstanceOf[js.Dynamic].applyDynamic("directionToDelta")(direction.asInstanceOf[js.Any]).asInstanceOf[IMovementDelta]
}
