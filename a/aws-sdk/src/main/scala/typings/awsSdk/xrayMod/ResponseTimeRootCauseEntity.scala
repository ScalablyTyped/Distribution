package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseTimeRootCauseEntity extends js.Object {
  /**
    * The types and messages of the exceptions.
    */
  var Coverage: js.UndefOr[NullableDouble] = js.native
  /**
    * The name of the entity.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A flag that denotes a remote subsegment.
    */
  var Remote: js.UndefOr[NullableBoolean] = js.native
}

object ResponseTimeRootCauseEntity {
  @scala.inline
  def apply(
    Coverage: js.UndefOr[NullableDouble] = js.undefined,
    Name: String = null,
    Remote: js.UndefOr[NullableBoolean] = js.undefined
  ): ResponseTimeRootCauseEntity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Coverage)) __obj.updateDynamic("Coverage")(Coverage.get.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Remote)) __obj.updateDynamic("Remote")(Remote.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseTimeRootCauseEntity]
  }
}

