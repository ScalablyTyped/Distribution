package typings.backbone.backboneMod

import typings.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("$")
  var $: JQueryStatic = js.native
  var emulateHTTP: Boolean = js.native
  var emulateJSON: Boolean = js.native
  var history: History = js.native
}

