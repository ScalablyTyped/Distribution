package typings.cassandraDriver.mod

import typings.cassandraDriver.graphMod.graph.EnumValue
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "datastax")
@js.native
object datastax extends js.Object {
  @js.native
  object graph extends js.Object {
    @js.native
    class GraphResultSet protected ()
      extends typings.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
    }
    
    def asDouble(value: Double): js.Object = js.native
    def asFloat(value: Double): js.Object = js.native
    def asInt(value: Double): js.Object = js.native
    def asTimestamp(value: Date): js.Object = js.native
    def asUdt(value: js.Object): js.Object = js.native
    @js.native
    object direction extends js.Object {
      val both: EnumValue = js.native
      // `in` is a reserved word
      @JSName("in_")
      val in: EnumValue = js.native
      val out: EnumValue = js.native
    }
    
    @js.native
    object t extends js.Object {
      val id: EnumValue = js.native
      val key: EnumValue = js.native
      val label: EnumValue = js.native
      val value: EnumValue = js.native
    }
    
  }
  
  @js.native
  object search extends js.Object {
    @js.native
    class DateRange protected ()
      extends typings.cassandraDriver.datastaxMod.datastax.search.DateRange {
      def this(
        lowerBound: typings.cassandraDriver.searchMod.search.DateRangeBound,
        upperBound: typings.cassandraDriver.searchMod.search.DateRangeBound
      ) = this()
    }
    
    @js.native
    class DateRangeBound ()
      extends typings.cassandraDriver.datastaxMod.datastax.search.DateRangeBound
    
    /* static members */
    @js.native
    object DateRange extends js.Object {
      def fromBuffer(value: Buffer): typings.cassandraDriver.searchMod.search.DateRange = js.native
      def fromString(value: String): typings.cassandraDriver.searchMod.search.DateRange = js.native
    }
    
    /* static members */
    @js.native
    object DateRangeBound extends js.Object {
      def fromString(value: String): typings.cassandraDriver.searchMod.search.DateRangeBound = js.native
      def toLowerBound(bound: typings.cassandraDriver.searchMod.search.DateRangeBound): typings.cassandraDriver.searchMod.search.DateRangeBound = js.native
      def toUpperBound(bound: typings.cassandraDriver.searchMod.search.DateRangeBound): typings.cassandraDriver.searchMod.search.DateRangeBound = js.native
    }
    
    @js.native
    object dateRangePrecision extends js.Object {
      /* 1 */ val day: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.day with Double = js.native
      /* 2 */ val hour: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.hour with Double = js.native
      /* 5 */ val millisecond: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.millisecond with Double = js.native
      /* 3 */ val minute: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.minute with Double = js.native
      /* 0 */ val month: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.month with Double = js.native
      /* 4 */ val second: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.second with Double = js.native
      /* 0 */ val year: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.year with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision with Double
          ] = js.native
    }
    
  }
  
}

