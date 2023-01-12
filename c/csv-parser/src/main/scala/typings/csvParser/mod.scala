package typings.csvParser

import typings.csvParser.anon.Header
import typings.csvParser.anon.Index
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Streaming CSV parser that aims for maximum speed as well as compatibility with the [csv-spectrum](https://npmjs.org/csv-spectrum) CSV acid test suite.
    *
    * @param optionsOrHeaders - As an alternative to passing an `options` object, you may pass an `Array[String]` which specifies the headers to use. If you need to specify options _and_ headers, please use the the object notation with the `headers` property.
    *
    * @example
    *
    * // data.csv:
    * //
    * // NAME,AGE
    * // Daffy Duck,24
    * // Bugs Bunny,22
    *
    * import csv = require('csv-parser');
    * import * as fs from 'fs';
    *
    * const results = [];
    *
    * fs.createReadStream('data.csv')
    *   .pipe(csv())
    *   .on('data', (data) => results.push(data))
    *   .on('end', () => {
    *     console.log(results);
    *     // [
    *     //   { NAME: 'Daffy Duck', AGE: '24' },
    *     //   { NAME: 'Bugs Bunny', AGE: '22' }
    *     // ]
    *   });
    */
  inline def apply(): CsvParser = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CsvParser]
  inline def apply(optionsOrHeaders: js.Array[String]): CsvParser = ^.asInstanceOf[js.Dynamic].apply(optionsOrHeaders.asInstanceOf[js.Any]).asInstanceOf[CsvParser]
  inline def apply(optionsOrHeaders: Options): CsvParser = ^.asInstanceOf[js.Dynamic].apply(optionsOrHeaders.asInstanceOf[js.Any]).asInstanceOf[CsvParser]
  
  @JSImport("csv-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CsvParser = Transform
  
  trait Options extends StObject {
    
    /**
      * A single-character string used to specify the character used to escape strings in a CSV row.
      *
      * @default '"'
      */
    val escape: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the headers to use. Headers define the property key for each value in a CSV row. If no `headers` option is provided, `csv-parser` will use the first line in a CSV file as the header specification.
      *
      * If `false`, specifies that the first row in a data file does _not_ contain headers, and instructs the parser to use the row index as the key for each row.
      *
      * Suppose you have a CSV file `data.csv` which contains the data:
      *
      * ```
    NAME,AGE
    Daffy Duck,24
    Bugs Bunny,22
    ```
      * Using `headers: false` with the data from `data.csv` would yield:
      * ```
    [
      { '0': 'Daffy Duck', '1': 24 },
      { '0': 'Bugs Bunny', '1': 22 }
    ]
    ```
      */
    val headers: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    /**
      * A function that can be used to modify the values of each header. Return `null` to remove the header, and it's column, from the results.
      *
      * @example
      *
      * csv({
      *   mapHeaders: ({ header, index }) => header.toLowerCase()
      * });
      */
    val mapHeaders: js.UndefOr[js.Function1[/* args */ Header, String | Null]] = js.undefined
    
    /**
      * A function that can be used to modify the value of each column value.
      *
      * @example
      *
      * csv({
      *   mapValues: ({ header, index, value }) => value.toLowerCase()
      * });
      */
    val mapValues: js.UndefOr[js.Function1[/* args */ Index, Any]] = js.undefined
    
    /**
      * Maximum number of bytes per row. An error is thrown if a line exeeds this value. The default value is on 8 peta byte.
      *
      * @default Number.MAX_SAFE_INTEGER
      */
    val maxRowBytes: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies a single-character string to denote the end of a line in a CSV file.
      *
      * @default '\n'
      */
    val newline: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a single-character string to denote a quoted string.
      *
      * @default '"'
      */
    val quote: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, instructs the parser not to decode UTF-8 strings.
      */
    val raw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a single-character string to use as the column separator for each row.
      *
      * @default ','
      */
    val separator: js.UndefOr[String] = js.undefined
    
    /**
      * Instructs the parser to ignore lines which represent comments in a CSV file. Since there is no specification that dictates what a CSV comment looks like, comments should be considered non-standard. The "most common" character used to signify a comment in a CSV file is `"#"`. If this option is set to `true`, lines which begin with `#` will be skipped. If a custom character is needed to denote a commented line, this option may be set to a string which represents the leading character(s) signifying a comment line.
      *
      * @default false
      */
    val skipComments: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Specifies the number of lines at the beginning of a data file that the parser should skip over, prior to parsing headers.
      *
      * @default 0
      */
    val skipLines: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, instructs the parser that the number of columns in each row must match the number of `headers` specified.
      */
    val strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHeaders(value: js.Array[String] | Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMapHeaders(value: /* args */ Header => String | Null): Self = StObject.set(x, "mapHeaders", js.Any.fromFunction1(value))
      
      inline def setMapHeadersUndefined: Self = StObject.set(x, "mapHeaders", js.undefined)
      
      inline def setMapValues(value: /* args */ Index => Any): Self = StObject.set(x, "mapValues", js.Any.fromFunction1(value))
      
      inline def setMapValuesUndefined: Self = StObject.set(x, "mapValues", js.undefined)
      
      inline def setMaxRowBytes(value: Double): Self = StObject.set(x, "maxRowBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxRowBytesUndefined: Self = StObject.set(x, "maxRowBytes", js.undefined)
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSkipComments(value: Boolean | String): Self = StObject.set(x, "skipComments", value.asInstanceOf[js.Any])
      
      inline def setSkipCommentsUndefined: Self = StObject.set(x, "skipComments", js.undefined)
      
      inline def setSkipLines(value: Double): Self = StObject.set(x, "skipLines", value.asInstanceOf[js.Any])
      
      inline def setSkipLinesUndefined: Self = StObject.set(x, "skipLines", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
