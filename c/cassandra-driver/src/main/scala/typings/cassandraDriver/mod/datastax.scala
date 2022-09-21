package typings.cassandraDriver.mod

import typings.cassandraDriver.graphMod.graph.EnumValue
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datastax {
  
  object graph {
    
    @JSImport("cassandra-driver", "datastax.graph")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cassandra-driver", "datastax.graph.GraphResultSet")
    @js.native
    open class GraphResultSet protected ()
      extends typings.cassandraDriver.datastaxMod.datastax.graph.GraphResultSet {
      def this(rs: ResultSet) = this()
    }
    
    inline def asDouble(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asFloat(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asInt(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asTimestamp(value: js.Date): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asUdt(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asUdt")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
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
    open class DateRange protected ()
      extends typings.cassandraDriver.datastaxMod.datastax.search.DateRange {
      def this(
        lowerBound: typings.cassandraDriver.searchMod.search.DateRangeBound,
        upperBound: typings.cassandraDriver.searchMod.search.DateRangeBound
      ) = this()
    }
    object DateRange {
      
      @JSImport("cassandra-driver", "datastax.search.DateRange")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(value: Buffer): typings.cassandraDriver.searchMod.search.DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.searchMod.search.DateRange]
      
      /* static member */
      inline def fromString(value: String): typings.cassandraDriver.searchMod.search.DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.searchMod.search.DateRange]
    }
    
    @JSImport("cassandra-driver", "datastax.search.DateRangeBound")
    @js.native
    open class DateRangeBound ()
      extends typings.cassandraDriver.datastaxMod.datastax.search.DateRangeBound
    object DateRangeBound {
      
      @JSImport("cassandra-driver", "datastax.search.DateRangeBound")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromString(value: String): typings.cassandraDriver.searchMod.search.DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.searchMod.search.DateRangeBound]
      
      /* static member */
      inline def toLowerBound(bound: typings.cassandraDriver.searchMod.search.DateRangeBound): typings.cassandraDriver.searchMod.search.DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerBound")(bound.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.searchMod.search.DateRangeBound]
      
      /* static member */
      inline def toUpperBound(bound: typings.cassandraDriver.searchMod.search.DateRangeBound): typings.cassandraDriver.searchMod.search.DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperBound")(bound.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.searchMod.search.DateRangeBound]
    }
    
    @JSImport("cassandra-driver", "datastax.search.dateRangePrecision")
    @js.native
    object dateRangePrecision extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision & Double] = js.native
      
      /* 1 */ val day: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.day & Double = js.native
      
      /* 2 */ val hour: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.hour & Double = js.native
      
      /* 5 */ val millisecond: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.millisecond & Double = js.native
      
      /* 3 */ val minute: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.minute & Double = js.native
      
      /* 0 */ val month: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.month & Double = js.native
      
      /* 4 */ val second: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.second & Double = js.native
      
      /* 0 */ val year: typings.cassandraDriver.datastaxMod.datastax.search.dateRangePrecision.year & Double = js.native
    }
  }
}
