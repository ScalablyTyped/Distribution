package typings.cypressImageSnapshot.mod._Global_

import typings.cypressImageSnapshot.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Cypress")
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

