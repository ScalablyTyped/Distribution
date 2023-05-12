package typings.csstoolsPostcssCascadeLayers

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Container
import typings.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSomeInTreeMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/some-in-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def someAtRuleInTree(container: Container[ChildNode], predicate: js.Function1[/* node */ AtRule_, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someAtRuleInTree")(container.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def someInTree(
    container: Container[ChildNode],
    predicate: js.Function1[/* node */ typings.postcss.libNodeMod.ChildNode, Boolean]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("someInTree")(container.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
