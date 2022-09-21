package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaTypings.projectionMod.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionAssembleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/projection/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleProjectionForModel(model: Model): js.Array[Projection] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleProjectionForModel")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Projection]]
  
  inline def assembleProjections(model: Model): js.Array[Projection] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleProjections")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Projection]]
  
  inline def assembleProjectionsForModelAndChildren(model: Model): js.Array[Projection] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleProjectionsForModelAndChildren")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Projection]]
}
