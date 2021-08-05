package typings.blueprintjsCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRef[T](): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[T | Null]
  inline def getRef[T](ref: T): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  inline def getRef[T](ref: IRefObject[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")(ref.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def isRefCallback[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefCallback")().asInstanceOf[/* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean]
  inline def isRefCallback[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefCallback")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean]
  
  inline def isRefObject[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")().asInstanceOf[/* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean]
  inline def isRefObject[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean]
  
  type IRef[T] = IRefObject[T] | IRefCallback[T]
  
  type IRefCallback[T] = js.Function1[/* ref */ T | Null, js.Any]
  
  trait IRefObject[T] extends StObject {
    
    var current: T | Null
  }
  object IRefObject {
    
    inline def apply[T](): IRefObject[T] = {
      val __obj = js.Dynamic.literal(current = null)
      __obj.asInstanceOf[IRefObject[T]]
    }
    
    extension [Self <: IRefObject[?], T](x: Self & IRefObject[T]) {
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
}
