package typings.cookiebotSdk

import typings.cookiebotSdk.anon.CcpaApplies
import typings.cookiebotSdk.anon.Marketing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Cookiebot {
    
    @JSGlobal("Cookiebot")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Cookiebot.consent")
    @js.native
    def consent: Marketing = js.native
    inline def consent_=(x: Marketing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("consent")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cookiebot.consented")
    @js.native
    def consented: Boolean = js.native
    inline def consented_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("consented")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cookiebot.declined")
    @js.native
    def declined: Boolean = js.native
    inline def declined_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("declined")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Cookiebot.doNotTrack")
    @js.native
    def doNotTrack: Boolean = js.native
    inline def doNotTrack_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doNotTrack")(x.asInstanceOf[js.Any])
    
    inline def getScript(url: String, async: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getScript")(url.asInstanceOf[js.Any], async.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Cookiebot.hasResponse")
    @js.native
    def hasResponse: Boolean = js.native
    inline def hasResponse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasResponse")(x.asInstanceOf[js.Any])
    
    inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
    
    @JSGlobal("Cookiebot.regulations")
    @js.native
    def regulations: CcpaApplies = js.native
    inline def regulations_=(x: CcpaApplies): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regulations")(x.asInstanceOf[js.Any])
    
    inline def renew(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renew")().asInstanceOf[Unit]
    
    inline def runScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runScripts")().asInstanceOf[Unit]
    
    inline def show(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")().asInstanceOf[Unit]
    
    inline def submitCustomConsent(optinPreferences: Boolean, optinStatistics: Boolean, optinMarketing: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("submitCustomConsent")(optinPreferences.asInstanceOf[js.Any], optinStatistics.asInstanceOf[js.Any], optinMarketing.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def withdraw(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("withdraw")().asInstanceOf[Unit]
  }
}
