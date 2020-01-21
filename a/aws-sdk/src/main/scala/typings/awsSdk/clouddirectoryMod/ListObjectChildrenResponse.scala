package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectChildrenResponse extends js.Object {
  /**
    * Children structure, which is a map with key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}

object ListObjectChildrenResponse {
  @scala.inline
  def apply(Children: LinkNameToObjectIdentifierMap = null, NextToken: NextToken = null): ListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    if (Children != null) __obj.updateDynamic("Children")(Children.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectChildrenResponse]
  }
}

