package typings.createHtmlElement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Options = typings.createHtmlElement.mod.BaseOptions with (typings.typeFest.mod.MergeExclusive[
    typings.createHtmlElement.mod.HtmlOptions, 
    typings.createHtmlElement.mod.TextOptions
  ])
}
