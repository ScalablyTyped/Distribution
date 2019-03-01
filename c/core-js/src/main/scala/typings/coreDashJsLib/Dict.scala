package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// Dict - https://github.com/zloirock/core-js/#dict
// Modules: core.dict
// #############################################################################################
trait Dict[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]
     with /* key */ org.scalablytyped.runtime.NumberDictionary[T]

object Dict {
  @scala.inline
  def apply[T](
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[T] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null
  ): Dict[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dict[T]]
  }
}

