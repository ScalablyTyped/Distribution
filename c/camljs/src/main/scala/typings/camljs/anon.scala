package typings.camljs

import typings.camljs.mod.Aggregation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Avg extends Aggregation {
    
    var avg: String = js.native
  }
  object Avg {
    
    @scala.inline
    def apply(avg: String): Avg = {
      val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avg]
    }
    
    @scala.inline
    implicit class AvgMutableBuilder[Self <: Avg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvg(value: String): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Count extends Aggregation {
    
    var count: String = js.native
  }
  object Count {
    
    @scala.inline
    def apply(count: String): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Max extends Aggregation {
    
    var max: String = js.native
  }
  object Max {
    
    @scala.inline
    def apply(max: String): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Min extends Aggregation {
    
    var min: String = js.native
  }
  object Min {
    
    @scala.inline
    def apply(min: String): Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Min]
    }
    
    @scala.inline
    implicit class MinMutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stdev extends Aggregation {
    
    var stdev: String = js.native
  }
  object Stdev {
    
    @scala.inline
    def apply(stdev: String): Stdev = {
      val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdev]
    }
    
    @scala.inline
    implicit class StdevMutableBuilder[Self <: Stdev] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStdev(value: String): Self = StObject.set(x, "stdev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sum extends Aggregation {
    
    var sum: String = js.native
  }
  object Sum {
    
    @scala.inline
    def apply(sum: String): Sum = {
      val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sum]
    }
    
    @scala.inline
    implicit class SumMutableBuilder[Self <: Sum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSum(value: String): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Var extends Aggregation {
    
    var `var`: String = js.native
  }
  object Var {
    
    @scala.inline
    def apply(`var`: String): Var = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Var]
    }
    
    @scala.inline
    implicit class VarMutableBuilder[Self <: Var] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVar(value: String): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
    }
  }
}
