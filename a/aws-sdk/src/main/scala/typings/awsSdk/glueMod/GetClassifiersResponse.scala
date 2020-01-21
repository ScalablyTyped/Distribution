package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClassifiersResponse extends js.Object {
  /**
    * The requested list of classifier objects.
    */
  var Classifiers: js.UndefOr[ClassifierList] = js.native
  /**
    * A continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetClassifiersResponse {
  @scala.inline
  def apply(Classifiers: ClassifierList = null, NextToken: Token = null): GetClassifiersResponse = {
    val __obj = js.Dynamic.literal()
    if (Classifiers != null) __obj.updateDynamic("Classifiers")(Classifiers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClassifiersResponse]
  }
}

