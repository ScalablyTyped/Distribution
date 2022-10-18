package typings.blueprintjsCore

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonUtilsReactUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureElement(): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")().asInstanceOf[js.UndefOr[ReactElement]]
  inline def ensureElement(
    child: Unit,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  inline def ensureElement(child: ReactNode): js.UndefOr[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ReactElement]]
  inline def ensureElement(
    child: ReactNode,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
  ): js.UndefOr[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ReactElement]]
  
  inline def getDisplayName(ComponentClass: INamed): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDisplayName(ComponentClass: ComponentType[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isElementOfType[P](element: Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], ComponentType.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def isReactNodeEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")().asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: Unit, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: ReactNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: ReactNode, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Represents anything that has a `name` property such as Functions.
    */
  trait INamed extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object INamed {
    
    inline def apply(): INamed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INamed]
    }
    
    extension [Self <: INamed](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
