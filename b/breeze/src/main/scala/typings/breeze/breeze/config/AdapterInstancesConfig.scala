package typings.breeze.breeze.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterInstancesConfig extends js.Object {
  
  /** the name of a previously registered "ajax" adapter */
  var ajax: js.UndefOr[String] = js.native
  
  /** the name of a previously registered "dataService" adapter */
  var dataService: js.UndefOr[String] = js.native
  
  /** the name of a previously registered "modelLibrary" adapter */
  var modelLibary: js.UndefOr[String] = js.native
  
  /** the name of a previously registered "uriBuilder" adapter */
  var uriBuilder: js.UndefOr[String] = js.native
}
object AdapterInstancesConfig {
  
  @scala.inline
  def apply(): AdapterInstancesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterInstancesConfig]
  }
  
  @scala.inline
  implicit class AdapterInstancesConfigOps[Self <: AdapterInstancesConfig] (val x: Self) extends AnyVal {
    
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
    def setAjax(value: String): Self = this.set("ajax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAjax: Self = this.set("ajax", js.undefined)
    
    @scala.inline
    def setDataService(value: String): Self = this.set("dataService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataService: Self = this.set("dataService", js.undefined)
    
    @scala.inline
    def setModelLibary(value: String): Self = this.set("modelLibary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelLibary: Self = this.set("modelLibary", js.undefined)
    
    @scala.inline
    def setUriBuilder(value: String): Self = this.set("uriBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriBuilder: Self = this.set("uriBuilder", js.undefined)
  }
}
