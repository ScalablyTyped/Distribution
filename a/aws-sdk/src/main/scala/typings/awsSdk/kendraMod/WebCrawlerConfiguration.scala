package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebCrawlerConfiguration extends StObject {
  
  /**
    * Configuration information required to connect to websites using authentication. You can connect to websites using basic authentication of user name and password. You use a secret in Secrets Manager to store your authentication credentials. You must provide the website host name and port number. For example, the host name of https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS.
    */
  var AuthenticationConfiguration: js.UndefOr[typings.awsSdk.kendraMod.AuthenticationConfiguration] = js.undefined
  
  /**
    * Specifies the number of levels in a website that you want to crawl. The first level begins from the website seed or starting point URL. For example, if a website has 3 levels – index level (i.e. seed in this example), sections level, and subsections level – and you are only interested in crawling information up to the sections level (i.e. levels 0-1), you can set your depth to 1. The default crawl depth is set to 2.
    */
  var CrawlDepth: js.UndefOr[typings.awsSdk.kendraMod.CrawlDepth] = js.undefined
  
  /**
    * The maximum size (in MB) of a webpage or attachment to crawl. Files larger than this size (in MB) are skipped/not crawled. The default maximum size of a webpage or attachment is set to 50 MB.
    */
  var MaxContentSizePerPageInMegaBytes: js.UndefOr[typings.awsSdk.kendraMod.MaxContentSizePerPageInMegaBytes] = js.undefined
  
  /**
    * The maximum number of URLs on a webpage to include when crawling a website. This number is per webpage. As a website’s webpages are crawled, any URLs the webpages link to are also crawled. URLs on a webpage are crawled in order of appearance. The default maximum links per page is 100.
    */
  var MaxLinksPerPage: js.UndefOr[typings.awsSdk.kendraMod.MaxLinksPerPage] = js.undefined
  
  /**
    * The maximum number of URLs crawled per website host per minute. A minimum of one URL is required. The default maximum number of URLs crawled per website host per minute is 300.
    */
  var MaxUrlsPerMinuteCrawlRate: js.UndefOr[typings.awsSdk.kendraMod.MaxUrlsPerMinuteCrawlRate] = js.undefined
  
  /**
    * Configuration information required to connect to your internal websites via a web proxy. You must provide the website host name and port number. For example, the host name of https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication. To store web proxy credentials, you use a secret in Secrets Manager.
    */
  var ProxyConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ProxyConfiguration] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain URLs to crawl. URLs that match the patterns are excluded from the index. URLs that don't match the patterns are included in the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn't included in the index.
    */
  var UrlExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain URLs to crawl. URLs that match the patterns are included in the index. URLs that don't match the patterns are excluded from the index. If a URL matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the URL file isn't included in the index.
    */
  var UrlInclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Specifies the seed or starting point URLs of the websites or the sitemap URLs of the websites you want to crawl. You can include website subdomains. You can list up to 100 seed URLs and up to three sitemap URLs. You can only crawl websites that use the secure communication protocol, Hypertext Transfer Protocol Secure (HTTPS). If you receive an error when crawling a website, it could be that the website is blocked from crawling.  When selecting websites to index, you must adhere to the Amazon Acceptable Use Policy and all other Amazon terms. Remember that you must only use Amazon Kendra Web Crawler to index your own webpages, or webpages that you have authorization to index. 
    */
  var Urls: typings.awsSdk.kendraMod.Urls
}
object WebCrawlerConfiguration {
  
  inline def apply(Urls: Urls): WebCrawlerConfiguration = {
    val __obj = js.Dynamic.literal(Urls = Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCrawlerConfiguration]
  }
  
  extension [Self <: WebCrawlerConfiguration](x: Self) {
    
    inline def setAuthenticationConfiguration(value: AuthenticationConfiguration): Self = StObject.set(x, "AuthenticationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationConfigurationUndefined: Self = StObject.set(x, "AuthenticationConfiguration", js.undefined)
    
    inline def setCrawlDepth(value: CrawlDepth): Self = StObject.set(x, "CrawlDepth", value.asInstanceOf[js.Any])
    
    inline def setCrawlDepthUndefined: Self = StObject.set(x, "CrawlDepth", js.undefined)
    
    inline def setMaxContentSizePerPageInMegaBytes(value: MaxContentSizePerPageInMegaBytes): Self = StObject.set(x, "MaxContentSizePerPageInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxContentSizePerPageInMegaBytesUndefined: Self = StObject.set(x, "MaxContentSizePerPageInMegaBytes", js.undefined)
    
    inline def setMaxLinksPerPage(value: MaxLinksPerPage): Self = StObject.set(x, "MaxLinksPerPage", value.asInstanceOf[js.Any])
    
    inline def setMaxLinksPerPageUndefined: Self = StObject.set(x, "MaxLinksPerPage", js.undefined)
    
    inline def setMaxUrlsPerMinuteCrawlRate(value: MaxUrlsPerMinuteCrawlRate): Self = StObject.set(x, "MaxUrlsPerMinuteCrawlRate", value.asInstanceOf[js.Any])
    
    inline def setMaxUrlsPerMinuteCrawlRateUndefined: Self = StObject.set(x, "MaxUrlsPerMinuteCrawlRate", js.undefined)
    
    inline def setProxyConfiguration(value: ProxyConfiguration): Self = StObject.set(x, "ProxyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProxyConfigurationUndefined: Self = StObject.set(x, "ProxyConfiguration", js.undefined)
    
    inline def setUrlExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "UrlExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setUrlExclusionPatternsUndefined: Self = StObject.set(x, "UrlExclusionPatterns", js.undefined)
    
    inline def setUrlExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "UrlExclusionPatterns", js.Array(value*))
    
    inline def setUrlInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "UrlInclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setUrlInclusionPatternsUndefined: Self = StObject.set(x, "UrlInclusionPatterns", js.undefined)
    
    inline def setUrlInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "UrlInclusionPatterns", js.Array(value*))
    
    inline def setUrls(value: Urls): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
  }
}
