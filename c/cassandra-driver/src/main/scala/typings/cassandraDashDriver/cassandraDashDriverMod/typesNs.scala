package typings.cassandraDashDriver.cassandraDashDriverMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_AchievedConsistency
import typings.cassandraDashDriver.Anon_Clockseq
import typings.cassandraDashDriver.Anon_Date
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.BigDecimal
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.BigDecimalStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Duration
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.DurationStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.InetAddress
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.InetAddressStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Integer
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.IntegerStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.LocalDate
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.LocalDateStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.LocalTime
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.LocalTimeStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.ResultSet
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.ResultSetStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Row
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.RowStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.TimeUuid
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.TimeUuidStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Tuple
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.TupleStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.Uuid
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.UuidStatic
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes
import typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.distance
import typings.long.Anon_High
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types")
@js.native
object typesNs extends js.Object {
  trait BigDecimal extends js.Object {
    def add(other: BigDecimal): BigDecimal
    def compare(other: BigDecimal): Double
    def equals(other: BigDecimal): Boolean
    def greaterThan(other: BigDecimal): Boolean
    def inspect(): String
    def isNegative(): Boolean
    def isZero(): Boolean
    def notEquals(other: BigDecimal): Boolean
    def subtract(other: BigDecimal): BigDecimal
    def toJSON(): String
    def toNumber(): Double
  }
  
