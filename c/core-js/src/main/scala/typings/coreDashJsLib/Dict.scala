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
  extends /* key */ ScalablyTyped.runtime.StringDictionary[T]
     with /* key */ ScalablyTyped.runtime.NumberDictionary[T]

