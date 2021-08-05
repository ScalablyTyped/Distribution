package typings.awsSdkSmithyClient

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("@aws-sdk/smithy-client/dist/cjs/date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateToUtcString(date: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToUtcString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
}
