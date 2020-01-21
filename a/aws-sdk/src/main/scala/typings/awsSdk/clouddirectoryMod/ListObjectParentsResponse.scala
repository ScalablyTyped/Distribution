package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectParentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  /**
    * Returns a list of parent reference and LinkName Tuples.
    */
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.native
  /**
    * The parent structure, which is a map with key as the ObjectIdentifier and LinkName as the value.
    */
  var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.native
}

object ListObjectParentsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ParentLinks: ObjectIdentifierAndLinkNameList = null,
    Parents: ObjectIdentifierToLinkNameMap = null
  ): ListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ParentLinks != null) __obj.updateDynamic("ParentLinks")(ParentLinks.asInstanceOf[js.Any])
    if (Parents != null) __obj.updateDynamic("Parents")(Parents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectParentsResponse]
  }
}

