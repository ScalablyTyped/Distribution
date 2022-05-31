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
    class IllegalArgumentError ()
      extends typings.conditional.mod.IllegalArgumentError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.IllegalStateError")
    @js.native
    class IllegalStateError ()
      extends typings.conditional.mod.IllegalStateError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.IllegalValueError")
    @js.native
    class IllegalValueError ()
      extends typings.conditional.mod.IllegalValueError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.InvalidTypeError")
    @js.native
    class InvalidTypeError ()
      extends typings.conditional.mod.InvalidTypeError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.UndefinedValueError")
    @js.native
    class UndefinedValueError ()
      extends typings.conditional.mod.UndefinedValueError {
      def this(message: String) = this()
    }
    
    @JSGlobal("preconditions.UnknownValueError")
    @js.native
    class UnknownValueError ()
      extends typings.conditional.mod.UnknownValueError {
      def this(message: String) = this()
    }
    
    inline def checkArgument(condition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkArgument(condition: js.Any, callback: ErrorCallback[typings.conditional.mod.IllegalArgumentError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkArgument(condition: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkArgument(
      condition: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.IllegalArgumentError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkArgument(
      condition: js.Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.IllegalArgumentError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkContains(value: js.Any, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(
      value: js.Any,
      `object`: js.Any,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(value: js.Any, `object`: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(
      value: js.Any,
      `object`: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkContains(
      value: js.Any,
      `object`: js.Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkContains")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkDefined(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkDefined(value: js.Any, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDefined(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDefined(
      value: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDefined(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkDoesNotContain(value: js.Any, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(
      value: js.Any,
      `object`: js.Any,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(
      value: js.Any,
      `object`: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotContain(
      value: js.Any,
      `object`: js.Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotContain")(value.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkDoesNotEqual(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(
      actual: js.Any,
      expected: js.Any,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(
      actual: js.Any,
      expected: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkDoesNotEqual(
      actual: js.Any,
      expected: js.Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDoesNotEqual")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkEmpty(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkEmpty(value: js.Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEmpty(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEmpty(value: js.Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEmpty(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkEquals(actual: js.Any, expected: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(
      actual: js.Any,
      expected: js.Any,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(actual: js.Any, expected: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(
      actual: js.Any,
      expected: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkEquals(
      actual: js.Any,
      expected: js.Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.UnknownValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkEquals")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNotEmpty(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNotEmpty(value: js.Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotEmpty(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotEmpty(value: js.Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotEmpty(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotEmpty")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNotNull(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNotNull(value: js.Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNull(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNull(value: js.Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNull(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNotNumberType(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNotNumberType(value: js.Any, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNumberType(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNumberType(value: js.Any, message: String, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNotNumberType(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNotNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNull(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNull(value: js.Any, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNull(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNull(value: js.Any, message: String, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNull(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.IllegalValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNull")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkNumberType(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkNumberType(value: js.Any, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNumberType(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNumberType(value: js.Any, message: String, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkNumberType(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.InvalidTypeError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkNumberType")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkState(condition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkState(condition: js.Any, callback: ErrorCallback[typings.conditional.mod.IllegalStateError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkState(condition: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkState(
      condition: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.IllegalStateError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkState(
      condition: js.Any,
      message: Unit,
      callback: ErrorCallback[typings.conditional.mod.IllegalStateError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def checkUndefined(value: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def checkUndefined(value: js.Any, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkUndefined(value: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkUndefined(
      value: js.Any,
      message: String,
      callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkUndefined(value: js.Any, message: Unit, callback: ErrorCallback[typings.conditional.mod.UndefinedValueError]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUndefined")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
