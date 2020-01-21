package typings.browserfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemMod {
  type BFSCallback[T] = js.Function2[
    /* e */ js.UndefOr[typings.browserfs.apiErrorMod.ApiError | scala.Null], 
    /* rv */ js.UndefOr[T], 
    js.Any
  ]
  type BFSOneArgCallback = js.Function1[/* e */ js.UndefOr[typings.browserfs.apiErrorMod.ApiError | scala.Null], js.Any]
  type BFSThreeArgCallback[T, U] = js.Function3[
    /* e */ js.UndefOr[typings.browserfs.apiErrorMod.ApiError | scala.Null], 
    /* arg1 */ js.UndefOr[T], 
    /* arg2 */ js.UndefOr[U], 
    js.Any
  ]
  type FileSystemOptions = org.scalablytyped.runtime.StringDictionary[typings.browserfs.fileSystemMod.FileSystemOption[js.Any]]
}
