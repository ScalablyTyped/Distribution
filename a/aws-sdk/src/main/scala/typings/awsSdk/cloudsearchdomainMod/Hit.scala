package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hit extends js.Object {
  /**
    * The expressions returned from a document that matches the search request.
    */
  var exprs: js.UndefOr[Exprs] = js.native
  /**
    * The fields returned from a document that matches the search request.
    */
  var fields: js.UndefOr[Fields] = js.native
  /**
    * The highlights returned from a document that matches the search request.
    */
  var highlights: js.UndefOr[Highlights] = js.native
  /**
    * The document ID of a document that matches the search request.
    */
  var id: js.UndefOr[String] = js.native
}

object Hit {
  @scala.inline
  def apply(exprs: Exprs = null, fields: Fields = null, highlights: Highlights = null, id: String = null): Hit = {
    val __obj = js.Dynamic.literal()
    if (exprs != null) __obj.updateDynamic("exprs")(exprs.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (highlights != null) __obj.updateDynamic("highlights")(highlights.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hit]
  }
}

