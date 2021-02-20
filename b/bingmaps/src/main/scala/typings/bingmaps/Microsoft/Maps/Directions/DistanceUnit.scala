package typings.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DistanceUnit extends StObject
@JSGlobal("Microsoft.Maps.Directions.DistanceUnit")
@js.native
object DistanceUnit extends StObject {
  
  /** A distance in Kilometers. */
  @js.native
  sealed trait km extends DistanceUnit
  
  /** A distance in Miles. */
  @js.native
  sealed trait miles extends DistanceUnit
}
