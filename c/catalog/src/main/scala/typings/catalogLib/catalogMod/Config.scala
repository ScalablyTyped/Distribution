package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var imports: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var logoSrc: js.UndefOr[java.lang.String] = js.undefined
  var pages: js.Array[ConfigPageOrGroup]
  var responsiveSizes: js.UndefOr[js.Array[ConfigResponsiveSize]] = js.undefined
  var scripts: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var theme: js.UndefOr[stdLib.Partial[Theme]] = js.undefined
  var title: java.lang.String
  var useBrowserHistory: js.UndefOr[scala.Boolean] = js.undefined
}

