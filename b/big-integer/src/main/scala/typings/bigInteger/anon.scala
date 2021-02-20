package typings.bigInteger

import typings.bigInteger.mod.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Quotient extends StObject {
    
    var quotient: BigInteger = js.native
    
    var remainder: BigInteger = js.native
  }
  object Quotient {
    
    @scala.inline
    def apply(quotient: BigInteger, remainder: BigInteger): Quotient = {
      val __obj = js.Dynamic.literal(quotient = quotient.asInstanceOf[js.Any], remainder = remainder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quotient]
    }
    
    @scala.inline
    implicit class QuotientMutableBuilder[Self <: Quotient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuotient(value: BigInteger): Self = StObject.set(x, "quotient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainder(value: BigInteger): Self = StObject.set(x, "remainder", value.asInstanceOf[js.Any])
    }
  }
}
