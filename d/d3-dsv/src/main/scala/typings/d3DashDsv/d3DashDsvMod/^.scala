package typings.d3DashDsv.d3DashDsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-dsv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def csvFormat[T /* <: js.Object */](rows: js.Array[T]): String = js.native
  def csvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[String]): String = js.native
  def csvFormatRows(rows: js.Array[js.Array[String]]): String = js.native
  def csvParse[Columns /* <: String */](csvString: String): DSVRowArray[Columns] = js.native
  def csvParse[ParsedRow /* <: js.Object */, Columns /* <: String */](
    csvString: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): DSVParsedArray[ParsedRow] = js.native
  def csvParseRows(csvString: String): js.Array[js.Array[String]] = js.native
  def csvParseRows[ParsedRow /* <: js.Object */](
    csvString: String,
    row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
  ): js.Array[ParsedRow] = js.native
  def dsvFormat(delimiter: String): DSV = js.native
  def tsvFormat[T /* <: js.Object */](rows: js.Array[T]): String = js.native
  def tsvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[String]): String = js.native
  def tsvFormatRows(rows: js.Array[js.Array[String]]): String = js.native
  def tsvParse[Columns /* <: String */](tsvString: String): DSVRowArray[Columns] = js.native
  def tsvParse[ParsedRow /* <: js.Object */, Columns /* <: String */](
    tsvString: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): DSVParsedArray[ParsedRow] = js.native
  def tsvParseRows(tsvString: String): js.Array[js.Array[String]] = js.native
  def tsvParseRows[ParsedRow /* <: js.Object */](
    tsvString: String,
    row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
  ): js.Array[ParsedRow] = js.native
}

