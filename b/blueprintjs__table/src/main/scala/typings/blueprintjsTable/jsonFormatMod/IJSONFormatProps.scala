package typings.blueprintjsTable.jsonFormatMod

import typings.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJSONFormatProps extends ITruncatedFormatProps {
  
  @JSName("children")
  var children_IJSONFormatProps: js.UndefOr[js.Any] = js.native
  
  /**
    * By default, we omit stringifying native JavaScript strings since
    * `JSON.stringify` awkwardly adds double-quotes to the display value.
    * This behavior can be turned off by setting this boolean to `false`.
    * @default true
    */
  var omitQuotesOnStrings: js.UndefOr[Boolean] = js.native
  
  /**
    * Optionally specify the stringify method. Default is `JSON.stringify`
    * with 2-space indentation.
    */
  var stringify: js.UndefOr[js.Function1[/* obj */ js.Any, String]] = js.native
}
object IJSONFormatProps {
  
  @scala.inline
  def apply(): IJSONFormatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJSONFormatProps]
  }
  
  @scala.inline
  implicit class IJSONFormatPropsOps[Self <: IJSONFormatProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOmitQuotesOnStrings(value: Boolean): Self = this.set("omitQuotesOnStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitQuotesOnStrings: Self = this.set("omitQuotesOnStrings", js.undefined)
    
    @scala.inline
    def setStringify(value: /* obj */ js.Any => String): Self = this.set("stringify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
  }
}
