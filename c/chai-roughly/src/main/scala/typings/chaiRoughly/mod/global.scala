package typings.chaiRoughly.mod

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Chai extends js.Object {
    
    // For Assert APIs
    @js.native
    trait Assert extends js.Object {
      
      def roughly(): Assertion = js.native
      def roughly(tolerance: Double): Assertion = js.native
      def roughly(`type`: String): typings.chai.Chai.Assertion = js.native
      def roughly(`type`: String, message: String): typings.chai.Chai.Assertion = js.native
      @JSName("roughly")
      var roughly_Original: Roughly = js.native
    }
    
    @js.native
    trait Assertion
      extends LanguageChains
         with NumericComparison
         with TypeComparison {
      
      def roughly(): Assertion = js.native
      def roughly(tolerance: Double): Assertion = js.native
      def roughly(`type`: String): typings.chai.Chai.Assertion = js.native
      def roughly(`type`: String, message: String): typings.chai.Chai.Assertion = js.native
      @JSName("roughly")
      var roughly_Original: Roughly = js.native
    }
    
    // For BDD APIs
    @js.native
    trait Roughly extends Assertion {
      
      def apply(): Assertion = js.native
      def apply(tolerance: Double): Assertion = js.native
    }
  }
}
