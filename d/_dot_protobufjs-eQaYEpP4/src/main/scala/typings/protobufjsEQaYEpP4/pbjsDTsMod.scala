package typings.protobufjsEQaYEpP4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbjsDTsMod {
  
  @JSImport(".protobufjs-eQaYEpP4/cli/pbjs.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  type pbjsCallback = js.Function2[/* err */ js.Error | Null, /* output */ js.UndefOr[String], Unit]
}
