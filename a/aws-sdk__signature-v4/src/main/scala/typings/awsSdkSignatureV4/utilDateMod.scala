package typings.awsSdkSignatureV4

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilDateMod {
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/utilDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iso8601(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDate(time: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def toDate(time: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def toDate(time: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
}
