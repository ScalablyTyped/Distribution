package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait protocolVersion extends StObject
@JSImport("cassandra-driver/lib/types", "types.protocolVersion")
@js.native
object protocolVersion extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[protocolVersion & Double] = js.native
  
  @js.native
  sealed trait dseV1
    extends StObject
       with protocolVersion
  /* 0x41 */ val dseV1: typings.cassandraDriver.typesMod.types.protocolVersion.dseV1 & Double = js.native
  
  @js.native
  sealed trait dseV2
    extends StObject
       with protocolVersion
  /* 0x42 */ val dseV2: typings.cassandraDriver.typesMod.types.protocolVersion.dseV2 & Double = js.native
  
  def isSupported(version: protocolVersion): Boolean = js.native
  
  @js.native
  sealed trait maxSupported
    extends StObject
       with protocolVersion
  /* 0x42 */ val maxSupported: typings.cassandraDriver.typesMod.types.protocolVersion.maxSupported & Double = js.native
  
  @js.native
  sealed trait minSupported
    extends StObject
       with protocolVersion
  /* 0x01 */ val minSupported: typings.cassandraDriver.typesMod.types.protocolVersion.minSupported & Double = js.native
  
  @js.native
  sealed trait v1
    extends StObject
       with protocolVersion
  /* 0x01 */ val v1: typings.cassandraDriver.typesMod.types.protocolVersion.v1 & Double = js.native
  
  @js.native
  sealed trait v2
    extends StObject
       with protocolVersion
  /* 0x02 */ val v2: typings.cassandraDriver.typesMod.types.protocolVersion.v2 & Double = js.native
  
  @js.native
  sealed trait v3
    extends StObject
       with protocolVersion
  /* 0x03 */ val v3: typings.cassandraDriver.typesMod.types.protocolVersion.v3 & Double = js.native
  
  @js.native
  sealed trait v4
    extends StObject
       with protocolVersion
  /* 0x04 */ val v4: typings.cassandraDriver.typesMod.types.protocolVersion.v4 & Double = js.native
  
  @js.native
  sealed trait v5
    extends StObject
       with protocolVersion
  /* 0x05 */ val v5: typings.cassandraDriver.typesMod.types.protocolVersion.v5 & Double = js.native
}
