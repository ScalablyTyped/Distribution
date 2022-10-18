package typings.cassandraDriver.libTypesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait distance extends StObject
@JSImport("cassandra-driver/lib/types", "types.distance")
@js.native
object distance extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[distance & Double] = js.native
  
  @js.native
  sealed trait ignored
    extends StObject
       with distance
  /* 1 */ val ignored: typings.cassandraDriver.libTypesMod.types.distance.ignored & Double = js.native
  
  @js.native
  sealed trait local
    extends StObject
       with distance
  /* 0 */ val local: typings.cassandraDriver.libTypesMod.types.distance.local & Double = js.native
  
  @js.native
  sealed trait remote
    extends StObject
       with distance
  /* 0 */ val remote: typings.cassandraDriver.libTypesMod.types.distance.remote & Double = js.native
}
