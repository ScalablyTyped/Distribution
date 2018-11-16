package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types")
@js.native
object typesNs extends js.Object {
  
  trait BigDecimal extends js.Object {
    def add(other: BigDecimal): BigDecimal
    def compare(other: BigDecimal): scala.Double
    def equals(other: BigDecimal): scala.Boolean
    def greaterThan(other: BigDecimal): scala.Boolean
    def inspect(): java.lang.String
    def isNegative(): scala.Boolean
    def isZero(): scala.Boolean
    def notEquals(other: BigDecimal): scala.Boolean
    def subtract(other: BigDecimal): BigDecimal
    def toJSON(): java.lang.String
    def toNumber(): scala.Double
  }
  
  @js.native
  trait BigDecimalStatic
    extends ScalablyTyped.runtime.Instantiable2[/* unscaledValue */ scala.Double, /* scale */ scala.Double, BigDecimal] {
    def fromBuffer(buf: nodeLib.Buffer): BigDecimal = js.native
    def fromNumber(value: scala.Double): BigDecimal = js.native
    def fromString(value: java.lang.String): BigDecimal = js.native
    def toBuffer(value: BigDecimal): nodeLib.Buffer = js.native
  }
  
  
  trait Duration extends js.Object {
    def equals(other: Duration): scala.Boolean
    def toBuffer(): nodeLib.Buffer
  }
  
  @js.native
  trait DurationStatic
    extends ScalablyTyped.runtime.Instantiable3[
          /* month */ scala.Double, 
          /* days */ scala.Double, 
          (/* nanoseconds */ scala.Double) | (/* nanoseconds */ longLib.longMod.namespaced), 
          Duration
        ] {
    def fromBuffer(buffer: nodeLib.Buffer): Duration = js.native
    def fromString(input: java.lang.String): Duration = js.native
  }
  
  
  trait InetAddress extends js.Object {
    var length: scala.Double
    var version: scala.Double
    def equals(other: InetAddress): scala.Boolean
    def getBuffer(): nodeLib.Buffer
    def inspect(): java.lang.String
    def toJSON(): java.lang.String
  }
  
  @js.native
  trait InetAddressStatic
    extends ScalablyTyped.runtime.Instantiable1[/* buffer */ nodeLib.Buffer, InetAddress] {
    def fromString(value: java.lang.String): InetAddress = js.native
  }
  
  @js.native
  trait Integer extends js.Object {
    def abs(): Integer = js.native
    def add(other: Integer): Integer = js.native
    def and(other: Integer): Integer = js.native
    def compare(other: Integer): scala.Double = js.native
    def divide(other: Integer): Integer = js.native
    def equals(other: Integer): scala.Boolean = js.native
    def getBits(index: scala.Double): scala.Double = js.native
    def getBitsUnsigned(index: scala.Double): scala.Double = js.native
    def getSign(): scala.Double = js.native
    def greaterThan(other: Integer): scala.Boolean = js.native
    def greaterThanOrEqual(other: Integer): scala.Boolean = js.native
    def inspect(): java.lang.String = js.native
    def isNegative(): scala.Boolean = js.native
    def isOdd(): scala.Boolean = js.native
    def isZero(): scala.Boolean = js.native
    def lessThan(other: Integer): scala.Boolean = js.native
    def lessThanOrEqual(other: Integer): scala.Boolean = js.native
    def modulo(other: Integer): Integer = js.native
    def multiply(other: Integer): Integer = js.native
    def negate(): Integer = js.native
    def not(): Integer = js.native
    def notEquals(other: Integer): scala.Boolean = js.native
    def or(other: Integer): Integer = js.native
    def shiftLeft(numBits: scala.Double): Integer = js.native
    def shiftRight(numBits: scala.Double): Integer = js.native
    def shorten(numBits: scala.Double): Integer = js.native
    def subtract(other: Integer): Integer = js.native
    def toInt(): scala.Double = js.native
    def toJSON(): java.lang.String = js.native
    def toNumber(): scala.Double = js.native
    def toString(opt_radix: scala.Double): java.lang.String = js.native
    def xor(other: Integer): Integer = js.native
  }
  
