package typings.coreJs

import typings.std.PropertyDescriptorMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Object` */
object libraryCoreObjectMod {
  
  @JSImport("core-js/library/core/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def classof(value: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("classof")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def create(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def create(o: Any, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def define[T](target: T, mixin: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(target.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def defineProperties(o: Any, properties: PropertyDescriptorMap): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperties")(o.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def defineProperty(o: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def entries(`object`: Any): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("entries")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
  
  inline def freeze[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getOwnPropertyDescriptor(o: Any, propertyKey: PropertyKey): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(o.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  
  inline def getOwnPropertyDescriptors(`object`: Any): PropertyDescriptorMap = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptors")(`object`.asInstanceOf[js.Any]).asInstanceOf[PropertyDescriptorMap]
  
  inline def getOwnPropertyNames(o: Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyNames")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
  
  inline def getOwnPropertySymbols(o: Any): Array[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertySymbols")(o.asInstanceOf[js.Any]).asInstanceOf[Array[js.Symbol]]
  
  inline def getPrototypeOf(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def is(value1: Any, value2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExtensible(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFrozen(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrozen")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSealed(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSealed")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def keys(o: Any): Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(o.asInstanceOf[js.Any]).asInstanceOf[Array[java.lang.String]]
  
  inline def make[T](proto: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def make[T](proto: T, mixin: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(proto.asInstanceOf[js.Any], mixin.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def preventExtensions[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def seal[T](o: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("seal")(o.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def setPrototypeOf(o: Any, proto: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(o.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def values(`object`: Any): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(`object`.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
}
