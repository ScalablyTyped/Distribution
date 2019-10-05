package typings.d3DashDsv

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashDsv.d3DashDsvMod.DSV
import typings.d3DashDsv.d3DashDsvMod.DSVParsedArray
import typings.d3DashDsv.d3DashDsvMod.DSVRowArray
import typings.d3DashDsv.d3DashDsvMod.DSVRowString
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-dsv", JSImport.Namespace)
@js.native
object d3DashDsvMod extends js.Object {
  @js.native
  trait DSV extends js.Object {
    /**
      * Formats the specified array of object rows as delimiter-separated values, returning a string.
      * This operation is the inverse of dsv.parse. Each row will be separated by a newline (\n),
      * and each column within each row will be separated by the delimiter (such as a comma, ,).
      * Values that contain either the delimiter, a double-quote (") or a newline will be escaped using double-quotes.
      *
      * If columns is not specified, the list of column names that forms the header row is determined by the union of all properties on all objects in rows;
      * the order of columns is nondeterministic.
      *
      * @param rows Array of object rows.
      * @param columns An array of strings representing the column names.
      */
    def format[T /* <: js.Object */](rows: js.Array[T]): String = js.native
    def format[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[String]): String = js.native
    /**
      * Formats the specified array of array of string rows as delimiter-separated values, returning a string.
      * This operation is the reverse of dsv.parseRows. Each row will be separated by a newline (\n),
      * and each column within each row will be separated by the delimiter (such as a comma, ,).
      * Values that contain either the delimiter, a double-quote (") or a newline will be escaped using double-quotes.
      *
      * To convert an array of objects to an array of arrays while explicitly specifying the columns, use array.map.
      * If you like, you can also array.concat this result with an array of column names to generate the first row.
      *
      * @param rows An array of array of string rows.
      */
    def formatRows(rows: js.Array[js.Array[String]]): String = js.native
    /**
      * Parses the specified string, which must be in the delimiter-separated values format with the appropriate delimiter, returning an array of objects representing the parsed rows.
      *
      * Unlike dsv.parseRows, this method requires that the first line of the DSV content contains a delimiter-separated list of column names;
      * these column names become the attributes on the returned objects.
      *
      * The returned array also exposes a columns property containing the column names in input order (in contrast to Object.keys, whose iteration order is arbitrary).
      *
      * @param dsvString A string, which must be in the delimiter-separated values format with the appropriate delimiter.
      */
    // tslint:disable-next-line:no-unnecessary-generics
    def parse[Columns /* <: String */](dsvString: String): DSVRowArray[Columns] = js.native
    /**
      * Parses the specified string, which must be in the delimiter-separated values format with the appropriate delimiter, returning an array of objects representing the parsed rows.
      *
      * Unlike dsv.parseRows, this method requires that the first line of the DSV content contains a delimiter-separated list of column names;
      * these column names become the attributes on the returned objects.
      *
      * The returned array also exposes a columns property containing the column names in input order (in contrast to Object.keys, whose iteration order is arbitrary).
      *
      * @param dsvString A string, which must be in the delimiter-separated values format with the appropriate delimiter.
      * @param row A row conversion function which is invoked for each row, being passed an object representing the current row (d),
      * the index (i) starting at zero for the first non-header row, and the array of column names. If the returned value is null or undefined,
      * the row is skipped and will be omitted from the array returned by dsv.parse; otherwise, the returned value defines the corresponding row object.
      * In effect, row is similar to applying a map and filter operator to the returned rows.
      */
    def parse[ParsedRow /* <: js.Object */, Columns /* <: String */](
      dsvString: String,
      row: js.Function3[
          /* rawRow */ DSVRowString[Columns], 
          /* index */ Double, 
          /* columns */ js.Array[Columns], 
          js.UndefOr[ParsedRow | Null]
        ]
    ): DSVParsedArray[ParsedRow] = js.native
    /**
      * Parses the specified string, which must be in the delimiter-separated values format with the appropriate delimiter, returning an array of arrays representing the parsed rows.
      *
      * Unlike dsv.parse, this method treats the header line as a standard row, and should be used whenever DSV content does not contain a header.
      * Each row is represented as an array rather than an object. Rows may have variable length.
      *
      * If a row conversion function is not specified, field values are strings. For safety, there is no automatic conversion to numbers, dates, or other types.
      * In some cases, JavaScript may coerce strings to numbers for you automatically (for example, using the + operator), but better is to specify a row conversion function.
      *
      * @param dsvString A string, which must be in the delimiter-separated values format with the appropriate delimiter.
      */
    def parseRows(dsvString: String): js.Array[js.Array[String]] = js.native
    /**
      * Parses the specified string, which must be in the delimiter-separated values format with the appropriate delimiter, returning an array of arrays representing the parsed rows.
      *
      * Unlike dsv.parse, this method treats the header line as a standard row, and should be used whenever DSV content does not contain a header.
      * Each row is represented as an array rather than an object. Rows may have variable length.
      *
      * @param dsvString A string, which must be in the delimiter-separated values format with the appropriate delimiter.
      * @param row A row conversion function which is invoked for each row, being passed an array representing the current row (d), the index (i)
      * starting at zero for the first row, and the array of column names. If the returned value is null or undefined,
      * the row is skipped and will be omitted from the array returned by dsv.parse; otherwise, the returned value defines the corresponding row object.
      * In effect, row is similar to applying a map and filter operator to the returned rows.
      */
    def parseRows[ParsedRow /* <: js.Object */](
      dsvString: String,
      row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
    ): js.Array[ParsedRow] = js.native
  }
  
  @js.native
  trait DSVParsedArray[T] extends Array[T] {
    /**
      * List of column names.
      */
    var columns: js.Array[String] = js.native
  }
  
  @js.native
  trait DSVRowArray[Columns /* <: String */] extends Array[DSVRowString[Columns]] {
    /**
      * List of column names.
      */
    var columns: js.Array[Columns] = js.native
  }
  
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
  type DSVRaw[T /* <: js.Object */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof T ]: string | undefined}
    */ typings.d3DashDsv.d3DashDsvStrings.DSVRaw with js.Any
  type DSVRowAny = StringDictionary[js.Any]
  type DSVRowString[Columns /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in Columns ]: string | undefined}
    */ typings.d3DashDsv.d3DashDsvStrings.DSVRowString with js.Any
}

