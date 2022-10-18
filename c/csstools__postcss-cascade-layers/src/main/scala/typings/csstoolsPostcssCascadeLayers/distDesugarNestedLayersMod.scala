package typings.csstoolsPostcssCascadeLayers

import typings.csstoolsPostcssCascadeLayers.distModelMod.Model
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDesugarNestedLayersMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/desugar-nested-layers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def desugarNestedLayers(root: Container[ChildNode], model: Model): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("desugarNestedLayers")(root.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
