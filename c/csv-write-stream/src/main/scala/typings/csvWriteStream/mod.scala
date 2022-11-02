package typings.csvWriteStream

import typings.node.nodeColonstreamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a CSV encoder stream that produces properly escaped CSVs.
    *
    * Write arrays of strings (or JS objects) and you will receive a properly escaped CSV stream out the other end.
    *
    * @example
    * // example of auto headers
    *
    * import * as fs from 'node:fs'
    * import csvWriter = require('csv-write-stream')
    *
    * const writer = csvWriter()
    *
    * writer.pipe(fs.createWriteStream('out.csv'))
    * writer.write({hello: 'world', foo: 'bar', baz: 'taco'})
    * writer.end()
    *
    * // produces: hello,foo,baz\nworld,bar,taco\n
    *
    * @example
    * // example of specifying headers
    *
    * import * as fs from 'node:fs'
    * import csvWriter = require('csv-write-stream')
    *
    * const writer = csvWriter({ headers: ['hello', 'foo'] })
    *
    * writer.pipe(fs.createWriteStream('out.csv'))
    * writer.write(['world', 'bar'])
    * writer.end()
    *
    * // produces: hello,foo\nworld,bar\n
    *
    * @example
    * // example of not sending headers
    *
    * import * as fs from 'node:fs'
    * import csvWriter = require('csv-write-stream')
    *
    * const writer = csvWriter({ sendHeaders: false })
    *
    * writer.pipe(fs.createWriteStream('out.csv'))
    * writer.write({hello: 'world', foo: 'bar', baz: 'taco'})
    * writer.end()
    *
    * // produces: world,bar,taco\n
    */
  inline def apply(): CsvWriteStream = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CsvWriteStream]
  inline def apply(options: Options): CsvWriteStream = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CsvWriteStream]
  
  @JSImport("csv-write-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait CsvWriteStream extends Transform {
    
    val headers: js.Array[String] | Null = js.native
    
    val newline: String = js.native
    
    val sendHeaders: Boolean = js.native
    
    val separator: String = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Can be an array of strings to use as the header row. If you don't specify a header
      * row the keys of the first row written to the stream will be used as the header row
      * IF the first row is an object.
      *
      * @default null
      */
    var headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @default '\n'
      */
    var newline: js.UndefOr[String] = js.undefined
    
    /**
      * If set to `false`, the headers will be used for ordering the data but will never
      * be written to the stream.
      *
      * @default true
      */
    var sendHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default ','
      */
    var separator: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setSendHeaders(value: Boolean): Self = StObject.set(x, "sendHeaders", value.asInstanceOf[js.Any])
      
      inline def setSendHeadersUndefined: Self = StObject.set(x, "sendHeaders", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
}
