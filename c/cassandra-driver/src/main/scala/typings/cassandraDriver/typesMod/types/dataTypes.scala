package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dataTypes extends StObject
@JSImport("cassandra-driver/lib/types", "types.dataTypes")
@js.native
object dataTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dataTypes with Double] = js.native
  
  @js.native
  sealed trait ascii extends dataTypes
  /* 0x0001 */ val ascii: typings.cassandraDriver.typesMod.types.dataTypes.ascii with Double = js.native
  
  @js.native
  sealed trait bigint extends dataTypes
  /* 0x0002 */ val bigint: typings.cassandraDriver.typesMod.types.dataTypes.bigint with Double = js.native
  
  @js.native
  sealed trait blob extends dataTypes
  /* 0x0003 */ val blob: typings.cassandraDriver.typesMod.types.dataTypes.blob with Double = js.native
  
  @js.native
  sealed trait boolean extends dataTypes
  /* 0x0004 */ val boolean: typings.cassandraDriver.typesMod.types.dataTypes.boolean with Double = js.native
  
  @js.native
  sealed trait counter extends dataTypes
  /* 0x0005 */ val counter: typings.cassandraDriver.typesMod.types.dataTypes.counter with Double = js.native
  
  @js.native
  sealed trait custom extends dataTypes
  /* 0x0000 */ val custom: typings.cassandraDriver.typesMod.types.dataTypes.custom with Double = js.native
  
  @js.native
  sealed trait date extends dataTypes
  /* 0x0011 */ val date: typings.cassandraDriver.typesMod.types.dataTypes.date with Double = js.native
  
  @js.native
  sealed trait decimal extends dataTypes
  /* 0x0006 */ val decimal: typings.cassandraDriver.typesMod.types.dataTypes.decimal with Double = js.native
  
  @js.native
  sealed trait double extends dataTypes
  /* 0x0007 */ val double: typings.cassandraDriver.typesMod.types.dataTypes.double with Double = js.native
  
  @js.native
  sealed trait duration extends dataTypes
  /* 0x0015 */ val duration: typings.cassandraDriver.typesMod.types.dataTypes.duration with Double = js.native
  
  @js.native
  sealed trait float extends dataTypes
  /* 0x0008 */ val float: typings.cassandraDriver.typesMod.types.dataTypes.float with Double = js.native
  
  @js.native
  sealed trait inet extends dataTypes
  /* 0x0010 */ val inet: typings.cassandraDriver.typesMod.types.dataTypes.inet with Double = js.native
  
  @js.native
  sealed trait int extends dataTypes
  /* 0x0009 */ val int: typings.cassandraDriver.typesMod.types.dataTypes.int with Double = js.native
  
  @js.native
  sealed trait list extends dataTypes
  /* 0x0020 */ val list: typings.cassandraDriver.typesMod.types.dataTypes.list with Double = js.native
  
  @js.native
  sealed trait map extends dataTypes
  /* 0x0021 */ val map: typings.cassandraDriver.typesMod.types.dataTypes.map with Double = js.native
  
  @js.native
  sealed trait set extends dataTypes
  /* 0x0022 */ val set: typings.cassandraDriver.typesMod.types.dataTypes.set with Double = js.native
  
  @js.native
  sealed trait smallint extends dataTypes
  /* 0x0013 */ val smallint: typings.cassandraDriver.typesMod.types.dataTypes.smallint with Double = js.native
  
  @js.native
  sealed trait text extends dataTypes
  /* 0x000a */ val text: typings.cassandraDriver.typesMod.types.dataTypes.text with Double = js.native
  
  @js.native
  sealed trait time extends dataTypes
  /* 0x0012 */ val time: typings.cassandraDriver.typesMod.types.dataTypes.time with Double = js.native
  
  @js.native
  sealed trait timestamp extends dataTypes
  /* 0x000b */ val timestamp: typings.cassandraDriver.typesMod.types.dataTypes.timestamp with Double = js.native
  
  @js.native
  sealed trait timeuuid extends dataTypes
  /* 0x000f */ val timeuuid: typings.cassandraDriver.typesMod.types.dataTypes.timeuuid with Double = js.native
  
  @js.native
  sealed trait tinyint extends dataTypes
  /* 0x0014 */ val tinyint: typings.cassandraDriver.typesMod.types.dataTypes.tinyint with Double = js.native
  
  @js.native
  sealed trait tuple extends dataTypes
  /* 0x0031 */ val tuple: typings.cassandraDriver.typesMod.types.dataTypes.tuple with Double = js.native
  
  @js.native
  sealed trait udt extends dataTypes
  /* 0x0030 */ val udt: typings.cassandraDriver.typesMod.types.dataTypes.udt with Double = js.native
  
  @js.native
  sealed trait uuid extends dataTypes
  /* 0x000c */ val uuid: typings.cassandraDriver.typesMod.types.dataTypes.uuid with Double = js.native
  
  @js.native
  sealed trait varchar extends dataTypes
  /* 0x000d */ val varchar: typings.cassandraDriver.typesMod.types.dataTypes.varchar with Double = js.native
  
  @js.native
  sealed trait varint extends dataTypes
  /* 0x000e */ val varint: typings.cassandraDriver.typesMod.types.dataTypes.varint with Double = js.native
}
