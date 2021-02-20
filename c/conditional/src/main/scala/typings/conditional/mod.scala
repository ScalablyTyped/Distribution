package typings.conditional

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("conditional", "IllegalArgumentError")
  @js.native
  class IllegalArgumentError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("conditional", "IllegalStateError")
  @js.native
  class IllegalStateError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("conditional", "IllegalValueError")
  @js.native
  class IllegalValueError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("conditional", "InvalidTypeError")
  @js.native
  class InvalidTypeError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("conditional", "UndefinedValueError")
  @js.native
  class UndefinedValueError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("conditional", "UnknownValueError")
  @js.native
  class UnknownValueError () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("conditional", "checkArgument")
  @js.native
  def checkArgument(condition: js.Any): Unit = js.native
  @JSImport("conditional", "checkArgument")
  @js.native
  def checkArgument(condition: js.Any, callback: ErrorCallback[IllegalArgumentError]): Unit = js.native
  @JSImport("conditional", "checkArgument")
  @js.native
  def checkArgument(
    condition: js.Any,
    message: js.UndefOr[scala.Nothing],
    callback: ErrorCallback[IllegalArgumentError]
  ): Unit = js.native
  @JSImport("conditional", "checkArgument")
  @js.native
  def checkArgument(condition: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkArgument")
  @js.native
  def checkArgument(condition: js.Any, message: String, callback: ErrorCallback[IllegalArgumentError]): Unit = js.native
  
  @JSImport("conditional", "checkContains")
  @js.native
  def checkContains(value: js.Any, `object`: js.Any): Unit = js.native
  @JSImport("conditional", "checkContains")
  @js.native
  def checkContains(value: js.Any, `object`: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  @JSImport("conditional", "checkContains")
  @js.native
  def checkContains(
    value: js.Any,
    `object`: js.Any,
    message: js.UndefOr[scala.Nothing],
    callback: ErrorCallback[UnknownValueError]
  ): Unit = js.native
  @JSImport("conditional", "checkContains")
  @js.native
  def checkContains(value: js.Any, `object`: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkContains")
  @js.native
  def checkContains(value: js.Any, `object`: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  
  @JSImport("conditional", "checkDefined")
  @js.native
  def checkDefined(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkDefined")
  @js.native
  def checkDefined(value: js.Any, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  @JSImport("conditional", "checkDefined")
  @js.native
  def checkDefined(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  @JSImport("conditional", "checkDefined")
  @js.native
  def checkDefined(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkDefined")
  @js.native
  def checkDefined(value: js.Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  
  @JSImport("conditional", "checkDoesNotContain")
  @js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any): Unit = js.native
  @JSImport("conditional", "checkDoesNotContain")
  @js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  @JSImport("conditional", "checkDoesNotContain")
  @js.native
  def checkDoesNotContain(
    value: js.Any,
    `object`: js.Any,
    message: js.UndefOr[scala.Nothing],
    callback: ErrorCallback[UnknownValueError]
  ): Unit = js.native
  @JSImport("conditional", "checkDoesNotContain")
  @js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkDoesNotContain")
  @js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  
  @JSImport("conditional", "checkDoesNotEqual")
  @js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("conditional", "checkDoesNotEqual")
  @js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  @JSImport("conditional", "checkDoesNotEqual")
  @js.native
  def checkDoesNotEqual(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    callback: ErrorCallback[UnknownValueError]
  ): Unit = js.native
  @JSImport("conditional", "checkDoesNotEqual")
  @js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkDoesNotEqual")
  @js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  
  @JSImport("conditional", "checkEmpty")
  @js.native
  def checkEmpty(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkEmpty")
  @js.native
  def checkEmpty(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkEmpty")
  @js.native
  def checkEmpty(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkEmpty")
  @js.native
  def checkEmpty(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkEmpty")
  @js.native
  def checkEmpty(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  
  @JSImport("conditional", "checkEquals")
  @js.native
  def checkEquals(actual: js.Any, expected: js.Any): Unit = js.native
  @JSImport("conditional", "checkEquals")
  @js.native
  def checkEquals(actual: js.Any, expected: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  @JSImport("conditional", "checkEquals")
  @js.native
  def checkEquals(
    actual: js.Any,
    expected: js.Any,
    message: js.UndefOr[scala.Nothing],
    callback: ErrorCallback[UnknownValueError]
  ): Unit = js.native
  @JSImport("conditional", "checkEquals")
  @js.native
  def checkEquals(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkEquals")
  @js.native
  def checkEquals(actual: js.Any, expected: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  
  @JSImport("conditional", "checkNotEmpty")
  @js.native
  def checkNotEmpty(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkNotEmpty")
  @js.native
  def checkNotEmpty(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkNotEmpty")
  @js.native
  def checkNotEmpty(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkNotEmpty")
  @js.native
  def checkNotEmpty(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkNotEmpty")
  @js.native
  def checkNotEmpty(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  
  @JSImport("conditional", "checkNotNull")
  @js.native
  def checkNotNull(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkNotNull")
  @js.native
  def checkNotNull(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkNotNull")
  @js.native
  def checkNotNull(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkNotNull")
  @js.native
  def checkNotNull(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkNotNull")
  @js.native
  def checkNotNull(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  
  @JSImport("conditional", "checkNotNumberType")
  @js.native
  def checkNotNumberType(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkNotNumberType")
  @js.native
  def checkNotNumberType(value: js.Any, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  @JSImport("conditional", "checkNotNumberType")
  @js.native
  def checkNotNumberType(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  @JSImport("conditional", "checkNotNumberType")
  @js.native
  def checkNotNumberType(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkNotNumberType")
  @js.native
  def checkNotNumberType(value: js.Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  
  @JSImport("conditional", "checkNull")
  @js.native
  def checkNull(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkNull")
  @js.native
  def checkNull(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkNull")
  @js.native
  def checkNull(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[IllegalValueError]): Unit = js.native
  @JSImport("conditional", "checkNull")
  @js.native
  def checkNull(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkNull")
  @js.native
  def checkNull(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  
  @JSImport("conditional", "checkNumberType")
  @js.native
  def checkNumberType(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkNumberType")
  @js.native
  def checkNumberType(value: js.Any, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  @JSImport("conditional", "checkNumberType")
  @js.native
  def checkNumberType(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  @JSImport("conditional", "checkNumberType")
  @js.native
  def checkNumberType(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkNumberType")
  @js.native
  def checkNumberType(value: js.Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  
  @JSImport("conditional", "checkState")
  @js.native
  def checkState(condition: js.Any): Unit = js.native
  @JSImport("conditional", "checkState")
  @js.native
  def checkState(condition: js.Any, callback: ErrorCallback[IllegalStateError]): Unit = js.native
  @JSImport("conditional", "checkState")
  @js.native
  def checkState(condition: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[IllegalStateError]): Unit = js.native
  @JSImport("conditional", "checkState")
  @js.native
  def checkState(condition: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkState")
  @js.native
  def checkState(condition: js.Any, message: String, callback: ErrorCallback[IllegalStateError]): Unit = js.native
  
  @JSImport("conditional", "checkUndefined")
  @js.native
  def checkUndefined(value: js.Any): Unit = js.native
  @JSImport("conditional", "checkUndefined")
  @js.native
  def checkUndefined(value: js.Any, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  @JSImport("conditional", "checkUndefined")
  @js.native
  def checkUndefined(value: js.Any, message: js.UndefOr[scala.Nothing], callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  @JSImport("conditional", "checkUndefined")
  @js.native
  def checkUndefined(value: js.Any, message: String): Unit = js.native
  @JSImport("conditional", "checkUndefined")
  @js.native
  def checkUndefined(value: js.Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  
  type ErrorCallback[T] = js.Function1[/* err */ T | Null, Unit]
}
