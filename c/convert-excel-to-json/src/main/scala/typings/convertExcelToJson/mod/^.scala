package typings.convertExcelToJson.mod

import org.scalablytyped.runtime.StringDictionary
import typings.convertExcelToJson.anon.Sheets
import typings.convertExcelToJson.anon.Source
import typings.convertExcelToJson.anon.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("convert-excel-to-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(
                                                                      // Input can also be a json-string (for cli)
  config: (SourceFile | Source) with Sheets with SheetConfig
  ): StringDictionary[js.Array[_]] = js.native
  def apply(
                                                                      // Input can also be a json-string (for cli)
  config: (SourceFile | Source) with Sheets with SheetConfig,
                                                               // For cli
  sourceFile: String
  ): StringDictionary[js.Array[_]] = js.native
  def apply(
                                                                      // Input can also be a json-string (for cli)
  config: String
  ): StringDictionary[js.Array[_]] = js.native
  def apply(
                                                                      // Input can also be a json-string (for cli)
  config: String,
                                                               // For cli
  sourceFile: String
  ): StringDictionary[js.Array[_]] = js.native
}