  @js.native
  trait IntegerStatic
    extends ScalablyTyped.runtime.Instantiable2[/* bits */ js.Array[scala.Double], /* sign */ scala.Double, Integer] {
    var ONE: Integer = js.native
    var ZERO: Integer = js.native
    def fromBits(bits: js.Array[scala.Double]): Integer = js.native
    def fromBuffer(bits: nodeLib.Buffer): Integer = js.native
    def fromInt(value: scala.Double): Integer = js.native
    def fromNumber(value: scala.Double): Integer = js.native
    def fromString(str: java.lang.String): Integer = js.native
    def fromString(str: java.lang.String, opt_radix: scala.Double): Integer = js.native
    def toBuffer(value: Integer): nodeLib.Buffer = js.native
  }
  
  
  trait LocalDate extends js.Object {
    var _value: scala.Double
    var day: scala.Double
    var month: scala.Double
    var year: scala.Double
    def equals(other: LocalDate): scala.Boolean
    def inspect(): java.lang.String
    def toBuffer(): nodeLib.Buffer
    def toJSON(): java.lang.String
  }
  
  @js.native
  trait LocalDateStatic
    extends ScalablyTyped.runtime.Instantiable3[/* year */ scala.Double, /* month */ scala.Double, /* day */ scala.Double, LocalDate] {
    def fromBuffer(buffer: nodeLib.Buffer): LocalDate = js.native
    def fromDate(date: stdLib.Date): LocalDate = js.native
    def fromString(value: java.lang.String): LocalDate = js.native
    def now(): LocalDate = js.native
    def utcNow(): LocalDate = js.native
  }
  
  
  trait LocalTime extends js.Object {
    var hour: scala.Double
    var minute: scala.Double
    var nanosecond: scala.Double
    var second: scala.Double
    def compare(other: LocalTime): scala.Boolean
    def equals(other: LocalTime): scala.Boolean
    def getTotalNanoseconds(): longLib.longMod.namespaced
    def inspect(): java.lang.String
    def toBuffer(): nodeLib.Buffer
    def toJSON(): java.lang.String
  }
  
