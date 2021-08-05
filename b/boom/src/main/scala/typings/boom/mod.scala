package typings.boom

import org.scalablytyped.runtime.StringDictionary
import typings.boom.anon.Message
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
    * @see {@link https://github.com/hapijs/boom#boom}
    */
  @JSImport("boom", JSImport.Namespace)
  @js.native
  /** Creates a new Boom object using the provided message and then calling boomify() to decorate the error with the Boom properties. */
  class ^[Data] ()
    extends StObject
       with Boom[Data] {
    def this(message: String) = this()
    def this(message: Error) = this()
    def this(message: String, options: Options[Data]) = this()
    def this(message: Unit, options: Options[Data]) = this()
    def this(message: Error, options: Options[Data]) = this()
    
    /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
    /* CompleteClass */
    var data: Data = js.native
    
    /** isBoom - if true, indicates this is a Boom object instance. */
    /* CompleteClass */
    var isBoom: Boolean = js.native
    
    /** isServer - convenience bool indicating status code >= 500. */
    /* CompleteClass */
    var isServer: Boolean = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
    /* CompleteClass */
    var output: Output = js.native
    
    /** reformat() - rebuilds error.output using the other object properties. */
    /* CompleteClass */
    override def reformat(): String = js.native
    
    /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
    /* CompleteClass */
    override def typeof(): js.Any = js.native
  }
  @JSImport("boom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a 422 Unprocessable Entity error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombaddatamessage-data}
    */
  inline def badData[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badData")().asInstanceOf[Boom[Data]]
  inline def badData[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badData")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badData[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badData[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badData")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 502 Bad Gateway error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadgatewaymessage-data}
    */
  inline def badGateway[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")().asInstanceOf[Boom[Data]]
  inline def badGateway[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badGateway[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badGateway")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  // 5xx
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  inline def badImplementation[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")().asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badImplementation[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badImplementation")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  // 4xx
  /**
    * Returns a 400 Bad Request error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadrequestmessage-data}
    */
  inline def badRequest[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")().asInstanceOf[Boom[Data]]
  inline def badRequest[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def badRequest[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("badRequest")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Decorates an error with the boom properties
    * @param error the error object to wrap. If error is already a boom object, it defaults to overriding the object with the new status code and message.
    * @param options optional additional options
    * @see {@link https://github.com/hapijs/boom#boomifyerror-options}
    */
  inline def boomify(error: Error): Boom[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("boomify")(error.asInstanceOf[js.Any]).asInstanceOf[Boom[Null]]
  inline def boomify(error: Error, options: Message): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("boomify")(error.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  
  /**
    * Returns a 408 Request Time-out error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomclienttimeoutmessage-data}
    */
  inline def clientTimeout[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")().asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def clientTimeout[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("clientTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 409 Conflict error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomconflictmessage-data}
    */
  inline def conflict[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")().asInstanceOf[Boom[Data]]
  inline def conflict[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def conflict[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def conflict[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("conflict")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 413 Request Entity Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomentitytoolargemessage-data}
    */
  inline def entityTooLarge[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")().asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def entityTooLarge[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("entityTooLarge")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 417 Expectation Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomexpectationfailedmessage-data}
    */
  inline def expectationFailed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")().asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def expectationFailed[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("expectationFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 424 Failed Dependency error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomfaileddependencymessage-data}
    */
  inline def failedDependency[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")().asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def failedDependency[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("failedDependency")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 403 Forbidden error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomforbiddenmessage-data}
    */
  inline def forbidden[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")().asInstanceOf[Boom[Data]]
  inline def forbidden[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def forbidden[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidden")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 504 Gateway Time-out error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomgatewaytimeoutmessage-data}
    */
  inline def gatewayTimeout[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")().asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def gatewayTimeout[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("gatewayTimeout")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 451 Unavailable For Legal Reasons error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomillegalmessage-data}
    */
  inline def illegal[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")().asInstanceOf[Boom[Data]]
  inline def illegal[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def illegal[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def illegal[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("illegal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  inline def internal[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")().asInstanceOf[Boom[Data]]
  inline def internal[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def internal[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("internal")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Identifies whether an error is a Boom object. Same as calling instanceof Boom.
    * @param error the error object to identify.
    */
  inline def isBoom(error: Error): /* is boom.boom.Boom<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoom")(error.asInstanceOf[js.Any]).asInstanceOf[/* is boom.boom.Boom<any> */ Boolean]
  
  /**
    * Returns a 411 Length Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlengthrequiredmessage-data}
    */
  inline def lengthRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")().asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def lengthRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("lengthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 423 Locked error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomlockedmessage-data}
    */
  inline def locked[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")().asInstanceOf[Boom[Data]]
  inline def locked[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("locked")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def locked[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def locked[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("locked")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 405 Method Not Allowed error
    * @param message optional message.
    * @param data optional additional error data.
    * @param allow optional string or array of strings (to be combined and separated by ', ') which is set to the 'Allow' header.
    * @see {@link https://github.com/hapijs/boom#boommethodnotallowedmessage-data-allow}
    */
  inline def methodNotAllowed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")().asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: String, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Data, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Data, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Unit, allow: String): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def methodNotAllowed[Data](message: Unit, data: Unit, allow: js.Array[String]): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodNotAllowed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any], allow.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 406 Not Acceptable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotacceptablemessage-data}
    */
  inline def notAcceptable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")().asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notAcceptable[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notAcceptable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 404 Not Found error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotfoundmessage-data}
    */
  inline def notFound[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")().asInstanceOf[Boom[Data]]
  inline def notFound[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notFound[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notFound[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notFound")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 501 Not Implemented error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomnotimplementedmessage-data}
    */
  inline def notImplemented[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")().asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def notImplemented[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 402 Payment Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompaymentrequiredmessage-data}
    */
  inline def paymentRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")().asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def paymentRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("paymentRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 412 Precondition Failed error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionfailedmessage-data}
    */
  inline def preconditionFailed[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")().asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionFailed[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionFailed")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 428 Precondition Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boompreconditionrequiredmessage-data}
    */
  inline def preconditionRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")().asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def preconditionRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("preconditionRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 407 Proxy Authentication Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomproxyauthrequiredmessage-data}
    */
  inline def proxyAuthRequired[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")().asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def proxyAuthRequired[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyAuthRequired")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 416 Requested Range Not Satisfiable error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomrangenotsatisfiablemessage-data}
    */
  inline def rangeNotSatisfiable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")().asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def rangeNotSatisfiable[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeNotSatisfiable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 410 Gone error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomresourcegonemessage-data}
    */
  inline def resourceGone[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")().asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def resourceGone[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("resourceGone")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 503 Service Unavailable error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomserverunavailablemessage-data}
    */
  inline def serverUnavailable[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")().asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def serverUnavailable[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("serverUnavailable")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 418 I'm a Teapot error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomteapotmessage-data}
    */
  inline def teapot[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")().asInstanceOf[Boom[Data]]
  inline def teapot[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def teapot[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def teapot[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("teapot")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 429 Too Many Requests error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomtoomanyrequestsmessage-data}
    */
  inline def tooManyRequests[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")().asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def tooManyRequests[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("tooManyRequests")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
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
  inline def unauthorized(): Boom[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")().asInstanceOf[Boom[Null]]
  inline def unauthorized(message: String): Boom[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: String, scheme: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: String, scheme: String, attributes: StringDictionary[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: String, scheme: js.Array[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: String, scheme: Unit, attributes: StringDictionary[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Null, scheme: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Null, scheme: String, attributes: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Null, scheme: String, attributes: StringDictionary[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Null, scheme: Unit, attributes: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Null, scheme: Unit, attributes: StringDictionary[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Unit, scheme: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Unit, scheme: String, attributes: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Unit, scheme: String, attributes: StringDictionary[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Unit, scheme: js.Array[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Unit, scheme: Unit, attributes: String): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  inline def unauthorized(message: Unit, scheme: Unit, attributes: StringDictionary[String]): Boom[Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("unauthorized")(message.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boom[Null]]
  
  /**
    * Returns a 415 Unsupported Media Type error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomunsupportedmediatypemessage-data}
    */
  inline def unsupportedMediaType[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")().asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def unsupportedMediaType[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsupportedMediaType")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * Returns a 414 Request-URI Too Large error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomuritoolongmessage-data}
    */
  inline def uriTooLong[Data](): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")().asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](message: String): Boom[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(message.asInstanceOf[js.Any]).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](message: String, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  inline def uriTooLong[Data](message: Unit, data: Data): Boom[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("uriTooLong")(message.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boom[Data]]
  
  /**
    * boom provides a set of utilities for returning HTTP errors. Each utility returns a Boom error response object (instance of Error) which includes the following properties:
    * @see {@link https://github.com/hapijs/boom#boom}
    */
  trait Boom[Data]
    extends StObject
       with Error {
    
    /** https://github.com/hapijs/boom#createstatuscode-message-data and https://github.com/hapijs/boom/blob/v4.3.0/lib/index.js#L99 */
    var data: Data
    
    /** isBoom - if true, indicates this is a Boom object instance. */
    var isBoom: Boolean
    
    /**
      * "If message is unset, the 'error' segment of the header will not be present and
      * isMissing will be true on the error object." mentioned in
      * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
      */
    var isMissing: js.UndefOr[Boolean] = js.undefined
    
    /** isServer - convenience bool indicating status code >= 500. */
    var isServer: Boolean
    
    /** output - the formatted response. Can be directly manipulated after object construction to return a custom error response. Allowed root keys: */
    var output: Output
    
    /** reformat() - rebuilds error.output using the other object properties. */
    def reformat(): String
    
    /** typeof - the constructor used to create the error (e.g. Boom.badRequest). */
    def typeof(): js.Any
  }
  object Boom {
    
    inline def apply[Data](
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
    
    extension [Self <: Boom[?], Data](x: Self & Boom[Data]) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsBoom(value: Boolean): Self = StObject.set(x, "isBoom", value.asInstanceOf[js.Any])
      
      inline def setIsMissing(value: Boolean): Self = StObject.set(x, "isMissing", value.asInstanceOf[js.Any])
      
      inline def setIsMissingUndefined: Self = StObject.set(x, "isMissing", js.undefined)
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setReformat(value: () => String): Self = StObject.set(x, "reformat", js.Any.fromFunction0(value))
      
      inline def setTypeof(value: () => js.Any): Self = StObject.set(x, "typeof", js.Any.fromFunction0(value))
    }
  }
  
  trait Options[Data] extends StObject {
    
    /** ctor - constructor reference used to crop the exception call stack output. */
    var ctor: js.UndefOr[js.Any] = js.undefined
    
    /** data - additional error information (assigned to error.data). */
    var data: js.UndefOr[Data] = js.undefined
    
    /** decorate - an option with extra properties to set on the error object. */
    var decorate: js.UndefOr[js.Object] = js.undefined
    
    /** message - error message string. If the error already has a message, the provided message is added as a prefix. Defaults to no message. */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * override - if false, the err provided is a Boom object, and a statusCode or message are
      * provided, the values are ignored. Defaults to true (apply the provided statusCode and
      * message options to the error regardless of its type, Error or Boom object).
      */
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    /** statusCode - the HTTP status code. Defaults to 500 if no status code is already set. */
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[Data](): Options[Data] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Data]]
    }
    
    extension [Self <: Options[?], Data](x: Self & Options[Data]) {
      
      inline def setCtor(value: js.Any): Self = StObject.set(x, "ctor", value.asInstanceOf[js.Any])
      
      inline def setCtorUndefined: Self = StObject.set(x, "ctor", js.undefined)
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDecorate(value: js.Object): Self = StObject.set(x, "decorate", value.asInstanceOf[js.Any])
      
      inline def setDecorateUndefined: Self = StObject.set(x, "decorate", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait Output extends StObject {
    
    /**
      * headers - an object containing any HTTP headers where each key is a header name and
      * value is the header content. (Limited value type to string
      * https://github.com/hapijs/boom/issues/151 )
      */
    var headers: StringDictionary[String]
    
    /**
      * payload - the formatted object used as the response payload (stringified).
      * Can be directly manipulated but any changes will be lost if reformat() is called.
      * Any content allowed and by default includes the following content:
      */
    var payload: Payload
    
    /** statusCode - the HTTP status code (typically 4xx or 5xx). */
    var statusCode: Double
  }
  object Output {
    
    inline def apply(headers: StringDictionary[String], payload: Payload, statusCode: Double): Output = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    /**
      * "Every key/value pair will be included ... in the response payload under the attributes key."
      * [see docs](https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes)
      */
    var attributes: js.UndefOr[js.Any] = js.undefined
    
    /** error - the HTTP status message (e.g. 'Bad Request', 'Internal Server Error') derived from statusCode. */
    var error: String
    
    /** message - the error message derived from error.message. */
    var message: String
    
    /** statusCode - the HTTP status code, derived from error.output.statusCode. */
    var statusCode: Double
  }
  object Payload {
    
    inline def apply(error: String, message: String, statusCode: Double): Payload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
