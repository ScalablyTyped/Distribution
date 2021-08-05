package typings.awsSdkProtocolTimestamp

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def epoch(time: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def epoch(time: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def epoch(time: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epoch")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def iso8601(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rfc822(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc822")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rfc822(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc822")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def rfc822(time: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rfc822")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDate(time: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def toDate(time: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def toDate(time: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
}
