package typings.awsSdkSignatureV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilDateMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/utilDate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iso8601(time: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def iso8601(time: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8601")(time.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toDate(time: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(time: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toDate(time: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(time.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
