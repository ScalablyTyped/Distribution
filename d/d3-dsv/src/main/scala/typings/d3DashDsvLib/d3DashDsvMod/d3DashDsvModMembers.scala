package typings
package d3DashDsvLib.d3DashDsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-dsv", JSImport.Namespace)
@js.native
object d3DashDsvModMembers extends js.Object {
  def csvFormat[T /* <: js.Object */](rows: js.Array[T]): java.lang.String = js.native
  def csvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[java.lang.String]): java.lang.String = js.native
  def csvFormatRows(rows: js.Array[js.Array[java.lang.String]]): java.lang.String = js.native
  def csvParse(csvString: java.lang.String): DSVParsedArray[DSVRowString] = js.native
  def csvParse[ParsedRow /* <: js.Object */](
    csvString: java.lang.String,
    row: js.Function3[
      /* rawRow */ DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): DSVParsedArray[ParsedRow] = js.native
  def csvParseRows(csvString: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def csvParseRows[ParsedRow /* <: js.Object */](
    csvString: java.lang.String,
    row: js.Function2[
      /* rawRow */ js.Array[java.lang.String], 
      /* index */ scala.Double, 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Array[ParsedRow] = js.native
  def dsvFormat(delimiter: java.lang.String): DSV = js.native
  def tsvFormat[T /* <: js.Object */](rows: js.Array[T]): java.lang.String = js.native
  def tsvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[java.lang.String]): java.lang.String = js.native
  def tsvFormatRows(rows: js.Array[js.Array[java.lang.String]]): java.lang.String = js.native
  def tsvParse(tsvString: java.lang.String): DSVParsedArray[DSVRowString] = js.native
  def tsvParse[MappedRow /* <: js.Object */](
    tsvString: java.lang.String,
    row: js.Function3[
      /* rawRow */ DSVRowString, 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      js.UndefOr[MappedRow | scala.Null]
    ]
  ): DSVParsedArray[MappedRow] = js.native
  def tsvParseRows(tsvString: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def tsvParseRows[MappedRow /* <: js.Object */](
    tsvString: java.lang.String,
    row: js.Function2[
      /* rawRow */ js.Array[java.lang.String], 
      /* index */ scala.Double, 
      js.UndefOr[MappedRow | scala.Null]
    ]
  ): js.Array[MappedRow] = js.native
}

