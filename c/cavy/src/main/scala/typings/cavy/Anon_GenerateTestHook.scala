package typings.cavy

import typings.cavy.cavyMod.TestHookGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GenerateTestHook extends js.Object {
  var generateTestHook: TestHookGenerator
}

object Anon_GenerateTestHook {
  @scala.inline
  def apply(generateTestHook: TestHookGenerator): Anon_GenerateTestHook = {
    val __obj = js.Dynamic.literal(generateTestHook = generateTestHook.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_GenerateTestHook]
  }
}

