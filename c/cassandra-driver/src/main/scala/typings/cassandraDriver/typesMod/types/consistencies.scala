package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait consistencies extends StObject
@JSImport("cassandra-driver/lib/types", "types.consistencies")
@js.native
object consistencies extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[consistencies & Double] = js.native
  
  @js.native
  sealed trait all
    extends StObject
       with consistencies
  /* 0x05 */ val all: typings.cassandraDriver.typesMod.types.consistencies.all & Double = js.native
  
  @js.native
  sealed trait any
    extends StObject
       with consistencies
  /* 0x00 */ val any: typings.cassandraDriver.typesMod.types.consistencies.any & Double = js.native
  
  @js.native
  sealed trait eachQuorum
    extends StObject
       with consistencies
  /* 0x07 */ val eachQuorum: typings.cassandraDriver.typesMod.types.consistencies.eachQuorum & Double = js.native
  
  @js.native
  sealed trait localOne
    extends StObject
       with consistencies
  /* 0x0a */ val localOne: typings.cassandraDriver.typesMod.types.consistencies.localOne & Double = js.native
  
  @js.native
  sealed trait localQuorum
    extends StObject
       with consistencies
  /* 0x06 */ val localQuorum: typings.cassandraDriver.typesMod.types.consistencies.localQuorum & Double = js.native
  
  @js.native
  sealed trait localSerial
    extends StObject
       with consistencies
  /* 0x09 */ val localSerial: typings.cassandraDriver.typesMod.types.consistencies.localSerial & Double = js.native
  
  @js.native
  sealed trait one
    extends StObject
       with consistencies
  /* 0x01 */ val one: typings.cassandraDriver.typesMod.types.consistencies.one & Double = js.native
  
  @js.native
  sealed trait quorum
    extends StObject
       with consistencies
  /* 0x04 */ val quorum: typings.cassandraDriver.typesMod.types.consistencies.quorum & Double = js.native
  
  @js.native
  sealed trait serial
    extends StObject
       with consistencies
  /* 0x08 */ val serial: typings.cassandraDriver.typesMod.types.consistencies.serial & Double = js.native
  
  @js.native
  sealed trait three
    extends StObject
       with consistencies
  /* 0x03 */ val three: typings.cassandraDriver.typesMod.types.consistencies.three & Double = js.native
  
  @js.native
  sealed trait two
    extends StObject
       with consistencies
  /* 0x02 */ val two: typings.cassandraDriver.typesMod.types.consistencies.two & Double = js.native
}
