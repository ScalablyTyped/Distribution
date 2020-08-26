package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projection extends js.Object {
  /**
    * Represents the non-key attribute names which will be projected into the index. For local secondary indexes, the total count of NonKeyAttributes summed across all of the local secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.
    */
  var NonKeyAttributes: js.UndefOr[NonKeyAttributeNameList] = js.native
  /**
    * The set of attributes that are projected into the index:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.  
    */
  var ProjectionType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProjectionType] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNonKeyAttributesVarargs(value: NonKeyAttributeName*): Self = this.set("NonKeyAttributes", js.Array(value :_*))
    @scala.inline
    def setNonKeyAttributes(value: NonKeyAttributeNameList): Self = this.set("NonKeyAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonKeyAttributes: Self = this.set("NonKeyAttributes", js.undefined)
    @scala.inline
    def setProjectionType(value: ProjectionType): Self = this.set("ProjectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionType: Self = this.set("ProjectionType", js.undefined)
  }
  
}

