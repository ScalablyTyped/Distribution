package typings.cronConverter

import typings.cronConverter.distMjsTypesMod.Options
import typings.cronConverter.distMjsTypesMod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsPartMod {
  
  @JSImport("cron-converter/dist/mjs/part", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToStringPart(arr: js.Array[Double], unit: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToStringPart")(arr.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringToArrayPart(str: String, unit: Unit): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayPart")(str.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
