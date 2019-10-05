package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexType extends js.Object

@JSImport("cassandra-driver", "metadata.IndexType")
@js.native
object IndexType extends js.Object {
  @js.native
  sealed trait composites extends IndexType
  
  @js.native
  sealed trait custom extends IndexType
  
  @js.native
  sealed trait keys extends IndexType
  
  /* 1 */ val composites: typings.cassandraDashDriver.cassandraDashDriverMod.metadata.IndexType.composites with Double = js.native
  /* 0 */ val custom: typings.cassandraDashDriver.cassandraDashDriverMod.metadata.IndexType.custom with Double = js.native
  /* 0 */ val keys: typings.cassandraDashDriver.cassandraDashDriverMod.metadata.IndexType.keys with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexType with Double] = js.native
}

