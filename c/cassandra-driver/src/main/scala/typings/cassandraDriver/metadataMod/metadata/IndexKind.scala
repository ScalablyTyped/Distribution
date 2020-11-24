package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexKind extends js.Object
@JSImport("cassandra-driver/lib/metadata", "metadata.IndexKind")
@js.native
object IndexKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind with Double] = js.native
  
  @js.native
  sealed trait composites extends IndexKind
  /* 1 */ @js.native
  object composites extends TopLevel[composites with Double]
  
  @js.native
  sealed trait custom extends IndexKind
  /* 0 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  @js.native
  sealed trait keys extends IndexKind
  /* 0 */ @js.native
  object keys extends TopLevel[keys with Double]
}
