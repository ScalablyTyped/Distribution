package typings.commonErrors

import org.scalablytyped.runtime.Instantiable1
import typings.commonErrors.anon.Args
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("common-errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "AlreadyInUseError")
  @js.native
  open class AlreadyInUseError protected () extends StObject {
    /**
      * @param entityName the entity that owns the protected resource
      * @param args       the fields or attributes that are already in use
      */
    def this(entityName: String, args: String*) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "ArgumentError")
  @js.native
  open class ArgumentError protected () extends StObject {
    /**
      * @param argumentName the name of the argument that has a problem
      * @param inner_error  the Error instance that caused the current error.
      *                     Stack trace will be appended.
      */
    def this(argumentName: String) = this()
    def this(argumentName: String, inner_error: Error) = this()
  }
  
  @JSImport("common-errors", "ArgumentNullError")
  @js.native
  open class ArgumentNullError protected () extends ArgumentError {
    /**
      * @param argumentName the name of the argument that is null
      * @param inner_error  the Error instance that caused the current error.
      *                     Stack trace will be appended.
      */
    def this(argumentName: String) = this()
    def this(argumentName: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "AuthenticationRequiredError")
  @js.native
  open class AuthenticationRequiredError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "ConnectionError")
  @js.native
  open class ConnectionError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "Error")
  @js.native
  open class Error protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(entityName: String) = this()
    def this(entityName: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "HttpStatusError")
  @js.native
  open class HttpStatusError protected () extends StObject {
    /**
      * @param err any instanceof Error
      * @param req the request object
      */
    def this(err: Error) = this()
    /**
      * Figure out a proper status code and message from a given error. To
      * change the mappings, modify HttpStatusError.message_map and
      * HttpStatusError.code_map
      *
      * @param status_code any HTTP status code integer
      * @param message     any message
      */
    def this(status_code: Double) = this()
    def this(
      err: Error,
      req: Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
    ) = this()
    def this(status_code: Double, message: String) = this()
    
    /**
      * Status code for this error.
      */
    var statusCode: Double = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "InvalidOperationError")
  @js.native
  open class InvalidOperationError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "NotFoundError")
  @js.native
  open class NotFoundError protected () extends StObject {
    /**
      * @param entity_name a description for what was not found
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(entity_name: String) = this()
    def this(entity_name: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "NotImplementedError")
  @js.native
  open class NotImplementedError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "NotPermittedError")
  @js.native
  open class NotPermittedError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "NotSupportedError")
  @js.native
  open class NotSupportedError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "OutOfMemoryError")
  @js.native
  open class OutOfMemoryError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.RangeError * / any */ @JSImport("common-errors", "RangeError")
  @js.native
  open class RangeError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.ReferenceError * / any */ @JSImport("common-errors", "ReferenceError")
  @js.native
  open class ReferenceError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "SocketError")
  @js.native
  open class SocketError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "StackOverflowError")
  @js.native
  open class StackOverflowError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.SyntaxError * / any */ @JSImport("common-errors", "SyntaxError")
  @js.native
  open class SyntaxError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "TimeoutError")
  @js.native
  open class TimeoutError protected () extends StObject {
    /**
      * @param time        a time duration
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(time: String) = this()
    def this(time: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.TypeError * / any */ @JSImport("common-errors", "TypeError")
  @js.native
  open class TypeError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.URIError * / any */ @JSImport("common-errors", "URIError")
  @js.native
  open class URIError protected () extends StObject {
    /**
      * @param message     any message
      * @param inner_error the Error instance that caused the current error.
      *                    Stack trace will be appended.
      */
    def this(message: String) = this()
    def this(message: String, inner_error: Error) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "ValidationError")
  @js.native
  open class ValidationError protected () extends StObject {
    /**
      * @param message any message
      * @param code    an optional error code
      * @param field   an optional description of the data
      */
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: String, field: String) = this()
    def this(message: String, code: Unit, field: String) = this()
    
    /**
      * add an error object to the errors array
      */
    def addError(error: Error): this.type = js.native
    
    /**
      * append an array of error objects to the errors array
      */
    def addErrors(errors: js.Array[Error]): this.type = js.native
  }
  
  object data {
    
    /**
      * Applicable when an error occurs on or with an external data source.
      *
      * @example throw new errors.data.DataError('Too many rows returned from database', err)
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "data.DataError")
    @js.native
    open class DataError protected () extends StObject {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when an error occurs while using memcached.
      *
      * @example throw new errors.data.MemcachedError('Expected value not found', err)
      */
    @JSImport("common-errors", "data.MemcachedError")
    @js.native
    open class MemcachedError protected () extends DataError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when an error occurs while using MongoDB.
      *
      * @example throw new errors.data.MongoDBError('Retrieved value not in expected format', err)
      */
    @JSImport("common-errors", "data.MongoDBError")
    @js.native
    open class MongoDBError protected () extends DataError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when an error occurs while using redis.
      *
      * @example throw new errors.data.RedisError('expected value not found in redis', err)
      */
    @JSImport("common-errors", "data.RedisError")
    @js.native
    open class RedisError protected () extends DataError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when a transaction was unexpectedly rolled back.
      *
      * @example throw new errors.data.RollbackError('database transaction was unexpectedly rolled back', err)
      */
    @JSImport("common-errors", "data.RollbackError")
    @js.native
    open class RollbackError protected () extends DataError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when an error occurs while using a SQL database.
      *
      * @example throw new errors.data.SQLError('foreign key constraint violated', err)
      */
    @JSImport("common-errors", "data.SQLError")
    @js.native
    open class SQLError protected () extends DataError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when an error unexpectedly interrupts a transaction.
      *
      * @example throw new errors.data.TransactionError('transaction already complete', err)
      */
    @JSImport("common-errors", "data.TransactionError")
    @js.native
    open class TransactionError protected () extends DataError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
  }
  
  object helpers {
    
    @JSImport("common-errors", "helpers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Simple interface for generating a new Error class type.
      * @param name The full name of the new Error class
      * @param options.extends         The base class for the new Error
      *                                class. Default is Error.
      * @param options.globalize       Boolean (default true) to store the
      *                                Error in global space so that the
      *                                Error is equivalent to others included
      *                                from other versions of the module.
      * @param options.args            Array of names of values to accept and
      *                                store from the class constructor.
      *                                Default is ['message', 'inner_error'].
      * @param options.generateMessage A function for defining a custom error
      *                                message.
      */
    inline def generateClass(name: String): ErrorConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("generateClass")(name.asInstanceOf[js.Any]).asInstanceOf[ErrorConstructor]
    inline def generateClass(name: String, options: Args): ErrorConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("generateClass")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ErrorConstructor]
  }
  
  object io {
    
    /**
      * Applicable when part of a file or directory cannot be found.
      *
      * @example throw new errors.io.DirectoryNotFoundError("/var/log", err)
      */
    @JSImport("common-errors", "io.DirectoryNotFoundError")
    @js.native
    open class DirectoryNotFoundError protected () extends IOError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when trying to access a drive or share that is not
      * available.
      *
      * @example throw new errors.io.DriveNotFoundError("c", err)
      */
    @JSImport("common-errors", "io.DriveNotFoundError")
    @js.native
    open class DriveNotFoundError protected () extends IOError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when reading is attempted past the end of a stream.
      *
      * @example throw new errors.io.EndOfStreamError("EOS while reading header", err)
      */
    @JSImport("common-errors", "io.EndOfStreamError")
    @js.native
    open class EndOfStreamError protected () extends IOError {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when a file is found and read but cannot be loaded.
      *
      * @example throw new errors.io.FileLoadError("./package.json", err)
      */
    @JSImport("common-errors", "io.FileLoadError")
    @js.native
    open class FileLoadError protected () extends IOError {
      /**
        * @param file_name   any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(file_name: String) = this()
      def this(file_name: String, inner_error: Error) = this()
    }
    
    /**
      * Applicable when an attempt to access a file that does not exist on
      * disk fails.
      *
      * @example throw new errors.io.FileNotFoundError("./package.json", err)
      */
    @JSImport("common-errors", "io.FileNotFoundError")
    @js.native
    open class FileNotFoundError protected () extends IOError {
      /**
        * @param file_name   any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(file_name: String) = this()
      def this(file_name: String, inner_error: Error) = this()
    }
    
    /**
      * Base class for Errors while accessing information using streams,
      * files and directories.
      *
      * @example throw new errors.io.IOError("Could not open file", err)
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify global.Error * / any */ @JSImport("common-errors", "io.IOError")
    @js.native
    open class IOError protected () extends StObject {
      /**
        * @param message     any message
        * @param inner_error the Error instance that caused the current
        *                    error. Stack trace will be appended.
        */
      def this(message: String) = this()
      def this(message: String, inner_error: Error) = this()
    }
  }
  
  inline def log(err: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(err.asInstanceOf[js.Any]).asInstanceOf[Error]
  inline def log(err: Error, message: String): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(err.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def logError(err: Error, cb: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logError")(err.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object middleware {
    
    @JSImport("common-errors", "middleware")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Express middleware for preventing the web server from crashing when
      * an error is thrown from an asynchronous context. Any error that would
      * have caused a crash is logged to stderr.
      */
    inline def crashProtector(
      errorHandler: js.Function3[
          /* err */ Error, 
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("crashProtector")(errorHandler.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Express middleware that translates common errors into HTTP status
      * codes and messages.
      */
    inline def errorHandler(
      err: Error,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("errorHandler")(err.asInstanceOf[js.Any], req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def prependCurrentStack(err: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("prependCurrentStack")(err.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @js.native
  trait ErrorConstructor
    extends StObject
       with Instantiable1[/* params (repeated) */ Any, Error]
  
  type GenerateMessageMethod = js.Function0[String]
}
