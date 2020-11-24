package typings.azdata.mod.nb

import typings.azdata.anon.AzdatachartOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellOutput extends js.Object {
  
  var metadata: js.UndefOr[AzdatachartOptions] = js.native
  
  var output_type: OutputTypeName = js.native
}
object ICellOutput {
  
  @scala.inline
  def apply(output_type: OutputTypeName): ICellOutput = {
    val __obj = js.Dynamic.literal(output_type = output_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellOutput]
  }
  
  @scala.inline
  implicit class ICellOutputOps[Self <: ICellOutput] (val x: Self) extends AnyVal {
    
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
    def setOutput_type(value: OutputTypeName): Self = this.set("output_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: AzdatachartOptions): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
