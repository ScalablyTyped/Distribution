package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.GherkinDocument.IFeature
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
  
  inline def apply(): IGherkinDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGherkinDocument]
  }
  
  extension [Self <: IGherkinDocument](x: Self) {
    
    inline def setComments(value: js.Array[IComment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: IComment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setFeature(value: IFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
