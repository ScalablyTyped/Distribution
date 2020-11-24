package typings.blueprintjsTable.loadableContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILoadableContentProps extends js.Object {
  
  /**
    * If true, render a skeleton. Otherwise render the single, non-string child passed to this
    * component.
    */
  var loading: Boolean = js.native
  
  /**
    * If true, show a skeleton of random width (25-75% cell width) when rendering the loading state.
    * @default false
    */
  var variableLength: js.UndefOr[Boolean] = js.native
}
object ILoadableContentProps {
  
  @scala.inline
  def apply(loading: Boolean): ILoadableContentProps = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoadableContentProps]
  }
  
  @scala.inline
  implicit class ILoadableContentPropsOps[Self <: ILoadableContentProps] (val x: Self) extends AnyVal {
    
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableLength(value: Boolean): Self = this.set("variableLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableLength: Self = this.set("variableLength", js.undefined)
  }
}
