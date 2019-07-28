package typings.combineDashSourceDashMap.combineDashSourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("combine-source-map", JSImport.Namespace)
@js.native
class ^ () extends Combiner {
  def this(file: String) = this()
  def this(file: String, sourceRoot: String) = this()
}

@JSImport("combine-source-map", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Create a source map combiner that accepts multiple files, offsets them and then combines them into one source map.
    * @param file optional name of the generated file
    * @param sourceRoot optional sourceRoot of the map to be generated
    * @return Combiner instance to which source maps can be added and later combined
    */
  def create(): Combiner = js.native
  def create(file: String): Combiner = js.native
  def create(file: String, sourceRoot: String): Combiner = js.native
  /**
    * @return src with all sourceMappingUrl comments removed
    */
  def removeComments(src: String): String = js.native
}

