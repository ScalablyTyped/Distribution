package typings.cavy.anon

import typings.cavy.mod.TestHookGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTestHook extends js.Object {
  var generateTestHook: TestHookGenerator
}

object GenerateTestHook {
  @scala.inline
  def apply(generateTestHook: TestHookGenerator): GenerateTestHook = {
    val __obj = js.Dynamic.literal(generateTestHook = generateTestHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTestHook]
  }
}

