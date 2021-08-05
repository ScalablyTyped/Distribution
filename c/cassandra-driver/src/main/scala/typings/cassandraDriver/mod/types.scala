package typings.cassandraDriver.mod

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object types {
  
  @JSImport("cassandra-driver", "types.BigDecimal")
  @js.native
  class BigDecimal protected ()
    extends typings.cassandraDriver.typesMod.types.BigDecimal {
    def this(unscaledValue: Double, scale: Double) = this()
  }
  object BigDecimal {
    
    @JSImport("cassandra-driver", "types.BigDecimal")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buf: Buffer): typings.cassandraDriver.typesMod.types.BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.BigDecimal]
    
    /* static member */
    inline def fromNumber(value: Double): typings.cassandraDriver.typesMod.types.BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.BigDecimal]
    
    /* static member */
    inline def fromString(value: String): typings.cassandraDriver.typesMod.types.BigDecimal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.BigDecimal]
    
    /* static member */
    inline def toBuffer(value: typings.cassandraDriver.typesMod.types.BigDecimal): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  @JSImport("cassandra-driver", "types.Duration")
  @js.native
  class Duration protected ()
    extends typings.cassandraDriver.typesMod.types.Duration {
    def this(month: Double, days: Double, nanoseconds: Double) = this()
    def this(month: Double, days: Double, nanoseconds: typings.cassandraDriver.typesMod.types.Long) = this()
  }
  object Duration {
    
    @JSImport("cassandra-driver", "types.Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typings.cassandraDriver.typesMod.types.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Duration]
    
    /* static member */
    inline def fromString(input: String): typings.cassandraDriver.typesMod.types.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(input.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Duration]
  }
  
  @JSImport("cassandra-driver", "types.InetAddress")
  @js.native
  class InetAddress protected ()
    extends typings.cassandraDriver.typesMod.types.InetAddress {
    def this(buffer: Buffer) = this()
  }
  object InetAddress {
    
    @JSImport("cassandra-driver", "types.InetAddress")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromString(value: String): typings.cassandraDriver.typesMod.types.InetAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.InetAddress]
  }
  
  @JSImport("cassandra-driver", "types.Integer")
  @js.native
  class Integer protected ()
    extends typings.cassandraDriver.typesMod.types.Integer {
    def this(bits: js.Array[Double], sign: Double) = this()
  }
  object Integer {
    
    @JSImport("cassandra-driver", "types.Integer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.ONE")
    @js.native
    def ONE: typings.cassandraDriver.typesMod.types.Integer = js.native
    inline def ONE_=(x: typings.cassandraDriver.typesMod.types.Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("cassandra-driver", "types.Integer.ZERO")
    @js.native
    def ZERO: typings.cassandraDriver.typesMod.types.Integer = js.native
    inline def ZERO_=(x: typings.cassandraDriver.typesMod.types.Integer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def fromBits(bits: js.Array[Double]): typings.cassandraDriver.typesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(bits.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Integer]
    
    /* static member */
    inline def fromBuffer(bits: Buffer): typings.cassandraDriver.typesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(bits.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Integer]
    
    /* static member */
    inline def fromInt(value: Double): typings.cassandraDriver.typesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Integer]
    
    /* static member */
    inline def fromNumber(value: Double): typings.cassandraDriver.typesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Integer]
    
    /* static member */
    inline def fromString(str: String): typings.cassandraDriver.typesMod.types.Integer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Integer]
    inline def fromString(str: String, opt_radix: Double): typings.cassandraDriver.typesMod.types.Integer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], opt_radix.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.Integer]
    
    /* static member */
    inline def toBuffer(value: typings.cassandraDriver.typesMod.types.Integer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  }
  
  @JSImport("cassandra-driver", "types.LocalDate")
  @js.native
  class LocalDate protected ()
    extends typings.cassandraDriver.typesMod.types.LocalDate {
    def this(year: Double, month: Double, day: Double) = this()
  }
  object LocalDate {
    
    @JSImport("cassandra-driver", "types.LocalDate")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typings.cassandraDriver.typesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalDate]
    
    /* static member */
    inline def fromDate(date: Date): typings.cassandraDriver.typesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalDate]
    
    /* static member */
    inline def fromString(value: String): typings.cassandraDriver.typesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalDate]
    
    /* static member */
    inline def now(): typings.cassandraDriver.typesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.cassandraDriver.typesMod.types.LocalDate]
    
    /* static member */
    inline def utcNow(): typings.cassandraDriver.typesMod.types.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("utcNow")().asInstanceOf[typings.cassandraDriver.typesMod.types.LocalDate]
  }
  
  @JSImport("cassandra-driver", "types.LocalTime")
  @js.native
  class LocalTime protected ()
    extends typings.cassandraDriver.typesMod.types.LocalTime {
    def this(totalNanoseconds: typings.cassandraDriver.typesMod.types.Long) = this()
  }
  object LocalTime {
    
    @JSImport("cassandra-driver", "types.LocalTime")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(value: Buffer): typings.cassandraDriver.typesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
    
    /* static member */
    inline def fromDate(date: Date, nanoseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], nanoseconds.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
    
    /* static member */
    inline def fromMilliseconds(milliseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMilliseconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
    inline def fromMilliseconds(milliseconds: Double, nanoseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMilliseconds")(milliseconds.asInstanceOf[js.Any], nanoseconds.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
    
    /* static member */
    inline def fromString(value: String): typings.cassandraDriver.typesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
    
    /* static member */
    inline def now(): typings.cassandraDriver.typesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
    inline def now(nanoseconds: Double): typings.cassandraDriver.typesMod.types.LocalTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nanoseconds.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.LocalTime]
  }
  
  @JSImport("cassandra-driver", "types.Long")
  @js.native
  class Long ()
    extends typings.cassandraDriver.typesMod.types.Long
  
  @JSImport("cassandra-driver", "types.TimeUuid")
  @js.native
  class TimeUuid protected ()
    extends typings.cassandraDriver.typesMod.types.TimeUuid {
    def this(buffer: Buffer) = this()
  }
  object TimeUuid {
    
    @JSImport("cassandra-driver", "types.TimeUuid")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromDate(date: Date): typings.cassandraDriver.typesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Double): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Double, nodeId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    /* static member */
    inline def fromDate(
      date: Date,
      ticks: Double,
      nodeId: String,
      clockId: String,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(
      date: Date,
      ticks: Double,
      nodeId: String,
      clockId: Buffer,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: Date, ticks: Double, nodeId: Unit, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Double, nodeId: Unit, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Double, nodeId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(
      date: Date,
      ticks: Double,
      nodeId: Buffer,
      clockId: String,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(
      date: Date,
      ticks: Double,
      nodeId: Buffer,
      clockId: Buffer,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fromDate(date: Date, ticks: Unit, nodeId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: String, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: String, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: Unit, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: Unit, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: Buffer, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def fromDate(date: Date, ticks: Unit, nodeId: Buffer, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any], nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    
    /* static member */
    inline def fromString(value: String): typings.cassandraDriver.typesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    
    /* static member */
    inline def max(date: Date, ticks: Double): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    
    /* static member */
    inline def min(date: Date, ticks: Double): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(date.asInstanceOf[js.Any], ticks.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    
    /* static member */
    inline def now(): typings.cassandraDriver.typesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    /* static member */
    inline def now(callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /* static member */
    inline def now(nodeId: String): typings.cassandraDriver.typesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def now(nodeId: String, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    /* static member */
    inline def now(
      nodeId: String,
      clockId: String,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def now(nodeId: String, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def now(
      nodeId: String,
      clockId: Buffer,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def now(nodeId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def now(nodeId: Buffer, clockId: String): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def now(
      nodeId: Buffer,
      clockId: String,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def now(nodeId: Buffer, clockId: Buffer): typings.cassandraDriver.typesMod.types.TimeUuid = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any])).asInstanceOf[typings.cassandraDriver.typesMod.types.TimeUuid]
    inline def now(
      nodeId: Buffer,
      clockId: Buffer,
      callback: ValueCallback[typings.cassandraDriver.typesMod.types.TimeUuid]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(nodeId.asInstanceOf[js.Any], clockId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("cassandra-driver", "types.Tuple")
  @js.native
  class Tuple protected ()
    extends typings.cassandraDriver.typesMod.types.Tuple {
    def this(args: js.Any*) = this()
  }
  object Tuple {
    
    @JSImport("cassandra-driver", "types.Tuple")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromArray(elements: js.Array[js.Any]): typings.cassandraDriver.typesMod.types.Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(elements.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Tuple]
  }
  
  @JSImport("cassandra-driver", "types.Uuid")
  @js.native
  class Uuid protected ()
    extends typings.cassandraDriver.typesMod.types.Uuid {
    def this(buffer: Buffer) = this()
  }
  object Uuid {
    
    @JSImport("cassandra-driver", "types.Uuid")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromString(value: String): typings.cassandraDriver.typesMod.types.Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.typesMod.types.Uuid]
    
    /* static member */
    inline def random(): typings.cassandraDriver.typesMod.types.Uuid = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typings.cassandraDriver.typesMod.types.Uuid]
    /* static member */
    inline def random(callback: ValueCallback[typings.cassandraDriver.typesMod.types.Uuid]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("cassandra-driver", "types.consistencies")
  @js.native
  object consistencies extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cassandraDriver.typesMod.types.consistencies & Double] = js.native
    
    /* 0x05 */ val all: typings.cassandraDriver.typesMod.types.consistencies.all & Double = js.native
    
    /* 0x00 */ val any: typings.cassandraDriver.typesMod.types.consistencies.any & Double = js.native
    
    /* 0x07 */ val eachQuorum: typings.cassandraDriver.typesMod.types.consistencies.eachQuorum & Double = js.native
    
    /* 0x0a */ val localOne: typings.cassandraDriver.typesMod.types.consistencies.localOne & Double = js.native
    
    /* 0x06 */ val localQuorum: typings.cassandraDriver.typesMod.types.consistencies.localQuorum & Double = js.native
    
    /* 0x09 */ val localSerial: typings.cassandraDriver.typesMod.types.consistencies.localSerial & Double = js.native
    
    /* 0x01 */ val one: typings.cassandraDriver.typesMod.types.consistencies.one & Double = js.native
    
    /* 0x04 */ val quorum: typings.cassandraDriver.typesMod.types.consistencies.quorum & Double = js.native
    
    /* 0x08 */ val serial: typings.cassandraDriver.typesMod.types.consistencies.serial & Double = js.native
    
    /* 0x03 */ val three: typings.cassandraDriver.typesMod.types.consistencies.three & Double = js.native
    
    /* 0x02 */ val two: typings.cassandraDriver.typesMod.types.consistencies.two & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.dataTypes")
  @js.native
  object dataTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cassandraDriver.typesMod.types.dataTypes & Double] = js.native
    
    /* 0x0001 */ val ascii: typings.cassandraDriver.typesMod.types.dataTypes.ascii & Double = js.native
    
    /* 0x0002 */ val bigint: typings.cassandraDriver.typesMod.types.dataTypes.bigint & Double = js.native
    
    /* 0x0003 */ val blob: typings.cassandraDriver.typesMod.types.dataTypes.blob & Double = js.native
    
    /* 0x0004 */ val boolean: typings.cassandraDriver.typesMod.types.dataTypes.boolean & Double = js.native
    
    /* 0x0005 */ val counter: typings.cassandraDriver.typesMod.types.dataTypes.counter & Double = js.native
    
    /* 0x0000 */ val custom: typings.cassandraDriver.typesMod.types.dataTypes.custom & Double = js.native
    
    /* 0x0011 */ val date: typings.cassandraDriver.typesMod.types.dataTypes.date & Double = js.native
    
    /* 0x0006 */ val decimal: typings.cassandraDriver.typesMod.types.dataTypes.decimal & Double = js.native
    
    /* 0x0007 */ val double: typings.cassandraDriver.typesMod.types.dataTypes.double & Double = js.native
    
    /* 0x0015 */ val duration: typings.cassandraDriver.typesMod.types.dataTypes.duration & Double = js.native
    
    /* 0x0008 */ val float: typings.cassandraDriver.typesMod.types.dataTypes.float & Double = js.native
    
    /* 0x0010 */ val inet: typings.cassandraDriver.typesMod.types.dataTypes.inet & Double = js.native
    
    /* 0x0009 */ val int: typings.cassandraDriver.typesMod.types.dataTypes.int & Double = js.native
    
    /* 0x0020 */ val list: typings.cassandraDriver.typesMod.types.dataTypes.list & Double = js.native
    
    /* 0x0021 */ val map: typings.cassandraDriver.typesMod.types.dataTypes.map & Double = js.native
    
    /* 0x0022 */ val set: typings.cassandraDriver.typesMod.types.dataTypes.set & Double = js.native
    
    /* 0x0013 */ val smallint: typings.cassandraDriver.typesMod.types.dataTypes.smallint & Double = js.native
    
    /* 0x000a */ val text: typings.cassandraDriver.typesMod.types.dataTypes.text & Double = js.native
    
    /* 0x0012 */ val time: typings.cassandraDriver.typesMod.types.dataTypes.time & Double = js.native
    
    /* 0x000b */ val timestamp: typings.cassandraDriver.typesMod.types.dataTypes.timestamp & Double = js.native
    
    /* 0x000f */ val timeuuid: typings.cassandraDriver.typesMod.types.dataTypes.timeuuid & Double = js.native
    
    /* 0x0014 */ val tinyint: typings.cassandraDriver.typesMod.types.dataTypes.tinyint & Double = js.native
    
    /* 0x0031 */ val tuple: typings.cassandraDriver.typesMod.types.dataTypes.tuple & Double = js.native
    
    /* 0x0030 */ val udt: typings.cassandraDriver.typesMod.types.dataTypes.udt & Double = js.native
    
    /* 0x000c */ val uuid: typings.cassandraDriver.typesMod.types.dataTypes.uuid & Double = js.native
    
    /* 0x000d */ val varchar: typings.cassandraDriver.typesMod.types.dataTypes.varchar & Double = js.native
    
    /* 0x000e */ val varint: typings.cassandraDriver.typesMod.types.dataTypes.varint & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.distance")
  @js.native
  object distance extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cassandraDriver.typesMod.types.distance & Double] = js.native
    
    /* 1 */ val ignored: typings.cassandraDriver.typesMod.types.distance.ignored & Double = js.native
    
    /* 0 */ val local: typings.cassandraDriver.typesMod.types.distance.local & Double = js.native
    
    /* 0 */ val remote: typings.cassandraDriver.typesMod.types.distance.remote & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.protocolVersion")
  @js.native
  object protocolVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cassandraDriver.typesMod.types.protocolVersion & Double] = js.native
    
    /* 0x41 */ val dseV1: typings.cassandraDriver.typesMod.types.protocolVersion.dseV1 & Double = js.native
    
    /* 0x42 */ val dseV2: typings.cassandraDriver.typesMod.types.protocolVersion.dseV2 & Double = js.native
    
    def isSupported(version: typings.cassandraDriver.typesMod.types.protocolVersion): Boolean = js.native
    
    /* 0x42 */ val maxSupported: typings.cassandraDriver.typesMod.types.protocolVersion.maxSupported & Double = js.native
    
    /* 0x01 */ val minSupported: typings.cassandraDriver.typesMod.types.protocolVersion.minSupported & Double = js.native
    
    /* 0x01 */ val v1: typings.cassandraDriver.typesMod.types.protocolVersion.v1 & Double = js.native
    
    /* 0x02 */ val v2: typings.cassandraDriver.typesMod.types.protocolVersion.v2 & Double = js.native
    
    /* 0x03 */ val v3: typings.cassandraDriver.typesMod.types.protocolVersion.v3 & Double = js.native
    
    /* 0x04 */ val v4: typings.cassandraDriver.typesMod.types.protocolVersion.v4 & Double = js.native
    
    /* 0x05 */ val v5: typings.cassandraDriver.typesMod.types.protocolVersion.v5 & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.responseErrorCodes")
  @js.native
  object responseErrorCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.cassandraDriver.typesMod.types.responseErrorCodes & Double] = js.native
    
    /* 0x2400 */ val alreadyExists: typings.cassandraDriver.typesMod.types.responseErrorCodes.alreadyExists & Double = js.native
    
    /* 0x0100 */ val badCredentials: typings.cassandraDriver.typesMod.types.responseErrorCodes.badCredentials & Double = js.native
    
    /* 0x8000 */ val clientWriteFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.clientWriteFailure & Double = js.native
    
    /* 0x2300 */ val configError: typings.cassandraDriver.typesMod.types.responseErrorCodes.configError & Double = js.native
    
    /* 0x1400 */ val functionFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.functionFailure & Double = js.native
    
    /* 0x2200 */ val invalid: typings.cassandraDriver.typesMod.types.responseErrorCodes.invalid & Double = js.native
    
    /* 0x1002 */ val isBootstrapping: typings.cassandraDriver.typesMod.types.responseErrorCodes.isBootstrapping & Double = js.native
    
    /* 0x1001 */ val overloaded: typings.cassandraDriver.typesMod.types.responseErrorCodes.overloaded & Double = js.native
    
    /* 0x000A */ val protocolError: typings.cassandraDriver.typesMod.types.responseErrorCodes.protocolError & Double = js.native
    
    /* 0x1300 */ val readFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.readFailure & Double = js.native
    
    /* 0x1200 */ val readTimeout: typings.cassandraDriver.typesMod.types.responseErrorCodes.readTimeout & Double = js.native
    
    /* 0x0000 */ val serverError: typings.cassandraDriver.typesMod.types.responseErrorCodes.serverError & Double = js.native
    
    /* 0x2000 */ val syntaxError: typings.cassandraDriver.typesMod.types.responseErrorCodes.syntaxError & Double = js.native
    
    /* 0x1003 */ val truncateError: typings.cassandraDriver.typesMod.types.responseErrorCodes.truncateError & Double = js.native
    
    /* 0x2100 */ val unauthorized: typings.cassandraDriver.typesMod.types.responseErrorCodes.unauthorized & Double = js.native
    
    /* 0x1000 */ val unavailableException: typings.cassandraDriver.typesMod.types.responseErrorCodes.unavailableException & Double = js.native
    
    /* 0x2500 */ val unprepared: typings.cassandraDriver.typesMod.types.responseErrorCodes.unprepared & Double = js.native
    
    /* 0x1500 */ val writeFailure: typings.cassandraDriver.typesMod.types.responseErrorCodes.writeFailure & Double = js.native
    
    /* 0x1100 */ val writeTimeout: typings.cassandraDriver.typesMod.types.responseErrorCodes.writeTimeout & Double = js.native
  }
  
  @JSImport("cassandra-driver", "types.unset")
  @js.native
  val unset: js.Object = js.native
}
