package typings.commonTags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JSTag = js.Function2[
    /* literals */ typings.std.TemplateStringsArray, 
    /* repeated */ js.Any, 
    java.lang.String
  ]
  type PluginFunction = js.Function2[
    /* oldValue */ java.lang.String, 
    /* newValue */ java.lang.String, 
    typings.commonTags.mod.TemplateTransformer[js.Any]
  ]
}
