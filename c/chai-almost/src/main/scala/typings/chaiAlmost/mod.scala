package typings.chaiAlmost

import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.Equal
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.Almost
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.DeepAlmost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ChaiPlugin]
  @scala.inline
  def apply(tolerance: Double): ChaiPlugin = ^.asInstanceOf[js.Dynamic].apply(tolerance.asInstanceOf[js.Any]).asInstanceOf[ChaiPlugin]
  
  @JSImport("chai-almost", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object Chai {
      
      trait Assertion extends StObject {
        
        def almost(value: js.Any): Assertion
        def almost(value: js.Any, toleranceOverride: Double): Assertion
        @JSName("almost")
        var almost_Original: Almost
      }
      object Assertion {
        
        @scala.inline
        def apply(almost: Almost): Assertion = {
          val __obj = js.Dynamic.literal(almost = almost.asInstanceOf[js.Any])
          __obj.asInstanceOf[Assertion]
        }
        
        @scala.inline
        implicit class AssertionMutableBuilder[Self <: Assertion] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlmost(value: Almost): Self = StObject.set(x, "almost", value.asInstanceOf[js.Any])
        }
      }
      
      object ChaiAlmost {
        
        @js.native
        trait Almost
          extends StObject
             with DeepAlmost {
          
          def eql(value: js.Any): typings.chai.Chai.Assertion = js.native
          def eql(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("eql")
          var eql_Original: Equal = js.native
          
          def eqls(value: js.Any): typings.chai.Chai.Assertion = js.native
          def eqls(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("eqls")
          var eqls_Original: Equal = js.native
        }
        
        @js.native
        trait DeepAlmost extends StObject {
          
          def apply(value: js.Any): Assertion = js.native
          def apply(value: js.Any, toleranceOverride: Double): Assertion = js.native
          
          def eq(value: js.Any): typings.chai.Chai.Assertion = js.native
          def eq(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("eq")
          var eq_Original: Equal = js.native
          
          def equal(value: js.Any): typings.chai.Chai.Assertion = js.native
          def equal(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("equal")
          var equal_Original: Equal = js.native
          
          def equals(value: js.Any): typings.chai.Chai.Assertion = js.native
          def equals(value: js.Any, message: String): typings.chai.Chai.Assertion = js.native
          @JSName("equals")
          var equals_Original: Equal = js.native
        }
      }
      
      trait Deep extends StObject {
        
        def almost(value: js.Any): Assertion
        def almost(value: js.Any, toleranceOverride: Double): Assertion
        @JSName("almost")
        var almost_Original: DeepAlmost
      }
      object Deep {
        
        @scala.inline
        def apply(almost: DeepAlmost): Deep = {
          val __obj = js.Dynamic.literal(almost = almost.asInstanceOf[js.Any])
          __obj.asInstanceOf[Deep]
        }
        
        @scala.inline
        implicit class DeepMutableBuilder[Self <: Deep] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlmost(value: DeepAlmost): Self = StObject.set(x, "almost", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
