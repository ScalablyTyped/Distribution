package typings.breeze.breezeMod

import typings.breeze.breezeNs.coreNs.ErrorCallback
import typings.std.PropertyDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class Enum protected ()
    extends typings.breeze.breezeNs.coreNs.Enum {
    def this(name: String) = this()
    def this(name: String, methodObj: js.Any) = this()
  }
  
  @js.native
  class EnumSymbol ()
    extends typings.breeze.breezeNs.coreNs.EnumSymbol
  
  @js.native
  class Event protected ()
    extends typings.breeze.breezeNs.coreNs.Event {
    def this(name: String, publisher: js.Any) = this()
    def this(name: String, publisher: js.Any, defaultErrorCallback: ErrorCallback) = this()
  }
  
  def arrayEquals(
    a1: js.Array[_],
    a2: js.Array[_],
    equalsFn: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, Boolean]
  ): Boolean = js.native
  def arrayFirst(a1: js.Array[_], predicate: js.Function1[/* e */ js.Any, Boolean]): js.Any = js.native
  def arrayIndexOf(a1: js.Array[_], predicate: js.Function1[/* e */ js.Any, Boolean]): Double = js.native
  def arrayRemoveItem(array: js.Array[_], item: js.Any, shouldRemoveMultiple: Boolean): js.Any = js.native
  def arrayRemoveItem(
    array: js.Array[_],
    predicate: js.Function1[/* e */ js.Any, Boolean],
    shouldRemoveMultiple: Boolean
  ): js.Any = js.native
  def arrayZip(a1: js.Array[_], a2: js.Array[_], callback: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, _]): js.Array[_] = js.native
  def durationToSeconds(duration: String): Double = js.native
  def extend(target: js.Object, source: js.Object): js.Object = js.native
  def formatString(format: String, args: js.Any*): String = js.native
  def getPropertyDescriptor(obj: js.Any, propertyName: String): PropertyDescriptor = js.native
  def getUuid(): String = js.native
  def isDate(o: js.Any): Boolean = js.native
  def isDuration(o: js.Any): Boolean = js.native
  def isEmpty(o: js.Any): Boolean = js.native
  def isFunction(o: js.Any): Boolean = js.native
  def isGuid(o: js.Any): Boolean = js.native
  def isNumeric(o: js.Any): Boolean = js.native
  def memoize(fn: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def objectForEach(obj: js.Object, kvfn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  def pluck(propertyName: String): js.Function1[/* obj */ js.Object, _] = js.native
  def propEq(propertyName: String, value: js.Any): js.Function1[/* obj */ js.Object, Boolean] = js.native
  def requireLib(libnames: String, errMessage: String): js.Object = js.native
  def stringEndsWith(str: String, suffix: String): Boolean = js.native
  def stringStartsWith(str: String, prefix: String): Boolean = js.native
  def titleCase(str: String): String = js.native
  def toJSONSafe(obj: js.Any, replacer: js.Function2[/* prop */ String, /* val */ js.Any, _]): js.Any = js.native
  def toJSONSafeReplacer(prop: String, `val`: js.Any): js.Any = js.native
  def using(obj: js.Object, property: String, tempValue: js.Any, fn: js.Function0[_]): js.Any = js.native
  /* static members */
  @js.native
  object Enum extends js.Object {
    def isSymbol(`object`: js.Any): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Event extends js.Object {
    def enable(eventName: String, target: js.Any): Unit = js.native
    def enable(eventName: String, target: js.Any, isEnabled: js.Function): Unit = js.native
    def enable(eventName: String, target: js.Any, isEnabled: Boolean): Unit = js.native
    def isEnabled(eventName: String, target: js.Any): Boolean = js.native
  }
  
}

