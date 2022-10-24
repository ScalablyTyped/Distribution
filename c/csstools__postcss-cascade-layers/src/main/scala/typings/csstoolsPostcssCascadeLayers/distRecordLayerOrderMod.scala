package typings.csstoolsPostcssCascadeLayers

import typings.csstoolsPostcssCascadeLayers.anon.Options
import typings.csstoolsPostcssCascadeLayers.distModelMod.Model
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRecordLayerOrderMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/record-layer-order", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recordLayerOrder(root: Container[ChildNode], model: Model, param2: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordLayerOrder")(root.asInstanceOf[js.Any], model.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
