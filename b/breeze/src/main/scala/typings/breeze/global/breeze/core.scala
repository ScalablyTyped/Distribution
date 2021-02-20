package typings.breeze.global.breeze

import typings.breeze.breeze.core.ErrorCallback
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSGlobal("breeze.core.Enum")
  @js.native
  class Enum protected ()
    extends typings.breeze.breeze.core.Enum {
    def this(name: String) = this()
    def this(name: String, methodObj: js.Any) = this()
  }
  /* static members */
  object Enum {
    
    @JSGlobal("breeze.core.Enum.isSymbol")
    @js.native
    def isSymbol(`object`: js.Any): Boolean = js.native
  }
  
  @JSGlobal("breeze.core.EnumSymbol")
  @js.native
  class EnumSymbol ()
    extends typings.breeze.breeze.core.EnumSymbol
  
  @JSGlobal("breeze.core.Event")
  @js.native
  class Event protected ()
    extends typings.breeze.breeze.core.Event {
    def this(name: String, publisher: js.Any) = this()
    def this(name: String, publisher: js.Any, defaultErrorCallback: ErrorCallback) = this()
  }
  /* static members */
  object Event {
    
    @JSGlobal("breeze.core.Event.enable")
    @js.native
    def enable(eventName: String, target: js.Any): Unit = js.native
    @JSGlobal("breeze.core.Event.enable")
    @js.native
    def enable(eventName: String, target: js.Any, isEnabled: js.Function): Unit = js.native
    @JSGlobal("breeze.core.Event.enable")
    @js.native
    def enable(eventName: String, target: js.Any, isEnabled: Boolean): Unit = js.native
    
    @JSGlobal("breeze.core.Event.isEnabled")
    @js.native
    def isEnabled(eventName: String, target: js.Any): Boolean = js.native
  }
  
  @JSGlobal("breeze.core.arrayEquals")
  @js.native
  def arrayEquals(
    a1: js.Array[_],
    a2: js.Array[_],
    equalsFn: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, Boolean]
  ): Boolean = js.native
  
  @JSGlobal("breeze.core.arrayFirst")
  @js.native
  def arrayFirst(a1: js.Array[_], predicate: js.Function1[/* e */ js.Any, Boolean]): js.Any = js.native
  
  @JSGlobal("breeze.core.arrayIndexOf")
  @js.native
  def arrayIndexOf(a1: js.Array[_], predicate: js.Function1[/* e */ js.Any, Boolean]): Double = js.native
  
  @JSGlobal("breeze.core.arrayRemoveItem")
  @js.native
  def arrayRemoveItem(array: js.Array[_], item: js.Any, shouldRemoveMultiple: Boolean): js.Any = js.native
  @JSGlobal("breeze.core.arrayRemoveItem")
  @js.native
  def arrayRemoveItem(
    array: js.Array[_],
    predicate: js.Function1[/* e */ js.Any, Boolean],
    shouldRemoveMultiple: Boolean
  ): js.Any = js.native
  
  @JSGlobal("breeze.core.arrayZip")
  @js.native
  def arrayZip(a1: js.Array[_], a2: js.Array[_], callback: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, _]): js.Array[_] = js.native
  
  @JSGlobal("breeze.core.durationToSeconds")
  @js.native
  def durationToSeconds(duration: String): Double = js.native
  
  @JSGlobal("breeze.core.extend")
  @js.native
  def extend(target: js.Object, source: js.Object): js.Object = js.native
  
  @JSGlobal("breeze.core.formatString")
  @js.native
  def formatString(format: String, args: js.Any*): String = js.native
  
  @JSGlobal("breeze.core.getPropertyDescriptor")
  @js.native
  def getPropertyDescriptor(obj: js.Any, propertyName: String): PropertyDescriptor = js.native
  
  @JSGlobal("breeze.core.getUuid")
  @js.native
  def getUuid(): String = js.native
  
  @JSGlobal("breeze.core.isDate")
  @js.native
  def isDate(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.core.isDuration")
  @js.native
  def isDuration(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.core.isEmpty")
  @js.native
  def isEmpty(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.core.isFunction")
  @js.native
  def isFunction(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.core.isGuid")
  @js.native
  def isGuid(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.core.isNumeric")
  @js.native
  def isNumeric(o: js.Any): Boolean = js.native
  
  @JSGlobal("breeze.core.memoize")
  @js.native
  def memoize(fn: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  @JSGlobal("breeze.core.objectForEach")
  @js.native
  def objectForEach(obj: js.Object, kvfn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = js.native
  
  @JSGlobal("breeze.core.pluck")
  @js.native
  def pluck(propertyName: String): js.Function1[/* obj */ js.Object, _] = js.native
  
  @JSGlobal("breeze.core.propEq")
  @js.native
  def propEq(propertyName: String, value: js.Any): js.Function1[/* obj */ js.Object, Boolean] = js.native
  
  @JSGlobal("breeze.core.requireLib")
  @js.native
  def requireLib(libnames: String, errMessage: String): js.Object = js.native
  
  @JSGlobal("breeze.core.stringEndsWith")
  @js.native
  def stringEndsWith(str: String, suffix: String): Boolean = js.native
  
  @JSGlobal("breeze.core.stringStartsWith")
  @js.native
  def stringStartsWith(str: String, prefix: String): Boolean = js.native
  
  @JSGlobal("breeze.core.titleCase")
  @js.native
  def titleCase(str: String): String = js.native
  
  @JSGlobal("breeze.core.toJSONSafe")
  @js.native
  def toJSONSafe(obj: js.Any, replacer: js.Function2[/* prop */ String, /* val */ js.Any, _]): js.Any = js.native
  
  @JSGlobal("breeze.core.toJSONSafeReplacer")
  @js.native
  def toJSONSafeReplacer(prop: String, `val`: js.Any): js.Any = js.native
  
  @JSGlobal("breeze.core.using")
  @js.native
  def using(obj: js.Object, property: String, tempValue: js.Any, fn: js.Function0[_]): js.Any = js.native
}
