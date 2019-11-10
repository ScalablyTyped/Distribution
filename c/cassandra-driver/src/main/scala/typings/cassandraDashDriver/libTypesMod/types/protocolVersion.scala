package typings.cassandraDashDriver.libTypesMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait protocolVersion extends js.Object

@JSImport("cassandra-driver/lib/types", "types.protocolVersion")
@js.native
object protocolVersion extends js.Object {
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
  
  /* 0x05 */ val maxSupported: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.maxSupported with Double = js.native
  /* 0x01 */ val minSupported: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.minSupported with Double = js.native
  /* 0x01 */ val v1: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.v1 with Double = js.native
  /* 0x02 */ val v2: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.v2 with Double = js.native
  /* 0x03 */ val v3: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.v3 with Double = js.native
  /* 0x04 */ val v4: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.v4 with Double = js.native
  /* 0x05 */ val v5: typings.cassandraDashDriver.libTypesMod.types.protocolVersion.v5 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[protocolVersion with Double] = js.native
  def isSupported(version: protocolVersion): Boolean = js.native
}

