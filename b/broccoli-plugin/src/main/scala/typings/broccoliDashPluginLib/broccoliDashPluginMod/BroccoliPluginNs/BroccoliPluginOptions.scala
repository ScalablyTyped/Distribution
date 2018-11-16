package typings
package broccoliDashPluginLib.broccoliDashPluginMod.BroccoliPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BroccoliPluginOptions extends js.Object {
  /**
           * A descriptive annotation. Useful for debugging, to tell multiple
           * instances of the same plugin apart.
           */
  var annotation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The name of this plugin. Defaults to `this.constructor.name`.
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If `true`, a cache directory is created automatically and the path is
           * set at `cachePath`. If `false`, a cache directory is not created and
           * `this.cachePath` is `undefined`. Defaults to `true`.
           */
  var needsCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If `true`, the output directory is not automatically emptied between
           * builds. Defaults to `false`.
           */
  var persistentOutput: js.UndefOr[scala.Boolean] = js.undefined
}

