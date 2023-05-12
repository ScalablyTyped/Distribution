package typings.csstoolsPostcssLogicalResize

import typings.csstoolsPostcssLogicalResize.distLibTypesMod.DirectionConfig
import typings.postcss.mod.Declaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTransformResizeMod {
  
  @JSImport("@csstools/postcss-logical-resize/dist/lib/transform-resize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformResize(directionConfig: DirectionConfig): js.Function1[/* declaration */ Declaration, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformResize")(directionConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* declaration */ Declaration, Boolean]]
}
