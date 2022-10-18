package typings.cfcsCore

import typings.cfcsCore.declarationCoreTypesMod.Ref
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationDomUtilsMod {
  
  @JSImport("@cfcs/core/declaration/dom/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findTarget[Target /* <: Element */](): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")().asInstanceOf[Target | Null]
  inline def findTarget[Target /* <: Element */](target: Target): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target | Null]
  inline def findTarget[Target /* <: Element */](target: String): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target | Null]
  inline def findTarget[Target /* <: Element */](target: Ref[Target]): Target | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target | Null]
  
  inline def withClassMethods(methods: js.Array[String]): js.Function2[/* prototype */ Any, /* memberName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withClassMethods")(methods.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* prototype */ Any, /* memberName */ String, Unit]]
}
