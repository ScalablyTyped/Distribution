package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterParameters extends js.Object {
  /**
    * Maximum number of rows to query Twitter.
    */
  var MaxRows: PositiveInteger = js.native
  /**
    * Twitter query string.
    */
  var Query: typings.awsSdk.quicksightMod.Query = js.native
}

object TwitterParameters {
  @scala.inline
  def apply(MaxRows: PositiveInteger, Query: Query): TwitterParameters = {
    val __obj = js.Dynamic.literal(MaxRows = MaxRows.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterParameters]
  }
  @scala.inline
  implicit class TwitterParametersOps[Self <: TwitterParameters] (val x: Self) extends AnyVal {
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
    def setMaxRows(value: PositiveInteger): Self = this.set("MaxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: Query): Self = this.set("Query", value.asInstanceOf[js.Any])
  }
  
}

