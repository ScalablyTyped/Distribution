package typings.cassandraDriver

import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
      
      /* static member */
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRange.fromBuffer")
      @js.native
      def fromBuffer(value: Buffer): DateRange = js.native
      
      /* static member */
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRange.fromString")
      @js.native
      def fromString(value: String): DateRange = js.native
    }
    
    @JSImport("cassandra-driver/lib/datastax/search", "search.DateRangeBound")
    @js.native
    class DateRangeBound () extends StObject {
      
      var date: Date = js.native
      
      def equals(other: DateRangeBound): Boolean = js.native
      
      var precision: Double = js.native
    }
    object DateRangeBound {
      
      /* static member */
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRangeBound.fromString")
      @js.native
      def fromString(value: String): DateRangeBound = js.native
      
      /* static member */
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRangeBound.toLowerBound")
      @js.native
      def toLowerBound(bound: DateRangeBound): DateRangeBound = js.native
      
      /* static member */
      @JSImport("cassandra-driver/lib/datastax/search", "search.DateRangeBound.toUpperBound")
      @js.native
      def toUpperBound(bound: DateRangeBound): DateRangeBound = js.native
    }
    
    @js.native
    sealed trait dateRangePrecision extends StObject
    @JSImport("cassandra-driver/lib/datastax/search", "search.dateRangePrecision")
    @js.native
    object dateRangePrecision extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[dateRangePrecision with Double] = js.native
      
      @js.native
      sealed trait day extends dateRangePrecision
      /* 1 */ val day: typings.cassandraDriver.searchMod.search.dateRangePrecision.day with Double = js.native
      
      @js.native
      sealed trait hour extends dateRangePrecision
      /* 2 */ val hour: typings.cassandraDriver.searchMod.search.dateRangePrecision.hour with Double = js.native
      
      @js.native
      sealed trait millisecond extends dateRangePrecision
      /* 5 */ val millisecond: typings.cassandraDriver.searchMod.search.dateRangePrecision.millisecond with Double = js.native
      
      @js.native
      sealed trait minute extends dateRangePrecision
      /* 3 */ val minute: typings.cassandraDriver.searchMod.search.dateRangePrecision.minute with Double = js.native
      
      @js.native
      sealed trait month extends dateRangePrecision
      /* 0 */ val month: typings.cassandraDriver.searchMod.search.dateRangePrecision.month with Double = js.native
      
      @js.native
      sealed trait second extends dateRangePrecision
      /* 4 */ val second: typings.cassandraDriver.searchMod.search.dateRangePrecision.second with Double = js.native
      
      @js.native
      sealed trait year extends dateRangePrecision
      /* 0 */ val year: typings.cassandraDriver.searchMod.search.dateRangePrecision.year with Double = js.native
    }
  }
}
