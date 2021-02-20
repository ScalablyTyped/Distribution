package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCorsConfiguration extends StObject {
  
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
  implicit class AwsCorsConfigurationMutableBuilder[Self <: AwsCorsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCredentials(value: Boolean): Self = StObject.set(x, "AllowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCredentialsUndefined: Self = StObject.set(x, "AllowCredentials", js.undefined)
    
    @scala.inline
    def setAllowHeaders(value: NonEmptyStringList): Self = StObject.set(x, "AllowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeadersUndefined: Self = StObject.set(x, "AllowHeaders", js.undefined)
    
    @scala.inline
    def setAllowHeadersVarargs(value: NonEmptyString*): Self = StObject.set(x, "AllowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: NonEmptyStringList): Self = StObject.set(x, "AllowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMethodsUndefined: Self = StObject.set(x, "AllowMethods", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AllowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowOrigins(value: NonEmptyStringList): Self = StObject.set(x, "AllowOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOriginsUndefined: Self = StObject.set(x, "AllowOrigins", js.undefined)
    
    @scala.inline
    def setAllowOriginsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AllowOrigins", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: NonEmptyStringList): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: NonEmptyString*): Self = StObject.set(x, "ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaxAge(value: Integer): Self = StObject.set(x, "MaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "MaxAge", js.undefined)
  }
}
