package typings
package commonDashTagsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonDashTagsMod {
  type JSTag = js.Function2[/* literals */ stdLib.TemplateStringsArray, /* repeated */js.Any, java.lang.String]
  type PluginFunction = js.Function2[
    /* oldValue */ java.lang.String, 
    /* newValue */ java.lang.String, 
    TemplateTransformer[js.Any]
  ]
}
