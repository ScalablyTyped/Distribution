package typings.chaiAlmost

import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.Equal
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.Almost
import typings.chaiAlmost.mod.global.Chai.ChaiAlmost.DeepAlmost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chai-almost", JSImport.Namespace)
  @js.native
  def apply(): ChaiPlugin = js.native
  @JSImport("chai-almost", JSImport.Namespace)
  @js.native
  def apply(tolerance: Double): ChaiPlugin = js.native
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        def almost(value: js.Any): Assertion = js.native
        def almost(value: js.Any, toleranceOverride: Double): Assertion = js.native
        @JSName("almost")
        var almost_Original: Almost = js.native
      }
      
      object ChaiAlmost {
        
        @js.native
        trait Almost extends DeepAlmost {
          
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
      
      @js.native
      trait Deep extends StObject {
        
        def almost(value: js.Any): Assertion = js.native
        def almost(value: js.Any, toleranceOverride: Double): Assertion = js.native
        @JSName("almost")
        var almost_Original: DeepAlmost = js.native
      }
    }
  }
}
