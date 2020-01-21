package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalList] = js.native
}

object ListPrincipalsResponse {
  @scala.inline
  def apply(nextToken: String = null, principals: PrincipalList = null): ListPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (principals != null) __obj.updateDynamic("principals")(principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalsResponse]
  }
}

