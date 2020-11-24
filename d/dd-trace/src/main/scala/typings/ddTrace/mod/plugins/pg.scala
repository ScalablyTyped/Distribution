package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [pg](https://node-postgres.com/) module.
  */
@js.native
trait pg
  extends Integration
     with Analyzable {
  
  /**
    * The service name to be used for this plugin. If a function is used, it will be passed the connection parameters and its return value will be used as the service name.
    */
  @JSName("service")
  var service_pg: js.UndefOr[String | (js.Function1[/* params */ js.Any, String])] = js.native
}
object pg {
  
  @scala.inline
  def apply(): pg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pg]
  }
  
  @scala.inline
  implicit class pgOps[Self <: pg] (val x: Self) extends AnyVal {
    
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
    def setServiceFunction1(value: /* params */ js.Any => String): Self = this.set("service", js.Any.fromFunction1(value))
    
    @scala.inline
    def setService(value: String | (js.Function1[/* params */ js.Any, String])): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
}
