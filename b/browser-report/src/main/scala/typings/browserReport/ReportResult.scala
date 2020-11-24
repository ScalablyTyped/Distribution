package typings.browserReport

import typings.browserReport.anon.City
import typings.browserReport.anon.Colors
import typings.browserReport.anon.Layout
import typings.browserReport.anon.Name
import typings.browserReport.anon.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportResult extends js.Object {
  
  var browser: Name = js.native
  
  var cookies: Boolean = js.native
  
  var country: City = js.native
  
  var flash: Version = js.native
  
  var ip: String = js.native
  
  @JSName("java")
  var java_ : Version = js.native
  
  var lang: js.Array[String] = js.native
  
  var os: Name = js.native
  
  var screen: Colors = js.native
  
  var scripts: Boolean = js.native
  
  var timestamp: String = js.native
  
  var userAgent: String = js.native
  
  var viewport: Layout = js.native
  
  var websockets: Boolean = js.native
}
object ReportResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ReportResultOps[Self <: ReportResult] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: Name): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: Boolean): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: City): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash(value: Version): Self = this.set("flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJava_(value: Version): Self = this.set("java", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangVarargs(value: String*): Self = this.set("lang", js.Array(value :_*))
    
    @scala.inline
    def setLang(value: js.Array[String]): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: Name): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: Colors): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripts(value: Boolean): Self = this.set("scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: Layout): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsockets(value: Boolean): Self = this.set("websockets", value.asInstanceOf[js.Any])
  }
}
