package typings.blueprintjsCore

import typings.blueprintjsCore.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arraysEqual(arrA: js.Array[js.Any], arrB: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def arraysEqual(
    arrA: js.Array[js.Any],
    arrB: js.Array[js.Any],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")().asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any]).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  @scala.inline
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: Unit, objB: Unit, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepUnequalKeyValues")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key[T]]]
  
  @scala.inline
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyAllowlist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyDenylist[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompareKeys")(objA.asInstanceOf[js.Any], objB.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IKeyAllowlist[T] extends StObject {
    
    var include: js.Array[/* keyof T */ String]
  }
  object IKeyAllowlist {
    
    @scala.inline
    def apply[T](include: js.Array[/* keyof T */ String]): IKeyAllowlist[T] = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyAllowlist[T]]
    }
    
    @scala.inline
    implicit class IKeyAllowlistMutableBuilder[Self <: IKeyAllowlist[?], T] (val x: Self & IKeyAllowlist[T]) extends AnyVal {
      
      @scala.inline
      def setInclude(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  type IKeyBlacklist[T] = IKeyDenylist[T]
  
  trait IKeyDenylist[T] extends StObject {
    
    var exclude: js.Array[/* keyof T */ String]
  }
  object IKeyDenylist {
    
    @scala.inline
    def apply[T](exclude: js.Array[/* keyof T */ String]): IKeyDenylist[T] = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyDenylist[T]]
    }
    
    @scala.inline
    implicit class IKeyDenylistMutableBuilder[Self <: IKeyDenylist[?], T] (val x: Self & IKeyDenylist[T]) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
  
  type IKeyWhitelist[T] = IKeyAllowlist[T]
}
