package typings.d3Dsv

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-dsv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoType[ParsedRow /* <: js.UndefOr[js.Object | Null] */, Columns /* <: String */](// eslint-disable-next-line no-unnecessary-generics
  `object`: js.Array[String]): ParsedRow = ^.asInstanceOf[js.Dynamic].applyDynamic("autoType")(`object`.asInstanceOf[js.Any]).asInstanceOf[ParsedRow]
  inline def autoType[ParsedRow /* <: js.UndefOr[js.Object | Null] */, Columns /* <: String */](// eslint-disable-next-line no-unnecessary-generics
  `object`: DSVRowString[Columns]): ParsedRow = ^.asInstanceOf[js.Dynamic].applyDynamic("autoType")(`object`.asInstanceOf[js.Any]).asInstanceOf[ParsedRow]
  
  inline def csvFormat[T /* <: js.Object */](rows: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("csvFormat")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def csvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[/* keyof T */ String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("csvFormat")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def csvFormatBody[T /* <: js.Object */](rows: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("csvFormatBody")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def csvFormatBody[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[/* keyof T */ String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("csvFormatBody")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def csvFormatRow(row: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("csvFormatRow")(row.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def csvFormatRows(rows: js.Array[js.Array[String]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("csvFormatRows")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def csvFormatValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("csvFormatValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def csvParse[Columns /* <: String */](csvString: String): DSVRowArray[Columns] = ^.asInstanceOf[js.Dynamic].applyDynamic("csvParse")(csvString.asInstanceOf[js.Any]).asInstanceOf[DSVRowArray[Columns]]
  inline def csvParse[ParsedRow /* <: js.Object */, Columns /* <: String */](
    csvString: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): DSVParsedArray[ParsedRow] = (^.asInstanceOf[js.Dynamic].applyDynamic("csvParse")(csvString.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[DSVParsedArray[ParsedRow]]
  
  inline def csvParseRows(csvString: String): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("csvParseRows")(csvString.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def csvParseRows[ParsedRow /* <: js.Object */](
    csvString: String,
    row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
  ): js.Array[ParsedRow] = (^.asInstanceOf[js.Dynamic].applyDynamic("csvParseRows")(csvString.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedRow]]
  
  inline def dsvFormat(delimiter: String): DSV = ^.asInstanceOf[js.Dynamic].applyDynamic("dsvFormat")(delimiter.asInstanceOf[js.Any]).asInstanceOf[DSV]
  
  inline def tsvFormat[T /* <: js.Object */](rows: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormat")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def tsvFormat[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[/* keyof T */ String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormat")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tsvFormatBody[T /* <: js.Object */](rows: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormatBody")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def tsvFormatBody[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[/* keyof T */ String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormatBody")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tsvFormatRow(row: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormatRow")(row.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tsvFormatRows(rows: js.Array[js.Array[String]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormatRows")(rows.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tsvFormatValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvFormatValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tsvParse[Columns /* <: String */](tsvString: String): DSVRowArray[Columns] = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvParse")(tsvString.asInstanceOf[js.Any]).asInstanceOf[DSVRowArray[Columns]]
  inline def tsvParse[ParsedRow /* <: js.Object */, Columns /* <: String */](
    tsvString: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[Columns], 
      /* index */ Double, 
      /* columns */ js.Array[Columns], 
      js.UndefOr[ParsedRow | Null]
    ]
  ): DSVParsedArray[ParsedRow] = (^.asInstanceOf[js.Dynamic].applyDynamic("tsvParse")(tsvString.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[DSVParsedArray[ParsedRow]]
  
  inline def tsvParseRows(tsvString: String): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tsvParseRows")(tsvString.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def tsvParseRows[ParsedRow /* <: js.Object */](
    tsvString: String,
    row: js.Function2[/* rawRow */ js.Array[String], /* index */ Double, js.UndefOr[ParsedRow | Null]]
  ): js.Array[ParsedRow] = (^.asInstanceOf[js.Dynamic].applyDynamic("tsvParseRows")(tsvString.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedRow]]
  
  @js.native
  trait DSV extends StObject {
    
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
    def format[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[/* keyof T */ String]): String = js.native
    
    /**
      * Equivalent to dsv.format, but omits the header row.
      * This is useful, for example, when appending rows to an existing file.
      *
      * @param rows Array of object rows.
      * @param columns An array of strings representing the column names.
      */
    def formatBody[T /* <: js.Object */](rows: js.Array[T]): String = js.native
    def formatBody[T /* <: js.Object */](rows: js.Array[T], columns: js.Array[/* keyof T */ String]): String = js.native
    
    /**
      * Formats a single array row of strings as delimiter-separated values, returning a string.
      * Each column within the row will be separated by the delimiter (such as a comma, ,).
      * Values that contain either the delimiter, a double-quote (") or a newline will be escaped using double-quotes.
      *
      * @param row An array of strings representing a row.
      */
    def formatRow(row: js.Array[String]): String = js.native
    
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
      * Format a single value or string as a delimiter-separated value, returning a string.
      * A value that contains either the delimiter, a double-quote (") or a newline will be escaped using double-quotes.
      *
      * @param value A value.
      */
    def formatValue(value: String): String = js.native
    
    /**
      * Parses the specified string, which must be in the delimiter-separated values format with the appropriate delimiter, returning an array of objects representing the parsed rows.
      *
      * Unlike dsv.parseRows, this method requires that the first line of the DSV content contains a delimiter-separated list of column names;
      * these column names become the attributes on the returned objects.
      *
      * The returned array also exposes a columns property containing the column names in input order (in contrast to Object.keys, whose iteration order is arbitrary).
      *
      * If the column names are not unique, only the last value is returned for each name; to access all values, use dsv.parseRows instead.
      *
      * Note: requires unsafe-eval content security policy.
      *
      * @param dsvString A string, which must be in the delimiter-separated values format with the appropriate delimiter.
      */
    // eslint-disable-next-line no-unnecessary-generics
    def parse[Columns /* <: String */](dsvString: String): DSVRowArray[Columns] = js.native
    /**
      * Parses the specified string, which must be in the delimiter-separated values format with the appropriate delimiter, returning an array of objects representing the parsed rows.
      *
      * Unlike dsv.parseRows, this method requires that the first line of the DSV content contains a delimiter-separated list of column names;
      * these column names become the attributes on the returned objects.
      *
      * The returned array also exposes a columns property containing the column names in input order (in contrast to Object.keys, whose iteration order is arbitrary).
      *
      * If the column names are not unique, only the last value is returned for each name; to access all values, use dsv.parseRows instead.
      *
      * Note: requires unsafe-eval content security policy.
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
  trait DSVParsedArray[T]
    extends StObject
       with Array[T] {
    
    /**
      * List of column names.
      */
    var columns: js.Array[/* keyof T */ String] = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof T ]: string | undefined}
    }}}
    */
  @js.native
  trait DSVRaw[T /* <: js.Object */] extends StObject
  
  type DSVRowAny = StringDictionary[Any]
  
  @js.native
  trait DSVRowArray[Columns /* <: String */]
    extends StObject
       with Array[DSVRowString[Columns]] {
    
    /**
      * List of column names.
      */
    var columns: js.Array[Columns] = js.native
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in Columns ]: string | undefined}
    }}}
    */
  @js.native
  trait DSVRowString[Columns /* <: String */] extends StObject
}
