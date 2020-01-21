package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.
    */
  var HttpErrorCodeReturnedEquals: js.UndefOr[typings.awsSdk.s3Mod.HttpErrorCodeReturnedEquals] = js.native
  /**
    * The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.
    */
  var KeyPrefixEquals: js.UndefOr[typings.awsSdk.s3Mod.KeyPrefixEquals] = js.native
}

object Condition {
  @scala.inline
  def apply(
    HttpErrorCodeReturnedEquals: HttpErrorCodeReturnedEquals = null,
    KeyPrefixEquals: KeyPrefixEquals = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (HttpErrorCodeReturnedEquals != null) __obj.updateDynamic("HttpErrorCodeReturnedEquals")(HttpErrorCodeReturnedEquals.asInstanceOf[js.Any])
    if (KeyPrefixEquals != null) __obj.updateDynamic("KeyPrefixEquals")(KeyPrefixEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

