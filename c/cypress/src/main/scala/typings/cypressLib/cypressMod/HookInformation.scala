package typings
package cypressLib.cypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a single "before", "beforeEach", "afterEach" and "after" hook.
  */
trait HookInformation extends js.Object {
  var body: java.lang.String
  var hookId: cypressLib.cypressMod.hookId
  var hookName: cypressLib.cypressLibStrings.before | cypressLib.cypressLibStrings.beforeEach | cypressLib.cypressLibStrings.afterEach | cypressLib.cypressLibStrings.after
  var title: js.Array[java.lang.String]
}

object HookInformation {
  @scala.inline
  def apply(
    body: java.lang.String,
    hookId: hookId,
    hookName: cypressLib.cypressLibStrings.before | cypressLib.cypressLibStrings.beforeEach | cypressLib.cypressLibStrings.afterEach | cypressLib.cypressLibStrings.after,
    title: js.Array[java.lang.String]
  ): HookInformation = {
    val __obj = js.Dynamic.literal(body = body, hookId = hookId, hookName = hookName.asInstanceOf[js.Any], title = title)
  
    __obj.asInstanceOf[HookInformation]
  }
}

