package typings.cypress.mod

import typings.cypress.cypressStrings.after
import typings.cypress.cypressStrings.afterEach
import typings.cypress.cypressStrings.before
import typings.cypress.cypressStrings.beforeEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single "before", "beforeEach", "afterEach" and "after" hook.
  */
trait HookInformation extends js.Object {
  var body: String
  var hookId: typings.cypress.mod.hookId
  var hookName: before | beforeEach | afterEach | after
  var title: js.Array[String]
}

object HookInformation {
  @scala.inline
  def apply(
    body: String,
    hookId: hookId,
    hookName: before | beforeEach | afterEach | after,
    title: js.Array[String]
  ): HookInformation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hookId = hookId.asInstanceOf[js.Any], hookName = hookName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookInformation]
  }
}

