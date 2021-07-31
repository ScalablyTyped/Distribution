package typings.baconjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalMod {
  
  @JSImport("baconjs/types/optional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @hidden */
  object None_ {
    
    @JSImport("baconjs/types/optional", "None")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def filter(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[js.Any]
    
    @scala.inline
    def forEach(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")().asInstanceOf[Unit]
    
    @scala.inline
    def get(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[scala.Nothing]
    
    @scala.inline
    def getOrElse[V](value: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(value.asInstanceOf[js.Any]).asInstanceOf[V]
    
    @scala.inline
    def inspect(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")().asInstanceOf[String]
    
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
    
    @scala.inline
    def map(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[js.Any]
    
    @scala.inline
    def toArray(): js.Array[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")().asInstanceOf[js.Array[scala.Nothing]]
    
    @scala.inline
    def toString_(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[String]
  }
  
  /** @hidden */
  @JSImport("baconjs/types/optional", "Some")
  @js.native
  class Some[V] protected ()
    extends StObject
       with Option[V] {
    def this(value: V) = this()
    
    var _isSome: Boolean = js.native
    
    /* CompleteClass */
    override def filter(f: js.Function1[V, Boolean]): Option[V] = js.native
    
    /* CompleteClass */
    override def forEach(f: js.Function1[V, js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def get(): V = js.native
    
    /* CompleteClass */
    override def getOrElse(arg: V): V = js.native
    
    /* CompleteClass */
    override def inspect(): String = js.native
    
    /* CompleteClass */
    var isDefined: Boolean = js.native
    
    /* CompleteClass */
    override def map[V2](f: js.Function1[V, V2]): Option[V2] = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[V] = js.native
    
    var value: V = js.native
  }
  
  @scala.inline
  def isNone(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def none[T](): Option[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[Option[T]]
  
  @scala.inline
  def toOption[V](v: V): Option[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toOption")(v.asInstanceOf[js.Any]).asInstanceOf[Option[V]]
  @scala.inline
  def toOption[V](v: Option[V]): Option[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("toOption")(v.asInstanceOf[js.Any]).asInstanceOf[Option[V]]
  
  trait Option[V] extends StObject {
    
    def filter(f: js.Function1[/* value */ V, Boolean]): Option[V]
    
    def forEach(f: js.Function1[/* value */ V, js.Any]): Unit
    
    def get(): V
    
    def getOrElse(arg: V): V
    
    def inspect(): String
    
    var isDefined: Boolean
    
    def map[V2](f: js.Function1[/* value */ V, V2]): Option[V2]
    
    def toArray(): js.Array[V]
  }
  object Option {
    
    @scala.inline
    def apply[V](
      filter: js.Function1[/* value */ V, Boolean] => Option[V],
      forEach: js.Function1[/* value */ V, js.Any] => Unit,
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
    implicit class OptionMutableBuilder[Self <: Option[?], V] (val x: Self & Option[V]) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Function1[/* value */ V, Boolean] => Option[V]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function1[/* value */ V, js.Any] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
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
