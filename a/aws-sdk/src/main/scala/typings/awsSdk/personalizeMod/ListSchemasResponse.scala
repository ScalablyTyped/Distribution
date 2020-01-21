package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemasResponse extends js.Object {
  /**
    * A token used to get the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of schemas.
    */
  var schemas: js.UndefOr[Schemas] = js.native
}

object ListSchemasResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, schemas: Schemas = null): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasResponse]
  }
}

