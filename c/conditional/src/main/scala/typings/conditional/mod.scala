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
  class IllegalArgumentError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "IllegalStateError")
  @js.native
  class IllegalStateError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "IllegalValueError")
  @js.native
  class IllegalValueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "InvalidTypeError")
  @js.native
  class InvalidTypeError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "UndefinedValueError")
  @js.native
  class UndefinedValueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("conditional", "UnknownValueError")
  @js.native
  class UnknownValueError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def checkArgument(condition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkArgument(condition: js.Any, callback: ErrorCallback[IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArgument(condition: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArgument(condition: js.Any, message: String, callback: ErrorCallback[IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArgument(condition: js.Any, message: Unit, callback: ErrorCallback[IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkContains(value: js.Any, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: js.Any, `object`: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: js.Any, `object`: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: js.Any, `object`: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkContains(value: js.Any, `object`: js.Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkDefined(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkDefined(value: js.Any, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDefined(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDefined(value: js.Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDefined(value: js.Any, message: Unit, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkDoesNotContain(value: js.Any, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: js.Any, `object`: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotContain(value: js.Any, `object`: js.Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkDoesNotEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: js.Any, expected: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkEmpty(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkEmpty(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEmpty(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEmpty(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEmpty(value: js.Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkEquals(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: js.Any, expected: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: js.Any, expected: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkEquals(actual: js.Any, expected: js.Any, message: Unit, callback: ErrorCallback[UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNotEmpty(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNotEmpty(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotEmpty(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotEmpty(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotEmpty(value: js.Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNotNull(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNotNull(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNull(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNull(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNull(value: js.Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNotNumberType(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNotNumberType(value: js.Any, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNumberType(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNumberType(value: js.Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNotNumberType(value: js.Any, message: Unit, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNull(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNull(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNull(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNull(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNull(value: js.Any, message: Unit, callback: ErrorCallback[IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkNumberType(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkNumberType(value: js.Any, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNumberType(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNumberType(value: js.Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkNumberType(value: js.Any, message: Unit, callback: ErrorCallback[InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkState(condition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkState(condition: js.Any, callback: ErrorCallback[IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkState(condition: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkState(condition: js.Any, message: String, callback: ErrorCallback[IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkState(condition: js.Any, message: Unit, callback: ErrorCallback[IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkUndefined(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkUndefined(value: js.Any, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUndefined(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUndefined(value: js.Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkUndefined(value: js.Any, message: Unit, callback: ErrorCallback[UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ErrorCallback[T] = js.Function1[/* err */ T | Null, Unit]
}
