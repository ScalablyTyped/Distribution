package typings.azdata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzdatachartOptions extends js.Object {
  
  var azdata_chartOptions: js.UndefOr[js.Any] = js.native
}
object AzdatachartOptions {
  
  @scala.inline
  def apply(): AzdatachartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzdatachartOptions]
  }
  
  @scala.inline
  implicit class AzdatachartOptionsOps[Self <: AzdatachartOptions] (val x: Self) extends AnyVal {
    
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
    def setAzdata_chartOptions(value: js.Any): Self = this.set("azdata_chartOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAzdata_chartOptions: Self = this.set("azdata_chartOptions", js.undefined)
  }
}
