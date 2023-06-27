package typings.cookiebotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CcpaApplies extends StObject {
    
    var ccpaApplies: Boolean
    
    var gdprApplies: Boolean
    
    var lgpdApplies: Boolean
  }
  object CcpaApplies {
    
    inline def apply(ccpaApplies: Boolean, gdprApplies: Boolean, lgpdApplies: Boolean): CcpaApplies = {
      val __obj = js.Dynamic.literal(ccpaApplies = ccpaApplies.asInstanceOf[js.Any], gdprApplies = gdprApplies.asInstanceOf[js.Any], lgpdApplies = lgpdApplies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CcpaApplies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CcpaApplies] (val x: Self) extends AnyVal {
      
      inline def setCcpaApplies(value: Boolean): Self = StObject.set(x, "ccpaApplies", value.asInstanceOf[js.Any])
      
      inline def setGdprApplies(value: Boolean): Self = StObject.set(x, "gdprApplies", value.asInstanceOf[js.Any])
      
      inline def setLgpdApplies(value: Boolean): Self = StObject.set(x, "lgpdApplies", value.asInstanceOf[js.Any])
    }
  }
  
  trait Consent extends StObject {
    
    var consent: Marketing
    
    var consented: Boolean
    
    var declined: Boolean
    
    var doNotTrack: Boolean
    
    def getScript(url: String, async: Boolean, callback: js.Function0[Unit]): Unit
    
    var hasResponse: Boolean
    
    def hide(): Unit
    
    var regulations: CcpaApplies
    
    def renew(): Unit
    
    def runScripts(): Unit
    
    def show(): Unit
    
    def submitCustomConsent(optinPreferences: Boolean, optinStatistics: Boolean, optinMarketing: Boolean): Unit
    
    def withdraw(): Unit
  }
  object Consent {
    
    inline def apply(
      consent: Marketing,
      consented: Boolean,
      declined: Boolean,
      doNotTrack: Boolean,
      getScript: (String, Boolean, js.Function0[Unit]) => Unit,
      hasResponse: Boolean,
      hide: () => Unit,
      regulations: CcpaApplies,
      renew: () => Unit,
      runScripts: () => Unit,
      show: () => Unit,
      submitCustomConsent: (Boolean, Boolean, Boolean) => Unit,
      withdraw: () => Unit
    ): Consent = {
      val __obj = js.Dynamic.literal(consent = consent.asInstanceOf[js.Any], consented = consented.asInstanceOf[js.Any], declined = declined.asInstanceOf[js.Any], doNotTrack = doNotTrack.asInstanceOf[js.Any], getScript = js.Any.fromFunction3(getScript), hasResponse = hasResponse.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), regulations = regulations.asInstanceOf[js.Any], renew = js.Any.fromFunction0(renew), runScripts = js.Any.fromFunction0(runScripts), show = js.Any.fromFunction0(show), submitCustomConsent = js.Any.fromFunction3(submitCustomConsent), withdraw = js.Any.fromFunction0(withdraw))
      __obj.asInstanceOf[Consent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Consent] (val x: Self) extends AnyVal {
      
      inline def setConsent(value: Marketing): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
      
      inline def setConsented(value: Boolean): Self = StObject.set(x, "consented", value.asInstanceOf[js.Any])
      
      inline def setDeclined(value: Boolean): Self = StObject.set(x, "declined", value.asInstanceOf[js.Any])
      
      inline def setDoNotTrack(value: Boolean): Self = StObject.set(x, "doNotTrack", value.asInstanceOf[js.Any])
      
      inline def setGetScript(value: (String, Boolean, js.Function0[Unit]) => Unit): Self = StObject.set(x, "getScript", js.Any.fromFunction3(value))
      
      inline def setHasResponse(value: Boolean): Self = StObject.set(x, "hasResponse", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setRegulations(value: CcpaApplies): Self = StObject.set(x, "regulations", value.asInstanceOf[js.Any])
      
      inline def setRenew(value: () => Unit): Self = StObject.set(x, "renew", js.Any.fromFunction0(value))
      
      inline def setRunScripts(value: () => Unit): Self = StObject.set(x, "runScripts", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setSubmitCustomConsent(value: (Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "submitCustomConsent", js.Any.fromFunction3(value))
      
      inline def setWithdraw(value: () => Unit): Self = StObject.set(x, "withdraw", js.Any.fromFunction0(value))
    }
  }
  
  trait Marketing extends StObject {
    
    var marketing: Boolean
    
    var necessary: Boolean
    
    var preferences: Boolean
    
    var stamp: String
    
    var statistics: Boolean
  }
  object Marketing {
    
    inline def apply(marketing: Boolean, necessary: Boolean, preferences: Boolean, stamp: String, statistics: Boolean): Marketing = {
      val __obj = js.Dynamic.literal(marketing = marketing.asInstanceOf[js.Any], necessary = necessary.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any], stamp = stamp.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
      __obj.asInstanceOf[Marketing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Marketing] (val x: Self) extends AnyVal {
      
      inline def setMarketing(value: Boolean): Self = StObject.set(x, "marketing", value.asInstanceOf[js.Any])
      
      inline def setNecessary(value: Boolean): Self = StObject.set(x, "necessary", value.asInstanceOf[js.Any])
      
      inline def setPreferences(value: Boolean): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
      
      inline def setStamp(value: String): Self = StObject.set(x, "stamp", value.asInstanceOf[js.Any])
      
      inline def setStatistics(value: Boolean): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    }
  }
}
