package typings.bullArena.mod.BullArena

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiddlewareListenOptions extends js.Object {
  
  var basePath: js.UndefOr[String] = js.native
  
  var disableListen: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var useCdn: js.UndefOr[Boolean] = js.native
}
object MiddlewareListenOptions {
  
  @scala.inline
  def apply(): MiddlewareListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewareListenOptions]
  }
  
  @scala.inline
  implicit class MiddlewareListenOptionsOps[Self <: MiddlewareListenOptions] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setDisableListen(value: Boolean): Self = this.set("disableListen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableListen: Self = this.set("disableListen", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setUseCdn(value: Boolean): Self = this.set("useCdn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCdn: Self = this.set("useCdn", js.undefined)
  }
}
