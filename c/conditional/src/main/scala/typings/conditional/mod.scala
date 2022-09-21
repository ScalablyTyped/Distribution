package typings.conditional

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("conditional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("conditional", "IllegalArgumentError")
  @js.native
  open class IllegalArgumentError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "IllegalStateError")
  @js.native
  open class IllegalStateError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "IllegalValueError")
  @js.native
  open class IllegalValueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "InvalidTypeError")
  @js.native
  open class InvalidTypeError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "UndefinedValueError")
  @js.native
  open class UndefinedValueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "UnknownValueError")
  @js.native
  open class UnknownValueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def checkArgument(condition: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkArgument(condition: Any, callback: ErrorCallback[IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArgument(condition: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArgument(condition: Any, message: String, callback: ErrorCallback[IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArgument(condition: Any, message: Unit, callback: ErrorCallback[IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkContains(value: Any, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: Any, `object`: Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: Any, `object`: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: Any, `object`: Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: Any, `object`: Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkDefined(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkDefined(value: Any, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDefined(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDefined(value: Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDefined(value: Any, message: Unit, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkDoesNotContain(value: Any, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: Any, `object`: Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: Any, `object`: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: Any, `object`: Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: Any, `object`: Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkDoesNotEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: Any, expected: Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: Any, expected: Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: Any, expected: Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkEmpty(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkEmpty(value: Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEmpty(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEmpty(value: Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEmpty(value: Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkEquals(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: Any, expected: Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: Any, expected: Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: Any, expected: Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNotEmpty(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNotEmpty(value: Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotEmpty(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotEmpty(value: Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotEmpty(value: Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNotNull(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNotNull(value: Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNull(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNull(value: Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNull(value: Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNotNumberType(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNotNumberType(value: Any, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNumberType(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNumberType(value: Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNumberType(value: Any, message: Unit, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNull(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNull(value: Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNull(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNull(value: Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNull(value: Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNumberType(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNumberType(value: Any, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNumberType(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNumberType(value: Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNumberType(value: Any, message: Unit, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkState(condition: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkState(condition: Any, callback: ErrorCallback[IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkState(condition: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkState(condition: Any, message: String, callback: ErrorCallback[IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkState(condition: Any, message: Unit, callback: ErrorCallback[IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUndefined(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkUndefined(value: Any, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUndefined(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUndefined(value: Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUndefined(value: Any, message: Unit, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ErrorCallback[T] = js.Function1[/* err */ T | Null, Unit]
}
