package typings.browserResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncOpts = typings.resolve.mod.AsyncOpts with typings.browserResolve.mod.Opts
  /**
    * Callback invoked when resolving asynchronously
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type Callback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* resolved */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type SyncOpts = typings.resolve.mod.SyncOpts with typings.browserResolve.mod.Opts
}
