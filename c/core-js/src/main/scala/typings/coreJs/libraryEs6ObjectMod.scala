package typings.coreJs

import typings.std.PropertyDescriptor
import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Object` */
object libraryEs6ObjectMod {
  
  @JSImport("core-js/library/es6/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def classof(value: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classof")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def create(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def define[T](target: T, mixin: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(target.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: PropertyDescriptor): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def entries(`object`: js.Any): Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
  
  inline def freeze[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[PropertyDescriptor]
  
  inline def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(`object`.asInstanceOf[js.Any]).asInstanceOf[PropertyDescriptorMap]
  
  inline def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyNames")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
  
  inline def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertySymbols")(o.asInstanceOf[js.Any]).asInstanceOf[Array[js.Symbol]]
  
  inline def getPrototypeOf(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def is(value1: js.Any, value2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExtensible(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFrozen(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozen")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSealed(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSealed")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(o: js.Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
  
  inline def make[T](proto: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def make[T](proto: T, mixin: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def preventExtensions[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def seal[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("seal")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def values(`object`: js.Any): Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
}
