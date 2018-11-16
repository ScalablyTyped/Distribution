package typings
package csvtojsonLib.csvtojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Converts provided CSV input to  a JSON object.
     */
@JSImport("csvtojson", "Converter")
@js.native
class Converter ()
  extends csvtojsonLib.csvtojsonMod.csvtojsonNs.Converter {
  /**
           * Initializes a new instance of a Converter
           * @param options       converter options
           * @param    streamOptions stream options
           */
  def this(options: csvtojsonLib.csvtojsonMod.csvtojsonNs.ConverterOptions) = this()
  /**
           * Initializes a new instance of a Converter
           * @param options       converter options
           * @param    streamOptions stream options
           */
  def this(options: csvtojsonLib.csvtojsonMod.csvtojsonNs.ConverterOptions, streamOptions: csvtojsonLib.csvtojsonMod.csvtojsonNs.StreamOptions) = this()
}

