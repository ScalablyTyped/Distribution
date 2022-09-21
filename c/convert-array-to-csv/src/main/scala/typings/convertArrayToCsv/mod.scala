package typings.convertArrayToCsv

import typings.convertArrayToCsv.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("convert-array-to-csv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertArrayToCSV(data: js.Array[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayToCSV")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def convertArrayToCSV(data: js.Array[js.Object], options: Header): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArrayToCSV")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
