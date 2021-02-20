package typings.bidirectionalMap

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bidirectional-map", JSImport.Default)
  @js.native
  class default[TValue] () extends BiMap[TValue] {
    def this(`object`: StringDictionary[TValue]) = this()
  }
  
  @js.native
  trait BiMap[TValue] extends StObject {
    
    def clear(): Unit = js.native
    
    def delete(key: String): Unit = js.native
    
    def deleteValue(value: TValue): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[String, TValue]] = js.native
    
    def get(key: String): TValue = js.native
    
    def getKey(value: TValue): String = js.native
    
    def has(key: String): Boolean = js.native
    
    def hasValue(value: TValue): Boolean = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(key: String, value: TValue): Unit = js.native
    
    var size: Double = js.native
    
    def values(): IterableIterator[TValue] = js.native
  }
  object BiMap {
    
    @scala.inline
    def apply[TValue](
      clear: () => Unit,
      delete: String => Unit,
      deleteValue: TValue => Unit,
      entries: () => IterableIterator[js.Tuple2[String, TValue]],
      get: String => TValue,
      getKey: TValue => String,
      has: String => Boolean,
      hasValue: TValue => Boolean,
      keys: () => IterableIterator[String],
      set: (String, TValue) => Unit,
      size: Double,
      values: () => IterableIterator[TValue]
    ): BiMap[TValue] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), delete = js.Any.fromFunction1(delete), deleteValue = js.Any.fromFunction1(deleteValue), entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), getKey = js.Any.fromFunction1(getKey), has = js.Any.fromFunction1(has), hasValue = js.Any.fromFunction1(hasValue), keys = js.Any.fromFunction0(keys), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[BiMap[TValue]]
    }
    
    @scala.inline
    implicit class BiMapMutableBuilder[Self <: BiMap[_], TValue] (val x: Self with BiMap[TValue]) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDeleteValue(value: TValue => Unit): Self = StObject.set(x, "deleteValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEntries(value: () => IterableIterator[js.Tuple2[String, TValue]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetKey(value: TValue => String): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasValue(value: TValue => Boolean): Self = StObject.set(x, "hasValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => IterableIterator[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, TValue) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: () => IterableIterator[TValue]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
