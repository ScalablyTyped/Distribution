package typings.baseui

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHelpersMod {
  
  @JSImport("baseui/helpers/react-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenFragments(): js.Array[ReactNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")().asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: Unit, ChildWrapper: Unit, depth: Double): js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: Unit, ChildWrapper: ComponentType[js.Object]): js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: Unit, ChildWrapper: ComponentType[js.Object], depth: Double): js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: ReactNode): js.Array[ReactNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: ReactNode, ChildWrapper: Unit, depth: Double): js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: ReactNode, ChildWrapper: ComponentType[js.Object]): js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactNode]]
  inline def flattenFragments(children: ReactNode, ChildWrapper: ComponentType[js.Object], depth: Double): js.Array[ReactNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactNode]]
}
