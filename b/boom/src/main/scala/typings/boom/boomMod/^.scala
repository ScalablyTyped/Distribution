package typings.boom.boomMod

import org.scalablytyped.runtime.StringDictionary
import typings.boom.Anon_Message
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(message: String, options: Options[Data]) = this()
  def this(message: Error, options: Options[Data]) = this()
  /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
  /* CompleteClass */
  override var data: Data = js.native
  /** isBoom - if true, indicates this is a Boom object instance. */
  /* CompleteClass */
  override var isBoom: Boolean = js.native
  /** isServer - convenience bool indicating status code >= 500. */
  /* CompleteClass */
  override var isServer: Boolean = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
  /* CompleteClass */
  override var output: Output = js.native
  /** reformat() - rebuilds error.output using the other object properties. */
  /* CompleteClass */
  override def reformat(): String = js.native
  /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
  /* CompleteClass */
  override def typeof(): js.Any = js.native
}

@JSImport("boom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns a 422 Unprocessable Entity error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombaddatamessage-data}
    */
  def badData[Data](): Boom[Data] = js.native
  def badData[Data](message: String): Boom[Data] = js.native
  def badData[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 502 Bad Gateway error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadgatewaymessage-data}
    */
  def badGateway[Data](): Boom[Data] = js.native
  def badGateway[Data](message: String): Boom[Data] = js.native
  def badGateway[Data](message: String, data: Data): Boom[Data] = js.native
  // 5xx
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  def badImplementation[Data](): Boom[Data] = js.native
  def badImplementation[Data](message: String): Boom[Data] = js.native
  def badImplementation[Data](message: String, data: Data): Boom[Data] = js.native
  // 4xx
  /**
    * Returns a 400 Bad Request error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadrequestmessage-data}
    */
  def badRequest[Data](): Boom[Data] = js.native
  def badRequest[Data](message: String): Boom[Data] = js.native
  def badRequest[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Decorates an error with the boom properties
    * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
    * @param options optional additional options
    * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
    */
  def boomify(error: Error): Boom[Null] = js.native
  def boomify(error: Error, options: Anon_Message): Boom[Null] = js.native
  /**
    * Returns a 408 Request Time-out error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomclienttimeoutmessage-data}
    */
  def clientTimeout[Data](): Boom[Data] = js.native
  def clientTimeout[Data](message: String): Boom[Data] = js.native
  def clientTimeout[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 409 Conflict error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomconflictmessage-data}
    */
  def conflict[Data](): Boom[Data] = js.native
  def conflict[Data](message: String): Boom[Data] = js.native
  def conflict[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 413 Request Entity Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomentitytoolargemessage-data}
    */
  def entityTooLarge[Data](): Boom[Data] = js.native
  def entityTooLarge[Data](message: String): Boom[Data] = js.native
  def entityTooLarge[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 417 Expectation Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomexpectationfailedmessage-data}
    */
  def expectationFailed[Data](): Boom[Data] = js.native
  def expectationFailed[Data](message: String): Boom[Data] = js.native
  def expectationFailed[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 424 Failed Dependency error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomfaileddependencymessage-data}
    */
  def failedDependency[Data](): Boom[Data] = js.native
  def failedDependency[Data](message: String): Boom[Data] = js.native
  def failedDependency[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 403 Forbidden error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomforbiddenmessage-data}
    */
  def forbidden[Data](): Boom[Data] = js.native
  def forbidden[Data](message: String): Boom[Data] = js.native
  def forbidden[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 504 Gateway Time-out error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomgatewaytimeoutmessage-data}
    */
  def gatewayTimeout[Data](): Boom[Data] = js.native
  def gatewayTimeout[Data](message: String): Boom[Data] = js.native
  def gatewayTimeout[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 451 Unavailable For Legal Reasons error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomillegalmessage-data}
    */
  def illegal[Data](): Boom[Data] = js.native
  def illegal[Data](message: String): Boom[Data] = js.native
  def illegal[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  def internal[Data](): Boom[Data] = js.native
  def internal[Data](message: String): Boom[Data] = js.native
  def internal[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Identifies whether an error is a Boom object. Same as calling instanceof Boom.
    * @param error the error object to identify.
    */
  def isBoom(error: Error): /* is boom.boom.Boom<any> */ Boolean = js.native
  /**
    * Returns a 411 Length Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlengthrequiredmessage-data}
    */
  def lengthRequired[Data](): Boom[Data] = js.native
  def lengthRequired[Data](message: String): Boom[Data] = js.native
  def lengthRequired[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 423 Locked error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlockedmessage-data}
    */
  def locked[Data](): Boom[Data] = js.native
  def locked[Data](message: String): Boom[Data] = js.native
  def locked[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 405 Method Not Allowed error
    * @param message optional message.
    * @param data optional additional error data.
    * @param allow optional string or array of strings (to be combined and separated by ', ') which is set to the 'Allow' header.
    * @see {@link https://github.com/hapijs/boom#boommethodnotallowedmessage-data-allow}
    */
  def methodNotAllowed[Data](): Boom[Data] = js.native
  def methodNotAllowed[Data](message: String): Boom[Data] = js.native
  def methodNotAllowed[Data](message: String, data: Data): Boom[Data] = js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: String): Boom[Data] = js.native
  def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = js.native
  /**
    * Returns a 406 Not Acceptable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotacceptablemessage-data}
    */
  def notAcceptable[Data](): Boom[Data] = js.native
  def notAcceptable[Data](message: String): Boom[Data] = js.native
  def notAcceptable[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 404 Not Found error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotfoundmessage-data}
    */
  def notFound[Data](): Boom[Data] = js.native
  def notFound[Data](message: String): Boom[Data] = js.native
  def notFound[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 501 Not Implemented error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotimplementedmessage-data}
    */
  def notImplemented[Data](): Boom[Data] = js.native
  def notImplemented[Data](message: String): Boom[Data] = js.native
  def notImplemented[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 402 Payment Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompaymentrequiredmessage-data}
    */
  def paymentRequired[Data](): Boom[Data] = js.native
  def paymentRequired[Data](message: String): Boom[Data] = js.native
  def paymentRequired[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 412 Precondition Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionfailedmessage-data}
    */
  def preconditionFailed[Data](): Boom[Data] = js.native
  def preconditionFailed[Data](message: String): Boom[Data] = js.native
  def preconditionFailed[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 428 Precondition Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionrequiredmessage-data}
    */
  def preconditionRequired[Data](): Boom[Data] = js.native
  def preconditionRequired[Data](message: String): Boom[Data] = js.native
  def preconditionRequired[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 407 Proxy Authentication Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomproxyauthrequiredmessage-data}
    */
  def proxyAuthRequired[Data](): Boom[Data] = js.native
  def proxyAuthRequired[Data](message: String): Boom[Data] = js.native
  def proxyAuthRequired[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 416 Requested Range Not Satisfiable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomrangenotsatisfiablemessage-data}
    */
  def rangeNotSatisfiable[Data](): Boom[Data] = js.native
  def rangeNotSatisfiable[Data](message: String): Boom[Data] = js.native
  def rangeNotSatisfiable[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 410 Gone error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomresourcegonemessage-data}
    */
  def resourceGone[Data](): Boom[Data] = js.native
  def resourceGone[Data](message: String): Boom[Data] = js.native
  def resourceGone[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 503 Service Unavailable error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomserverunavailablemessage-data}
    */
  def serverUnavailable[Data](): Boom[Data] = js.native
  def serverUnavailable[Data](message: String): Boom[Data] = js.native
  def serverUnavailable[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 418 I'm a Teapot error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomteapotmessage-data}
    */
  def teapot[Data](): Boom[Data] = js.native
  def teapot[Data](message: String): Boom[Data] = js.native
  def teapot[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 429 Too Many Requests error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomtoomanyrequestsmessage-data}
    */
  def tooManyRequests[Data](): Boom[Data] = js.native
  def tooManyRequests[Data](message: String): Boom[Data] = js.native
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
  def unauthorized(): Boom[Null] = js.native
  def unauthorized(message: String): Boom[Null] = js.native
  def unauthorized(message: String, scheme: String): Boom[Null] = js.native
  def unauthorized(message: String, scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  def unauthorized(message: String, scheme: js.Array[String]): Boom[Null] = js.native
  def unauthorized(message: Null, scheme: String): Boom[Null] = js.native
  def unauthorized(message: Null, scheme: String, attributes: String): Boom[Null] = js.native
  def unauthorized(message: Null, scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  /**
    * Returns a 415 Unsupported Media Type error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomunsupportedmediatypemessage-data}
    */
  def unsupportedMediaType[Data](): Boom[Data] = js.native
  def unsupportedMediaType[Data](message: String): Boom[Data] = js.native
  def unsupportedMediaType[Data](message: String, data: Data): Boom[Data] = js.native
  /**
    * Returns a 414 Request-URI Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomuritoolongmessage-data}
    */
  def uriTooLong[Data](): Boom[Data] = js.native
  def uriTooLong[Data](message: String): Boom[Data] = js.native
  def uriTooLong[Data](message: String, data: Data): Boom[Data] = js.native
}

