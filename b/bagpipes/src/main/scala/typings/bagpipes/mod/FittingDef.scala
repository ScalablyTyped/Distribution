package typings.bagpipes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FittingDef
  extends /* prop */ StringDictionary[js.Any] {
  
  /** Static values passed to the fitting during construction */
  var config: js.UndefOr[js.Any] = js.native
  
  /** Dynamic values passed to the fitting during execution */
  var input: js.UndefOr[js.Any] = js.native
  
  /** The name of the fitting of the type specified */
  var name: js.UndefOr[String] = js.native
  
  /** The name of the context key to which the output value is assigned */
  var output: js.UndefOr[js.Any] = js.native
  
  /**
    * If type is omitted (as it must be for in-line usage), Bagpipes will
    * first check the user fittings then the system fittings for the name and
    * use the first fitting found.
    *
    * Thus be aware that if you define a fitting with the same name as a
    * system one, your fitting will override it.
    */
  var `type`: js.UndefOr[FittingType] = js.native
}
object FittingDef {
  
  @scala.inline
  def apply(): FittingDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FittingDef]
  }
  
  @scala.inline
  implicit class FittingDefOps[Self <: FittingDef] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setInput(value: js.Any): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Any): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setType(value: FittingType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
