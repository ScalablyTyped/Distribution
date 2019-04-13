package typings
package combineDashSourceDashMapLib.combineDashSourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("combine-source-map", JSImport.Namespace)
@js.native
class ^ () extends Combiner {
  def this(file: java.lang.String) = this()
  def this(file: java.lang.String, sourceRoot: java.lang.String) = this()
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
  def create(file: java.lang.String): Combiner = js.native
  def create(file: java.lang.String, sourceRoot: java.lang.String): Combiner = js.native
  /**
    * @return src with all sourceMappingUrl comments removed
    */
  def removeComments(src: java.lang.String): java.lang.String = js.native
}

