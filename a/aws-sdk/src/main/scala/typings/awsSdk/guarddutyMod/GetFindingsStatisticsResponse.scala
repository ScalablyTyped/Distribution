package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsStatisticsResponse extends js.Object {
  /**
    * Finding statistics object.
    */
  var FindingStatistics: typings.awsSdk.guarddutyMod.FindingStatistics = js.native
}

object GetFindingsStatisticsResponse {
  @scala.inline
  def apply(FindingStatistics: FindingStatistics): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal(FindingStatistics = FindingStatistics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
}

