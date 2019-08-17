package typings.classnames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.classnames.Anon_DefaultClassNamesFn

  type ClassDictionary = StringDictionary[js.Any]
  type ClassNamesExport = ClassNamesFn with Anon_DefaultClassNamesFn
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, String]
  type ClassValue = js.UndefOr[String | Double | ClassDictionary | ClassArray | Null | Boolean]
}
