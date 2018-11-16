package typings
package commonDashTagsLib.commonDashTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TemplateTransformer extends js.Object {
  var onEndResult: js.UndefOr[js.Function1[/* endResult */ java.lang.String, java.lang.String]] = js.undefined
  var onSubstitution: js.UndefOr[
    js.Function2[
      /* substitution */ java.lang.String, 
      /* resultSoFar */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
}

