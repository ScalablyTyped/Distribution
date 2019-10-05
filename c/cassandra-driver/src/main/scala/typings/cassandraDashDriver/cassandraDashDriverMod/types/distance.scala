package typings.cassandraDashDriver.cassandraDashDriverMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait distance extends js.Object

@JSImport("cassandra-driver", "types.distance")
@js.native
object distance extends js.Object {
  @js.native
  sealed trait ignored extends distance
  
  @js.native
  sealed trait local extends distance
  
  @js.native
  sealed trait remote extends distance
  
  /* 1 */ val ignored: typings.cassandraDashDriver.cassandraDashDriverMod.types.distance.ignored with Double = js.native
  /* 0 */ val local: typings.cassandraDashDriver.cassandraDashDriverMod.types.distance.local with Double = js.native
  /* 0 */ val remote: typings.cassandraDashDriver.cassandraDashDriverMod.types.distance.remote with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[distance with Double] = js.native
}

