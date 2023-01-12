package typings.camljs

import typings.camljs.mod.Aggregation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Avg
    extends StObject
       with Aggregation {
    
    var avg: String
  }
  object Avg {
    
    inline def apply(avg: String): Avg = {
      val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Avg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Avg] (val x: Self) extends AnyVal {
      
      inline def setAvg(value: String): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count
    extends StObject
       with Aggregation {
    
    var count: String
  }
  object Count {
    
    inline def apply(count: String): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max
    extends StObject
       with Aggregation {
    
    var max: String
  }
  object Max {
    
    inline def apply(max: String): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait Min
    extends StObject
       with Aggregation {
    
    var min: String
  }
  object Min {
    
    inline def apply(min: String): Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Min]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Min] (val x: Self) extends AnyVal {
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stdev
    extends StObject
       with Aggregation {
    
    var stdev: String
  }
  object Stdev {
    
    inline def apply(stdev: String): Stdev = {
      val __obj = js.Dynamic.literal(stdev = stdev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stdev]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stdev] (val x: Self) extends AnyVal {
      
      inline def setStdev(value: String): Self = StObject.set(x, "stdev", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sum
    extends StObject
       with Aggregation {
    
    var sum: String
  }
  object Sum {
    
    inline def apply(sum: String): Sum = {
      val __obj = js.Dynamic.literal(sum = sum.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sum] (val x: Self) extends AnyVal {
      
      inline def setSum(value: String): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    }
  }
  
  trait Var
    extends StObject
       with Aggregation {
    
    var `var`: String
  }
  object Var {
    
    inline def apply(`var`: String): Var = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Var]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Var] (val x: Self) extends AnyVal {
      
      inline def setVar(value: String): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
    }
  }
}
