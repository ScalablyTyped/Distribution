package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityUnitsConfiguration extends js.Object {
  /**
    * The amount of extra query capacity for an index. Each capacity unit provides 0.5 queries per second and 40,000 queries per day.
    */
  var QueryCapacityUnits: QueryCapacityUnit = js.native
  /**
    * The amount of extra storage capacity for an index. Each capacity unit provides 150 Gb of storage space or 500,000 documents, whichever is reached first.
    */
  var StorageCapacityUnits: StorageCapacityUnit = js.native
}

object CapacityUnitsConfiguration {
  @scala.inline
  def apply(QueryCapacityUnits: QueryCapacityUnit, StorageCapacityUnits: StorageCapacityUnit): CapacityUnitsConfiguration = {
    val __obj = js.Dynamic.literal(QueryCapacityUnits = QueryCapacityUnits.asInstanceOf[js.Any], StorageCapacityUnits = StorageCapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityUnitsConfiguration]
  }
}

