package typings.chaiAlmost

import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.Equal
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.Almost
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.DeepAlmost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ChaiPlugin]
  inline def apply(tolerance: Double): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply(tolerance.asInstanceOf[js.Any]).asInstanceOf[ChaiPlugin]
  
  @JSImport("chai-almost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object Chai {
      
      trait Assertion extends StObject {
        
        def almost(value: Any): Assertion
        def almost(value: Any, toleranceOverride: Double): Assertion
        @JSName("almost")
        var almost_Original: Almost
      }
      object Assertion {
        
        inline def apply(almost: Almost): Assertion = {
          val __obj = js.Dynamic.literal(almost = almost.asInstanceOf[js.Any])
          __obj.asInstanceOf[Assertion]
        }
        
        extension [Self <: Assertion](x: Self) {
          
          inline def setAlmost(value: Almost): Self = StObject.set(x, "almost", value.asInstanceOf[js.Any])
        }
      }
      
      object ChaiAlmost {
        
        @js.native
        trait Almost
          extends StObject
             with DeepAlmost {
          
          def eql(value: Any): typings.chai.Chai.Assertion = js.native
          def eql(value: Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("eql")
          var eql_Original: Equal = js.native
          
          def eqls(value: Any): typings.chai.Chai.Assertion = js.native
          def eqls(value: Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("eqls")
          var eqls_Original: Equal = js.native
        }
        
        @js.native
        trait DeepAlmost extends StObject {
          
          def apply(value: Any): Assertion = js.native
          def apply(value: Any, toleranceOverride: Double): Assertion = js.native
          
          def eq(value: Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("eq")
          var eq_Original: Equal = js.native
          
          def equal(value: Any): typings.chai.Chai.Assertion = js.native
          def equal(value: Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("equal")
          var equal_Original: Equal = js.native
          
          def equals(value: Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("equals")
          var equals_Original: Equal = js.native
        }
      }
      
      trait Deep extends StObject {
        
        def almost(value: Any): Assertion
        def almost(value: Any, toleranceOverride: Double): Assertion
        @JSName("almost")
        var almost_Original: DeepAlmost
      }
      object Deep {
        
        inline def apply(almost: DeepAlmost): Deep = {
          val __obj = js.Dynamic.literal(almost = almost.asInstanceOf[js.Any])
          __obj.asInstanceOf[Deep]
        }
        
        extension [Self <: Deep](x: Self) {
          
          inline def setAlmost(value: DeepAlmost): Self = StObject.set(x, "almost", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
