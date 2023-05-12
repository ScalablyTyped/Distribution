package typings.cronValidate

import typings.cronValidate.libResultMod.Result
import typings.cronValidate.libTypesMod.Options
import typings.cronValidate.mod.CronData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldCheckersDayOfMonthCheckerMod {
  
  @JSImport("cron-validate/lib/fieldCheckers/dayOfMonthChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cronData: CronData, options: Options): Result[Boolean, js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cronData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[Boolean, js.Array[String]]]
}
