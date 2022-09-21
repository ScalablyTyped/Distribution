package typings.blueprintjsCore

import typings.blueprintjsCore.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arraysEqual(arrA: js.Array[Any], arrB: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(arrA: js.Array[Any], arrB: js.Array[Any], compare: js.Function2[/* a */ Any, /* b */ Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deepCompareKeys(objA: Any, objB: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def deepCompareKeys(objA: Any, objB: Any, keys: js.Array[String | Double | js.Symbol]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")().asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  inline def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  
  inline def shallowCompareKeys[T /* <: js.Object */](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")().asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Null, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Null, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Unit, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: Unit, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: T, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: T, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Null, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Null, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Unit, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Null, objB: Unit, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: T, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: T, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Null, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Null, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Unit, keys: KeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def shallowCompareKeys[T /* <: js.Object */](objA: Unit, objB: Unit, keys: KeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IKeyAllowlist[T] extends StObject {
    
    var include: js.Array[/* keyof T */ String]
  }
  object IKeyAllowlist {
    
    inline def apply[T](include: js.Array[/* keyof T */ String]): IKeyAllowlist[T] = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyAllowlist[T]]
    }
    
    extension [Self <: IKeyAllowlist[?], T](x: Self & IKeyAllowlist[T]) {
      
      inline def setInclude(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait IKeyDenylist[T] extends StObject {
    
    var exclude: js.Array[/* keyof T */ String]
  }
  object IKeyDenylist {
    
    inline def apply[T](exclude: js.Array[/* keyof T */ String]): IKeyDenylist[T] = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyDenylist[T]]
    }
    
    extension [Self <: IKeyDenylist[?], T](x: Self & IKeyDenylist[T]) {
      
      inline def setExclude(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  type KeyAllowlist[T] = IKeyAllowlist[T]
  
  type KeyDenylist[T] = IKeyDenylist[T]
}
