package typings.cronValidate

import typings.cronValidate.libResultMod.Result
import typings.cronValidate.libTypesMod.Options
import typings.cronValidate.mod.CronFieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelperMod {
  
  @JSImport("cron-validate/lib/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cronField: String, cronFieldType: CronFieldType, options: Options): Result[Boolean, js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cronField.asInstanceOf[js.Any], cronFieldType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[Boolean, js.Array[String]]]
}
