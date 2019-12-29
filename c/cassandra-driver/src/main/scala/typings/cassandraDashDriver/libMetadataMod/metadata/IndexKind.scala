package typings.cassandraDashDriver.libMetadataMod.metadata

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
  /* 1 */ @js.native
  object composites extends TopLevel[composites with Double]
  
  /* 0 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 0 */ @js.native
  object keys extends TopLevel[keys with Double]
  
}

