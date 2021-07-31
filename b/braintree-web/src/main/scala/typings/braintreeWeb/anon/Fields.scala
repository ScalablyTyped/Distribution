package typings.braintreeWeb.anon

import typings.braintreeWeb.hostedFieldsMod.HostedFieldFieldOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fields extends StObject {
  
  var authorization: js.UndefOr[String] = js.undefined
  
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.undefined
  
  var fields: HostedFieldFieldOptions
  
  var styles: js.UndefOr[js.Any] = js.undefined
}
object Fields {
  
  @scala.inline
  def apply(fields: HostedFieldFieldOptions): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
  
  @scala.inline
  implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setFields(value: HostedFieldFieldOptions): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
