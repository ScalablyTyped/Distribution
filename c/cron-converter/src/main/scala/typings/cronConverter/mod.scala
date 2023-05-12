package typings.cronConverter

import typings.cronConverter.anon.PartialOptions
import typings.cronConverter.distMjsScheduleMod.Schedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cron-converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToString(arr: js.Array[js.Array[Double]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToString")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def arrayToString(arr: js.Array[js.Array[Double]], options: PartialOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayToString")(arr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSchedule(arr: js.Array[js.Array[Double]]): Schedule = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchedule")(arr.asInstanceOf[js.Any]).asInstanceOf[Schedule]
  inline def getSchedule(arr: js.Array[js.Array[Double]], now: String): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchedule")(arr.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Schedule]
  inline def getSchedule(arr: js.Array[js.Array[Double]], now: String, timezone: String): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchedule")(arr.asInstanceOf[js.Any], now.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Schedule]
  inline def getSchedule(arr: js.Array[js.Array[Double]], now: js.Date): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchedule")(arr.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Schedule]
  inline def getSchedule(arr: js.Array[js.Array[Double]], now: js.Date, timezone: String): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchedule")(arr.asInstanceOf[js.Any], now.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Schedule]
  inline def getSchedule(arr: js.Array[js.Array[Double]], now: Unit, timezone: String): Schedule = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchedule")(arr.asInstanceOf[js.Any], now.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Schedule]
  
  inline def getUnits(): js.Array[typings.cronConverter.distMjsTypesMod.Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnits")().asInstanceOf[js.Array[typings.cronConverter.distMjsTypesMod.Unit]]
  
  inline def stringToArray(str: String): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
}
