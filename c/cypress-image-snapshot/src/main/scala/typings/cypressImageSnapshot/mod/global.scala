package typings.cypressImageSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Cypress extends js.Object {
    @js.native
    trait Chainable extends js.Object {
      def matchImageSnapshot(): Unit = js.native
      def matchImageSnapshot(nameOrOptions: String): Unit = js.native
      def matchImageSnapshot(nameOrOptions: Options): Unit = js.native
      def matchImageSnapshot(name: String, options: Options): Unit = js.native
    }
    
  }
  
}

