package typings
package breezeLib.breezeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "core")
@js.native
object coreNs extends js.Object {
  @js.native
  class Enum protected ()
    extends breezeLib.breezeNs.coreNs.Enum {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, methodObj: js.Any) = this()
  }
  
  @js.native
  class EnumSymbol ()
    extends breezeLib.breezeNs.coreNs.EnumSymbol
  
  @js.native
  class Event protected ()
    extends breezeLib.breezeNs.coreNs.Event {
    def this(name: java.lang.String, publisher: js.Any) = this()
    def this(name: java.lang.String, publisher: js.Any, defaultErrorCallback: breezeLib.breezeNs.coreNs.ErrorCallback) = this()
  }
  
  def arrayEquals(
    a1: js.Array[_],
    a2: js.Array[_],
    equalsFn: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, scala.Boolean]
  ): scala.Boolean = js.native
  def arrayFirst(a1: js.Array[_], predicate: js.Function1[/* e */ js.Any, scala.Boolean]): js.Any = js.native
  def arrayIndexOf(a1: js.Array[_], predicate: js.Function1[/* e */ js.Any, scala.Boolean]): scala.Double = js.native
  def arrayRemoveItem(array: js.Array[_], item: js.Any, shouldRemoveMultiple: scala.Boolean): js.Any = js.native
  def arrayRemoveItem(
    array: js.Array[_],
    predicate: js.Function1[/* e */ js.Any, scala.Boolean],
    shouldRemoveMultiple: scala.Boolean
  ): js.Any = js.native
  def arrayZip(a1: js.Array[_], a2: js.Array[_], callback: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, _]): js.Array[_] = js.native
  def durationToSeconds(duration: java.lang.String): scala.Double = js.native
  def extend(target: js.Object, source: js.Object): js.Object = js.native
  def formatString(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  def getPropertyDescriptor(obj: js.Any, propertyName: java.lang.String): stdLib.PropertyDescriptor = js.native
  def getUuid(): java.lang.String = js.native
  def isDate(o: js.Any): scala.Boolean = js.native
  def isDuration(o: js.Any): scala.Boolean = js.native
  def isEmpty(o: js.Any): scala.Boolean = js.native
  def isFunction(o: js.Any): scala.Boolean = js.native
  def isGuid(o: js.Any): scala.Boolean = js.native
  def isNumeric(o: js.Any): scala.Boolean = js.native
  def memoize(fn: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def objectForEach(obj: js.Object, kvfn: js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit]): scala.Unit = js.native
  def pluck(propertyName: java.lang.String): js.Function1[/* obj */ js.Object, _] = js.native
  def propEq(propertyName: java.lang.String, value: js.Any): js.Function1[/* obj */ js.Object, scala.Boolean] = js.native
  def requireLib(libnames: java.lang.String, errMessage: java.lang.String): js.Object = js.native
  def stringEndsWith(str: java.lang.String, suffix: java.lang.String): scala.Boolean = js.native
  def stringStartsWith(str: java.lang.String, prefix: java.lang.String): scala.Boolean = js.native
  def titleCase(str: java.lang.String): java.lang.String = js.native
  def toJSONSafe(obj: js.Any, replacer: js.Function2[/* prop */ java.lang.String, /* val */ js.Any, _]): js.Any = js.native
  def toJSONSafeReplacer(prop: java.lang.String, `val`: js.Any): js.Any = js.native
  def using(obj: js.Object, property: java.lang.String, tempValue: js.Any, fn: js.Function0[_]): js.Any = js.native
  @js.native
  object Enum extends js.Object {
    def isSymbol(`object`: js.Any): scala.Boolean = js.native
  }
  
  @js.native
  object Event extends js.Object {
    def enable(eventName: java.lang.String, target: js.Any): scala.Unit = js.native
    def enable(eventName: java.lang.String, target: js.Any, isEnabled: js.Function): scala.Unit = js.native
    def enable(eventName: java.lang.String, target: js.Any, isEnabled: scala.Boolean): scala.Unit = js.native
    def isEnabled(eventName: java.lang.String, target: js.Any): scala.Boolean = js.native
  }
  
}

