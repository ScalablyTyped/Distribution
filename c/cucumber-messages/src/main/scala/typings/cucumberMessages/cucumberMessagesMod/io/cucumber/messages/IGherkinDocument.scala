package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GherkinDocument. */
trait IGherkinDocument extends StObject {
  
  /** GherkinDocument comments */
  var comments: js.UndefOr[js.Array[IComment] | Null] = js.undefined
  
  /** GherkinDocument feature */
  var feature: js.UndefOr[IFeature | Null] = js.undefined
  
  /**
    * The [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)
    * of the source, typically a file path relative to the root directory
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object IGherkinDocument {
  
  @scala.inline
  def apply(): IGherkinDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGherkinDocument]
  }
  
  @scala.inline
  implicit class IGherkinDocumentMutableBuilder[Self <: IGherkinDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[IComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: IComment*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setFeature(value: IFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriNull: Self = StObject.set(x, "uri", null)
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
