package typings.createHtmlElement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Options = typings.createHtmlElement.mod.BaseOptions with (typings.typeFest.mergeExclusiveMod.MergeExclusive[
    typings.createHtmlElement.mod.HtmlOptions, 
    typings.createHtmlElement.mod.TextOptions
  ])
}
