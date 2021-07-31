package typings.breeze.global.breeze

import typings.breeze.breeze.core.ErrorCallback
import typings.breeze.breeze.core.IEnum
import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSGlobal("breeze.core")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("breeze.core.Enum")
  @js.native
  class Enum protected ()
    extends StObject
       with typings.breeze.breeze.core.Enum {
    def this(name: String) = this()
    def this(name: String, methodObj: js.Any) = this()
    
    /* CompleteClass */
    override def contains(`object`: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def fromName(name: String): typings.breeze.breeze.core.EnumSymbol = js.native
    
    /* CompleteClass */
    override def getNames(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getSymbols(): js.Array[typings.breeze.breeze.core.EnumSymbol] = js.native
  }
  /* static members */
  object Enum {
    
    @JSGlobal("breeze.core.Enum")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isSymbol(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("breeze.core.EnumSymbol")
  @js.native
  class EnumSymbol ()
    extends StObject
       with typings.breeze.breeze.core.EnumSymbol {
    
    /* CompleteClass */
    override def getName(): String = js.native
    
    /* CompleteClass */
    var parentEnum: IEnum = js.native
  }
  
  @JSGlobal("breeze.core.Event")
  @js.native
  class Event protected ()
    extends StObject
       with typings.breeze.breeze.core.Event {
    def this(name: String, publisher: js.Any) = this()
    def this(name: String, publisher: js.Any, defaultErrorCallback: ErrorCallback) = this()
  }
  /* static members */
  object Event {
    
    @JSGlobal("breeze.core.Event")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def enable(eventName: String, target: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(eventName.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def enable(eventName: String, target: js.Any, isEnabled: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(eventName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def enable(eventName: String, target: js.Any, isEnabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(eventName.asInstanceOf[js.Any], target.asInstanceOf[js.Any], isEnabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def isEnabled(eventName: String, target: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(eventName.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @scala.inline
  def arrayEquals(
    a1: js.Array[js.Any],
    a2: js.Array[js.Any],
    equalsFn: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayEquals")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], equalsFn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def arrayFirst(a1: js.Array[js.Any], predicate: js.Function1[/* e */ js.Any, Boolean]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayFirst")(a1.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def arrayIndexOf(a1: js.Array[js.Any], predicate: js.Function1[/* e */ js.Any, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayIndexOf")(a1.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def arrayRemoveItem(array: js.Array[js.Any], item: js.Any, shouldRemoveMultiple: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], shouldRemoveMultiple.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def arrayRemoveItem(
    array: js.Array[js.Any],
    predicate: js.Function1[/* e */ js.Any, Boolean],
    shouldRemoveMultiple: Boolean
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveItem")(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], shouldRemoveMultiple.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def arrayZip(
    a1: js.Array[js.Any],
    a2: js.Array[js.Any],
    callback: js.Function2[/* e1 */ js.Any, /* e2 */ js.Any, js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayZip")(a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def durationToSeconds(duration: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToSeconds")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def extend(target: js.Object, source: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def formatString(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getPropertyDescriptor(obj: js.Any, propertyName: String): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyDescriptor")(obj.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
  
  @scala.inline
  def getUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUuid")().asInstanceOf[String]
  
  @scala.inline
  def isDate(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDuration(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isEmpty(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFunction(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isGuid(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuid")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNumeric(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def memoize(fn: js.Function1[/* repeated */ js.Any, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def objectForEach(obj: js.Object, kvfn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("objectForEach")(obj.asInstanceOf[js.Any], kvfn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def pluck(propertyName: String): js.Function1[/* obj */ js.Object, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(propertyName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Object, js.Any]]
  
  @scala.inline
  def propEq(propertyName: String, value: js.Any): js.Function1[/* obj */ js.Object, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("propEq")(propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* obj */ js.Object, Boolean]]
  
  @scala.inline
  def requireLib(libnames: String, errMessage: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("requireLib")(libnames.asInstanceOf[js.Any], errMessage.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  @scala.inline
  def stringEndsWith(str: String, suffix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringEndsWith")(str.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def stringStartsWith(str: String, prefix: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringStartsWith")(str.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def titleCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toJSONSafe(obj: js.Any, replacer: js.Function2[/* prop */ String, /* val */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSONSafe")(obj.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def toJSONSafeReplacer(prop: String, `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJSONSafeReplacer")(prop.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def `using`(obj: js.Object, property: String, tempValue: js.Any, fn: js.Function0[js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(obj.asInstanceOf[js.Any], property.asInstanceOf[js.Any], tempValue.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
