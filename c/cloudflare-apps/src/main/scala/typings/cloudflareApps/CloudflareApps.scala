package typings.cloudflareApps

import org.scalablytyped.runtime.StringDictionary
import typings.cloudflareApps.cloudflareAppsStrings.after
import typings.cloudflareApps.cloudflareAppsStrings.append
import typings.cloudflareApps.cloudflareAppsStrings.before
import typings.cloudflareApps.cloudflareAppsStrings.http
import typings.cloudflareApps.cloudflareAppsStrings.https
import typings.cloudflareApps.cloudflareAppsStrings.prepend
import typings.cloudflareApps.cloudflareAppsStrings.replace
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CloudflareApps {
  
  trait App extends StObject {
    
    var appId: String
    
    var options: InstallOptions
    
    var scope: InstallScope
  }
  object App {
    
    inline def apply(appId: String, options: InstallOptions, scope: InstallScope): App = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    extension [Self <: App](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: InstallOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setScope(value: InstallScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloudflareApps
    extends StObject
       with CloudflareAppsMethods {
    
    var installs: StringDictionary[js.UndefOr[App]] = js.native
    
    var proxy: CloudflareAppsProxy = js.native
    
    var siteId: String = js.native
  }
  
  @js.native
  trait CloudflareAppsMethods extends StObject {
    
    def createElement[T /* <: Element */](options: ElementLocation): T = js.native
    def createElement[T /* <: Element */](options: ElementLocation, previousElement: T): T = js.native
    
    def matchPage(patterns: js.Array[String]): Boolean = js.native
    
    def querySelector(selectors: String): Element | Null = js.native
    def querySelector[K /* <: /* keyof cloudflare-apps.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](selectors: K): (/* import warning: importer.ImportType#apply Failed type conversion: cloudflare-apps.anon.ElementTagNameMap[K] */ js.Any) | Null = js.native
  }
  
  trait CloudflareAppsProxy extends StObject {
    
    var embedSiteId: String
    
    var hasRocketEmbed: Boolean
    
    var originalURL: OriginalURL
  }
  object CloudflareAppsProxy {
    
    inline def apply(embedSiteId: String, hasRocketEmbed: Boolean, originalURL: OriginalURL): CloudflareAppsProxy = {
      val __obj = js.Dynamic.literal(embedSiteId = embedSiteId.asInstanceOf[js.Any], hasRocketEmbed = hasRocketEmbed.asInstanceOf[js.Any], originalURL = originalURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudflareAppsProxy]
    }
    
    extension [Self <: CloudflareAppsProxy](x: Self) {
      
      inline def setEmbedSiteId(value: String): Self = StObject.set(x, "embedSiteId", value.asInstanceOf[js.Any])
      
      inline def setHasRocketEmbed(value: Boolean): Self = StObject.set(x, "hasRocketEmbed", value.asInstanceOf[js.Any])
      
      inline def setOriginalURL(value: OriginalURL): Self = StObject.set(x, "originalURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementLocation extends StObject {
    
    var method: before | prepend | append | after | replace
    
    var selector: String
  }
  object ElementLocation {
    
    inline def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementLocation]
    }
    
    extension [Self <: ElementLocation](x: Self) {
      
      inline def setMethod(value: before | prepend | append | after | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  type InstallOptions = StringDictionary[js.Any]
  
  trait InstallProduct extends StObject {
    
    var id: String
  }
  object InstallProduct {
    
    inline def apply(id: String): InstallProduct = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallProduct]
    }
    
    extension [Self <: InstallProduct](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type InstallScope = StringDictionary[js.Any]
  
  trait OriginalURL extends StObject {
    
    var parsed: OriginalURLParsed
    
    var raw: String
  }
  object OriginalURL {
    
    inline def apply(parsed: OriginalURLParsed, raw: String): OriginalURL = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalURL]
    }
    
    extension [Self <: OriginalURL](x: Self) {
      
      inline def setParsed(value: OriginalURLParsed): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait OriginalURLParsed extends StObject {
    
    var fragment: String
    
    var host: String
    
    var path: String
    
    var query: URLQuery
    
    var scheme: https | http
  }
  object OriginalURLParsed {
    
    inline def apply(fragment: String, host: String, path: String, query: URLQuery, scheme: https | http): OriginalURLParsed = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalURLParsed]
    }
    
    extension [Self <: OriginalURLParsed](x: Self) {
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: URLQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: https | http): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
  
  type URLQuery = StringDictionary[js.Array[String]]
}
