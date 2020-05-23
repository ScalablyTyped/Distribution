package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProviderStrategyItem extends js.Object {
  /**
    * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
    */
  var base: js.UndefOr[CapacityProviderStrategyItemBase] = js.native
  /**
    * The short name of the capacity provider.
    */
  var capacityProvider: String = js.native
  /**
    * The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. For example, if you have a strategy that contains two capacity providers and both have a weight of 1, then when the base is satisfied, the tasks will be split evenly across the two capacity providers. Using that same logic, if you specify a weight of 1 for capacityProviderA and a weight of 4 for capacityProviderB, then for every one task that is run using capacityProviderA, four tasks would use capacityProviderB.
    */
  var weight: js.UndefOr[CapacityProviderStrategyItemWeight] = js.native
}

object CapacityProviderStrategyItem {
  @scala.inline
  def apply(
    capacityProvider: String,
    base: js.UndefOr[CapacityProviderStrategyItemBase] = js.undefined,
    weight: js.UndefOr[CapacityProviderStrategyItemWeight] = js.undefined
  ): CapacityProviderStrategyItem = {
    val __obj = js.Dynamic.literal(capacityProvider = capacityProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProviderStrategyItem]
  }
}

