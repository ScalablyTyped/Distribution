package typings
package classnamesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object classnamesMod {
  type ClassDictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ClassNamesExport = ClassNamesFn with classnamesLib.Anon_Default
  // tslint:disable-line no-empty-interface
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, java.lang.String]
  type ClassValue = js.UndefOr[
    java.lang.String | scala.Double | ClassDictionary | ClassArray | scala.Null | scala.Boolean
  ]
}
