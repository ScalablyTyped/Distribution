package typings.creativebulmaBulmaTagsinput.mod

import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@creativebulma/bulma-tagsinput", JSImport.Default)
@js.native
class default protected () extends BulmaTagsInput {
  /**
    * @param selector query string returning a single Node or directly a Node
    */
  def this(selector: String) = this()
  def this(selector: HTMLInputElement) = this()
  def this(selector: String, options: BulmaTagsInputOptions) = this()
  def this(selector: HTMLInputElement, options: BulmaTagsInputOptions) = this()
}
/* static members */
@JSImport("@creativebulma/bulma-tagsinput", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * DOM modifications will be observed to detect any new element responding to the given selector
    * to automatically instantiate BulmaTagsInput on them with the given option.
    *
    * @param selector selector can be a query string returning a single Node or a NodeList, directly
    * a Node or a NodeList
    */
  def attach(selector: String): BulmaTagsInput = js.native
  def attach(selector: String, options: BulmaTagsInputOptions): BulmaTagsInput = js.native
  def attach(selector: HTMLInputElement): BulmaTagsInput = js.native
  def attach(selector: HTMLInputElement, options: BulmaTagsInputOptions): BulmaTagsInput = js.native
}
