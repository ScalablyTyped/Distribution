package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ParameterType. */
@js.native
trait IParameterType extends js.Object {
  
  /** ParameterType name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** ParameterType preferForRegularExpressionMatch */
  var preferForRegularExpressionMatch: js.UndefOr[Boolean | Null] = js.native
  
  /** ParameterType regularExpressions */
  var regularExpressions: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ParameterType useForSnippets */
  var useForSnippets: js.UndefOr[Boolean | Null] = js.native
}
object IParameterType {
  
  @scala.inline
  def apply(): IParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParameterType]
  }
  
  @scala.inline
  implicit class IParameterTypeOps[Self <: IParameterType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setPreferForRegularExpressionMatch(value: Boolean): Self = this.set("preferForRegularExpressionMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferForRegularExpressionMatch: Self = this.set("preferForRegularExpressionMatch", js.undefined)
    
    @scala.inline
    def setPreferForRegularExpressionMatchNull: Self = this.set("preferForRegularExpressionMatch", null)
    
    @scala.inline
    def setRegularExpressionsVarargs(value: String*): Self = this.set("regularExpressions", js.Array(value :_*))
    
    @scala.inline
    def setRegularExpressions(value: js.Array[String]): Self = this.set("regularExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegularExpressions: Self = this.set("regularExpressions", js.undefined)
    
    @scala.inline
    def setRegularExpressionsNull: Self = this.set("regularExpressions", null)
    
    @scala.inline
    def setUseForSnippets(value: Boolean): Self = this.set("useForSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseForSnippets: Self = this.set("useForSnippets", js.undefined)
    
    @scala.inline
    def setUseForSnippetsNull: Self = this.set("useForSnippets", null)
  }
}
