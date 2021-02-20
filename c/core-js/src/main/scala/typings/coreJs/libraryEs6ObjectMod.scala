package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Object` */
object libraryEs6ObjectMod {
  
  @JSImport("core-js/library/es6/object", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("core-js/library/es6/object", "classof")
  @js.native
  def classof(value: js.Any): java.lang.String = js.native
  
  @JSImport("core-js/library/es6/object", "create")
  @js.native
  def create(o: js.Any): js.Any = js.native
  @JSImport("core-js/library/es6/object", "create")
  @js.native
  def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("core-js/library/es6/object", "define")
  @js.native
  def define[T](target: T, mixin: js.Any): T = js.native
  
  @JSImport("core-js/library/es6/object", "defineProperties")
  @js.native
  def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("core-js/library/es6/object", "defineProperty")
  @js.native
  def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = js.native
  
  @JSImport("core-js/library/es6/object", "entries")
  @js.native
  def entries(`object`: js.Any): Array[_] = js.native
  
  @JSImport("core-js/library/es6/object", "freeze")
  @js.native
  def freeze[T](o: T): T = js.native
  
  @JSImport("core-js/library/es6/object", "getOwnPropertyDescriptor")
  @js.native
  def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = js.native
  
  @JSImport("core-js/library/es6/object", "getOwnPropertyDescriptors")
  @js.native
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
  
  @JSImport("core-js/library/es6/object", "getOwnPropertyNames")
  @js.native
  def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
  
  @JSImport("core-js/library/es6/object", "getOwnPropertySymbols")
  @js.native
  def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
  
  @JSImport("core-js/library/es6/object", "getPrototypeOf")
  @js.native
  def getPrototypeOf(o: js.Any): js.Any = js.native
  
  @JSImport("core-js/library/es6/object", "is")
  @js.native
  def is(value1: js.Any, value2: js.Any): Boolean = js.native
  
  @JSImport("core-js/library/es6/object", "isExtensible")
  @js.native
  def isExtensible(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/library/es6/object", "isFrozen")
  @js.native
  def isFrozen(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/library/es6/object", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("core-js/library/es6/object", "isSealed")
  @js.native
  def isSealed(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/library/es6/object", "keys")
  @js.native
  def keys(o: js.Any): Array[java.lang.String] = js.native
  
  @JSImport("core-js/library/es6/object", "make")
  @js.native
  def make[T](proto: T): T = js.native
  @JSImport("core-js/library/es6/object", "make")
  @js.native
  def make[T](proto: T, mixin: js.Any): T = js.native
  
  @JSImport("core-js/library/es6/object", "preventExtensions")
  @js.native
  def preventExtensions[T](o: T): T = js.native
  
  @JSImport("core-js/library/es6/object", "seal")
  @js.native
  def seal[T](o: T): T = js.native
  
  @JSImport("core-js/library/es6/object", "setPrototypeOf")
  @js.native
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
  
  @JSImport("core-js/library/es6/object", "values")
  @js.native
  def values(`object`: js.Any): Array[_] = js.native
}
