package typings.cronValidate

import org.scalablytyped.runtime.StringDictionary
import typings.cronValidate.libResultMod.Result
import typings.cronValidate.libTypesMod.InputOptions
import typings.cronValidate.libTypesMod.OptionPreset
import typings.cronValidate.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOptionMod {
  
  @JSImport("cron-validate/lib/option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOptionPreset(presetId: String): Result[OptionPreset, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionPreset")(presetId.asInstanceOf[js.Any]).asInstanceOf[Result[OptionPreset, String]]
  
  inline def getOptionPresets(): StringDictionary[OptionPreset] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionPresets")().asInstanceOf[StringDictionary[OptionPreset]]
  
  inline def registerOptionPreset(presetName: String, preset: OptionPreset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOptionPreset")(presetName.asInstanceOf[js.Any], preset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateOptions(inputOptions: InputOptions): Result[Options, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(inputOptions.asInstanceOf[js.Any]).asInstanceOf[Result[Options, js.Array[String]]]
}
