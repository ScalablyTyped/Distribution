package typings.awsSdkClientS3Node.typesConditionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * <p>The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.</p>
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[String] = js.undefined
  /**
    * <p>The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.</p>
    */
  var KeyPrefixEquals: js.UndefOr[String] = js.undefined
}

object Condition {
  @scala.inline
  def apply(HttpErrorCodeReturnedEquals: String = null, KeyPrefixEquals: String = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (HttpErrorCodeReturnedEquals != null) __obj.updateDynamic("HttpErrorCodeReturnedEquals")(HttpErrorCodeReturnedEquals.asInstanceOf[js.Any])
    if (KeyPrefixEquals != null) __obj.updateDynamic("KeyPrefixEquals")(KeyPrefixEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

