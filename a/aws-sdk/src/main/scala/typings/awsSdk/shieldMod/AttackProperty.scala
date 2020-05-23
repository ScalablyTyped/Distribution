package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackProperty extends js.Object {
  /**
    * The type of distributed denial of service (DDoS) event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
    */
  var AttackLayer: js.UndefOr[typings.awsSdk.shieldMod.AttackLayer] = js.native
  /**
    * Defines the DDoS attack property information that is provided. The WORDPRESS_PINGBACK_REFLECTOR and WORDPRESS_PINGBACK_SOURCE values are valid only for WordPress reflective pingback DDoS attacks.
    */
  var AttackPropertyIdentifier: js.UndefOr[typings.awsSdk.shieldMod.AttackPropertyIdentifier] = js.native
  /**
    * The array of Contributor objects that includes the top five contributors to an attack. 
    */
  var TopContributors: js.UndefOr[typings.awsSdk.shieldMod.TopContributors] = js.native
  /**
    * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
    */
  var Total: js.UndefOr[Long] = js.native
  /**
    * The unit of the Value of the contributions.
    */
  var Unit: js.UndefOr[typings.awsSdk.shieldMod.Unit] = js.native
}

object AttackProperty {
  @scala.inline
  def apply(
    AttackLayer: AttackLayer = null,
    AttackPropertyIdentifier: AttackPropertyIdentifier = null,
    TopContributors: TopContributors = null,
    Total: js.UndefOr[Long] = js.undefined,
    Unit: Unit = null
  ): AttackProperty = {
    val __obj = js.Dynamic.literal()
    if (AttackLayer != null) __obj.updateDynamic("AttackLayer")(AttackLayer.asInstanceOf[js.Any])
    if (AttackPropertyIdentifier != null) __obj.updateDynamic("AttackPropertyIdentifier")(AttackPropertyIdentifier.asInstanceOf[js.Any])
    if (TopContributors != null) __obj.updateDynamic("TopContributors")(TopContributors.asInstanceOf[js.Any])
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total.get.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackProperty]
  }
}

