package typings.csstoolsPostcssCascadeLayers

import typings.postcss.mod.Container
import typings.postcss.nodeMod.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cleanBlocksMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/clean-blocks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeEmptyAncestorBlocks(block: Container[ChildNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyAncestorBlocks")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeEmptyDescendantBlocks(block: Container[ChildNode]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyDescendantBlocks")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
