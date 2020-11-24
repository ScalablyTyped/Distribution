package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDataTable
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDocString
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Step. */
@js.native
trait IStep extends js.Object {
  
  /** Step dataTable */
  var dataTable: js.UndefOr[IDataTable | Null] = js.native
  
  /** Step docString */
  var docString: js.UndefOr[IDocString | Null] = js.native
  
  /** Step id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** Step keyword */
  var keyword: js.UndefOr[String | Null] = js.native
  
  /** Step location */
  var location: js.UndefOr[ILocation | Null] = js.native
  
  /** Step text */
  var text: js.UndefOr[String | Null] = js.native
}
object IStep {
  
  @scala.inline
  def apply(): IStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStep]
  }
  
  @scala.inline
  implicit class IStepOps[Self <: IStep] (val x: Self) extends AnyVal {
    
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
    def setDataTable(value: IDataTable): Self = this.set("dataTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataTable: Self = this.set("dataTable", js.undefined)
    
    @scala.inline
    def setDataTableNull: Self = this.set("dataTable", null)
    
    @scala.inline
    def setDocString(value: IDocString): Self = this.set("docString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocString: Self = this.set("docString", js.undefined)
    
    @scala.inline
    def setDocStringNull: Self = this.set("docString", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    
    @scala.inline
    def setKeywordNull: Self = this.set("keyword", null)
    
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
}
