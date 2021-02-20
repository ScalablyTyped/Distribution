package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait distance extends StObject
@JSImport("cassandra-driver/lib/types", "types.distance")
@js.native
object distance extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[distance with Double] = js.native
  
  @js.native
  sealed trait ignored extends distance
  /* 1 */ val ignored: typings.cassandraDriver.typesMod.types.distance.ignored with Double = js.native
  
  @js.native
  sealed trait local extends distance
  /* 0 */ val local: typings.cassandraDriver.typesMod.types.distance.local with Double = js.native
  
  @js.native
  sealed trait remote extends distance
  /* 0 */ val remote: typings.cassandraDriver.typesMod.types.distance.remote with Double = js.native
}
