package typings.csvtojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csvtojson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Factory function which creates an instance of a Converter object.
    * @param options       converter options
    * @param    streamOptions stream options
    * @return Converter object
    */
  def apply(): Converter = js.native
  def apply(options: ConverterOptions): Converter = js.native
  def apply(options: ConverterOptions, streamOptions: StreamOptions): Converter = js.native
}