  @js.native
  trait LocalTimeStatic
    extends ScalablyTyped.runtime.Instantiable1[/* totalNanoseconds */ longLib.longMod.namespaced, LocalTime] {
    def fromBuffer(value: nodeLib.Buffer): LocalTime = js.native
    def fromDate(date: stdLib.Date, nanoseconds: scala.Double): LocalTime = js.native
    def fromMilliseconds(milliseconds: scala.Double): LocalTime = js.native
    def fromMilliseconds(milliseconds: scala.Double, nanoseconds: scala.Double): LocalTime = js.native
    def fromString(value: java.lang.String): LocalTime = js.native
    def now(): LocalTime = js.native
    def now(nanoseconds: scala.Double): LocalTime = js.native
  }
  
  
  trait ResultSet extends js.Object {
    var columns: js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String]]
    var info: cassandraDashDriverLib.Anon_SpeculativeExecutions
    @JSName(ScalablyTyped.runtime.Symbol.iterator)
    var iterator: js.Function0[nodeLib.Iterator[Row]]
    var nextPage: js.Function
    var pageState: java.lang.String
    var rowLength: scala.Double
    var rows: js.Array[Row]
    def first(): Row | scala.Null
    def getColumns(): js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String]]
    def getPageState(): java.lang.String
    def wasApplied(): scala.Boolean
  }
  
  @js.native
  trait ResultSetStatic
    extends ScalablyTyped.runtime.Instantiable5[
          /* response */ js.Any, 
          /* host */ java.lang.String, 
          /* triedHost */ ScalablyTyped.runtime.StringDictionary[js.Any], 
          /* speculativeExecutions */ scala.Double, 
          /* consistency */ consistencies, 
          ResultSet
        ]
  
  @js.native
  trait ResultStream
    extends nodeLib.streamMod.Readable {
    var buffer: nodeLib.Buffer = js.native
    var paused: scala.Boolean = js.native
    def _valve(readNext: js.Function): scala.Unit = js.native
    def add(chunk: nodeLib.Buffer): scala.Unit = js.native
  }
  
  @js.native
  trait ResultStreamStatic
    extends ScalablyTyped.runtime.Instantiable1[/* opt */ js.Any, ResultSet]
  
  @js.native
  trait Row
    extends /* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
    def forEach(callback: cassandraDashDriverLib.cassandraDashDriverMod.Callback): scala.Unit = js.native
    def get(columnName: java.lang.String): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    def get(columnName: scala.Double): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
    def keys(): js.Array[java.lang.String] = js.native
    def values(): js.Array[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  }
  
  @js.native
  trait RowStatic
    extends ScalablyTyped.runtime.Instantiable1[
          /* columns */ js.Array[ScalablyTyped.runtime.StringDictionary[java.lang.String]], 
          Row
        ]
  
  
  trait TimeUuid extends Uuid {
    def getDate(): stdLib.Date
    def getDatePrecision(): cassandraDashDriverLib.Anon_Date
    def getNodeId(): nodeLib.Buffer
    def getNodeIdString(): java.lang.String
  }
  
  @js.native
  trait TimeUuidStatic
    extends ScalablyTyped.runtime.Instantiable4[
          /* value */ stdLib.Date, 
          /* ticks */ scala.Double, 
          (/* nodeId */ java.lang.String) | (/* nodeId */ nodeLib.Buffer), 
          (/* clockId */ java.lang.String) | (/* clockId */ nodeLib.Buffer), 
          TimeUuid
        ]
       with ScalablyTyped.runtime.Instantiable0[TimeUuid]
       with ScalablyTyped.runtime.Instantiable1[/* value */ stdLib.Date, TimeUuid]
       with ScalablyTyped.runtime.Instantiable2[/* value */ stdLib.Date, /* ticks */ scala.Double, TimeUuid]
       with ScalablyTyped.runtime.Instantiable3[
          /* value */ stdLib.Date, 
          /* ticks */ scala.Double, 
          (/* nodeId */ java.lang.String) | (/* nodeId */ nodeLib.Buffer), 
          TimeUuid
        ] {
    def fromDate(date: stdLib.Date): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double, nodeId: java.lang.String): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double, nodeId: java.lang.String, clockId: java.lang.String): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double, nodeId: java.lang.String, clockId: nodeLib.Buffer): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double, nodeId: nodeLib.Buffer): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double, nodeId: nodeLib.Buffer, clockId: java.lang.String): TimeUuid = js.native
    def fromDate(date: stdLib.Date, ticks: scala.Double, nodeId: nodeLib.Buffer, clockId: nodeLib.Buffer): TimeUuid = js.native
    def fromString(value: java.lang.String): TimeUuid = js.native
    def max(date: stdLib.Date): TimeUuid = js.native
    def max(date: stdLib.Date, ticks: scala.Double): TimeUuid = js.native
    def min(date: stdLib.Date): TimeUuid = js.native
    def min(date: stdLib.Date, ticks: scala.Double): TimeUuid = js.native
    def now(): TimeUuid = js.native
    def now(nodeId: java.lang.String): TimeUuid = js.native
    def now(nodeId: java.lang.String, clockId: java.lang.String): TimeUuid = js.native
    def now(nodeId: java.lang.String, clockId: nodeLib.Buffer): TimeUuid = js.native
    def now(nodeId: nodeLib.Buffer): TimeUuid = js.native
    def now(nodeId: nodeLib.Buffer, clockId: java.lang.String): TimeUuid = js.native
    def now(nodeId: nodeLib.Buffer, clockId: nodeLib.Buffer): TimeUuid = js.native
  }
  
  
  trait Tuple extends js.Object {
    var elements: js.Array[_]
    var length: scala.Double
    def get(index: scala.Double): js.Any
    def toJSON(): java.lang.String
    def values(): js.Array[_]
  }
  
  @js.native
  trait TupleStatic
    extends ScalablyTyped.runtime.Instantiable1[/* args (repeated) */ js.Any, Tuple] {
    def fromArray(elements: js.Array[_]): Tuple = js.native
  }
  
  
  trait Uuid extends js.Object {
    var buffer: nodeLib.Buffer
    def equals(other: Uuid): scala.Boolean
    def getBuffer(): nodeLib.Buffer
    def inspect(): java.lang.String
    def toJSON(): java.lang.String
  }
  
  @js.native
  trait UuidStatic
    extends ScalablyTyped.runtime.Instantiable1[/* buffer */ nodeLib.Buffer, Uuid] {
    def fromString(value: java.lang.String): Uuid = js.native
    def random(): Uuid = js.native
  }
  
  @js.native
  sealed trait consistencies extends js.Object
  
  @js.native
  sealed trait dataTypes extends js.Object
  
  @js.native
  sealed trait distance extends js.Object
  
  
  trait responseErrorCodes
    extends /* key */ ScalablyTyped.runtime.StringDictionary[scala.Double]
  
  
  trait unset extends js.Object {
    var unset: scala.Boolean
  }
  
  var BigDecimal: BigDecimalStatic = js.native
  var Duration: DurationStatic = js.native
  var InetAddress: InetAddressStatic = js.native
  var Integer: IntegerStatic = js.native
  var LocalDate: LocalDateStatic = js.native
  var LocalTime: LocalTimeStatic = js.native
  var Long: longLib.longMod.namespaced = js.native
  var ResultSet: ResultSetStatic = js.native
  // let ResultStream: ResultStreamStatic;
  var Row: RowStatic = js.native
  var TimeUuid: TimeUuidStatic = js.native
  var Tuple: TupleStatic = js.native
  var Uuid: UuidStatic = js.native
  def generateTimestamp(): longLib.longMod.namespaced = js.native
  def generateTimestamp(date: stdLib.Date): longLib.longMod.namespaced = js.native
  def generateTimestamp(date: stdLib.Date, microseconds: scala.Double): longLib.longMod.namespaced = js.native
  def timeuuid(): java.lang.String = js.native
  def timeuuid(options: cassandraDashDriverLib.Anon_Node): java.lang.String = js.native
  def timeuuid(options: cassandraDashDriverLib.Anon_Node, buffer: nodeLib.Buffer): java.lang.String = js.native
  def timeuuid(options: cassandraDashDriverLib.Anon_Node, buffer: nodeLib.Buffer, offset: scala.Double): java.lang.String = js.native
  @js.native
  object consistencies extends js.Object {
    @js.native
    sealed trait all
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait any
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait eachQuorum
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait localOne
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait localQuorum
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait localSerial
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait one
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait quorum
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait serial
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait three
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    @js.native
    sealed trait two
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
    
    val all: all with scala.Double = js.native
    /* 0 */ val any: any with scala.Double = js.native
    val eachQuorum: eachQuorum with scala.Double = js.native
    val localOne: localOne with scala.Double = js.native
    val localQuorum: localQuorum with scala.Double = js.native
    val localSerial: localSerial with scala.Double = js.native
    val one: one with scala.Double = js.native
    val quorum: quorum with scala.Double = js.native
    val serial: serial with scala.Double = js.native
    val three: three with scala.Double = js.native
    val two: two with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies with scala.Double
      ] = js.native
  }
  
  @js.native
  object dataTypes extends js.Object {
    @js.native
    sealed trait ascii
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait bigint
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait blob
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait boolean
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait counter
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait custom
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait date
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait decimal
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait double
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait float
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait inet
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait int
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait list
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait map
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait set
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait smallint
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait text
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait time
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait timestamp
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait timeuuid
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait tinyint
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait tuple
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait udt
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait uuid
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait varchar
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    @js.native
    sealed trait varint
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes
    
    val ascii: ascii with scala.Double = js.native
    val bigint: bigint with scala.Double = js.native
    val blob: blob with scala.Double = js.native
    val boolean: boolean with scala.Double = js.native
    val counter: counter with scala.Double = js.native
    /* 0 */ val custom: custom with scala.Double = js.native
    val date: date with scala.Double = js.native
    val decimal: decimal with scala.Double = js.native
    val double: double with scala.Double = js.native
    val float: float with scala.Double = js.native
    val inet: inet with scala.Double = js.native
    val int: int with scala.Double = js.native
    val list: list with scala.Double = js.native
    val map: map with scala.Double = js.native
    val set: set with scala.Double = js.native
    val smallint: smallint with scala.Double = js.native
    val text: text with scala.Double = js.native
    val time: time with scala.Double = js.native
    val timestamp: timestamp with scala.Double = js.native
    val timeuuid: timeuuid with scala.Double = js.native
    val tinyint: tinyint with scala.Double = js.native
    val tuple: tuple with scala.Double = js.native
    val udt: udt with scala.Double = js.native
    val uuid: uuid with scala.Double = js.native
    val varchar: varchar with scala.Double = js.native
    val varint: varint with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        cassandraDashDriverLib.cassandraDashDriverMod.typesNs.dataTypes with scala.Double
      ] = js.native
  }
  
  @js.native
  object distance extends js.Object {
    @js.native
    sealed trait ignored
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.distance
    
    @js.native
    sealed trait local
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.distance
    
    @js.native
    sealed trait remote
      extends cassandraDashDriverLib.cassandraDashDriverMod.typesNs.distance
    
    val ignored: ignored with scala.Double = js.native
    /* 0 */ val local: local with scala.Double = js.native
    val remote: remote with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[cassandraDashDriverLib.cassandraDashDriverMod.typesNs.distance with scala.Double] = js.native
  }
  
}

