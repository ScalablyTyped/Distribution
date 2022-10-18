package typings.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDateUtilsMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/date-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateToUtcString(date: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToUtcString")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseEpochTimestamp(value: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEpochTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def parseRfc3339DateTime(value: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRfc3339DateTime")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
  
  inline def parseRfc7231DateTime(value: Any): js.UndefOr[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRfc7231DateTime")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Date]]
}
