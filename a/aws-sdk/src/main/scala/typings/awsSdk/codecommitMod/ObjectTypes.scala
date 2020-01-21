package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypes extends js.Object {
  /**
    * The type of the object in the base commit of the merge.
    */
  var base: js.UndefOr[ObjectTypeEnum] = js.native
  /**
    * The type of the object in the destination branch.
    */
  var destination: js.UndefOr[ObjectTypeEnum] = js.native
  /**
    * The type of the object in the source branch.
    */
  var source: js.UndefOr[ObjectTypeEnum] = js.native
}

object ObjectTypes {
  @scala.inline
  def apply(base: ObjectTypeEnum = null, destination: ObjectTypeEnum = null, source: ObjectTypeEnum = null): ObjectTypes = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypes]
  }
}

