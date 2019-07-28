package typings

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreDashJs {
  // #############################################################################################
  // Dict - https://github.com/zloirock/core-js/#dict
  // Modules: core.dict
  // #############################################################################################
  type Dict[T] = StringDictionary[js.UndefOr[T]] with NumberDictionary[js.UndefOr[T]]
}
