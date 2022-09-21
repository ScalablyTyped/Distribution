package typings.awsSdkProtocolTimestamp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def epoch(time: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def epoch(time: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def epoch(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def iso8601(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rfc822(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc822")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rfc822(time: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc822")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rfc822(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc822")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDate(time: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(time: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(time: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
