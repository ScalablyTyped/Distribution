package typings.awsSyntheticsPuppeteer

import typings.awsSyntheticsPuppeteer.anon.Body
import typings.awsSyntheticsPuppeteer.anon.ContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestsReportMod {
  
  /**
    * This class handles the creation of http requests report.
    * This report is generated and uploaded to S3 bucket by Synthetics.
    */
  @JSImport("HttpRequestsReport", "HttpCallResult")
  @js.native
  open class HttpCallResult () extends StObject {
    
    def getHttpTimings(): HttpTimingsResult = js.native
    
    def getRequest(): HttpRequestResult = js.native
    
    def getRequestNum(): Double = js.native
    
    def getRequestUrl(): String = js.native
    
    def getResponse(): HttpResponseResult = js.native
    
    def getStep(): Any = js.native
    
    var httpTimings: HttpTimingsResult = js.native
    
    var request: HttpRequestResult = js.native
    
    var requestNum: Double = js.native
    
    var requestUrl: String = js.native
    
    var response: HttpResponseResult = js.native
    
    var step: Any = js.native
    
    def withHttpTimings(httpTimings: Any): HttpCallResult = js.native
    
    def withRequest(request: Any): HttpCallResult = js.native
    
    def withRequestNum(requestNum: Any): HttpCallResult = js.native
    
    def withRequestUrl(requestUrl: Any): HttpCallResult = js.native
    
    def withResponse(response: Any): HttpCallResult = js.native
    
    def withStep(step: Any): HttpCallResult = js.native
  }
  
  @JSImport("HttpRequestsReport", "HttpRequestResult")
  @js.native
  open class HttpRequestResult () extends StObject {
    
    var body: Any = js.native
    
    def getBody(): Any = js.native
    
    def getBodySize(): Double = js.native
    
    def getHeaders(): Any = js.native
    
    def getHeadersSize(): Double = js.native
    
    def getHost(): Any = js.native
    
    def getHostName(): Any = js.native
    
    def getMethod(): Any = js.native
    
    def getPath(): Any = js.native
    
    def getPort(): Any = js.native
    
    def getProtocol(): Any = js.native
    
    var headers: Any = js.native
    
    var host: Any = js.native
    
    var hostname: Any = js.native
    
    var method: Any = js.native
    
    var path: Any = js.native
    
    var port: Any = js.native
    
    var protocol: Any = js.native
    
    var sizeInBytes: Body = js.native
    
    def withBody(body: Any): HttpRequestResult = js.native
    
    def withBodySize(bodySize: Any): HttpRequestResult = js.native
    
    def withHeaders(headers: Any): HttpRequestResult = js.native
    
    def withHeadersSize(headersSize: Any): HttpRequestResult = js.native
    
    def withHost(host: Any): HttpRequestResult = js.native
    
    def withHostName(hostName: Any): HttpRequestResult = js.native
    
    def withMethod(method: Any): HttpRequestResult = js.native
    
    def withPath(path: Any): HttpRequestResult = js.native
    
    def withPort(port: Any): HttpRequestResult = js.native
    
    def withProtocol(protocol: Any): HttpRequestResult = js.native
  }
  object HttpRequestResult {
    
    @JSImport("HttpRequestsReport", "HttpRequestResult")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def buildRequestResult(options: Any, requestBody: Any, syntheticsConfiguration: Any): HttpRequestResult = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRequestResult")(options.asInstanceOf[js.Any], requestBody.asInstanceOf[js.Any], syntheticsConfiguration.asInstanceOf[js.Any])).asInstanceOf[HttpRequestResult]
  }
  
  @JSImport("HttpRequestsReport", "HttpRequestUrl")
  @js.native
  open class HttpRequestUrl protected () extends StObject {
    def this(protocol: Any, hostname: Any, path: Any) = this()
    
    def getHostName(): Any = js.native
    
    def getLogString(): Any = js.native
    def getLogString(skipQueryString: Boolean): Any = js.native
    
    def getPath(): Any = js.native
    
    def getProtocol(): Any = js.native
    
    var hostname: Any = js.native
    
    var path: Any = js.native
    
    var protocol: Any = js.native
  }
  object HttpRequestUrl {
    
    @JSImport("HttpRequestsReport", "HttpRequestUrl")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def buildRequestUrl(options: Any, urlObj: Any): HttpRequestUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("buildRequestUrl")(options.asInstanceOf[js.Any], urlObj.asInstanceOf[js.Any])).asInstanceOf[HttpRequestUrl]
  }
  
  @JSImport("HttpRequestsReport", "HttpResponseResult")
  @js.native
  open class HttpResponseResult () extends StObject {
    
    var content: ContentType = js.native
    
    var error: String = js.native
    
    def getBody(): String = js.native
    
    def getBodySize(): Double = js.native
    
    def getContentEncoding(): String = js.native
    
    def getContentType(): String = js.native
    
    def getError(): String = js.native
    
    def getHeaders(): Any = js.native
    
    def getHeadersSize(): Double = js.native
    
    def getStatusCode(): String = js.native
    
    def getStatusMessage(): String = js.native
    
    var headers: Any = js.native
    
    var sizeInBytes: Body = js.native
    
    var statusCode: String = js.native
    
    var statusMessage: String = js.native
    
    def withBody(responseBody: Any, syntheticsConfiguration: Any): HttpResponseResult = js.native
    
    def withBodySize(bodySize: Any): HttpResponseResult = js.native
    
    def withContentEncoding(contentEncoding: Any): HttpResponseResult = js.native
    
    def withContentType(contentType: Any): HttpResponseResult = js.native
    
    def withError(error: Any): HttpResponseResult = js.native
    
    def withHeaders(responseHeaders: Any, syntheticsConfiguration: Any): HttpResponseResult = js.native
    
    def withHeadersSize(headersSize: Any): HttpResponseResult = js.native
    
    def withStatusCode(statusCode: Any): HttpResponseResult = js.native
    
    def withStatusMessage(statusMessage: Any): HttpResponseResult = js.native
  }
  
  @JSImport("HttpRequestsReport", "HttpTimingsResult")
  @js.native
  open class HttpTimingsResult () extends StObject {
    
    var contentTransferTimeInMs: Any = js.native
    
    var dnsLookUpTimeInMs: Any = js.native
    
    var endedAt: Any = js.native
    
    var firstByteTimeInMs: Any = js.native
    
    def getContentTransferTime(): Any = js.native
    
    def getDnsLookUpTime(): Any = js.native
    
    def getEndedAt(): Any = js.native
    
    def getFirstByteTime(): Any = js.native
    
    def getStartedAt(): Any = js.native
    
    def getTcpConnectionTime(): Any = js.native
    
    def getTlsHandshakeTime(): Any = js.native
    
    def getTotalDuration(): Any = js.native
    
    var startedAt: Any = js.native
    
    var tcpConnectionTimeInMs: Any = js.native
    
    var tlsHandshakeTimeInMs: Any = js.native
    
    var totalDurationInMs: Any = js.native
    
    def withContentTransferTime(contentTransferTime: Any): HttpTimingsResult = js.native
    
    def withDnsLookupTime(dnsLookUpTime: Any): HttpTimingsResult = js.native
    
    def withEndedAt(endedAt: Any): HttpTimingsResult = js.native
    
    def withFirstByteTime(firstByteTime: Any): HttpTimingsResult = js.native
    
    def withStartedAt(startedAt: Any): HttpTimingsResult = js.native
    
    def withTcpConnectionTime(tcpConnectionTime: Any): HttpTimingsResult = js.native
    
    def withTlsHandshakeTime(tlsHandshakeTime: Any): HttpTimingsResult = js.native
    
    def withTotalDuration(totalDuration: Any): HttpTimingsResult = js.native
  }
}
