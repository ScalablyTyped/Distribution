package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Object` */
object objectMod {
  
  @JSImport("core-js/core/object", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("core-js/core/object", "classof")
  @js.native
  def classof(value: js.Any): java.lang.String = js.native
  
  @JSImport("core-js/core/object", "create")
  @js.native
  def create(o: js.Any): js.Any = js.native
  @JSImport("core-js/core/object", "create")
  @js.native
  def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("core-js/core/object", "define")
  @js.native
  def define[T](target: T, mixin: js.Any): T = js.native
  
  @JSImport("core-js/core/object", "defineProperties")
  @js.native
  def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("core-js/core/object", "defineProperty")
  @js.native
  def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = js.native
  
  @JSImport("core-js/core/object", "entries")
  @js.native
  def entries(`object`: js.Any): Array[_] = js.native
  
  @JSImport("core-js/core/object", "freeze")
  @js.native
  def freeze[T](o: T): T = js.native
  
  @JSImport("core-js/core/object", "getOwnPropertyDescriptor")
  @js.native
  def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
  
  @JSImport("core-js/core/object", "getOwnPropertyDescriptors")
  @js.native
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
  
  @JSImport("core-js/core/object", "getOwnPropertyNames")
  @js.native
  def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
  
  @JSImport("core-js/core/object", "getOwnPropertySymbols")
  @js.native
  def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
  
  @JSImport("core-js/core/object", "getPrototypeOf")
  @js.native
  def getPrototypeOf(o: js.Any): js.Any = js.native
  
  @JSImport("core-js/core/object", "is")
  @js.native
  def is(value1: js.Any, value2: js.Any): Boolean = js.native
  
  @JSImport("core-js/core/object", "isExtensible")
  @js.native
  def isExtensible(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/core/object", "isFrozen")
  @js.native
  def isFrozen(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/core/object", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("core-js/core/object", "isSealed")
  @js.native
  def isSealed(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/core/object", "keys")
  @js.native
  def keys(o: js.Any): Array[java.lang.String] = js.native
  
  @JSImport("core-js/core/object", "make")
  @js.native
  def make[T](proto: T): T = js.native
  @JSImport("core-js/core/object", "make")
  @js.native
  def make[T](proto: T, mixin: js.Any): T = js.native
  
  @JSImport("core-js/core/object", "preventExtensions")
  @js.native
  def preventExtensions[T](o: T): T = js.native
  
  @JSImport("core-js/core/object", "seal")
  @js.native
  def seal[T](o: T): T = js.native
  
  @JSImport("core-js/core/object", "setPrototypeOf")
  @js.native
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
  
  @JSImport("core-js/core/object", "values")
  @js.native
  def values(`object`: js.Any): Array[_] = js.native
}
