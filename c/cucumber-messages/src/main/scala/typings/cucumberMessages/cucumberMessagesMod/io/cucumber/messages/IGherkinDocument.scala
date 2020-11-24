package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GherkinDocument. */
@js.native
trait IGherkinDocument extends js.Object {
  
  /** GherkinDocument comments */
  var comments: js.UndefOr[js.Array[IComment] | Null] = js.native
  
  /** GherkinDocument feature */
  var feature: js.UndefOr[IFeature | Null] = js.native
  
  /**
    * The [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)
    * of the source, typically a file path relative to the root directory
    */
  var uri: js.UndefOr[String | Null] = js.native
}
object IGherkinDocument {
  
  @scala.inline
  def apply(): IGherkinDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGherkinDocument]
  }
  
  @scala.inline
  implicit class IGherkinDocumentOps[Self <: IGherkinDocument] (val x: Self) extends AnyVal {
    
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
    def setCommentsVarargs(value: IComment*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[IComment]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setFeature(value: IFeature): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setFeatureNull: Self = this.set("feature", null)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUriNull: Self = this.set("uri", null)
  }
}
