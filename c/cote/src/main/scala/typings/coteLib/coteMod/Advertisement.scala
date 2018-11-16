package typings
package coteLib.coteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Advertisement extends js.Object {
  /**
       * Tunes the performance by grouping certain components. Two components
       * with exact same `environment`s with different `key`s wouldn't be able
       * to communicate. Think of it as `${environment}_${key}`.
       */
  var key: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  /**
       * Maps to a socket.io namespace. Shields a service from the rest of the
       * system. Components with different namespaces won't recognize each other
       * and try to communicate.
       */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
}

