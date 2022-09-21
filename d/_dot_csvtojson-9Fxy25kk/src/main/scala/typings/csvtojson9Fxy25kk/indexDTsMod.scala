package typings.csvtojson9Fxy25kk

import typings.csvtojson9Fxy25kk.anon.PartialCSVParseParam
import typings.csvtojson9Fxy25kk.converterDTsMod.Converter
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexDTsMod {
  
  inline def apply(): Converter = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Converter]
  inline def apply(param: Unit, options: TransformOptions): Converter = (^.asInstanceOf[js.Dynamic].apply(param.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Converter]
  inline def apply(param: PartialCSVParseParam): Converter = ^.asInstanceOf[js.Dynamic].apply(param.asInstanceOf[js.Any]).asInstanceOf[Converter]
  inline def apply(param: PartialCSVParseParam, options: TransformOptions): Converter = (^.asInstanceOf[js.Dynamic].apply(param.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Converter]
  
  @JSImport(".csvtojson-9Fxy25kk/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
