package typings.cassandraDashDriver.cassandraDashDriverMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait consistencies extends js.Object

@JSImport("cassandra-driver", "types.consistencies")
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
  
  /* 4 */ val all: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.all with Double = js.native
  /* 0 */ val any: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.any with Double = js.native
  /* 6 */ val eachQuorum: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.eachQuorum with Double = js.native
  /* 9 */ val localOne: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.localOne with Double = js.native
  /* 5 */ val localQuorum: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.localQuorum with Double = js.native
  /* 8 */ val localSerial: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.localSerial with Double = js.native
  /* 0 */ val one: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.one with Double = js.native
  /* 3 */ val quorum: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.quorum with Double = js.native
  /* 7 */ val serial: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.serial with Double = js.native
  /* 2 */ val three: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.three with Double = js.native
  /* 1 */ val two: typings.cassandraDashDriver.cassandraDashDriverMod.types.consistencies.two with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[consistencies with Double] = js.native
}

