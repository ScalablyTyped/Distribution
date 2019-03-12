package typings
package d3DashDsvLib.d3DashDsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-dsv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def csvFormat[T /* <: js.Object */](rows: js.Array[T]): java.lang.String = js.native
  def csvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[java.lang.String]): java.lang.String = js.native
  def csvFormatRows(rows: js.Array[js.Array[java.lang.String]]): java.lang.String = js.native
  def csvParse[Columns /* <: java.lang.String */](csvString: java.lang.String): DSVRowArray[Columns] = js.native
  def csvParse[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    csvString: java.lang.String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
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
  def tsvParse[Columns /* <: java.lang.String */](tsvString: java.lang.String): DSVRowArray[Columns] = js.native
  def tsvParse[ParsedRow /* <: js.Object */, Columns /* <: java.lang.String */](
    tsvString: java.lang.String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ scala.Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): DSVParsedArray[ParsedRow] = js.native
  def tsvParseRows(tsvString: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def tsvParseRows[ParsedRow /* <: js.Object */](
    tsvString: java.lang.String,
    row: js.Function2[
      /* rawRow */ js.Array[java.lang.String], 
      /* index */ scala.Double, 
      js.UndefOr[ParsedRow | scala.Null]
    ]
  ): js.Array[ParsedRow] = js.native
}

