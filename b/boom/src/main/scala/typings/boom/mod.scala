package typings.boom

import org.scalablytyped.runtime.StringDictionary
import typings.boom.anon.Message
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
    * @see {@link https://github.com/hapijs/boom#boom}
    */
  @JSImport("boom", JSImport.Namespace)
  @js.native
  /** Creates a new Boom object using the provided message and then calling boomify() to decorate the error with the Boom properties. */
  class ^[Data] () extends Boom[Data] {
    def this(message: String) = this()
    def this(message: Error) = this()
    def this(message: js.UndefOr[scala.Nothing], options: Options[Data]) = this()
    def this(message: String, options: Options[Data]) = this()
    def this(message: Error, options: Options[Data]) = this()
  }
  
  /**
    * Returns a 422 Unprocessable Entity error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombaddatamessage-data}
    */
  @JSImport("boom", "badData")
  @js.native
  def badData[Data](): Boom[Data] = js.native
  @JSImport("boom", "badData")
  @js.native
  def badData[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "badData")
  @js.native
  def badData[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "badData")
  @js.native
  def badData[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 502 Bad Gateway error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadgatewaymessage-data}
    */
  @JSImport("boom", "badGateway")
  @js.native
  def badGateway[Data](): Boom[Data] = js.native
  @JSImport("boom", "badGateway")
  @js.native
  def badGateway[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "badGateway")
  @js.native
  def badGateway[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "badGateway")
  @js.native
  def badGateway[Data](message: String, data: Data): Boom[Data] = js.native
  
  // 5xx
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  @JSImport("boom", "badImplementation")
  @js.native
  def badImplementation[Data](): Boom[Data] = js.native
  @JSImport("boom", "badImplementation")
  @js.native
  def badImplementation[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "badImplementation")
  @js.native
  def badImplementation[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "badImplementation")
  @js.native
  def badImplementation[Data](message: String, data: Data): Boom[Data] = js.native
  
  // 4xx
  /**
    * Returns a 400 Bad Request error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadrequestmessage-data}
    */
  @JSImport("boom", "badRequest")
  @js.native
  def badRequest[Data](): Boom[Data] = js.native
  @JSImport("boom", "badRequest")
  @js.native
  def badRequest[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "badRequest")
  @js.native
  def badRequest[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "badRequest")
  @js.native
  def badRequest[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Decorates an error with the boom properties
    * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
    * @param options optional additional options
    * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
    */
  @JSImport("boom", "boomify")
  @js.native
  def boomify(error: Error): Boom[Null] = js.native
  @JSImport("boom", "boomify")
  @js.native
  def boomify(error: Error, options: Message): Boom[Null] = js.native
  
  /**
    * Returns a 408 Request Time-out error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomclienttimeoutmessage-data}
    */
  @JSImport("boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](): Boom[Data] = js.native
  @JSImport("boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "clientTimeout")
  @js.native
  def clientTimeout[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 409 Conflict error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomconflictmessage-data}
    */
  @JSImport("boom", "conflict")
  @js.native
  def conflict[Data](): Boom[Data] = js.native
  @JSImport("boom", "conflict")
  @js.native
  def conflict[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "conflict")
  @js.native
  def conflict[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "conflict")
  @js.native
  def conflict[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 413 Request Entity Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomentitytoolargemessage-data}
    */
  @JSImport("boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](): Boom[Data] = js.native
  @JSImport("boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "entityTooLarge")
  @js.native
  def entityTooLarge[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 417 Expectation Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomexpectationfailedmessage-data}
    */
  @JSImport("boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](): Boom[Data] = js.native
  @JSImport("boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "expectationFailed")
  @js.native
  def expectationFailed[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 424 Failed Dependency error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomfaileddependencymessage-data}
    */
  @JSImport("boom", "failedDependency")
  @js.native
  def failedDependency[Data](): Boom[Data] = js.native
  @JSImport("boom", "failedDependency")
  @js.native
  def failedDependency[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "failedDependency")
  @js.native
  def failedDependency[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "failedDependency")
  @js.native
  def failedDependency[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 403 Forbidden error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomforbiddenmessage-data}
    */
  @JSImport("boom", "forbidden")
  @js.native
  def forbidden[Data](): Boom[Data] = js.native
  @JSImport("boom", "forbidden")
  @js.native
  def forbidden[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "forbidden")
  @js.native
  def forbidden[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "forbidden")
  @js.native
  def forbidden[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 504 Gateway Time-out error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomgatewaytimeoutmessage-data}
    */
  @JSImport("boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](): Boom[Data] = js.native
  @JSImport("boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "gatewayTimeout")
  @js.native
  def gatewayTimeout[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 451 Unavailable For Legal Reasons error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomillegalmessage-data}
    */
  @JSImport("boom", "illegal")
  @js.native
  def illegal[Data](): Boom[Data] = js.native
  @JSImport("boom", "illegal")
  @js.native
  def illegal[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "illegal")
  @js.native
  def illegal[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "illegal")
  @js.native
  def illegal[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  @JSImport("boom", "internal")
  @js.native
  def internal[Data](): Boom[Data] = js.native
  @JSImport("boom", "internal")
  @js.native
  def internal[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "internal")
  @js.native
  def internal[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "internal")
  @js.native
  def internal[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Identifies whether an error is a Boom object. Same as calling instanceof Boom.
    * @param error the error object to identify.
    */
  @JSImport("boom", "isBoom")
  @js.native
  def isBoom(error: Error): /* is boom.boom.Boom<any> */ Boolean = js.native
  
  /**
    * Returns a 411 Length Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlengthrequiredmessage-data}
    */
  @JSImport("boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](): Boom[Data] = js.native
  @JSImport("boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "lengthRequired")
  @js.native
  def lengthRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 423 Locked error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlockedmessage-data}
    */
  @JSImport("boom", "locked")
  @js.native
  def locked[Data](): Boom[Data] = js.native
  @JSImport("boom", "locked")
  @js.native
  def locked[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "locked")
  @js.native
  def locked[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "locked")
  @js.native
  def locked[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 405 Method Not Allowed error
    * @param message optional message.
    * @param data optional additional error data.
    * @param allow optional string or array of strings (to be combined and separated by ', ') which is set to the 'Allow' header.
    * @see {@link https://github.com/hapijs/boom#boommethodnotallowedmessage-data-allow}
    */
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: String): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: Data, allow: js.Array[String]): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: Data): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: String): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: js.UndefOr[scala.Nothing], allow: String): Boom[Data] = js.native
  @JSImport("boom", "methodNotAllowed")
  @js.native
  def methodNotAllowed[Data](message: String, data: js.UndefOr[scala.Nothing], allow: js.Array[String]): Boom[Data] = js.native
  
  /**
    * Returns a 406 Not Acceptable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotacceptablemessage-data}
    */
  @JSImport("boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](): Boom[Data] = js.native
  @JSImport("boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "notAcceptable")
  @js.native
  def notAcceptable[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 404 Not Found error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotfoundmessage-data}
    */
  @JSImport("boom", "notFound")
  @js.native
  def notFound[Data](): Boom[Data] = js.native
  @JSImport("boom", "notFound")
  @js.native
  def notFound[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "notFound")
  @js.native
  def notFound[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "notFound")
  @js.native
  def notFound[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 501 Not Implemented error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotimplementedmessage-data}
    */
  @JSImport("boom", "notImplemented")
  @js.native
  def notImplemented[Data](): Boom[Data] = js.native
  @JSImport("boom", "notImplemented")
  @js.native
  def notImplemented[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "notImplemented")
  @js.native
  def notImplemented[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "notImplemented")
  @js.native
  def notImplemented[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 402 Payment Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompaymentrequiredmessage-data}
    */
  @JSImport("boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](): Boom[Data] = js.native
  @JSImport("boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "paymentRequired")
  @js.native
  def paymentRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 412 Precondition Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionfailedmessage-data}
    */
  @JSImport("boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](): Boom[Data] = js.native
  @JSImport("boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "preconditionFailed")
  @js.native
  def preconditionFailed[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 428 Precondition Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionrequiredmessage-data}
    */
  @JSImport("boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](): Boom[Data] = js.native
  @JSImport("boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "preconditionRequired")
  @js.native
  def preconditionRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 407 Proxy Authentication Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomproxyauthrequiredmessage-data}
    */
  @JSImport("boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](): Boom[Data] = js.native
  @JSImport("boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "proxyAuthRequired")
  @js.native
  def proxyAuthRequired[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 416 Requested Range Not Satisfiable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomrangenotsatisfiablemessage-data}
    */
  @JSImport("boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](): Boom[Data] = js.native
  @JSImport("boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "rangeNotSatisfiable")
  @js.native
  def rangeNotSatisfiable[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 410 Gone error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomresourcegonemessage-data}
    */
  @JSImport("boom", "resourceGone")
  @js.native
  def resourceGone[Data](): Boom[Data] = js.native
  @JSImport("boom", "resourceGone")
  @js.native
  def resourceGone[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "resourceGone")
  @js.native
  def resourceGone[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "resourceGone")
  @js.native
  def resourceGone[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 503 Service Unavailable error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomserverunavailablemessage-data}
    */
  @JSImport("boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](): Boom[Data] = js.native
  @JSImport("boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "serverUnavailable")
  @js.native
  def serverUnavailable[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 418 I'm a Teapot error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomteapotmessage-data}
    */
  @JSImport("boom", "teapot")
  @js.native
  def teapot[Data](): Boom[Data] = js.native
  @JSImport("boom", "teapot")
  @js.native
  def teapot[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "teapot")
  @js.native
  def teapot[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "teapot")
  @js.native
  def teapot[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 429 Too Many Requests error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomtoomanyrequestsmessage-data}
    */
  @JSImport("boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](): Boom[Data] = js.native
  @JSImport("boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "tooManyRequests")
  @js.native
  def tooManyRequests[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 401 Unauthorized error
    * @param message optional message.
    * @param scheme can be one of the following:
    *      * an authentication scheme name
    *      * an array of string values. These values will be separated by ', ' and set to the 'WWW-Authenticate' header.
    * @param attributes an object of values to use while setting the 'WWW-Authenticate' header.
    * This value is only used when scheme is a string, otherwise it is ignored.
    * Every key/value pair will be included in the 'WWW-Authenticate' in the format of
    * 'key="value"' as well as in the response payload under the attributes key.
    * Alternatively value can be a string which is use to set the value of the scheme,
    * for example setting the token value for negotiate header.
    * If string is used message parameter must be null.
    * null and undefined will be replaced with an empty string. If attributes is set,
    * message will be used as the 'error' segment of the 'WWW-Authenticate' header.
    * If message is unset, the 'error' segment of the header will not be present and isMissing will be true on the error object.
    * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
    */
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], scheme: js.UndefOr[scala.Nothing], attributes: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(
    message: js.UndefOr[scala.Nothing],
    scheme: js.UndefOr[scala.Nothing],
    attributes: StringDictionary[String]
  ): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], scheme: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], scheme: String, attributes: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: js.UndefOr[scala.Nothing], scheme: js.Array[String]): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: String, scheme: js.UndefOr[scala.Nothing], attributes: StringDictionary[String]): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: String, scheme: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: String, scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: String, scheme: js.Array[String]): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: Null, scheme: js.UndefOr[scala.Nothing], attributes: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: Null, scheme: js.UndefOr[scala.Nothing], attributes: StringDictionary[String]): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: Null, scheme: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: Null, scheme: String, attributes: String): Boom[Null] = js.native
  @JSImport("boom", "unauthorized")
  @js.native
  def unauthorized(message: Null, scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  
  /**
    * Returns a 415 Unsupported Media Type error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomunsupportedmediatypemessage-data}
    */
  @JSImport("boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](): Boom[Data] = js.native
  @JSImport("boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "unsupportedMediaType")
  @js.native
  def unsupportedMediaType[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * Returns a 414 Request-URI Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomuritoolongmessage-data}
    */
  @JSImport("boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](): Boom[Data] = js.native
  @JSImport("boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  @JSImport("boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](message: String): Boom[Data] = js.native
  @JSImport("boom", "uriTooLong")
  @js.native
  def uriTooLong[Data](message: String, data: Data): Boom[Data] = js.native
  
  /**
    * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
    * @see {@link https://github.com/hapijs/boom#boom}
    */
  @js.native
  trait Boom[Data] extends Error {
    
    /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
    var data: Data = js.native
    
    /** isBoom - if true, indicates this is a Boom object instance. */
    var isBoom: Boolean = js.native
    
    /**
      * "If message is unset, the 'error' segment of the header will not be present and
      * isMissing will be true on the error object." mentioned in
      * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
      */
    var isMissing: js.UndefOr[Boolean] = js.native
    
    /** isServer - convenience bool indicating status code >= 500. */
    var isServer: Boolean = js.native
    
    /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
    var output: Output = js.native
    
    /** reformat() - rebuilds error.output using the other object properties. */
    def reformat(): String = js.native
    
    /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
    def typeof(): js.Any = js.native
  }
  object Boom {
    
    @scala.inline
    def apply[Data](
      data: Data,
      isBoom: Boolean,
      isServer: Boolean,
      message: String,
      name: String,
      output: Output,
      reformat: () => String,
      typeof: () => js.Any
    ): Boom[Data] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isBoom = isBoom.asInstanceOf[js.Any], isServer = isServer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reformat = js.Any.fromFunction0(reformat), typeof = js.Any.fromFunction0(typeof))
      __obj.asInstanceOf[Boom[Data]]
    }
    
    @scala.inline
    implicit class BoomMutableBuilder[Self <: Boom[_], Data] (val x: Self with Boom[Data]) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBoom(value: Boolean): Self = StObject.set(x, "isBoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMissing(value: Boolean): Self = StObject.set(x, "isMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMissingUndefined: Self = StObject.set(x, "isMissing", js.undefined)
      
      @scala.inline
      def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReformat(value: () => String): Self = StObject.set(x, "reformat", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeof(value: () => js.Any): Self = StObject.set(x, "typeof", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options[Data] extends StObject {
    
    /** ctor - constructor reference used to crop the exception call stack output. */
    var ctor: js.UndefOr[js.Any] = js.native
    
    /** data - additional error information (assigned to error.data). */
    var data: js.UndefOr[Data] = js.native
    
    /** decorate - an option with extra properties to set on the error object. */
    var decorate: js.UndefOr[js.Object] = js.native
    
    /** message - error message string. If the error already has a message, the provided message is added as a prefix. Defaults to no message. */
    var message: js.UndefOr[String] = js.native
    
    /**
      * override - if false, the err provided is a Boom object, and a statusCode or message are
      * provided, the values are ignored. Defaults to true (apply the provided statusCode and
      * message options to the error regardless of its type, Error or Boom object).
      */
    var `override`: js.UndefOr[Boolean] = js.native
    
    /** statusCode - the HTTP status code. Defaults to 500 if no status code is already set. */
    var statusCode: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[Data](): Options[Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Data]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], Data] (val x: Self with Options[Data]) extends AnyVal {
      
      @scala.inline
      def setCtor(value: js.Any): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecorate(value: js.Object): Self = StObject.set(x, "decorate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait Output extends StObject {
    
    /**
      * headers - an object containing any HTTP headers where each key is a header name and
      * value is the header content. (Limited value type to string
      * https://github.com/hapijs/boom/issues/151 )
      */
    var headers: StringDictionary[String] = js.native
    
    /**
      * payload - the formatted object used as the response payload (stringified).
      * Can be directly manipulated but any changes will be lost if reformat() is called.
      * Any content allowed and by default includes the following content:
      */
    var payload: Payload = js.native
    
    /** statusCode - the HTTP status code (typically 4xx or 5xx). */
    var statusCode: Double = js.native
  }
  object Output {
    
    @scala.inline
    def apply(headers: StringDictionary[String], payload: Payload, statusCode: Double): Output = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    /**
      * "Every key/value pair will be included ... in the response payload under the attributes key."
      * [see docs](https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes)
      */
    var attributes: js.UndefOr[js.Any] = js.native
    
    /** error - the HTTP status message (e.g. 'Bad Request', 'Internal Server Error') derived from statusCode. */
    var error: String = js.native
    
    /** message - the error message derived from error.message. */
    var message: String = js.native
    
    /** statusCode - the HTTP status code, derived from error.output.statusCode. */
    var statusCode: Double = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(error: String, message: String, statusCode: Double): Payload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
