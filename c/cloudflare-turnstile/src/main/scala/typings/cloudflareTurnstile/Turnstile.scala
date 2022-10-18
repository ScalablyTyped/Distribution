package typings.cloudflareTurnstile

import typings.std.HTMLElement
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Turnstile {
  
  /**
    * Parameters for the turnstile.render() method.
    */
  trait RenderParameters extends StObject {
    
    /**
      * Optional. A customer value that can be used to differentiate widgets under the same sitekey in analytics and which is returned upon validation.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. A customer payload that can be used to attach customer data to the challenge throughout its issuance and which is returned upon validation.
      */
    var cData: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. A JavaScript callback that is invoked upon success of the challenge.
      * The callback is passed a token that can be validated.
      */
    var callback: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
    
    /**
      * Optional. A JavaScript callback that is invoked when there is a network error.
      */
    var `error-callback`: js.UndefOr[VoidFunction] = js.undefined
    
    /**
      * Optional. A JavaScript callback that is invoked when a challenge expires.
      */
    var `expired-callback`: js.UndefOr[VoidFunction] = js.undefined
    
    /**
      * Your Cloudflare Turnstile sitekey. This sitekey is associated with the corresponding widget configuration and is created upon the widget creation.
      */
    var sitekey: String
    
    /**
      * Optional. The tabindex of Turnstile’s iframe for accessibility purposes.
      * @default 0
      */
    var tabindex: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. The widget theme.
      * Accepted values: "auto", "light", "dark"
      * @default "auto"
      */
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object RenderParameters {
    
    inline def apply(sitekey: String): RenderParameters = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderParameters]
    }
    
    extension [Self <: RenderParameters](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCData(value: String): Self = StObject.set(x, "cData", value.asInstanceOf[js.Any])
      
      inline def setCDataUndefined: Self = StObject.set(x, "cData", js.undefined)
      
      inline def setCallback(value: /* token */ String => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def `setError-callback`(value: () => Unit): Self = StObject.set(x, "error-callback", js.Any.fromFunction0(value))
      
      inline def `setError-callbackUndefined`: Self = StObject.set(x, "error-callback", js.undefined)
      
      inline def `setExpired-callback`(value: () => Unit): Self = StObject.set(x, "expired-callback", js.Any.fromFunction0(value))
      
      inline def `setExpired-callbackUndefined`: Self = StObject.set(x, "expired-callback", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /**
    * The theme of the Turnstile widget.
    * The default is "auto", which respects the user preference. This can be forced to "light" or "dark" by setting the theme accordingly.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.cloudflareTurnstile.cloudflareTurnstileStrings.auto
    - typings.cloudflareTurnstile.cloudflareTurnstileStrings.light
    - typings.cloudflareTurnstile.cloudflareTurnstileStrings.dark
  */
  trait Theme extends StObject
  object Theme {
    
    inline def auto: typings.cloudflareTurnstile.cloudflareTurnstileStrings.auto = "auto".asInstanceOf[typings.cloudflareTurnstile.cloudflareTurnstileStrings.auto]
    
    inline def dark: typings.cloudflareTurnstile.cloudflareTurnstileStrings.dark = "dark".asInstanceOf[typings.cloudflareTurnstile.cloudflareTurnstileStrings.dark]
    
    inline def light: typings.cloudflareTurnstile.cloudflareTurnstileStrings.light = "light".asInstanceOf[typings.cloudflareTurnstile.cloudflareTurnstileStrings.light]
  }
  
  @js.native
  trait Turnstile extends StObject {
    
    /**
      * Gets the response of a Turnstile widget.
      * @param widgetId The ID of the Turnstile widget to get the response for.
      * @return the response of the Turnstile widget.
      */
    def getResponse(widgetId: String): String = js.native
    
    /**
      * Invokes a Turnstile widget and returns the ID of the newly created widget.
      * @param container The HTML element to render the Turnstile widget into. Specify either the ID of HTML element (string), or the DOM element itself.
      * @param params An object containing render parameters as key=value pairs, for example, {"sitekey": "your_site_key", "theme": "auto"}.
      * @return the ID of the newly created widget, or undefined if invocation is unsuccessful.
      */
    def render(container: String, params: RenderParameters): js.UndefOr[String] = js.native
    def render(container: HTMLElement, params: RenderParameters): js.UndefOr[String] = js.native
    
    /**
      * Resets a Turnstile widget.
      * @param widgetId The ID of the Turnstile widget to be reset.
      */
    def reset(widgetId: String): Unit = js.native
  }
}
