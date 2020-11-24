package typings.cssDeclarationSorter.mod

import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`-1`
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`0`
import typings.cssDeclarationSorter.cssDeclarationSorterNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * To prevent breaking legacy CSS where shorthand declarations override longhand declarations
    * (also taking into account vendor prefixes) this option can enabled.
    * For example `animation-name: some; animation: greeting;` will be kept in this order when `keepOverrides` is `true`.
    */
  var keepOverrides: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide the name of one of the built-in sort orders or a comparison function that is passed to `Array.sort`.
    * @default 'alphabetical'
    */
  var order: js.UndefOr[SortOrder | SortFunction] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeepOverrides(value: Boolean): Self = this.set("keepOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOverrides: Self = this.set("keepOverrides", js.undefined)
    
    @scala.inline
    def setOrderFunction2(value: (/* aProp */ String, /* bProp */ String) => `-1` | `0` | `1`): Self = this.set("order", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOrder(value: SortOrder | SortFunction): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
