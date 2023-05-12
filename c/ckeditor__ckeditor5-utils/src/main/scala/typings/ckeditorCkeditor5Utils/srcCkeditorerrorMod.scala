package typings.ckeditorCkeditor5Utils

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCkeditorerrorMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/ckeditorerror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ckeditor/ckeditor5-utils/src/ckeditorerror", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CKEditorError {
    /**
      * Creates an instance of the CKEditorError class.
      *
      * @param errorName The error id in an `error-name` format. A link to this error documentation page will be added
      * to the thrown error's `message`.
      * @param context A context of the error by which the {@link module:watchdog/watchdog~Watchdog watchdog}
      * is able to determine which editor crashed. It should be an editor instance or a property connected to it. It can be also
      * a `null` value if the editor should not be restarted in case of the error (e.g. during the editor initialization).
      * The error context should be checked using the `areConnectedThroughProperties( editor, context )` utility
      * to check if the object works as the context.
      * @param data Additional data describing the error. A stringified version of this object
      * will be appended to the error message, so the data are quickly visible in the console. The original
      * data object will also be later available under the {@link #data} property.
      */
    def this(errorName: String) = this()
    def this(errorName: String, context: js.Object) = this()
    def this(errorName: String, context: js.Object, data: js.Object) = this()
    def this(errorName: String, context: Null, data: js.Object) = this()
    def this(errorName: String, context: Unit, data: js.Object) = this()
    
    /**
      * Checks if the error is of the `CKEditorError` type.
      */
    /* CompleteClass */
    override def is(`type`: String): Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-utils/src/ckeditorerror", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A utility that ensures that the thrown error is a {@link module:utils/ckeditorerror~CKEditorError} one.
      * It is useful when combined with the {@link module:watchdog/watchdog~Watchdog} feature, which can restart the editor in case
      * of a {@link module:utils/ckeditorerror~CKEditorError} error.
      *
      * @param err The error to rethrow.
      * @param context An object connected through properties with the editor instance. This context will be used
      * by the watchdog to verify which editor should be restarted.
      */
    inline def rethrowUnexpectedError(err: js.Error, context: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("rethrowUnexpectedError")(err.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  }
  
  @JSImport("@ckeditor/ckeditor5-utils/src/ckeditorerror", "DOCUMENTATION_URL")
  @js.native
  val DOCUMENTATION_URL: /* "https://ckeditor.com/docs/ckeditor5/latest/support/error-codes.html" */ String = js.native
  
  inline def logError(errorName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logError")(errorName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logError(errorName: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logError")(errorName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logWarning(errorName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logWarning")(errorName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def logWarning(errorName: String, data: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logWarning")(errorName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CKEditorError
    extends StObject
       with Error {
    
    /**
      * A context of the error by which the Watchdog is able to determine which editor crashed.
      */
    val context: js.UndefOr[js.Object | Null] = js.undefined
    
    /**
      * The additional error data passed to the constructor. Undefined if none was passed.
      */
    val data: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Checks if the error is of the `CKEditorError` type.
      */
    def is(`type`: String): Boolean
  }
  object CKEditorError {
    
    inline def apply(is: String => Boolean, message: String, name: String): CKEditorError = {
      val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CKEditorError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CKEditorError] (val x: Self) extends AnyVal {
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setIs(value: String => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    }
  }
}
