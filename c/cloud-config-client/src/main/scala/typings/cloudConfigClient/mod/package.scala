package typings.cloudConfigClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigSource = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LoadCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* config */ js.UndefOr[typings.cloudConfigClient.mod.Config], 
    scala.Unit
  ]
}
