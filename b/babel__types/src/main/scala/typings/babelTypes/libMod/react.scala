package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object react {
  
  @JSImport("@babel/types/lib", "react")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@babel/types/lib", "react.buildChildren")
  @js.native
  def buildChildren: js.Function1[/* node */ JSXElement__ | JSXFragment__, js.Array[ReturnedChild]] = js.native
  inline def buildChildren(node: JSXElement__): js.Array[ReturnedChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReturnedChild]]
  inline def buildChildren(node: JSXFragment__): js.Array[ReturnedChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildChildren")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReturnedChild]]
  inline def buildChildren_=(x: js.Function1[/* node */ JSXElement__ | JSXFragment__, js.Array[ReturnedChild]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildChildren")(x.asInstanceOf[js.Any])
  
  inline def isCompatTag(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompatTag")().asInstanceOf[Boolean]
  inline def isCompatTag(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompatTag")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @JSImport("@babel/types/lib", "react.isCompatTag")
  @js.native
  def isCompatTag_Freact: js.Function1[/* tagName */ js.UndefOr[String], Boolean] = js.native
  
  inline def isCompatTag_Freact_=(x: js.Function1[/* tagName */ js.UndefOr[String], Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCompatTag")(x.asInstanceOf[js.Any])
  
  inline def isReactComponent(member: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactComponent")(member.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
