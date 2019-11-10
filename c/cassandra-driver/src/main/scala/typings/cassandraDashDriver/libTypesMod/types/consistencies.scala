package typings.cassandraDashDriver.libTypesMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait consistencies extends js.Object

@JSImport("cassandra-driver/lib/types", "types.consistencies")
@js.native
object consistencies extends js.Object {
  @js.native
  sealed trait all extends consistencies
  
  @js.native
  sealed trait any extends consistencies
  
  @js.native
  sealed trait eachQuorum extends consistencies
  
  @js.native
  sealed trait localOne extends consistencies
  
  @js.native
  sealed trait localQuorum extends consistencies
  
  @js.native
  sealed trait localSerial extends consistencies
  
  @js.native
  sealed trait one extends consistencies
  
  @js.native
  sealed trait quorum extends consistencies
  
  @js.native
  sealed trait serial extends consistencies
  
  @js.native
  sealed trait three extends consistencies
  
  @js.native
  sealed trait two extends consistencies
  
  /* 0x05 */ val all: typings.cassandraDashDriver.libTypesMod.types.consistencies.all with Double = js.native
  /* 0x00 */ val any: typings.cassandraDashDriver.libTypesMod.types.consistencies.any with Double = js.native
  /* 0x07 */ val eachQuorum: typings.cassandraDashDriver.libTypesMod.types.consistencies.eachQuorum with Double = js.native
  /* 0x0a */ val localOne: typings.cassandraDashDriver.libTypesMod.types.consistencies.localOne with Double = js.native
  /* 0x06 */ val localQuorum: typings.cassandraDashDriver.libTypesMod.types.consistencies.localQuorum with Double = js.native
  /* 0x09 */ val localSerial: typings.cassandraDashDriver.libTypesMod.types.consistencies.localSerial with Double = js.native
  /* 0x01 */ val one: typings.cassandraDashDriver.libTypesMod.types.consistencies.one with Double = js.native
  /* 0x04 */ val quorum: typings.cassandraDashDriver.libTypesMod.types.consistencies.quorum with Double = js.native
  /* 0x08 */ val serial: typings.cassandraDashDriver.libTypesMod.types.consistencies.serial with Double = js.native
  /* 0x03 */ val three: typings.cassandraDashDriver.libTypesMod.types.consistencies.three with Double = js.native
  /* 0x02 */ val two: typings.cassandraDashDriver.libTypesMod.types.consistencies.two with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[consistencies with Double] = js.native
}

