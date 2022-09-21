package typings.cssnanoUtils

import typings.cssnanoUtils.anon.Parent
import typings.postcss.nodeMod.AnyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sameParentMod {
  
  /** @typedef {import('postcss').AnyNode & {parent?: Child}} Child */
  /**
    * @param {Child} nodeA
    * @param {Child} nodeB
    * @return {boolean}
    */
  inline def apply(nodeA: Child, nodeB: Child): Boolean = (^.asInstanceOf[js.Dynamic].apply(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("cssnano-utils/types/sameParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Child = AnyNode & Parent
}
