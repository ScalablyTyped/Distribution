package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object classnamesLib {
  type ClassNamesExport = ClassNamesFn with Anon_Classes
  // tslint:disable-line no-empty-interface
  type ClassNamesFn = js.Function1[/* repeated */ ClassValue, java.lang.String]
  type ClassValue = js.UndefOr[
    java.lang.String | scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ClassDictionary */ js.Any) | scala.Null | scala.Boolean
  ]
}
