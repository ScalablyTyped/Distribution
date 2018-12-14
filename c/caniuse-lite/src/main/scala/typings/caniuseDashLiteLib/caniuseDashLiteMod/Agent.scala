package typings
package caniuseDashLiteLib.caniuseDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Agent extends js.Object {
  /**
       * The agent's name
       */
  var browser: java.lang.String
  /**
       * The agents vendor prefix
       */
  var prefix: java.lang.String
  /**
       * Exceptions to vendor prefix use.
       */
  var prefix_exceptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  /**
       * Release dates as seconds since epoch by version.
       */
  var release_date: org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  /**
       * Global agent usage by version
       */
  var usage_global: UsageByVersion
  /**
       * Version matrix. See [caniuse](https://caniuse.com)
       */
  var versions: js.Array[js.Any]
}

