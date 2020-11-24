package typings.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StepDefinitionOptions extends js.Object {
  
  var timeout: js.UndefOr[Double] = js.native
  
  var wrapperOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object StepDefinitionOptions {
  
  @scala.inline
  def apply(): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepDefinitionOptions]
  }
  
  @scala.inline
  implicit class StepDefinitionOptionsOps[Self <: StepDefinitionOptions] (val x: Self) extends AnyVal {
    
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWrapperOptions(value: StringDictionary[js.Any]): Self = this.set("wrapperOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperOptions: Self = this.set("wrapperOptions", js.undefined)
  }
}
