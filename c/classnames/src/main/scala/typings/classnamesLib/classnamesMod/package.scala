package typings
package classnamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object classnamesMod {
  // This is the only way I found to break circular references between ClassArray and ClassValue
  // https://github.com/Microsoft/TypeScript/issues/3496#issuecomment-128553540
  type ClassArray = js.Array[classnamesLib.ClassValue]
  type ClassDictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
}
