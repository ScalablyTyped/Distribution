package typings.browserReport

import typings.browserReport.anon.City
import typings.browserReport.anon.Colors
import typings.browserReport.anon.Layout
import typings.browserReport.anon.Name
import typings.browserReport.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportResult extends StObject {
  
  var browser: Name
  
  var cookies: Boolean
  
  var country: City
  
  var flash: Version
  
  var ip: String
  
  @JSName("java")
  var java_ : Version
  
  var lang: js.Array[String]
  
  var os: Name
  
  var screen: Colors
  
  var scripts: Boolean
  
  var timestamp: String
  
  var userAgent: String
  
  var viewport: Layout
  
  var websockets: Boolean
}
object ReportResult {
  
  inline def apply(
    browser: Name,
    cookies: Boolean,
    country: City,
    flash: Version,
    ip: String,
    java_ : Version,
    lang: js.Array[String],
    os: Name,
    screen: Colors,
    scripts: Boolean,
    timestamp: String,
    userAgent: String,
    viewport: Layout,
    websockets: Boolean
  ): ReportResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], scripts = scripts.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], websockets = websockets.asInstanceOf[js.Any])
    __obj.updateDynamic("java")(java_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportResult]
  }
  
  extension [Self <: ReportResult](x: Self) {
    
    inline def setBrowser(value: Name): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: City): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setFlash(value: Version): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setJava_(value: Version): Self = StObject.set(x, "java", value.asInstanceOf[js.Any])
    
    inline def setLang(value: js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value*))
    
    inline def setOs(value: Name): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Colors): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Layout): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setWebsockets(value: Boolean): Self = StObject.set(x, "websockets", value.asInstanceOf[js.Any])
  }
}
