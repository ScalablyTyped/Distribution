package typings.blueprintjsCore.htmlTableMod

import typings.blueprintjsCore.propsMod.IElementRefProps
import typings.react.mod.TableHTMLAttributes
import typings.std.HTMLTableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLTableProps
  extends TableHTMLAttributes[HTMLTableElement]
     with IElementRefProps[HTMLTableElement] {
  
  /** Enables borders between rows and cells. */
  var bordered: js.UndefOr[Boolean] = js.native
  
  /** Use small, condensed appearance. */
  var condensed: js.UndefOr[Boolean] = js.native
  
  /** Enables hover styles on row. */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Use small, condensed appearance for this element and all child elements.
    * @deprecated
    */
  var small: js.UndefOr[Boolean] = js.native
  
  /** Use an alternate background color on odd rows. */
  var striped: js.UndefOr[Boolean] = js.native
}
object IHTMLTableProps {
  
  @scala.inline
  def apply(): IHTMLTableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHTMLTableProps]
  }
  
  @scala.inline
  implicit class IHTMLTablePropsOps[Self <: IHTMLTableProps] (val x: Self) extends AnyVal {
    
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
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
    
    @scala.inline
    def setCondensed(value: Boolean): Self = this.set("condensed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondensed: Self = this.set("condensed", js.undefined)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setSmall(value: Boolean): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmall: Self = this.set("small", js.undefined)
    
    @scala.inline
    def setStriped(value: Boolean): Self = this.set("striped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStriped: Self = this.set("striped", js.undefined)
  }
}
