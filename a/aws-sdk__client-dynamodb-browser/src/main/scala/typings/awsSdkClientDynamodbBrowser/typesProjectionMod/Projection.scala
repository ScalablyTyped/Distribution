package typings.awsSdkClientDynamodbBrowser.typesProjectionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ALL
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.INCLUDE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.KEYS_ONLY
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  /**
    * <p>Represents the non-key attribute names which will be projected into the index.</p> <p>For local secondary indexes, the total count of <code>NonKeyAttributes</code> summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.</p>
    */
  var NonKeyAttributes: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  /**
    * <p>The set of attributes that are projected into the index:</p> <ul> <li> <p> <code>KEYS_ONLY</code> - Only the index and primary keys are projected into the index.</p> </li> <li> <p> <code>INCLUDE</code> - Only the specified table attributes are projected into the index. The list of projected attributes are in <code>NonKeyAttributes</code>.</p> </li> <li> <p> <code>ALL</code> - All of the table attributes are projected into the index.</p> </li> </ul>
    */
  var ProjectionType: js.UndefOr[ALL | KEYS_ONLY | INCLUDE | String] = js.native
}

object Projection {
  @scala.inline
  def apply(): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Projection]
  }
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNonKeyAttributesVarargs(value: String*): Self = this.set("NonKeyAttributes", js.Array(value :_*))
    @scala.inline
    def setNonKeyAttributes(value: js.Array[String] | Iterable[String]): Self = this.set("NonKeyAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonKeyAttributes: Self = this.set("NonKeyAttributes", js.undefined)
    @scala.inline
    def setProjectionType(value: ALL | KEYS_ONLY | INCLUDE | String): Self = this.set("ProjectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionType: Self = this.set("ProjectionType", js.undefined)
  }
  
}

