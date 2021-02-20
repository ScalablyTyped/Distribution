package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.build__
import typings.awsSdk.awsSdkStrings.complete__
import typings.awsSdk.awsSdkStrings.error__
import typings.awsSdk.awsSdkStrings.extractData
import typings.awsSdk.awsSdkStrings.extractError
import typings.awsSdk.awsSdkStrings.httpData
import typings.awsSdk.awsSdkStrings.httpDone
import typings.awsSdk.awsSdkStrings.httpDownloadProgress
import typings.awsSdk.awsSdkStrings.httpError
import typings.awsSdk.awsSdkStrings.httpHeaders
import typings.awsSdk.awsSdkStrings.httpUploadProgress
import typings.awsSdk.awsSdkStrings.retry_
import typings.awsSdk.awsSdkStrings.send_
import typings.awsSdk.awsSdkStrings.sign__
import typings.awsSdk.awsSdkStrings.success__
import typings.awsSdk.awsSdkStrings.validate_
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.httpRequestMod.HttpRequest
import typings.awsSdk.responseMod.Response
import typings.awsSdk.serviceMod.Service
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Date
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("aws-sdk/lib/request", "Request")
  @js.native
  class Request[D, E] protected () extends StObject {
    /**
      * Creates a request for an operation on a given service with a set of input parameters.
      *
      * @param {AWS.Service} service - The service to perform the operation on.
      * @param {string} operation - The operation to perform on the service.
      * @param {object} params - Parameters to send to the operation.
      */
    def this(service: Service, operation: String) = this()
    def this(service: Service, operation: String, params: js.Any) = this()
    
    /**
      * Aborts a request, emitting the error and complete events.
      * This feature is not supported in the browser environment of the SDK.
      */
    def abort(): Unit = js.native
    
    /**
      * Converts the request object into a readable stream that can be read from or piped into a writable stream.
      * The data read from a readable stream contains only the raw HTTP body contents.
      * This feature is not supported in the browser environment of the SDK.
      */
    def createReadStream(): Readable = js.native
    
    /**
      * Iterates over each page of results given a pageable request, calling the provided callback with each page of data.
      * After all pages have been retrieved, the callback is called with null data.
      *
      * @param {eachPage} callback - The callback that handles the response.
      */
    def eachPage(
      callback: js.Function3[/* err */ E, /* data */ D, /* doneCallback */ js.UndefOr[js.Function0[Unit]], Boolean]
    ): Unit = js.native
    
    /**
      * The raw HTTP request object containing request headers and body information sent by the service.
      */
    var httpRequest: HttpRequest = js.native
    
    /**
      * Returns whether the operation can return multiple pages of response data.
      */
    def isPageable(): Boolean = js.native
    
    /**
      * Adds a listener that is triggered when a request emits the specified event.
      *
      * @param {string} event - 'Name of a request event.'
      * @param {function} listener - Callback to run when the event is triggered on the request.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    def on(event: String, listener: js.Function0[Unit]): Request[D, E] = js.native
    def on(event: String, listener: js.Function0[Unit], prepend: Boolean): Request[D, E] = js.native
    
    /**
      * Adds a listener that is triggered when a request emits the specified event.
      *
      * @param {string} event - 'Name of a request event.'
      * @param {function} listener - Callback to run when the event is triggered on the request.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    def onAsync(event: String, listener: js.Function0[Unit]): Request[D, E] = js.native
    def onAsync(event: String, listener: js.Function0[Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the request payload is being built.
      *
      * @param {string} event - build: triggered when the request payload is being built.
      * @param {function} listener - Callback to run when the request's payload is being built.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_build(event: build__, listener: js.Function1[/* request */ Request[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_build(event: build__, listener: js.Function1[/* request */ Request[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered whenever a request cycle completes.
      *
      * @param {string} event - complete: triggered whenever a request cycle completes.
      * @param {function} listener - Callback to run when the request cycle completes.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_complete(event: complete__, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_complete(event: complete__, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when an error occurs at any point during the request.
      *
      * @param {string} event - error: triggered when an error occurs at any point during the request.
      * @param {function} listener - Callback to run when the request errors at any point.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_error(event: error__, listener: js.Function2[/* err */ AWSError, /* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_error(
      event: error__,
      listener: js.Function2[/* err */ AWSError, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered in successful requests to allow listeners to de-serialize the response body into response.data.
      *
      * @param {string} event - extractData: triggered in successful requests to allow listeners to de-serialize the response body into response.data.
      * @param {function} listener - Callback to run when the request succeeded.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_extractData(event: extractData, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_extractData(event: extractData, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered on all non-2xx requests so that listeners can extract error details from the response body.
      *
      * @param {string} event - extractError: triggered on all non-2xx requests so that listeners can extract error details from the response body.
      * @param {function} listener - Callback to run when the request failed.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_extractError(event: extractError, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_extractError(event: extractError, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when data is sent by the remote server.
      *
      * @param {string} event - httpData: triggered when data is sent by the remote server.
      * @param {function} listener - Callback to run when data is sent by the remote server.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_httpData(
      event: httpData,
      listener: js.Function2[/* chunk */ Buffer | Uint8Array, /* response */ Response[D, E], Unit]
    ): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_httpData(
      event: httpData,
      listener: js.Function2[/* chunk */ Buffer | Uint8Array, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the server is finished sending data.
      *
      * @param {string} event - httpDone: triggered when the server is finished sending data.
      * @param {function} listener - Callback to run when the server is finished sending data.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_httpDone(event: httpDone, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_httpDone(event: httpDone, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the HTTP request has downloaded more data.
      *
      * @param {string} event - httpDownloadProgress: triggered when the HTTP request has downloaded more data.
      * @param {function} listener - Callback to run when the HTTP request has downloaded more data.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_httpDownloadProgress(
      event: httpDownloadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit]
    ): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_httpDownloadProgress(
      event: httpDownloadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the HTTP request failed.
      *
      * @param {string} event - httpError: triggered when the HTTP request failed.
      * @param {function} listener - Callback to run when the HTTP request failed.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_httpError(event: httpError, listener: js.Function2[/* err */ Error, /* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_httpError(
      event: httpError,
      listener: js.Function2[/* err */ Error, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when headers are sent by the remote server.
      *
      * @param {string} event - httpHeaders: triggered when headers are sent by the remote server.
      * @param {function} listener - Callback to run when the headers are sent by the remote server.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_httpHeaders(
      event: httpHeaders,
      listener: js.Function4[
          /* statusCode */ Double, 
          /* headers */ StringDictionary[String], 
          /* response */ Response[D, E], 
          /* statusMessage */ String, 
          Unit
        ]
    ): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_httpHeaders(
      event: httpHeaders,
      listener: js.Function4[
          /* statusCode */ Double, 
          /* headers */ StringDictionary[String], 
          /* response */ Response[D, E], 
          /* statusMessage */ String, 
          Unit
        ],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the HTTP request has uploaded more data.
      *
      * @param {string} event - httpUploadProgress: triggered when the HTTP request has uploaded more data.
      * @param {function} listener - Callback to run when the HTTP request has uploaded more data.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_httpUploadProgress(
      event: httpUploadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit]
    ): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_httpUploadProgress(
      event: httpUploadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request failed and might need to be retried or redirected.
      *
      * @param {string} event - retry: triggered when a request failed and might need to be retried or redirected.
      * @param {function} listener - Callback to run when the request failed and may be retried.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_retry(event: retry_, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_retry(event: retry_, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request is ready to be sent.
      *
      * @param {string} event - send: triggered when a request is ready to be sent.
      * @param {function} listener - Callback to run when the request is ready to be sent.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_send(event: send_, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_send(event: send_, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request is being signed.
      *
      * @param {string} event - sign: triggered when a request is being signed.
      * @param {function} listener - Callback to run when the request is being signed.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_sign(event: sign__, listener: js.Function1[/* request */ Request[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_sign(event: sign__, listener: js.Function1[/* request */ Request[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the request completed successfully.
      *
      * @param {string} event - success: triggered when the request completed successfully.
      * @param {function} listener - Callback to run when the request completed successfully.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_success(event: success__, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_success(event: success__, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request is being validated.
      *
      * @param {string} event - validate: triggered when a request is being validated.
      * @param {function} listener - Callback to run when the request is being validated.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("onAsync")
    def onAsync_validate(event: validate_, listener: js.Function1[/* request */ Request[D, E], Unit]): Request[D, E] = js.native
    @JSName("onAsync")
    def onAsync_validate(event: validate_, listener: js.Function1[/* request */ Request[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    
    /**
      * Adds a listener that is triggered when the request payload is being built.
      *
      * @param {string} event - build: triggered when the request payload is being built.
      * @param {function} listener - Callback to run when the request's payload is being built.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_build(event: build__, listener: js.Function1[/* request */ Request[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_build(event: build__, listener: js.Function1[/* request */ Request[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered whenever a request cycle completes.
      *
      * @param {string} event - complete: triggered whenever a request cycle completes.
      * @param {function} listener - Callback to run when the request cycle completes.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_complete(event: complete__, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_complete(event: complete__, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when an error occurs at any point during the request.
      *
      * @param {string} event - error: triggered when an error occurs at any point during the request.
      * @param {function} listener - Callback to run when the request errors at any point.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_error(event: error__, listener: js.Function2[/* err */ AWSError, /* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_error(
      event: error__,
      listener: js.Function2[/* err */ AWSError, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered in successful requests to allow listeners to de-serialize the response body into response.data.
      *
      * @param {string} event - extractData: triggered in successful requests to allow listeners to de-serialize the response body into response.data.
      * @param {function} listener - Callback to run when the request succeeded.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_extractData(event: extractData, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_extractData(event: extractData, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered on all non-2xx requests so that listeners can extract error details from the response body.
      *
      * @param {string} event - extractError: triggered on all non-2xx requests so that listeners can extract error details from the response body.
      * @param {function} listener - Callback to run when the request failed.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_extractError(event: extractError, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_extractError(event: extractError, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when data is sent by the remote server.
      *
      * @param {string} event - httpData: triggered when data is sent by the remote server.
      * @param {function} listener - Callback to run when data is sent by the remote server.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_httpData(
      event: httpData,
      listener: js.Function2[/* chunk */ Buffer | Uint8Array, /* response */ Response[D, E], Unit]
    ): Request[D, E] = js.native
    @JSName("on")
    def on_httpData(
      event: httpData,
      listener: js.Function2[/* chunk */ Buffer | Uint8Array, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the server is finished sending data.
      *
      * @param {string} event - httpDone: triggered when the server is finished sending data.
      * @param {function} listener - Callback to run when the server is finished sending data.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_httpDone(event: httpDone, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_httpDone(event: httpDone, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the HTTP request has downloaded more data.
      *
      * @param {string} event - httpDownloadProgress: triggered when the HTTP request has downloaded more data.
      * @param {function} listener - Callback to run when the HTTP request has downloaded more data.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_httpDownloadProgress(
      event: httpDownloadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit]
    ): Request[D, E] = js.native
    @JSName("on")
    def on_httpDownloadProgress(
      event: httpDownloadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the HTTP request failed.
      *
      * @param {string} event - httpError: triggered when the HTTP request failed.
      * @param {function} listener - Callback to run when the HTTP request failed.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_httpError(event: httpError, listener: js.Function2[/* err */ Error, /* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_httpError(
      event: httpError,
      listener: js.Function2[/* err */ Error, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when headers are sent by the remote server.
      *
      * @param {string} event - httpHeaders: triggered when headers are sent by the remote server.
      * @param {function} listener - Callback to run when the headers are sent by the remote server.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_httpHeaders(
      event: httpHeaders,
      listener: js.Function4[
          /* statusCode */ Double, 
          /* headers */ StringDictionary[String], 
          /* response */ Response[D, E], 
          /* statusMessage */ String, 
          Unit
        ]
    ): Request[D, E] = js.native
    @JSName("on")
    def on_httpHeaders(
      event: httpHeaders,
      listener: js.Function4[
          /* statusCode */ Double, 
          /* headers */ StringDictionary[String], 
          /* response */ Response[D, E], 
          /* statusMessage */ String, 
          Unit
        ],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the HTTP request has uploaded more data.
      *
      * @param {string} event - httpUploadProgress: triggered when the HTTP request has uploaded more data.
      * @param {function} listener - Callback to run when the HTTP request has uploaded more data.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_httpUploadProgress(
      event: httpUploadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit]
    ): Request[D, E] = js.native
    @JSName("on")
    def on_httpUploadProgress(
      event: httpUploadProgress,
      listener: js.Function2[/* progress */ Progress, /* response */ Response[D, E], Unit],
      prepend: Boolean
    ): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request failed and might need to be retried or redirected.
      *
      * @param {string} event - retry: triggered when a request failed and might need to be retried or redirected.
      * @param {function} listener - Callback to run when the request failed and may be retried.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_retry(event: retry_, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_retry(event: retry_, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request is ready to be sent.
      *
      * @param {string} event - send: triggered when a request is ready to be sent.
      * @param {function} listener - Callback to run when the request is ready to be sent.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_send(event: send_, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_send(event: send_, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request is being signed.
      *
      * @param {string} event - sign: triggered when a request is being signed.
      * @param {function} listener - Callback to run when the request is being signed.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_sign(event: sign__, listener: js.Function1[/* request */ Request[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_sign(event: sign__, listener: js.Function1[/* request */ Request[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when the request completed successfully.
      *
      * @param {string} event - success: triggered when the request completed successfully.
      * @param {function} listener - Callback to run when the request completed successfully.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_success(event: success__, listener: js.Function1[/* response */ Response[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_success(event: success__, listener: js.Function1[/* response */ Response[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    /**
      * Adds a listener that is triggered when a request is being validated.
      *
      * @param {string} event - validate: triggered when a request is being validated.
      * @param {function} listener - Callback to run when the request is being validated.
      * @param {boolean} prepend - If set, prepends listener instead of appending.
      */
    @JSName("on")
    def on_validate(event: validate_, listener: js.Function1[/* request */ Request[D, E], Unit]): Request[D, E] = js.native
    @JSName("on")
    def on_validate(event: validate_, listener: js.Function1[/* request */ Request[D, E], Unit], prepend: Boolean): Request[D, E] = js.native
    
    /**
      * Returns a 'thenable' promise.
      */
    def promise(): js.Promise[PromiseResult[D, E]] = js.native
    
    /**
      * Sends the request object.
      * If a callback is supplied, it is called when a response is returned from the service.
      */
    def send(): Unit = js.native
    def send(callback: js.Function2[/* err */ E, /* data */ D, Unit]): Unit = js.native
    
    /**
      * The time that the request started.
      */
    var startTime: Date = js.native
  }
  
  @js.native
  trait Progress extends StObject {
    
    var loaded: Double = js.native
    
    var total: Double = js.native
  }
  object Progress {
    
    @scala.inline
    def apply(loaded: Double, total: Double): Progress = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type PromiseResult[D, E] = D with (typings.awsSdk.anon.Response[D, E])
}
