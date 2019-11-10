package typings.cassandraDashDriver.libMetadataMod.metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexKind extends js.Object

@JSImport("cassandra-driver/lib/metadata", "metadata.IndexKind")
@js.native
object IndexKind extends js.Object {
  @js.native
  sealed trait composites extends IndexKind
  
  @js.native
  sealed trait custom extends IndexKind
  
  @js.native
  sealed trait keys extends IndexKind
  
  /* 1 */ val composites: typings.cassandraDashDriver.libMetadataMod.metadata.IndexKind.composites with Double = js.native
  /* 0 */ val custom: typings.cassandraDashDriver.libMetadataMod.metadata.IndexKind.custom with Double = js.native
  /* 0 */ val keys: typings.cassandraDashDriver.libMetadataMod.metadata.IndexKind.keys with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
}

