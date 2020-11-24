package typings.crumb.mod

import typings.hapi.mod.Request
import typings.hapi.mod.ResponseToolkit
import typings.hapi.mod.ServerStateCookieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterOptions extends js.Object {
  
  /**
    * Whether to automatically add the crumb to view contexts as the given key.
    *
    * @default true
    */
  var addToViewContext: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to automatically generate a new crumb for requests.
    *
    * @default true
    */
  var autoGenerate: js.UndefOr[Boolean] = js.native
  
  /**
    * Storage options for the cookie containing the crumb
    *
    * @default { path: '/' }
    */
  var cookieOptions: js.UndefOr[ServerStateCookieOptions] = js.native
  
  /**
    * Using enforce with false will set the CSRF header cookie but won't execute the validation.
    *
    * @default true
    */
  var enforce: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the name of the custom CSRF header.
    *
    * @default 'X-CSRF-Token'
    */
  var headerName: js.UndefOr[String] = js.native
  
  /**
    * The name of the cookie to store the CSRF crumb into.
    *
    * @default 'crumb'
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Whether to add to the request log with tag 'crumb' and data 'validation failed'.
    *
    * @default false
    */
  var logUnauthorized: js.UndefOr[Boolean] = js.native
  
  /**
    * RESTful mode that validates crumb tokens from 'X-CSRF-Token' request header for POST, PUT, PATCH and DELETE server routes.
    * Disables payload/query crumb validation.
    *
    * @default false
    */
  var restful: js.UndefOr[Boolean] = js.native
  
  /**
    * The length of the crumb to generate.
    * See {@link https://github.com/hapijs/cryptiles cryptiles} for more information.
    *
    * @default 43
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * A function which when provided, is called for every request.
    * If the provided function returns true, validation and generation of crumb is skipped.
    *
    * @default false
    */
  var skip: js.UndefOr[Boolean | SkipFunction] = js.native
}
object RegisterOptions {
  
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
    
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
    def setAddToViewContext(value: Boolean): Self = this.set("addToViewContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToViewContext: Self = this.set("addToViewContext", js.undefined)
    
    @scala.inline
    def setAutoGenerate(value: Boolean): Self = this.set("autoGenerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGenerate: Self = this.set("autoGenerate", js.undefined)
    
    @scala.inline
    def setCookieOptions(value: ServerStateCookieOptions): Self = this.set("cookieOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieOptions: Self = this.set("cookieOptions", js.undefined)
    
    @scala.inline
    def setEnforce(value: Boolean): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setHeaderName(value: String): Self = this.set("headerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderName: Self = this.set("headerName", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setLogUnauthorized(value: Boolean): Self = this.set("logUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUnauthorized: Self = this.set("logUnauthorized", js.undefined)
    
    @scala.inline
    def setRestful(value: Boolean): Self = this.set("restful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestful: Self = this.set("restful", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSkipFunction2(value: (/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit]) => Boolean): Self = this.set("skip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSkip(value: Boolean | SkipFunction): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
}
