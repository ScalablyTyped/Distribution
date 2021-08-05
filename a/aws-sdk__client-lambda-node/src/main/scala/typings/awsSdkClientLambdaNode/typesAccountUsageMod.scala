package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccountUsageMod {
  
  trait AccountUsage extends StObject {
    
    /**
      * <p>The number of your account's existing functions per region.</p>
      */
    var FunctionCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Total size, in bytes, of the account's deployment packages per region.</p>
      */
    var TotalCodeSize: js.UndefOr[Double] = js.undefined
  }
  object AccountUsage {
    
    inline def apply(): AccountUsage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountUsage]
    }
    
    extension [Self <: AccountUsage](x: Self) {
      
      inline def setFunctionCount(value: Double): Self = StObject.set(x, "FunctionCount", value.asInstanceOf[js.Any])
      
      inline def setFunctionCountUndefined: Self = StObject.set(x, "FunctionCount", js.undefined)
      
      inline def setTotalCodeSize(value: Double): Self = StObject.set(x, "TotalCodeSize", value.asInstanceOf[js.Any])
      
      inline def setTotalCodeSizeUndefined: Self = StObject.set(x, "TotalCodeSize", js.undefined)
    }
  }
  
  type UnmarshalledAccountUsage = AccountUsage
}
