package typings.browserfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNodeCoreFileUnderscoreSystemMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError

  type BFSCallback[T] = js.Function2[/* e */ js.UndefOr[ApiError | Null], /* rv */ js.UndefOr[T], js.Any]
  type BFSOneArgCallback = js.Function1[/* e */ js.UndefOr[ApiError | Null], js.Any]
  type BFSThreeArgCallback[T, U] = js.Function3[
    /* e */ js.UndefOr[ApiError | Null], 
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[U], 
    js.Any
  ]
  type FileSystemOptions = StringDictionary[FileSystemOption[js.Any]]
}
