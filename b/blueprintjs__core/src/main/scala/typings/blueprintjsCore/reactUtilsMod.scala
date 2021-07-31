package typings.blueprintjsCore

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createReactRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReactRef")().asInstanceOf[RefObject[T]]
  
  @scala.inline
  def ensureElement(): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")().asInstanceOf[js.UndefOr[ReactElement]]
  @scala.inline
  def ensureElement(
    child: Unit,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  @scala.inline
  def ensureElement(child: ReactNode): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReactElement]]
  @scala.inline
  def ensureElement(
    child: ReactNode,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  
  @scala.inline
  def getDisplayName(ComponentClass: INamed): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getDisplayName(ComponentClass: ComponentType[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isElementOfType[P](element: js.Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], ComponentType.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def isReactElement[T](child: ReactNode): /* is react.react.ReactElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactElement")(child.asInstanceOf[js.Any]).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  @scala.inline
  def isReactNodeEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")().asInstanceOf[Boolean]
  @scala.inline
  def isReactNodeEmpty(node: Unit, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isReactNodeEmpty(node: ReactNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isReactNodeEmpty(node: ReactNode, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait INamed extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object INamed {
    
    @scala.inline
    def apply(): INamed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INamed]
    }
    
    @scala.inline
    implicit class INamedMutableBuilder[Self <: INamed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type LifecycleCompatPolyfill[P, T /* <: ComponentClass[P, ComponentState] */] = js.Function1[
    /* Comp */ T, 
    T & typings.blueprintjsCore.blueprintjsCoreStrings.LifecycleCompatPolyfill & TopLevel[T]
  ]
}
