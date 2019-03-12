package typings
package cassanknexLib.cassanknexMod.CassanKnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateableIndexBuilder extends js.Object {
  def withOptions(opts: MappedDict[java.lang.String]): this.type
}

object CreateableIndexBuilder {
  @scala.inline
  def apply(withOptions: MappedDict[java.lang.String] => CreateableIndexBuilder): CreateableIndexBuilder = {
    val __obj = js.Dynamic.literal(withOptions = js.Any.fromFunction1(withOptions))
  
    __obj.asInstanceOf[CreateableIndexBuilder]
  }
}

