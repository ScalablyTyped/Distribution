package typings.bidirectionalMap.mod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BiMap[TValue] extends js.Object {
  
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
  implicit class BiMapOps[Self <: BiMap[_], TValue] (val x: Self with BiMap[TValue]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDelete(value: String => Unit): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteValue(value: TValue => Unit): Self = this.set("deleteValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEntries(value: () => IterableIterator[js.Tuple2[String, TValue]]): Self = this.set("entries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => TValue): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKey(value: TValue => String): Self = this.set("getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasValue(value: TValue => Boolean): Self = this.set("hasValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeys(value: () => IterableIterator[String]): Self = this.set("keys", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (String, TValue) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: () => IterableIterator[TValue]): Self = this.set("values", js.Any.fromFunction0(value))
  }
}
