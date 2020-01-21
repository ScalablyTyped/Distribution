package typings.cassandraDriver

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/datastax/search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  @js.native
  object search extends js.Object {
    @js.native
    class DateRange protected () extends js.Object {
      def this(lowerBound: DateRangeBound, upperBound: DateRangeBound) = this()
      var lowerBound: DateRangeBound = js.native
      var upperBound: DateRangeBound = js.native
      def equals(other: DateRangeBound): Boolean = js.native
    }
    
    @js.native
    class DateRangeBound () extends js.Object {
      var date: Date = js.native
      var precision: Double = js.native
      def equals(other: DateRangeBound): Boolean = js.native
    }
    
    @js.native
    sealed trait dateRangePrecision extends js.Object
    
    /* static members */
    @js.native
    object DateRange extends js.Object {
      def fromBuffer(value: Buffer): DateRange = js.native
      def fromString(value: String): DateRange = js.native
    }
    
    /* static members */
    @js.native
    object DateRangeBound extends js.Object {
      def fromString(value: String): DateRangeBound = js.native
      def toLowerBound(bound: DateRangeBound): DateRangeBound = js.native
      def toUpperBound(bound: DateRangeBound): DateRangeBound = js.native
    }
    
    @js.native
    object dateRangePrecision extends js.Object {
      @js.native
      sealed trait day extends dateRangePrecision
      
      @js.native
      sealed trait hour extends dateRangePrecision
      
      @js.native
      sealed trait millisecond extends dateRangePrecision
      
      @js.native
      sealed trait minute extends dateRangePrecision
      
      @js.native
      sealed trait month extends dateRangePrecision
      
      @js.native
      sealed trait second extends dateRangePrecision
      
      @js.native
      sealed trait year extends dateRangePrecision
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[dateRangePrecision with Double] = js.native
      /* 1 */ @js.native
      object day extends TopLevel[day with Double]
      
      /* 2 */ @js.native
      object hour extends TopLevel[hour with Double]
      
      /* 5 */ @js.native
      object millisecond extends TopLevel[millisecond with Double]
      
      /* 3 */ @js.native
      object minute extends TopLevel[minute with Double]
      
      /* 0 */ @js.native
      object month extends TopLevel[month with Double]
      
      /* 4 */ @js.native
      object second extends TopLevel[second with Double]
      
      /* 0 */ @js.native
      object year extends TopLevel[year with Double]
      
    }
    
  }
  
}

