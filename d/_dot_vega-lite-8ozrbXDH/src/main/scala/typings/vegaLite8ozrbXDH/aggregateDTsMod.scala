package typings.vegaLite8ozrbXDH

import typings.std.ReadonlySet
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregateDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "COUNTING_OPS")
  @js.native
  val COUNTING_OPS: ReadonlySet[NonArgAggregateOp] = js.native
  
  object MULTIDOMAIN_SORT_OP_INDEX {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "MULTIDOMAIN_SORT_OP_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "MULTIDOMAIN_SORT_OP_INDEX.count")
    @js.native
    def count: Double = js.native
    inline def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "MULTIDOMAIN_SORT_OP_INDEX.max")
    @js.native
    def max: Double = js.native
    inline def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "MULTIDOMAIN_SORT_OP_INDEX.min")
    @js.native
    def min: Double = js.native
    inline def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "SHARED_DOMAIN_OPS")
  @js.native
  val SHARED_DOMAIN_OPS: ReadonlySet[AggregateOp] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/aggregate.d.ts", "SUM_OPS")
  @js.native
  val SUM_OPS: ReadonlySet[NonArgAggregateOp] = js.native
  
  inline def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  inline def isAggregateOp(a: ArgmaxDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  inline def isAggregateOp(a: ArgminDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAggregateOp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean]
  
  inline def isArgmaxDef(a: String): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgmaxDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgmaxDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgmaxDef */ Boolean]
  inline def isArgmaxDef(a: Aggregate): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgmaxDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgmaxDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgmaxDef */ Boolean]
  
  inline def isArgminDef(a: String): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgminDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgminDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgminDef */ Boolean]
  inline def isArgminDef(a: Aggregate): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgminDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArgminDef")(a.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgminDef */ Boolean]
  
  inline def isCountingAggregateOp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")().asInstanceOf[Boolean]
  inline def isCountingAggregateOp(aggregate: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCountingAggregateOp(aggregate: Aggregate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCountingAggregateOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMinMaxOp(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")().asInstanceOf[Boolean]
  inline def isMinMaxOp(aggregate: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMinMaxOp(aggregate: Aggregate): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinMaxOp")(aggregate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Inlined .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.NonArgAggregateOp | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgmaxDef | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/aggregate.d.ts.ArgminDef */
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.max
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q1
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q3
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.argmax
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.sum
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variance
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.argmin
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.min
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.valid
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.missing
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdevp
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.distinct
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci0
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.product
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.count
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci1
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.average
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.values
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variancep
  */
  trait Aggregate extends StObject
  object Aggregate {
    
    inline def argmax: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.argmax = "argmax".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.argmax]
    
    inline def argmin: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.argmin = "argmin".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.argmin]
    
    inline def average: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.average = "average".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.average]
    
    inline def ci0: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci0 = "ci0".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci0]
    
    inline def ci1: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci1 = "ci1".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci1]
    
    inline def count: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.count = "count".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.count]
    
    inline def distinct: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.distinct = "distinct".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.distinct]
    
    inline def max: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.max = "max".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.max]
    
    inline def mean: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean = "mean".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean]
    
    inline def median: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median = "median".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median]
    
    inline def min: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.min = "min".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.min]
    
    inline def missing: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.missing = "missing".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.missing]
    
    inline def product: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.product = "product".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.product]
    
    inline def q1: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q1 = "q1".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q1]
    
    inline def q3: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q3 = "q3".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q3]
    
    inline def stderr: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr = "stderr".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr]
    
    inline def stdev: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev = "stdev".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev]
    
    inline def stdevp: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdevp = "stdevp".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdevp]
    
    inline def sum: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.sum = "sum".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.sum]
    
    inline def valid: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.valid = "valid".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.valid]
    
    inline def values: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.values = "values".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.values]
    
    inline def variance: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variance = "variance".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variance]
    
    inline def variancep: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variancep = "variancep".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variancep]
  }
  
  trait ArgmaxDef extends StObject {
    
    var argmax: FieldName
  }
  object ArgmaxDef {
    
    inline def apply(argmax: FieldName): ArgmaxDef = {
      val __obj = js.Dynamic.literal(argmax = argmax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmaxDef]
    }
    
    extension [Self <: ArgmaxDef](x: Self) {
      
      inline def setArgmax(value: FieldName): Self = StObject.set(x, "argmax", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArgminDef extends StObject {
    
    var argmin: FieldName
  }
  object ArgminDef {
    
    inline def apply(argmin: FieldName): ArgminDef = {
      val __obj = js.Dynamic.literal(argmin = argmin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgminDef]
    }
    
    extension [Self <: ArgminDef](x: Self) {
      
      inline def setArgmin(value: FieldName): Self = StObject.set(x, "argmin", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<vega.vega.AggregateOp, 'argmin' | 'argmax'> */
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.max
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q1
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q3
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.sum
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variance
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.min
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.valid
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.missing
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdevp
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.distinct
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci0
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.product
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.count
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci1
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.average
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.values
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variancep
  */
  trait NonArgAggregateOp extends StObject
  object NonArgAggregateOp {
    
    inline def average: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.average = "average".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.average]
    
    inline def ci0: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci0 = "ci0".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci0]
    
    inline def ci1: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci1 = "ci1".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ci1]
    
    inline def count: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.count = "count".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.count]
    
    inline def distinct: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.distinct = "distinct".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.distinct]
    
    inline def max: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.max = "max".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.max]
    
    inline def mean: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean = "mean".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.mean]
    
    inline def median: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median = "median".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.median]
    
    inline def min: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.min = "min".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.min]
    
    inline def missing: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.missing = "missing".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.missing]
    
    inline def product: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.product = "product".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.product]
    
    inline def q1: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q1 = "q1".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q1]
    
    inline def q3: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q3 = "q3".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.q3]
    
    inline def stderr: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr = "stderr".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stderr]
    
    inline def stdev: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev = "stdev".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdev]
    
    inline def stdevp: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdevp = "stdevp".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.stdevp]
    
    inline def sum: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.sum = "sum".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.sum]
    
    inline def valid: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.valid = "valid".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.valid]
    
    inline def values: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.values = "values".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.values]
    
    inline def variance: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variance = "variance".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variance]
    
    inline def variancep: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variancep = "variancep".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.variancep]
  }
}
