package typings.bidirectionalMap

import org.scalablytyped.runtime.StringDictionary
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bidirectional-map", JSImport.Default)
  @js.native
  class default[TValue] ()
    extends StObject
       with BiMap[TValue] {
    def this(`object`: StringDictionary[TValue]) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(key: String): Unit = js.native
    
    /* CompleteClass */
    override def deleteValue(value: TValue): Unit = js.native
    
    /* CompleteClass */
    override def entries(): IterableIterator[js.Tuple2[String, TValue]] = js.native
    
    /* CompleteClass */
    override def get(key: String): TValue = js.native
    
    /* CompleteClass */
    override def getKey(value: TValue): String = js.native
    
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def hasValue(value: TValue): Boolean = js.native
    
    /* CompleteClass */
    override def keys(): IterableIterator[String] = js.native
    
    /* CompleteClass */
    override def set(key: String, value: TValue): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def values(): IterableIterator[TValue] = js.native
  }
  
  trait BiMap[TValue] extends StObject {
    
    def clear(): Unit
    
    def delete(key: String): Unit
    
    def deleteValue(value: TValue): Unit
    
    def entries(): IterableIterator[js.Tuple2[String, TValue]]
    
    def get(key: String): TValue
    
    def getKey(value: TValue): String
    
    def has(key: String): Boolean
    
    def hasValue(value: TValue): Boolean
    
    def keys(): IterableIterator[String]
    
    def set(key: String, value: TValue): Unit
    
    var size: Double
    
    def values(): IterableIterator[TValue]
  }
  object BiMap {
    
    inline def apply[TValue](
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
    
    extension [Self <: BiMap[?], TValue](x: Self & BiMap[TValue]) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setDeleteValue(value: TValue => Unit): Self = StObject.set(x, "deleteValue", js.Any.fromFunction1(value))
      
      inline def setEntries(value: () => IterableIterator[js.Tuple2[String, TValue]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => TValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetKey(value: TValue => String): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setHasValue(value: TValue => Boolean): Self = StObject.set(x, "hasValue", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => IterableIterator[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, TValue) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValues(value: () => IterableIterator[TValue]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
