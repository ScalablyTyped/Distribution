package typings.cavy.anon

import typings.cavy.mod.TestHookGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateTestHook extends js.Object {
  
  var generateTestHook: TestHookGenerator = js.native
}
object GenerateTestHook {
  
  @scala.inline
  def apply(generateTestHook: TestHookGenerator): GenerateTestHook = {
    val __obj = js.Dynamic.literal(generateTestHook = generateTestHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTestHook]
  }
  
  @scala.inline
  implicit class GenerateTestHookOps[Self <: GenerateTestHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerateTestHook(value: TestHookGenerator): Self = this.set("generateTestHook", value.asInstanceOf[js.Any])
  }
}
