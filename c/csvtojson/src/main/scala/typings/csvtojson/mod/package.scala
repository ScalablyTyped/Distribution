package typings.csvtojson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Event handler for "csv" events.
    */
  type CsvEventHandler = js.Function2[/* csvRow */ js.Array[java.lang.String], /* rowNumber */ scala.Double, scala.Unit]
  
  /**
    * Event handler for "data" events.
    */
  type DataEventHandler = js.Function1[/* data */ js.Any, scala.Unit]
  
  /**
    * Event handler for "done" events.
    */
  type DoneEventHandler = js.Function1[/* err */ js.Any, scala.Unit]
  
  /**
    * Event handler for "end" events.
    */
  type EndEventHandler = js.Function0[scala.Unit]
  
  /**
    * Event handler for "end_parsed" events.
    */
  type EndParsedEventHandler = js.Function1[/* jsonObjArray */ js.Array[js.Any], scala.Unit]
  
  /**
    * Event handler for "error" events.
    */
  type ErrorEventHandler = js.Function1[/* err */ js.Any, scala.Unit]
  
  /**
    * Event handler for "json" events.
    */
  type JsonEventHandler = js.Function2[/* jsonObj */ js.Any, /* rowNumber */ scala.Double, scala.Unit]
  
  /**
    * Callback function for handling result of parse.
    */
  type ParseResultHandler = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  
  /**
    * Event handler for "record_parsed" events.
    */
  type RecordParsedEventHandler = js.Function3[
    /* jsonObj */ js.Any, 
    /* csvRoe */ js.Array[java.lang.String], 
    /* rowNumber */ scala.Double, 
    scala.Unit
  ]
  
  /**
    * Stream options
    */
  type StreamOptions = typings.node.streamMod.TransformOptions
}
