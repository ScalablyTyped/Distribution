package typings.cavy

import typings.cavy.mod.TestHookGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGenerateTestHook extends js.Object {
  var generateTestHook: TestHookGenerator
}

object AnonGenerateTestHook {
  @scala.inline
  def apply(generateTestHook: TestHookGenerator): AnonGenerateTestHook = {
    val __obj = js.Dynamic.literal(generateTestHook = generateTestHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGenerateTestHook]
  }
}

