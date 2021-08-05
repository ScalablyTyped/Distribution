package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConcurrencyMod {
  
  trait Concurrency extends StObject {
    
    /**
      * <p>The number of concurrent executions reserved for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var ReservedConcurrentExecutions: js.UndefOr[Double] = js.undefined
  }
  object Concurrency {
    
    inline def apply(): Concurrency = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Concurrency]
    }
    
    extension [Self <: Concurrency](x: Self) {
      
      inline def setReservedConcurrentExecutions(value: Double): Self = StObject.set(x, "ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      inline def setReservedConcurrentExecutionsUndefined: Self = StObject.set(x, "ReservedConcurrentExecutions", js.undefined)
    }
  }
  
  type UnmarshalledConcurrency = Concurrency
}
