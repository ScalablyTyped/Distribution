package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreDashJs {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary

  // #############################################################################################
  // Dict - https://github.com/zloirock/core-js/#dict
  // Modules: core.dict
  // #############################################################################################
  type Dict[T] = StringDictionary[js.UndefOr[T]] with NumberDictionary[js.UndefOr[T]]
}
