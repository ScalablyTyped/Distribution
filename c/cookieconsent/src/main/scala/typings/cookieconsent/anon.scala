package typings.cookieconsent

import org.scalablytyped.runtime.StringDictionary
import typings.cookieconsent.mod.Service
import typings.cookieconsent.mod.ServiceDefinition
import typings.cookieconsent.mod.ServiceResponse
import typings.csstype.mod.Property.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
  
  trait Allow extends StObject {
    
    var allow: js.UndefOr[String] = js.undefined
    
    var close: js.UndefOr[String] = js.undefined
    
    var deny: js.UndefOr[String] = js.undefined
    
    var dismiss: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var policy: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object Allow {
    
    inline def apply(): Allow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Allow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Allow] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      
      inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
      
      inline def setDismiss(value: String): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
      
      inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Background extends StObject {
    
    var background: js.UndefOr[
        typings.csstype.mod.Property.Background[String | typings.cookieconsent.cookieconsentInts.`0`]
      ] = js.undefined
    
    var link: js.UndefOr[Color] = js.undefined
    
    var text: js.UndefOr[Color] = js.undefined
  }
  object Background {
    
    inline def apply(): Background = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      inline def setBackground(
        value: typings.csstype.mod.Property.Background[String | typings.cookieconsent.cookieconsentInts.`0`]
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setLink(value: Color): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setText(value: Color): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Border extends StObject {
    
    var background: js.UndefOr[
        typings.csstype.mod.Property.Background[String | typings.cookieconsent.cookieconsentInts.`0`]
      ] = js.undefined
    
    var border: js.UndefOr[Color] = js.undefined
    
    var text: js.UndefOr[Color] = js.undefined
  }
  object Border {
    
    inline def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      inline def setBackground(
        value: typings.csstype.mod.Property.Background[String | typings.cookieconsent.cookieconsentInts.`0`]
      ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: Color): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setText(value: Color): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Button extends StObject {
    
    var button: js.UndefOr[Border] = js.undefined
    
    var highlight: js.UndefOr[Border] = js.undefined
    
    var popup: js.UndefOr[Background] = js.undefined
  }
  object Button {
    
    inline def apply(): Button = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Button]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
      
      inline def setButton(value: Border): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setHighlight(value: Border): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setPopup(value: Background): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    def callback(done: js.Function1[/* resp */ ServiceResponse, Unit], response: String): ServiceResponse
    
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    var isScript: js.UndefOr[Boolean] = js.undefined
    
    var url: String
  }
  object Callback {
    
    inline def apply(callback: (js.Function1[/* resp */ ServiceResponse, Unit], String) => ServiceResponse, url: String): Callback = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: (js.Function1[/* resp */ ServiceResponse, Unit], String) => ServiceResponse): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIsScript(value: Boolean): Self = StObject.set(x, "isScript", value.asInstanceOf[js.Any])
      
      inline def setIsScriptUndefined: Self = StObject.set(x, "isScript", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Close extends StObject {
    
    var allow: js.UndefOr[String] = js.undefined
    
    var close: js.UndefOr[String] = js.undefined
    
    var deny: js.UndefOr[String] = js.undefined
    
    var dismiss: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var link: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var messagelink: js.UndefOr[String] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      
      inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
      
      inline def setDismiss(value: String): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
      
      inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessagelink(value: String): Self = StObject.set(x, "messagelink", value.asInstanceOf[js.Any])
      
      inline def setMessagelinkUndefined: Self = StObject.set(x, "messagelink", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
  }
  object Code {
    
    inline def apply(code: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountryCode extends StObject {
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var regionalLaw: js.UndefOr[Boolean] = js.undefined
  }
  object CountryCode {
    
    inline def apply(): CountryCode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountryCode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CountryCode] (val x: Self) extends AnyVal {
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setRegionalLaw(value: Boolean): Self = StObject.set(x, "regionalLaw", value.asInstanceOf[js.Any])
      
      inline def setRegionalLawUndefined: Self = StObject.set(x, "regionalLaw", js.undefined)
    }
  }
  
  trait Domain extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expiryDays: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object Domain {
    
    inline def apply(): Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpiryDays(value: Double): Self = StObject.set(x, "expiryDays", value.asInstanceOf[js.Any])
      
      inline def setExpiryDaysUndefined: Self = StObject.set(x, "expiryDays", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait ServiceDefinitions extends StObject {
    
    var serviceDefinitions: js.UndefOr[StringDictionary[ServiceDefinition]] = js.undefined
    
    var services: js.UndefOr[js.Array[Service]] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ServiceDefinitions {
    
    inline def apply(): ServiceDefinitions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceDefinitions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceDefinitions] (val x: Self) extends AnyVal {
      
      inline def setServiceDefinitions(value: StringDictionary[ServiceDefinition]): Self = StObject.set(x, "serviceDefinitions", value.asInstanceOf[js.Any])
      
      inline def setServiceDefinitionsUndefined: Self = StObject.set(x, "serviceDefinitions", js.undefined)
      
      inline def setServices(value: js.Array[Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
