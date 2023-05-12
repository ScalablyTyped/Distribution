package typings.azureKustoData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcTimeUtilsMod {
  
  @JSImport("azure-kusto-data/types/src/timeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseKustoTimestampToMillis(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKustoTimestampToMillis")().asInstanceOf[Double]
  inline def parseKustoTimestampToMillis(t: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKustoTimestampToMillis")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toMilliseconds(hours: Double, minutes: Double, seconds: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toMilliseconds")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[Double]
}
