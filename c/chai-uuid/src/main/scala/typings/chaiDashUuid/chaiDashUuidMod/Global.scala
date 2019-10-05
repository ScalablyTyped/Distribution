package typings.chaiDashUuid.chaiDashUuidMod

import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import typings.chaiDashUuid.chaiDashUuidMod.Global.Chai.UuidVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  object Chai extends js.Object {
    @js.native
    trait Assert extends js.Object {
      def guid(guid: String): Unit = js.native
      def guid(guid: String, version: js.Any): Unit = js.native
      def uuid(uuid: String): Unit = js.native
      def uuid(uuid: String, version: UuidVersion): Unit = js.native
    }
    
    @js.native
    trait Assertion
      extends LanguageChains
         with NumericComparison
         with TypeComparison {
      def guid(): Unit = js.native
      def guid(guid: js.Any): Unit = js.native
      def uuid(): Unit = js.native
      def uuid(uuid: UuidVersion): Unit = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.chaiDashUuid.chaiDashUuidStrings.v1
      - typings.chaiDashUuid.chaiDashUuidStrings.v2
      - typings.chaiDashUuid.chaiDashUuidStrings.v3
      - typings.chaiDashUuid.chaiDashUuidStrings.v4
      - typings.chaiDashUuid.chaiDashUuidStrings.v5
      - typings.chaiDashUuid.chaiDashUuidStrings.Empty
    */
    trait UuidVersion extends js.Object
    
  }
  
}

