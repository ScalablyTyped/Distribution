package typings.chaiOequal

import typings.chai.Chai.Equal
import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  // For Assert APIs
  @js.native
  trait Assert extends StObject {
    
    def oeq(act: Any, exp: Any): Equal = js.native
    def oeq(act: Any, exp: Any, method: String): Equal = js.native
    
    def oeql(act: Any, exp: Any): Equal = js.native
    def oeql(act: Any, exp: Any, method: String): Equal = js.native
    
    def oequal(act: Any, exp: Any): Equal = js.native
    def oequal(act: Any, exp: Any, method: String): Equal = js.native
  }
  
  // For BDD APIs
  @js.native
  trait Assertion
    extends StObject
       with LanguageChains
       with NumericComparison
       with TypeComparison {
    
    def oeq(result: Any): Equal = js.native
    def oeq(result: Any, method: String): Equal = js.native
    
    def oeql(result: Any): Equal = js.native
    def oeql(result: Any, method: String): Equal = js.native
    
    def oequal(result: Any): Equal = js.native
    def oequal(result: Any, method: String): Equal = js.native
  }
}
