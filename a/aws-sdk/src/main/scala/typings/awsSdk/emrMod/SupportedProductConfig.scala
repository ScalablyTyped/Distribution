package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedProductConfig extends js.Object {
  
  /**
    * The list of user-supplied arguments.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  
  /**
    * The name of the product configuration.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
}
object SupportedProductConfig {
  
  @scala.inline
  def apply(): SupportedProductConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedProductConfig]
  }
  
  @scala.inline
  implicit class SupportedProductConfigOps[Self <: SupportedProductConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: XmlString*): Self = this.set("Args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: XmlStringList): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("Args", js.undefined)
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
