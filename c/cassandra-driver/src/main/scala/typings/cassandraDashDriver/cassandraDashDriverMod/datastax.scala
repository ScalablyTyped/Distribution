package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.cassandraDashDriver.libTypesMod.types.ResultSet
import typings.node.Buffer
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
      extends typings.cassandraDashDriver.libDatastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
    }
    
  }
  
  @js.native
  object search extends js.Object {
    @js.native
    class DateRange protected ()
      extends typings.cassandraDashDriver.libDatastaxMod.datastax.search.DateRange {
      def this(
        lowerBound: typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound,
        upperBound: typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound
      ) = this()
    }
    
    @js.native
    class DateRangeBound ()
      extends typings.cassandraDashDriver.libDatastaxMod.datastax.search.DateRangeBound
    
    /* static members */
    @js.native
    object DateRange extends js.Object {
      def fromBuffer(value: Buffer): typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRange = js.native
      def fromString(value: String): typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRange = js.native
    }
    
    /* static members */
    @js.native
    object DateRangeBound extends js.Object {
      def fromString(value: String): typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound = js.native
      def toLowerBound(bound: typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound): typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound = js.native
      def toUpperBound(bound: typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound): typings.cassandraDashDriver.libDatastaxSearchMod.search.DateRangeBound = js.native
    }
    
    @js.native
    object dateRangePrecision extends js.Object {
      /* 1 */ val day: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.day with Double = js.native
      /* 2 */ val hour: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.hour with Double = js.native
      /* 5 */ val millisecond: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.millisecond with Double = js.native
      /* 3 */ val minute: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.minute with Double = js.native
      /* 0 */ val month: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.month with Double = js.native
      /* 4 */ val second: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.second with Double = js.native
      /* 0 */ val year: typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision.year with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.cassandraDashDriver.libDatastaxMod.datastax.search.dateRangePrecision with Double
          ] = js.native
    }
    
  }
  
}

