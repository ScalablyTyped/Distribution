package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalMod {
  
  /** @hidden */
  object None_ {
    
    @JSImport("baconjs/types/optional", "None")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/optional", "None.filter")
    @js.native
    def filter(): js.Any = js.native
    
    @JSImport("baconjs/types/optional", "None.forEach")
    @js.native
    def forEach(): Unit = js.native
    
    @JSImport("baconjs/types/optional", "None.get")
    @js.native
    def get(): scala.Nothing = js.native
    
    @JSImport("baconjs/types/optional", "None.getOrElse")
    @js.native
    def getOrElse[V](value: V): V = js.native
    
    @JSImport("baconjs/types/optional", "None.inspect")
    @js.native
    def inspect(): String = js.native
    
    @JSImport("baconjs/types/optional", "None.isDefined")
    @js.native
    def isDefined: Boolean = js.native
    @scala.inline
    def isDefined_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDefined")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/optional", "None._isNone")
    @js.native
    def isNone: Boolean = js.native
    
    @scala.inline
    def isNone_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isNone")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/optional", "None.map")
    @js.native
    def map(): js.Any = js.native
    
    @JSImport("baconjs/types/optional", "None.toArray")
    @js.native
    def toArray(): js.Array[scala.Nothing] = js.native
    
    @JSImport("baconjs/types/optional", "None.toString")
    @js.native
    def toString_(): String = js.native
  }
  
  /** @hidden */
  @JSImport("baconjs/types/optional", "Some")
  @js.native
  class Some[V] protected () extends Option[V] {
    def this(value: V) = this()
    
    var _isSome: Boolean = js.native
    
    var value: V = js.native
  }
  
  @JSImport("baconjs/types/optional", "isNone")
  @js.native
  def isNone(`object`: js.Any): Boolean = js.native
  
  @JSImport("baconjs/types/optional", "none")
  @js.native
  def none[T](): Option[T] = js.native
  
  @JSImport("baconjs/types/optional", "toOption")
  @js.native
  def toOption[V](v: V): Option[V] = js.native
  @JSImport("baconjs/types/optional", "toOption")
  @js.native
  def toOption[V](v: Option[V]): Option[V] = js.native
  
  @js.native
  trait Option[V] extends StObject {
    
    def filter(f: js.Function1[/* value */ V, Boolean]): Option[V] = js.native
    
    def forEach(f: js.Function1[/* value */ V, _]): Unit = js.native
    
    def get(): V = js.native
    
    def getOrElse(arg: V): V = js.native
    
    def inspect(): String = js.native
    
    var isDefined: Boolean = js.native
    
    def map[V2](f: js.Function1[/* value */ V, V2]): Option[V2] = js.native
    
    def toArray(): js.Array[V] = js.native
  }
  object Option {
    
    @scala.inline
    def apply[V](
      filter: js.Function1[/* value */ V, Boolean] => Option[V],
      forEach: js.Function1[/* value */ V, _] => Unit,
      get: () => V,
      getOrElse: V => V,
      inspect: () => String,
      isDefined: Boolean,
      map: js.Function1[/* value */ V, js.Any] => Option[js.Any],
      toArray: () => js.Array[V]
    ): Option[V] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction0(get), getOrElse = js.Any.fromFunction1(getOrElse), inspect = js.Any.fromFunction0(inspect), isDefined = isDefined.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[Option[V]]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option[_], V] (val x: Self with Option[V]) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Function1[/* value */ V, Boolean] => Option[V]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function1[/* value */ V, _] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: () => V): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOrElse(value: V => V): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDefined(value: Boolean): Self = StObject.set(x, "isDefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Function1[/* value */ V, js.Any] => Option[js.Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[V]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    }
  }
}
