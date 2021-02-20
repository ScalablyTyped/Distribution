package typings.blueprintjsCore

import typings.blueprintjsCore.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "arraysEqual")
  @js.native
  def arraysEqual(arrA: js.Array[_], arrB: js.Array[_]): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "arraysEqual")
  @js.native
  def arraysEqual(
    arrA: js.Array[_],
    arrB: js.Array[_],
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]
  ): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "deepCompareKeys")
  @js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "deepCompareKeys")
  @js.native
  def deepCompareKeys(objA: js.Any, objB: js.Any, keys: js.Array[String | Double | js.Symbol]): Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: T, objB: js.UndefOr[scala.Nothing], keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](objA: js.UndefOr[scala.Nothing], objB: T, keys: js.Array[/* keyof T */ String]): js.Array[Key[T]] = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "getDeepUnequalKeyValues")
  @js.native
  def getDeepUnequalKeyValues[T /* <: js.Object */](
    objA: js.UndefOr[scala.Nothing],
    objB: js.UndefOr[scala.Nothing],
    keys: js.Array[/* keyof T */ String]
  ): js.Array[Key[T]] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "shallowCompareKeys")
  @js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "shallowCompareKeys")
  @js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyAllowlist[T]): Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/utils/compareUtils", "shallowCompareKeys")
  @js.native
  def shallowCompareKeys[T /* <: js.Object */](objA: T, objB: T, keys: IKeyDenylist[T]): Boolean = js.native
  
  @js.native
  trait IKeyAllowlist[T] extends StObject {
    
    var include: js.Array[/* keyof T */ String] = js.native
  }
  object IKeyAllowlist {
    
    @scala.inline
    def apply[T](include: js.Array[/* keyof T */ String]): IKeyAllowlist[T] = {
      val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyAllowlist[T]]
    }
    
    @scala.inline
    implicit class IKeyAllowlistMutableBuilder[Self <: IKeyAllowlist[_], T] (val x: Self with IKeyAllowlist[T]) extends AnyVal {
      
      @scala.inline
      def setInclude(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
  
  type IKeyBlacklist[T] = IKeyDenylist[T]
  
  @js.native
  trait IKeyDenylist[T] extends StObject {
    
    var exclude: js.Array[/* keyof T */ String] = js.native
  }
  object IKeyDenylist {
    
    @scala.inline
    def apply[T](exclude: js.Array[/* keyof T */ String]): IKeyDenylist[T] = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKeyDenylist[T]]
    }
    
    @scala.inline
    implicit class IKeyDenylistMutableBuilder[Self <: IKeyDenylist[_], T] (val x: Self with IKeyDenylist[T]) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
  
  type IKeyWhitelist[T] = IKeyAllowlist[T]
}
