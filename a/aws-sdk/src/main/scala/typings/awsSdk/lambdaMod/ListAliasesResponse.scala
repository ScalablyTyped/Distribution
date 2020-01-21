package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAliasesResponse extends js.Object {
  /**
    * A list of aliases.
    */
  var Aliases: js.UndefOr[AliasList] = js.native
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListAliasesResponse {
  @scala.inline
  def apply(Aliases: AliasList = null, NextMarker: String = null): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAliasesResponse]
  }
}

