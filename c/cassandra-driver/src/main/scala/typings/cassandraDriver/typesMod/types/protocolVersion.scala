package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait protocolVersion extends js.Object

@JSImport("cassandra-driver/lib/types", "types.protocolVersion")
@js.native
object protocolVersion extends js.Object {
  @js.native
  sealed trait dseV1 extends protocolVersion
  
  @js.native
  sealed trait dseV2 extends protocolVersion
  
  @js.native
  sealed trait maxSupported extends protocolVersion
  
  @js.native
  sealed trait minSupported extends protocolVersion
  
  @js.native
  sealed trait v1 extends protocolVersion
  
  @js.native
  sealed trait v2 extends protocolVersion
  
  @js.native
  sealed trait v3 extends protocolVersion
  
  @js.native
  sealed trait v4 extends protocolVersion
  
  @js.native
  sealed trait v5 extends protocolVersion
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[protocolVersion with Double] = js.native
  def isSupported(version: protocolVersion): Boolean = js.native
  /* 0x41 */ @js.native
  object dseV1 extends TopLevel[dseV1 with Double]
  
  /* 0x42 */ @js.native
  object dseV2 extends TopLevel[dseV2 with Double]
  
  /* 0x42 */ @js.native
  object maxSupported extends TopLevel[maxSupported with Double]
  
  /* 0x01 */ @js.native
  object minSupported extends TopLevel[minSupported with Double]
  
  /* 0x01 */ @js.native
  object v1 extends TopLevel[v1 with Double]
  
  /* 0x02 */ @js.native
  object v2 extends TopLevel[v2 with Double]
  
  /* 0x03 */ @js.native
  object v3 extends TopLevel[v3 with Double]
  
  /* 0x04 */ @js.native
  object v4 extends TopLevel[v4 with Double]
  
  /* 0x05 */ @js.native
  object v5 extends TopLevel[v5 with Double]
  
}

