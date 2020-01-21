package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchPathSummary extends js.Object {
  /**
    * The constraints on the portfolio-product relationship.
    */
  var ConstraintSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ConstraintSummaries] = js.native
  /**
    * The identifier of the product path.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  /**
    * The name of the portfolio to which the user was assigned.
    */
  var Name: js.UndefOr[PortfolioName] = js.native
  /**
    * The tags associated with this product path.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object LaunchPathSummary {
  @scala.inline
  def apply(
    ConstraintSummaries: ConstraintSummaries = null,
    Id: Id = null,
    Name: PortfolioName = null,
    Tags: Tags = null
  ): LaunchPathSummary = {
    val __obj = js.Dynamic.literal()
    if (ConstraintSummaries != null) __obj.updateDynamic("ConstraintSummaries")(ConstraintSummaries.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchPathSummary]
  }
}

