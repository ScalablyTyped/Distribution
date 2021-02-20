package typings.cassandraDriver.mod

import typings.cassandraDriver.graphMod.graph.EnumValue
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastax {
  
  object graph {
    
    @JSImport("cassandra-driver", "datastax.graph.GraphResultSet")
    @js.native
    class GraphResultSet protected ()
      extends typings.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
    }
    
    @JSImport("cassandra-driver", "datastax.graph.asDouble")
    @js.native
    def asDouble(value: Double): js.Object = js.native
    
    @JSImport("cassandra-driver", "datastax.graph.asFloat")
    @js.native
    def asFloat(value: Double): js.Object = js.native
    
    @JSImport("cassandra-driver", "datastax.graph.asInt")
    @js.native
    def asInt(value: Double): js.Object = js.native
    
    @JSImport("cassandra-driver", "datastax.graph.asTimestamp")
    @js.native
    def asTimestamp(value: Date): js.Object = js.native
    
    @JSImport("cassandra-driver", "datastax.graph.asUdt")
    @js.native
    def asUdt(value: js.Object): js.Object = js.native
    
    object direction {
      
      @JSImport("cassandra-driver", "datastax.graph.direction.both")
      @js.native
      val both: EnumValue = js.native
      
      // `in` is a reserved word
      @JSImport("cassandra-driver", "datastax.graph.direction.in_")
      @js.native
      val in: EnumValue = js.native
      
      @JSImport("cassandra-driver", "datastax.graph.direction.out")
      @js.native
      val out: EnumValue = js.native
    }
    
    object t {
      
      @JSImport("cassandra-driver", "datastax.graph.t.id")
      @js.native
      val id: EnumValue = js.native
      
      @JSImport("cassandra-driver", "datastax.graph.t.key")
      @js.native
      val key: EnumValue = js.native
      
      @JSImport("cassandra-driver", "datastax.graph.t.label")
      @js.native
      val label: EnumValue = js.native
      
      @JSImport("cassandra-driver", "datastax.graph.t.value")
      @js.native
      val value: EnumValue = js.native
    }
  }
  
  object search {
    
    @JSImport("cassandra-driver", "datastax.search.DateRange")
    @js.native
    class DateRange protected ()
      extends typings.cassandraDriver.datastaxMod.datastax.search.DateRange {
      def this(
        lowerBound: typings.cassandraDriver.searchMod.search.DateRangeBound,
        upperBound: typings.cassandraDriver.searchMod.search.DateRangeBound
      ) = this()
    }
    object DateRange {
      
      /* static member */
      @JSImport("cassandra-driver", "datastax.search.DateRange.fromBuffer")
      @js.native
      def fromBuffer(value: Buffer): typings.cassandraDriver.searchMod.search.DateRange = js.native
      
      /* static member */
      @JSImport("cassandra-driver", "datastax.search.DateRange.fromString")
      @js.native
      def fromString(value: String): typings.cassandraDriver.searchMod.search.DateRange = js.native
    }
    
    @JSImport("cassandra-driver", "datastax.search.DateRangeBound")
    @js.native
    class DateRangeBound ()
      extends typings.cassandraDriver.datastaxMod.datastax.search.DateRangeBound
    object DateRangeBound {
      
      /* static member */
      @JSImport("cassandra-driver", "datastax.search.DateRangeBound.fromString")
      @js.native
      def fromString(value: String): typings.cassandraDriver.searchMod.search.DateRangeBound = js.native
      
      /* static member */
      @JSImport("cassandra-driver", "datastax.search.DateRangeBound.toLowerBound")
      @js.native
      def toLowerBound(bound: typings.cassandraDriver.searchMod.search.DateRangeBound): typings.cassandraDriver.searchMod.search.DateRangeBound = js.native
      
      /* static member */
      @JSImport("cassandra-driver", "datastax.search.DateRangeBound.toUpperBound")
      @js.native
      def toUpperBound(bound: typings.cassandraDriver.searchMod.search.DateRangeBound): typings.cassandraDriver.searchMod.search.DateRangeBound = js.native
    }
    
    @JSImport("cassandra-driver", "datastax.search.dateRangePrecision")
    @js.native
    object dateRangePrecision extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision with Double
          ] = js.native
      
      /* 1 */ val day: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.day with Double = js.native
      
      /* 2 */ val hour: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.hour with Double = js.native
      
      /* 5 */ val millisecond: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.millisecond with Double = js.native
      
      /* 3 */ val minute: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.minute with Double = js.native
      
      /* 0 */ val month: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.month with Double = js.native
      
      /* 4 */ val second: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.second with Double = js.native
      
      /* 0 */ val year: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.year with Double = js.native
    }
  }
}
