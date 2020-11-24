package typings.dav.mod

import typings.dav.davStrings.caldav
import typings.dav.davStrings.carddav
import typings.dav.mod.transport.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountOptions extends js.Object {
  
  /**
    * one of 'caldav' or 'carddav'. Defaults to 'caldav'.
    */
  var accountType: js.UndefOr[caldav | carddav] = js.native
  
  /**
    * list of caldav filters to send with request.
    */
  var filters: js.UndefOr[js.Array[js.Object]] = js.native
  
  /**
    *  whether or not to load dav collections.
    */
  var loadCollections: js.UndefOr[Boolean] = js.native
  
  /**
    * whether or not to load dav objects.
    */
  var loadObjects: js.UndefOr[Boolean] = js.native
  
  /**
    * request sandox.
    */
  var sandbox: js.UndefOr[Sandbox | js.Object] = js.native
  
  /**
    *  some url for server (needn't be base url).
    */
  var server: String = js.native
  
  /**
    * VTIMEZONE calendar object.
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * request sender.
    */
  var xhr: js.UndefOr[Transport] = js.native
}
object CreateAccountOptions {
  
  @scala.inline
  def apply(server: String): CreateAccountOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOptions]
  }
  
  @scala.inline
  implicit class CreateAccountOptionsOps[Self <: CreateAccountOptions] (val x: Self) extends AnyVal {
    
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
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountType(value: caldav | carddav): Self = this.set("accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountType: Self = this.set("accountType", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: js.Object*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[js.Object]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setLoadCollections(value: Boolean): Self = this.set("loadCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadCollections: Self = this.set("loadCollections", js.undefined)
    
    @scala.inline
    def setLoadObjects(value: Boolean): Self = this.set("loadObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadObjects: Self = this.set("loadObjects", js.undefined)
    
    @scala.inline
    def setSandbox(value: Sandbox | js.Object): Self = this.set("sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSandbox: Self = this.set("sandbox", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setXhr(value: Transport): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
}