  @js.native
  class BigDecimalCls protected () extends BigDecimal {
    def this(unscaledValue: Double, scale: Double) = this()
    /* CompleteClass */
    override def add(other: BigDecimal): BigDecimal = js.native
    /* CompleteClass */
    override def compare(other: BigDecimal): Double = js.native
    /* CompleteClass */
    override def equals(other: BigDecimal): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: BigDecimal): Boolean = js.native
    /* CompleteClass */
    override def inspect(): String = js.native
    /* CompleteClass */
    override def isNegative(): Boolean = js.native
    /* CompleteClass */
    override def isZero(): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: BigDecimal): Boolean = js.native
    /* CompleteClass */
    override def subtract(other: BigDecimal): BigDecimal = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
    /* CompleteClass */
    override def toNumber(): Double = js.native
  }
  
  @js.native
  trait BigDecimalStatic extends Instantiable2[/* unscaledValue */ Double, /* scale */ Double, BigDecimal] {
    def fromBuffer(buf: Buffer): BigDecimal = js.native
    def fromNumber(value: Double): BigDecimal = js.native
    def fromString(value: String): BigDecimal = js.native
    def toBuffer(value: BigDecimal): Buffer = js.native
  }
  
  trait Duration extends js.Object {
    def equals(other: Duration): Boolean
    def toBuffer(): Buffer
  }
  
  @js.native
  class DurationCls protected () extends Duration {
    def this(month: Double, days: Double, nanoseconds: Double) = this()
    def this(month: Double, days: Double, nanoseconds: typings.long.longMod.^) = this()
    /* CompleteClass */
    override def equals(other: Duration): Boolean = js.native
    /* CompleteClass */
    override def toBuffer(): Buffer = js.native
  }
  
  @js.native
  trait DurationStatic
    extends Instantiable3[
          /* month */ Double, 
          /* days */ Double, 
          (/* nanoseconds */ Double) | (/* nanoseconds */ typings.long.longMod.^), 
          Duration
        ] {
    def fromBuffer(buffer: Buffer): Duration = js.native
    def fromString(input: String): Duration = js.native
  }
  
  trait InetAddress extends js.Object {
    var length: Double
    var version: Double
    def equals(other: InetAddress): Boolean
    def getBuffer(): Buffer
    def inspect(): String
    def toJSON(): String
  }
  
  @js.native
  class InetAddressCls protected () extends InetAddress {
    def this(buffer: Buffer) = this()
    /* CompleteClass */
    override var length: Double = js.native
    /* CompleteClass */
    override var version: Double = js.native
    /* CompleteClass */
    override def equals(other: InetAddress): Boolean = js.native
    /* CompleteClass */
    override def getBuffer(): Buffer = js.native
    /* CompleteClass */
    override def inspect(): String = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
  }
  
  @js.native
  trait InetAddressStatic extends Instantiable1[/* buffer */ Buffer, InetAddress] {
    def fromString(value: String): InetAddress = js.native
  }
  
  @js.native
  trait Integer extends js.Object {
    def abs(): Integer = js.native
    def add(other: Integer): Integer = js.native
    def and(other: Integer): Integer = js.native
    def compare(other: Integer): Double = js.native
    def divide(other: Integer): Integer = js.native
    def equals(other: Integer): Boolean = js.native
    def getBits(index: Double): Double = js.native
    def getBitsUnsigned(index: Double): Double = js.native
    def getSign(): Double = js.native
    def greaterThan(other: Integer): Boolean = js.native
    def greaterThanOrEqual(other: Integer): Boolean = js.native
    def inspect(): String = js.native
    def isNegative(): Boolean = js.native
    def isOdd(): Boolean = js.native
    def isZero(): Boolean = js.native
    def lessThan(other: Integer): Boolean = js.native
    def lessThanOrEqual(other: Integer): Boolean = js.native
    def modulo(other: Integer): Integer = js.native
    def multiply(other: Integer): Integer = js.native
    def negate(): Integer = js.native
    def not(): Integer = js.native
    def notEquals(other: Integer): Boolean = js.native
    def or(other: Integer): Integer = js.native
    def shiftLeft(numBits: Double): Integer = js.native
    def shiftRight(numBits: Double): Integer = js.native
    def shorten(numBits: Double): Integer = js.native
    def subtract(other: Integer): Integer = js.native
    def toInt(): Double = js.native
    def toJSON(): String = js.native
    def toNumber(): Double = js.native
    def toString(opt_radix: Double): String = js.native
    def xor(other: Integer): Integer = js.native
  }
  
  @js.native
  class IntegerCls protected () extends Integer {
    def this(bits: js.Array[Double], sign: Double) = this()
  }
  
  @js.native
  trait IntegerStatic
    extends Instantiable2[/* bits */ js.Array[Double], /* sign */ Double, Integer] {
    var ONE: Integer = js.native
    var ZERO: Integer = js.native
    def fromBits(bits: js.Array[Double]): Integer = js.native
    def fromBuffer(bits: Buffer): Integer = js.native
    def fromInt(value: Double): Integer = js.native
    def fromNumber(value: Double): Integer = js.native
    def fromString(str: String): Integer = js.native
    def fromString(str: String, opt_radix: Double): Integer = js.native
    def toBuffer(value: Integer): Buffer = js.native
  }
  
  trait LocalDate extends js.Object {
    var _value: Double
    var day: Double
    var month: Double
    var year: Double
    def equals(other: LocalDate): Boolean
    def inspect(): String
    def toBuffer(): Buffer
    def toJSON(): String
  }
  
  @js.native
  class LocalDateCls protected () extends LocalDate {
    def this(year: Double, month: Double, day: Double) = this()
    /* CompleteClass */
    override var _value: Double = js.native
    /* CompleteClass */
    override var day: Double = js.native
    /* CompleteClass */
    override var month: Double = js.native
    /* CompleteClass */
    override var year: Double = js.native
    /* CompleteClass */
    override def equals(other: LocalDate): Boolean = js.native
    /* CompleteClass */
    override def inspect(): String = js.native
    /* CompleteClass */
    override def toBuffer(): Buffer = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
  }
  
  @js.native
  trait LocalDateStatic extends Instantiable3[/* year */ Double, /* month */ Double, /* day */ Double, LocalDate] {
    def fromBuffer(buffer: Buffer): LocalDate = js.native
    def fromDate(date: Date): LocalDate = js.native
    def fromString(value: String): LocalDate = js.native
    def now(): LocalDate = js.native
    def utcNow(): LocalDate = js.native
  }
  
  trait LocalTime extends js.Object {
    var hour: Double
    var minute: Double
    var nanosecond: Double
    var second: Double
    def compare(other: LocalTime): Boolean
    def equals(other: LocalTime): Boolean
    def getTotalNanoseconds(): typings.long.longMod.^
    def inspect(): String
    def toBuffer(): Buffer
    def toJSON(): String
  }
  
  @js.native
  class LocalTimeCls protected () extends LocalTime {
    def this(totalNanoseconds: typings.long.longMod.^) = this()
    /* CompleteClass */
    override var hour: Double = js.native
    /* CompleteClass */
    override var minute: Double = js.native
    /* CompleteClass */
    override var nanosecond: Double = js.native
    /* CompleteClass */
    override var second: Double = js.native
    /* CompleteClass */
    override def compare(other: LocalTime): Boolean = js.native
    /* CompleteClass */
    override def equals(other: LocalTime): Boolean = js.native
    /* CompleteClass */
    override def getTotalNanoseconds(): typings.long.longMod.^ = js.native
    /* CompleteClass */
    override def inspect(): String = js.native
    /* CompleteClass */
    override def toBuffer(): Buffer = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
  }
  
  @js.native
  trait LocalTimeStatic
    extends Instantiable1[/* totalNanoseconds */ typings.long.longMod.^, LocalTime] {
    def fromBuffer(value: Buffer): LocalTime = js.native
    def fromDate(date: Date, nanoseconds: Double): LocalTime = js.native
    def fromMilliseconds(milliseconds: Double): LocalTime = js.native
    def fromMilliseconds(milliseconds: Double, nanoseconds: Double): LocalTime = js.native
    def fromString(value: String): LocalTime = js.native
    def now(): LocalTime = js.native
    def now(nanoseconds: Double): LocalTime = js.native
  }
  
  @js.native
  class Long protected ()
    extends typings.long.longMod.^ {
    /**
      * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as signed integers. See the from* functions below for more convenient ways of constructing Longs.
      */
    def this(low: Double) = this()
  }
  
  @js.native
  trait ResultSet extends js.Object {
    var columns: js.Array[StringDictionary[String]] = js.native
    var info: Anon_AchievedConsistency = js.native
    @JSName(scala.scalajs.js.Symbol.iterator)
    var iterator: js.Function0[Iterator[Row, _, js.UndefOr[scala.Nothing]]] = js.native
    var pageState: String = js.native
    var rowLength: Double = js.native
    var rows: js.Array[Row] = js.native
    def first(): Row | Null = js.native
    def getColumns(): js.Array[StringDictionary[String]] = js.native
    def getPageState(): String = js.native
    def nextPage(): Unit = js.native
    def wasApplied(): Boolean = js.native
  }
  
  @js.native
  class ResultSetCls protected () extends ResultSet {
    def this(
      response: js.Any,
      host: String,
      triedHost: StringDictionary[js.Any],
      speculativeExecutions: Double,
      consistency: consistencies
    ) = this()
  }
  
  @js.native
  trait ResultSetStatic
    extends Instantiable5[
          /* response */ js.Any, 
          /* host */ String, 
          /* triedHost */ StringDictionary[js.Any], 
          /* speculativeExecutions */ Double, 
          /* consistency */ consistencies, 
          ResultSet
        ]
  
  @js.native
  trait ResultStream extends Readable {
    var buffer: Buffer = js.native
    var paused: Boolean = js.native
    def _valve(readNext: js.Function0[Unit]): Unit = js.native
    def add(chunk: Buffer): Unit = js.native
  }
  
  @js.native
  trait ResultStreamStatic
    extends Instantiable1[/* opt */ js.Any, ResultSet]
  
  @js.native
  trait Row
    extends /* key */ StringDictionary[js.Any] {
    def forEach(callback: Callback): Unit = js.native
    def get(columnName: String): StringDictionary[js.Any] = js.native
    def get(columnName: Double): StringDictionary[js.Any] = js.native
    def keys(): js.Array[String] = js.native
    def values(): js.Array[StringDictionary[_]] = js.native
  }
  
  @js.native
  class RowCls protected () extends Row {
    def this(columns: js.Array[StringDictionary[String]]) = this()
  }
  
  @js.native
  trait RowStatic
    extends Instantiable1[/* columns */ js.Array[StringDictionary[String]], Row]
  
  trait TimeUuid extends Uuid {
    def getDate(): Date
    def getDatePrecision(): Anon_Date
    def getNodeId(): Buffer
    def getNodeIdString(): String
  }
  
  @js.native
  class TimeUuidCls () extends TimeUuid {
    def this(value: Date) = this()
    def this(value: Date, ticks: Double) = this()
    def this(value: Date, ticks: Double, nodeId: String) = this()
    def this(value: Date, ticks: Double, nodeId: Buffer) = this()
    def this(value: Date, ticks: Double, nodeId: String, clockId: String) = this()
    def this(value: Date, ticks: Double, nodeId: String, clockId: Buffer) = this()
    def this(value: Date, ticks: Double, nodeId: Buffer, clockId: String) = this()
    def this(value: Date, ticks: Double, nodeId: Buffer, clockId: Buffer) = this()
    /* CompleteClass */
    override var buffer: Buffer = js.native
    // tslint:disable-next-line:no-unnecessary-qualifier
    /* CompleteClass */
    override def equals(other: Uuid): Boolean = js.native
    /* CompleteClass */
    override def getBuffer(): Buffer = js.native
    /* CompleteClass */
    override def getDate(): Date = js.native
    /* CompleteClass */
    override def getDatePrecision(): Anon_Date = js.native
    /* CompleteClass */
    override def getNodeId(): Buffer = js.native
    /* CompleteClass */
    override def getNodeIdString(): String = js.native
    /* CompleteClass */
    override def inspect(): String = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
  }
  
  @js.native
  trait TimeUuidStatic
    extends Instantiable1[/* value */ Date, TimeUuid]
       with Instantiable4[
          /* value */ Date, 
          /* ticks */ Double, 
          (/* nodeId */ Buffer) | (/* nodeId */ String), 
          (/* clockId */ Buffer) | (/* clockId */ String), 
          TimeUuid
        ]
       with Instantiable3[
          /* value */ Date, 
          /* ticks */ Double, 
          (/* nodeId */ Buffer) | (/* nodeId */ String), 
          TimeUuid
        ]
       with Instantiable2[/* value */ Date, /* ticks */ Double, TimeUuid]
       with Instantiable0[TimeUuid] {
    def fromDate(date: Date): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double, nodeId: String): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double, nodeId: String, clockId: String): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double, nodeId: String, clockId: Buffer): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double, nodeId: Buffer): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: String): TimeUuid = js.native
    def fromDate(date: Date, ticks: Double, nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
    def fromString(value: String): TimeUuid = js.native
    def max(date: Date): TimeUuid = js.native
    def max(date: Date, ticks: Double): TimeUuid = js.native
    def min(date: Date): TimeUuid = js.native
    def min(date: Date, ticks: Double): TimeUuid = js.native
    def now(): TimeUuid = js.native
    def now(nodeId: String): TimeUuid = js.native
    def now(nodeId: String, clockId: String): TimeUuid = js.native
    def now(nodeId: String, clockId: Buffer): TimeUuid = js.native
    def now(nodeId: Buffer): TimeUuid = js.native
    def now(nodeId: Buffer, clockId: String): TimeUuid = js.native
    def now(nodeId: Buffer, clockId: Buffer): TimeUuid = js.native
  }
  
  trait Tuple extends js.Object {
    var elements: js.Array[_]
    var length: Double
    def get(index: Double): js.Any
    def toJSON(): String
    def values(): js.Array[_]
  }
  
  @js.native
  class TupleCls protected () extends Tuple {
    def this(args: js.Any*) = this()
    /* CompleteClass */
    override var elements: js.Array[_] = js.native
    /* CompleteClass */
    override var length: Double = js.native
    /* CompleteClass */
    override def get(index: Double): js.Any = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
    /* CompleteClass */
    override def values(): js.Array[_] = js.native
  }
  
  @js.native
  trait TupleStatic
    extends Instantiable1[/* args (repeated) */ js.Any, Tuple] {
    def fromArray(elements: js.Array[_]): Tuple = js.native
  }
  
  trait Uuid extends js.Object {
    var buffer: Buffer
    // tslint:disable-next-line:no-unnecessary-qualifier
    def equals(other: Uuid): Boolean
    def getBuffer(): Buffer
    def inspect(): String
    def toJSON(): String
  }
  
  @js.native
  class UuidCls protected () extends Uuid {
    def this(buffer: Buffer) = this()
    /* CompleteClass */
    override var buffer: Buffer = js.native
    // tslint:disable-next-line:no-unnecessary-qualifier
    /* CompleteClass */
    override def equals(other: Uuid): Boolean = js.native
    /* CompleteClass */
    override def getBuffer(): Buffer = js.native
    /* CompleteClass */
    override def inspect(): String = js.native
    /* CompleteClass */
    override def toJSON(): String = js.native
  }
  
  @js.native
  trait UuidStatic extends Instantiable1[/* buffer */ Buffer, Uuid] {
    def fromString(value: String): Uuid = js.native
    def random(): Uuid = js.native
  }
  
  @js.native
  sealed trait consistencies extends js.Object
  
  @js.native
  sealed trait dataTypes extends js.Object
  
  @js.native
  sealed trait distance extends js.Object
  
  trait unset extends js.Object {
    var unset: Boolean
  }
  
  var BigDecimal: BigDecimalStatic = js.native
  var Duration: DurationStatic = js.native
  var InetAddress: InetAddressStatic = js.native
  var Integer: IntegerStatic = js.native
  var LocalDate: LocalDateStatic = js.native
  var LocalTime: LocalTimeStatic = js.native
  var ResultSet: ResultSetStatic = js.native
  // let ResultStream: ResultStreamStatic;
  var Row: RowStatic = js.native
  var TimeUuid: TimeUuidStatic = js.native
  var Tuple: TupleStatic = js.native
  var Uuid: UuidStatic = js.native
  def generateTimestamp(): typings.long.longMod.^ = js.native
  def generateTimestamp(date: Date): typings.long.longMod.^ = js.native
  def generateTimestamp(date: Date, microseconds: Double): typings.long.longMod.^ = js.native
  def timeuuid(): String = js.native
  def timeuuid(options: Anon_Clockseq): String = js.native
  def timeuuid(options: Anon_Clockseq, buffer: Buffer): String = js.native
  def timeuuid(options: Anon_Clockseq, buffer: Buffer, offset: Double): String = js.native
  @js.native
  object Long
    extends Instantiable1[/* low */ Double, typings.long.longMod.^] {
    /**
      * Maximum unsigned value.
      */
    var MAX_UNSIGNED_VALUE: typings.long.longMod.Long = js.native
    /**
      * Maximum signed value.
      */
    var MAX_VALUE: typings.long.longMod.Long = js.native
    /**
      * Minimum signed value.
      */
    var MIN_VALUE: typings.long.longMod.Long = js.native
    /**
      * Signed negative one.
      */
    var NEG_ONE: typings.long.longMod.Long = js.native
    /**
      * Signed one.
      */
    var ONE: typings.long.longMod.Long = js.native
    /**
      * Unsigned one.
      */
    var UONE: typings.long.longMod.Long = js.native
    /**
      * Unsigned zero.
      */
    var UZERO: typings.long.longMod.Long = js.native
    /**
      * Signed zero
      */
    var ZERO: typings.long.longMod.Long = js.native
    /**
      * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits. Each is assumed to use 32 bits.
      */
    def fromBits(lowBits: Double, highBits: Double): typings.long.longMod.Long = js.native
    def fromBits(lowBits: Double, highBits: Double, unsigned: Boolean): typings.long.longMod.Long = js.native
    /**
      * Creates a Long from its byte representation.
      */
    def fromBytes(bytes: js.Array[Double]): typings.long.longMod.Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Boolean): typings.long.longMod.Long = js.native
    def fromBytes(bytes: js.Array[Double], unsigned: Boolean, le: Boolean): typings.long.longMod.Long = js.native
    /**
      * Creates a Long from its little endian byte representation.
      */
    def fromBytesBE(bytes: js.Array[Double]): typings.long.longMod.Long = js.native
    def fromBytesBE(bytes: js.Array[Double], unsigned: Boolean): typings.long.longMod.Long = js.native
    /**
      * Creates a Long from its little endian byte representation.
      */
    def fromBytesLE(bytes: js.Array[Double]): typings.long.longMod.Long = js.native
    def fromBytesLE(bytes: js.Array[Double], unsigned: Boolean): typings.long.longMod.Long = js.native
    /**
      * Returns a Long representing the given 32 bit integer value.
      */
    def fromInt(value: Double): typings.long.longMod.Long = js.native
    def fromInt(value: Double, unsigned: Boolean): typings.long.longMod.Long = js.native
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      */
    def fromNumber(value: Double): typings.long.longMod.Long = js.native
    def fromNumber(value: Double, unsigned: Boolean): typings.long.longMod.Long = js.native
    /**
      * Returns a Long representation of the given string, written using the specified radix.
      */
    def fromString(str: String): typings.long.longMod.Long = js.native
    def fromString(str: String, unsigned: Boolean): typings.long.longMod.Long = js.native
    def fromString(str: String, unsigned: Boolean, radix: Double): typings.long.longMod.Long = js.native
    def fromString(str: String, unsigned: Double): typings.long.longMod.Long = js.native
    def fromString(str: String, unsigned: Double, radix: Double): typings.long.longMod.Long = js.native
    def fromValue(`val`: String): typings.long.longMod.Long = js.native
    def fromValue(`val`: Double): typings.long.longMod.Long = js.native
    def fromValue(`val`: Anon_High): typings.long.longMod.Long = js.native
    /**
      * Converts the specified value to a Long.
      */
    def fromValue(`val`: typings.long.longMod.Long): typings.long.longMod.Long = js.native
    /**
      * Tests if the specified object is a Long.
      */
    def isLong(obj: js.Any): Boolean = js.native
  }
  
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
    
    /* 4 */ val all: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.all with Double = js.native
    /* 0 */ val any: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.any with Double = js.native
    /* 6 */ val eachQuorum: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.eachQuorum with Double = js.native
    /* 9 */ val localOne: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.localOne with Double = js.native
    /* 5 */ val localQuorum: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.localQuorum with Double = js.native
    /* 8 */ val localSerial: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.localSerial with Double = js.native
    /* 0 */ val one: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.one with Double = js.native
    /* 3 */ val quorum: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.quorum with Double = js.native
    /* 7 */ val serial: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.serial with Double = js.native
    /* 2 */ val three: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.three with Double = js.native
    /* 1 */ val two: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.consistencies.two with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[consistencies with Double] = js.native
  }
  
  @js.native
  object dataTypes extends js.Object {
    @js.native
    sealed trait ascii extends dataTypes
    
    @js.native
    sealed trait bigint extends dataTypes
    
    @js.native
    sealed trait blob extends dataTypes
    
    @js.native
    sealed trait boolean extends dataTypes
    
    @js.native
    sealed trait counter extends dataTypes
    
    @js.native
    sealed trait custom extends dataTypes
    
    @js.native
    sealed trait date extends dataTypes
    
    @js.native
    sealed trait decimal extends dataTypes
    
    @js.native
    sealed trait double extends dataTypes
    
    @js.native
    sealed trait float extends dataTypes
    
    @js.native
    sealed trait inet extends dataTypes
    
    @js.native
    sealed trait int extends dataTypes
    
    @js.native
    sealed trait list extends dataTypes
    
    @js.native
    sealed trait map extends dataTypes
    
    @js.native
    sealed trait set extends dataTypes
    
    @js.native
    sealed trait smallint extends dataTypes
    
    @js.native
    sealed trait text extends dataTypes
    
    @js.native
    sealed trait time extends dataTypes
    
    @js.native
    sealed trait timestamp extends dataTypes
    
    @js.native
    sealed trait timeuuid extends dataTypes
    
    @js.native
    sealed trait tinyint extends dataTypes
    
    @js.native
    sealed trait tuple extends dataTypes
    
    @js.native
    sealed trait udt extends dataTypes
    
    @js.native
    sealed trait uuid extends dataTypes
    
    @js.native
    sealed trait varchar extends dataTypes
    
    @js.native
    sealed trait varint extends dataTypes
    
    /* 0 */ val ascii: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.ascii with Double = js.native
    /* 1 */ val bigint: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.bigint with Double = js.native
    /* 2 */ val blob: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.blob with Double = js.native
    /* 3 */ val boolean: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.boolean with Double = js.native
    /* 4 */ val counter: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.counter with Double = js.native
    /* 0 */ val custom: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.custom with Double = js.native
    /* 16 */ val date: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.date with Double = js.native
    /* 5 */ val decimal: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.decimal with Double = js.native
    /* 6 */ val double: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.double with Double = js.native
    /* 7 */ val float: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.float with Double = js.native
    /* 15 */ val inet: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.inet with Double = js.native
    /* 8 */ val int: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.int with Double = js.native
    /* 20 */ val list: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.list with Double = js.native
    /* 21 */ val map: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.map with Double = js.native
    /* 22 */ val set: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.set with Double = js.native
    /* 18 */ val smallint: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.smallint with Double = js.native
    /* 9 */ val text: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.text with Double = js.native
    /* 17 */ val time: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.time with Double = js.native
    /* 10 */ val timestamp: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.timestamp with Double = js.native
    /* 14 */ val timeuuid: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.timeuuid with Double = js.native
    /* 19 */ val tinyint: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.tinyint with Double = js.native
    /* 24 */ val tuple: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.tuple with Double = js.native
    /* 23 */ val udt: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.udt with Double = js.native
    /* 11 */ val uuid: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.uuid with Double = js.native
    /* 12 */ val varchar: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.varchar with Double = js.native
    /* 13 */ val varint: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.dataTypes.varint with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[dataTypes with Double] = js.native
  }
  
  @js.native
  object distance extends js.Object {
    @js.native
    sealed trait ignored extends distance
    
    @js.native
    sealed trait local extends distance
    
    @js.native
    sealed trait remote extends distance
    
    /* 1 */ val ignored: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.distance.ignored with Double = js.native
    /* 0 */ val local: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.distance.local with Double = js.native
    /* 0 */ val remote: typings.cassandraDashDriver.cassandraDashDriverMod.typesNs.distance.remote with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[distance with Double] = js.native
  }
  
  type responseErrorCodes = StringDictionary[Double]
}

