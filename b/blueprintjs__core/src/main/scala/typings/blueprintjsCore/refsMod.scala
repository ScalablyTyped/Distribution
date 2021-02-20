package typings.blueprintjsCore

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "getRef")
  @js.native
  def getRef[T](): T | Null = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "getRef")
  @js.native
  def getRef[T](ref: T): T | Null = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "getRef")
  @js.native
  def getRef[T](ref: IRefObject[T]): T | Null = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "isRefCallback")
  @js.native
  def isRefCallback[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "isRefCallback")
  @js.native
  def isRefCallback[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefCallback<T> */ Boolean = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "isRefObject")
  @js.native
  def isRefObject[T /* <: HTMLElement */](): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = js.native
  @JSImport("@blueprintjs/core/lib/esm/common/refs", "isRefObject")
  @js.native
  def isRefObject[T /* <: HTMLElement */](value: IRef[T]): /* is @blueprintjs/core.@blueprintjs/core/lib/esm/common/refs.IRefObject<T> */ Boolean = js.native
  
  type IRef[T] = IRefObject[T] | IRefCallback[T]
  
  type IRefCallback[T] = js.Function1[/* ref */ T | Null, js.Any]
  
  @js.native
  trait IRefObject[T] extends StObject {
    
    var current: T | Null = js.native
  }
  object IRefObject {
    
    @scala.inline
    def apply[T](): IRefObject[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRefObject[T]]
    }
    
    @scala.inline
    implicit class IRefObjectMutableBuilder[Self <: IRefObject[_], T] (val x: Self with IRefObject[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentNull: Self = StObject.set(x, "current", null)
    }
  }
}
