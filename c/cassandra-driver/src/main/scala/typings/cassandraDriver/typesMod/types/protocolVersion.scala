package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait protocolVersion extends StObject
@JSImport("cassandra-driver/lib/types", "types.protocolVersion")
@js.native
object protocolVersion extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[protocolVersion with Double] = js.native
  
  @js.native
  sealed trait dseV1 extends protocolVersion
  /* 0x41 */ val dseV1: typings.cassandraDriver.typesMod.types.protocolVersion.dseV1 with Double = js.native
  
  @js.native
  sealed trait dseV2 extends protocolVersion
  /* 0x42 */ val dseV2: typings.cassandraDriver.typesMod.types.protocolVersion.dseV2 with Double = js.native
  
  def isSupported(version: protocolVersion): Boolean = js.native
  
  @js.native
  sealed trait maxSupported extends protocolVersion
  /* 0x42 */ val maxSupported: typings.cassandraDriver.typesMod.types.protocolVersion.maxSupported with Double = js.native
  
  @js.native
  sealed trait minSupported extends protocolVersion
  /* 0x01 */ val minSupported: typings.cassandraDriver.typesMod.types.protocolVersion.minSupported with Double = js.native
  
  @js.native
  sealed trait v1 extends protocolVersion
  /* 0x01 */ val v1: typings.cassandraDriver.typesMod.types.protocolVersion.v1 with Double = js.native
  
  @js.native
  sealed trait v2 extends protocolVersion
  /* 0x02 */ val v2: typings.cassandraDriver.typesMod.types.protocolVersion.v2 with Double = js.native
  
  @js.native
  sealed trait v3 extends protocolVersion
  /* 0x03 */ val v3: typings.cassandraDriver.typesMod.types.protocolVersion.v3 with Double = js.native
  
  @js.native
  sealed trait v4 extends protocolVersion
  /* 0x04 */ val v4: typings.cassandraDriver.typesMod.types.protocolVersion.v4 with Double = js.native
  
  @js.native
  sealed trait v5 extends protocolVersion
  /* 0x05 */ val v5: typings.cassandraDriver.typesMod.types.protocolVersion.v5 with Double = js.native
}
