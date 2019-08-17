package typings.atAwsDashSdkBuildDashTypes.buildSmokeTestModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmokeTestModel extends js.Object {
  /**
    * The region to use should no alternative be supplied via the test runner's execution environment.
    */
  var defaultRegion: String
  var testCases: js.Array[SmokeTestCase]
  /**
    * The version of smoke test document.
    */
  var version: Double
}

object SmokeTestModel {
  @scala.inline
  def apply(defaultRegion: String, testCases: js.Array[SmokeTestCase], version: Double): SmokeTestModel = {
    val __obj = js.Dynamic.literal(defaultRegion = defaultRegion, testCases = testCases, version = version)
  
    __obj.asInstanceOf[SmokeTestModel]
  }
}

