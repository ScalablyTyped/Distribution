package typings.conditional

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("conditional", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IllegalArgumentError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class IllegalStateError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class IllegalValueError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class InvalidTypeError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class UndefinedValueError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class UnknownValueError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def checkArgument(condition: js.Any): Unit = js.native
  def checkArgument(condition: js.Any, callback: ErrorCallback[IllegalArgumentError]): Unit = js.native
  def checkArgument(condition: js.Any, message: String): Unit = js.native
  def checkArgument(condition: js.Any, message: String, callback: ErrorCallback[IllegalArgumentError]): Unit = js.native
  def checkContains(value: js.Any, `object`: js.Any): Unit = js.native
  def checkContains(value: js.Any, `object`: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkContains(value: js.Any, `object`: js.Any, message: String): Unit = js.native
  def checkContains(value: js.Any, `object`: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkDefined(value: js.Any): Unit = js.native
  def checkDefined(value: js.Any, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  def checkDefined(value: js.Any, message: String): Unit = js.native
  def checkDefined(value: js.Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any): Unit = js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String): Unit = js.native
  def checkDoesNotContain(value: js.Any, `object`: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def checkDoesNotEqual(actual: js.Any, expected: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkEmpty(value: js.Any): Unit = js.native
  def checkEmpty(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkEmpty(value: js.Any, message: String): Unit = js.native
  def checkEmpty(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkEquals(actual: js.Any, expected: js.Any): Unit = js.native
  def checkEquals(actual: js.Any, expected: js.Any, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkEquals(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def checkEquals(actual: js.Any, expected: js.Any, message: String, callback: ErrorCallback[UnknownValueError]): Unit = js.native
  def checkNotEmpty(value: js.Any): Unit = js.native
  def checkNotEmpty(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkNotEmpty(value: js.Any, message: String): Unit = js.native
  def checkNotEmpty(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkNotNull(value: js.Any): Unit = js.native
  def checkNotNull(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkNotNull(value: js.Any, message: String): Unit = js.native
  def checkNotNull(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkNotNumberType(value: js.Any): Unit = js.native
  def checkNotNumberType(value: js.Any, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  def checkNotNumberType(value: js.Any, message: String): Unit = js.native
  def checkNotNumberType(value: js.Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  def checkNull(value: js.Any): Unit = js.native
  def checkNull(value: js.Any, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkNull(value: js.Any, message: String): Unit = js.native
  def checkNull(value: js.Any, message: String, callback: ErrorCallback[IllegalValueError]): Unit = js.native
  def checkNumberType(value: js.Any): Unit = js.native
  def checkNumberType(value: js.Any, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  def checkNumberType(value: js.Any, message: String): Unit = js.native
  def checkNumberType(value: js.Any, message: String, callback: ErrorCallback[InvalidTypeError]): Unit = js.native
  def checkState(condition: js.Any): Unit = js.native
  def checkState(condition: js.Any, callback: ErrorCallback[IllegalStateError]): Unit = js.native
  def checkState(condition: js.Any, message: String): Unit = js.native
  def checkState(condition: js.Any, message: String, callback: ErrorCallback[IllegalStateError]): Unit = js.native
  def checkUndefined(value: js.Any): Unit = js.native
  def checkUndefined(value: js.Any, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  def checkUndefined(value: js.Any, message: String): Unit = js.native
  def checkUndefined(value: js.Any, message: String, callback: ErrorCallback[UndefinedValueError]): Unit = js.native
  type ErrorCallback[T] = js.Function1[/* err */ T | Null, Unit]
}

