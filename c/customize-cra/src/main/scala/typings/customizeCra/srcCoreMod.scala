package typings.customizeCra

import typings.customizeCra.anon.Dest
import typings.customizeCra.customizeCraBooleans.`false`
import typings.customizeCra.customizeCraInts.`0`
import typings.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreMod {
  
  @JSImport("customize-cra/src/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBabelLoader(config: Configuration, isOutsideOfApp: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBabelLoader")(config.asInstanceOf[js.Any], isOutsideOfApp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def `override`(args: (js.UndefOr[OverrideFunc | `false` | Null | `0`])*): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[OverrideFunc]
  
  inline def overrideDevServer(args: OverrideFunc*): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideDevServer")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[OverrideFunc]
  
  inline def tap(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")().asInstanceOf[OverrideFunc]
  inline def tap(options: Dest): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  type OverrideFunc = js.Function1[/* config */ Configuration, Configuration]
}
