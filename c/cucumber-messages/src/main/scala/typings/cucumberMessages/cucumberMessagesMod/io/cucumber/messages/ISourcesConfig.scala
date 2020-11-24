package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourcesConfig. */
@js.native
trait ISourcesConfig extends js.Object {
  
  /** SourcesConfig absolutePaths */
  var absolutePaths: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** SourcesConfig filters */
  var filters: js.UndefOr[ISourcesFilterConfig | Null] = js.native
  
  /** SourcesConfig language */
  var language: js.UndefOr[String | Null] = js.native
  
  /** SourcesConfig order */
  var order: js.UndefOr[ISourcesOrder | Null] = js.native
}
object ISourcesConfig {
  
  @scala.inline
  def apply(): ISourcesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesConfig]
  }
  
  @scala.inline
  implicit class ISourcesConfigOps[Self <: ISourcesConfig] (val x: Self) extends AnyVal {
    
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
    def setAbsolutePathsVarargs(value: String*): Self = this.set("absolutePaths", js.Array(value :_*))
    
    @scala.inline
    def setAbsolutePaths(value: js.Array[String]): Self = this.set("absolutePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolutePaths: Self = this.set("absolutePaths", js.undefined)
    
    @scala.inline
    def setAbsolutePathsNull: Self = this.set("absolutePaths", null)
    
    @scala.inline
    def setFilters(value: ISourcesFilterConfig): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setFiltersNull: Self = this.set("filters", null)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
    
    @scala.inline
    def setOrder(value: ISourcesOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setOrderNull: Self = this.set("order", null)
  }
}
