package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnMetadata extends js.Object {
  /**
    * The format of the column.
    */
  var format: Format = js.native
  /**
    * The name of the column.
    */
  var name: Name = js.native
}

object ColumnMetadata {
  @scala.inline
  def apply(format: Format, name: Name): ColumnMetadata = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata]
  }
}

