package typings.combineSourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("combine-source-map", "create")
@js.native
object create extends js.Object {
  /**
    * Create a source map combiner that accepts multiple files, offsets them and then combines them into one source map.
    * @param file optional name of the generated file
    * @param sourceRoot optional sourceRoot of the map to be generated
    * @return Combiner instance to which source maps can be added and later combined
    */
  def apply(): Combiner = js.native
  def apply(file: js.UndefOr[scala.Nothing], sourceRoot: String): Combiner = js.native
  def apply(file: String): Combiner = js.native
  def apply(file: String, sourceRoot: String): Combiner = js.native
}

