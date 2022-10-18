package typings.csstoolsPostcssCascadeLayers

import typings.csstoolsPostcssCascadeLayers.distModelMod.Model
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDesugarAndParseLayerNamesMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/desugar-and-parse-layer-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def desugarAndParseLayerNames(root: Container[ChildNode], model: Model): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("desugarAndParseLayerNames")(root.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
