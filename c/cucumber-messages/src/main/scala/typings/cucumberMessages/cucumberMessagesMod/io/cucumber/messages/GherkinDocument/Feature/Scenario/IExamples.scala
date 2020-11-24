package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITableRow
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Examples. */
@js.native
trait IExamples extends js.Object {
  
  /** Examples description */
  var description: js.UndefOr[String | Null] = js.native
  
  /** Examples keyword */
  var keyword: js.UndefOr[String | Null] = js.native
  
  /** Examples location */
  var location: js.UndefOr[ILocation | Null] = js.native
  
  /** Examples name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Examples tableBody */
  var tableBody: js.UndefOr[js.Array[ITableRow] | Null] = js.native
  
  /** Examples tableHeader */
  var tableHeader: js.UndefOr[ITableRow | Null] = js.native
  
  /** Examples tags */
  var tags: js.UndefOr[js.Array[ITag] | Null] = js.native
}
object IExamples {
  
  @scala.inline
  def apply(): IExamples = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExamples]
  }
  
  @scala.inline
  implicit class IExamplesOps[Self <: IExamples] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setTableBodyVarargs(value: ITableRow*): Self = this.set("tableBody", js.Array(value :_*))
    
    @scala.inline
    def setTableBody(value: js.Array[ITableRow]): Self = this.set("tableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBody: Self = this.set("tableBody", js.undefined)
    
    @scala.inline
    def setTableBodyNull: Self = this.set("tableBody", null)
    
    @scala.inline
    def setTableHeader(value: ITableRow): Self = this.set("tableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeader: Self = this.set("tableHeader", js.undefined)
    
    @scala.inline
    def setTableHeaderNull: Self = this.set("tableHeader", null)
    
    @scala.inline
    def setTagsVarargs(value: ITag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[ITag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
  }
}
