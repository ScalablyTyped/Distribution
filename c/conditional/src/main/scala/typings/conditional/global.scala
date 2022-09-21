package typings.conditional

import typings.conditional.mod.ErrorCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object preconditions {
    
    @JSGlobal("preconditions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("preconditions.IllegalArgumentError")
    @js.native
    open class IllegalArgumentError ()
      extends typings.conditional.mod.IllegalArgumentError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.IllegalStateError")
    @js.native
    open class IllegalStateError ()
      extends typings.conditional.mod.IllegalStateError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.IllegalValueError")
    @js.native
    open class IllegalValueError ()
      extends typings.conditional.mod.IllegalValueError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.InvalidTypeError")
    @js.native
    open class InvalidTypeError ()
      extends typings.conditional.mod.InvalidTypeError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.UndefinedValueError")
    @js.native
    open class UndefinedValueError ()
      extends typings.conditional.mod.UndefinedValueError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.UnknownValueError")
    @js.native
    open class UnknownValueError ()
      extends typings.conditional.mod.UnknownValueError {
      def this(message: String) = this()
    }
    
    inline def checkArgument(condition: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkArgument(condition: Any, callback: ErrorCallback[typings.conditional.mod.IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkArgument(condition: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkArgument(
      condition: Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.IllegalArgumentError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkArgument(
      condition: Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.IllegalArgumentError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkContains(value: Any, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(value: Any, `object`: Any, callback: ErrorCallback[typings.conditional.mod.UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(value: Any, `object`: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(
      value: Any,
      `object`: Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(
      value: Any,
      `object`: Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkDefined(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkDefined(value: Any, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDefined(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDefined(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDefined(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkDoesNotContain(value: Any, `object`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(value: Any, `object`: Any, callback: ErrorCallback[typings.conditional.mod.UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(value: Any, `object`: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(
      value: Any,
      `object`: Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(
      value: Any,
      `object`: Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkDoesNotEqual(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(actual: Any, expected: Any, callback: ErrorCallback[typings.conditional.mod.UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(
      actual: Any,
      expected: Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(
      actual: Any,
      expected: Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkEmpty(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkEmpty(value: Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEmpty(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEmpty(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEmpty(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkEquals(actual: Any, expected: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(actual: Any, expected: Any, callback: ErrorCallback[typings.conditional.mod.UnknownValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(actual: Any, expected: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(
      actual: Any,
      expected: Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(
      actual: Any,
      expected: Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNotEmpty(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNotEmpty(value: Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotEmpty(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotEmpty(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotEmpty(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNotNull(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNotNull(value: Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNull(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNull(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNull(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNotNumberType(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNotNumberType(value: Any, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNumberType(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNumberType(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNumberType(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNull(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNull(value: Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNull(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNull(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNull(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNumberType(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNumberType(value: Any, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNumberType(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNumberType(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNumberType(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkState(condition: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkState(condition: Any, callback: ErrorCallback[typings.conditional.mod.IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkState(condition: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkState(
      condition: Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.IllegalStateError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkState(condition: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkUndefined(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkUndefined(value: Any, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkUndefined(value: Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkUndefined(value: Any, message: String, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkUndefined(value: Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
