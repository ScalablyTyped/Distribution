package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchOptions extends js.Object {
  /**
       * 	Ensures this operation is persisted to this many nodes.
       */
  var persist_to: js.UndefOr[scala.Double] = js.undefined
  /**
       * Ensures this operation is replicated to this many nodes.
       */
  var replicate_to: js.UndefOr[scala.Double] = js.undefined
}

