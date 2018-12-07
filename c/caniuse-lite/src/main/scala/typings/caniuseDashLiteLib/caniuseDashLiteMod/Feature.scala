package typings
package caniuseDashLiteLib.caniuseDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Feature extends js.Object {
  /**
       * Agent support matrix for this feature.
       */
  var stats: StatsByAgentID
  /**
       * Specification status of the feature.
       */
  var status: FeatureStatus
  /**
       * Descriptive title of the feature.
       */
  var title: java.lang.String
}

