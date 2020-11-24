package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourcesFilterConfig. */
@js.native
trait ISourcesFilterConfig extends js.Object {
  
  /** SourcesFilterConfig nameRegularExpressions */
  var nameRegularExpressions: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** SourcesFilterConfig tagExpression */
  var tagExpression: js.UndefOr[String | Null] = js.native
  
  /** SourcesFilterConfig uriToLinesMapping */
  var uriToLinesMapping: js.UndefOr[js.Array[IUriToLinesMapping] | Null] = js.native
}
object ISourcesFilterConfig {
  
  @scala.inline
  def apply(): ISourcesFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesFilterConfig]
  }
  
  @scala.inline
  implicit class ISourcesFilterConfigOps[Self <: ISourcesFilterConfig] (val x: Self) extends AnyVal {
    
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
    def setNameRegularExpressionsVarargs(value: String*): Self = this.set("nameRegularExpressions", js.Array(value :_*))
    
    @scala.inline
    def setNameRegularExpressions(value: js.Array[String]): Self = this.set("nameRegularExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameRegularExpressions: Self = this.set("nameRegularExpressions", js.undefined)
    
    @scala.inline
    def setNameRegularExpressionsNull: Self = this.set("nameRegularExpressions", null)
    
    @scala.inline
    def setTagExpression(value: String): Self = this.set("tagExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagExpression: Self = this.set("tagExpression", js.undefined)
    
    @scala.inline
    def setTagExpressionNull: Self = this.set("tagExpression", null)
    
    @scala.inline
    def setUriToLinesMappingVarargs(value: IUriToLinesMapping*): Self = this.set("uriToLinesMapping", js.Array(value :_*))
    
    @scala.inline
    def setUriToLinesMapping(value: js.Array[IUriToLinesMapping]): Self = this.set("uriToLinesMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUriToLinesMapping: Self = this.set("uriToLinesMapping", js.undefined)
    
    @scala.inline
    def setUriToLinesMappingNull: Self = this.set("uriToLinesMapping", null)
  }
}
