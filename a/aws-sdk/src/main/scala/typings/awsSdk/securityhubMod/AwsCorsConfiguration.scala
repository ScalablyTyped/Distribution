package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCorsConfiguration extends js.Object {
  
  /**
    * Indicates whether the CORS request includes credentials.
    */
  var AllowCredentials: js.UndefOr[Boolean] = js.native
  
  /**
    * The allowed headers for CORS requests.
    */
  var AllowHeaders: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * The allowed methods for CORS requests.
    */
  var AllowMethods: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * The allowed origins for CORS requests.
    */
  var AllowOrigins: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * The exposed headers for CORS requests.
    */
  var ExposeHeaders: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * The number of seconds for which the browser caches preflight request results.
    */
  var MaxAge: js.UndefOr[Integer] = js.native
}
object AwsCorsConfiguration {
  
  @scala.inline
  def apply(): AwsCorsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCorsConfiguration]
  }
  
  @scala.inline
  implicit class AwsCorsConfigurationOps[Self <: AwsCorsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowCredentials(value: Boolean): Self = this.set("AllowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCredentials: Self = this.set("AllowCredentials", js.undefined)
    
    @scala.inline
    def setAllowHeadersVarargs(value: NonEmptyString*): Self = this.set("AllowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowHeaders(value: NonEmptyStringList): Self = this.set("AllowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHeaders: Self = this.set("AllowHeaders", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: NonEmptyString*): Self = this.set("AllowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: NonEmptyStringList): Self = this.set("AllowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMethods: Self = this.set("AllowMethods", js.undefined)
    
    @scala.inline
    def setAllowOriginsVarargs(value: NonEmptyString*): Self = this.set("AllowOrigins", js.Array(value :_*))
    
    @scala.inline
    def setAllowOrigins(value: NonEmptyStringList): Self = this.set("AllowOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOrigins: Self = this.set("AllowOrigins", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: NonEmptyString*): Self = this.set("ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: NonEmptyStringList): Self = this.set("ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExposeHeaders: Self = this.set("ExposeHeaders", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Integer): Self = this.set("MaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("MaxAge", js.undefined)
  }
}
