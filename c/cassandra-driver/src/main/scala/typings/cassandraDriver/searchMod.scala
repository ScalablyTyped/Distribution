package typings.cassandraDriver

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  object search {
    
    @JSImport("cassandra-driver/lib/datastax/search", "search.DateRange")
    @js.native
    class DateRange protected () extends StObject {
      def this(lowerBound: DateRangeBound, upperBound: DateRangeBound) = this()
      
      def equals(other: DateRangeBound): Boolean = js.native
      
      var lowerBound: DateRangeBound = js.native
      
      var upperBound: DateRangeBound = js.native
    }
    object DateRange {
      
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRange")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(value: Buffer): DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[DateRange]
      
      /* static member */
      inline def fromString(value: String): DateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[DateRange]
    }
    
    @JSImport("cassandra-driver/lib/datastax/search", "search.DateRangeBound")
    @js.native
    class DateRangeBound () extends StObject {
      
      var date: Date = js.native
      
      def equals(other: DateRangeBound): Boolean = js.native
      
      var precision: Double = js.native
    }
    object DateRangeBound {
      
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRangeBound")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromString(value: String): DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[DateRangeBound]
      
      /* static member */
      inline def toLowerBound(bound: DateRangeBound): DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerBound")(bound.asInstanceOf[js.Any]).asInstanceOf[DateRangeBound]
      
      /* static member */
      inline def toUpperBound(bound: DateRangeBound): DateRangeBound = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperBound")(bound.asInstanceOf[js.Any]).asInstanceOf[DateRangeBound]
    }
    
    @js.native
    sealed trait dateRangePrecision extends StObject
    @JSImport("cassandra-driver/lib/datastax/search", "search.dateRangePrecision")
    @js.native
    object dateRangePrecision extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[dateRangePrecision & Double] = js.native
      
      @js.native
      sealed trait day
        extends StObject
           with dateRangePrecision
      /* 1 */ val day: typings.cassandraDriver.searchMod.search.dateRangePrecision.day & Double = js.native
      
      @js.native
      sealed trait hour
        extends StObject
           with dateRangePrecision
      /* 2 */ val hour: typings.cassandraDriver.searchMod.search.dateRangePrecision.hour & Double = js.native
      
      @js.native
      sealed trait millisecond
        extends StObject
           with dateRangePrecision
      /* 5 */ val millisecond: typings.cassandraDriver.searchMod.search.dateRangePrecision.millisecond & Double = js.native
      
      @js.native
      sealed trait minute
        extends StObject
           with dateRangePrecision
      /* 3 */ val minute: typings.cassandraDriver.searchMod.search.dateRangePrecision.minute & Double = js.native
      
      @js.native
      sealed trait month
        extends StObject
           with dateRangePrecision
      /* 0 */ val month: typings.cassandraDriver.searchMod.search.dateRangePrecision.month & Double = js.native
      
      @js.native
      sealed trait second
        extends StObject
           with dateRangePrecision
      /* 4 */ val second: typings.cassandraDriver.searchMod.search.dateRangePrecision.second & Double = js.native
      
      @js.native
      sealed trait year
        extends StObject
           with dateRangePrecision
      /* 0 */ val year: typings.cassandraDriver.searchMod.search.dateRangePrecision.year & Double = js.native
    }
  }
}
