package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleStep
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Pickle. */
@js.native
trait IPickle extends StObject {
  
  /**
    * Points to the AST node locations of the pickle. The last one represents the unique
    * id of the pickle. A pickle constructed from `Examples` will have the first
    * id originating from the `Scenario` AST node, and the second from the `TableRow` AST node.
    */
  var astNodeIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /**
    * A unique id for the pickle. This is a [SHA1](https://en.wikipedia.org/wiki/SHA-1) hash
    * from the source data and the `locations` of the pickle.
    * This ID will change if source the file is modified.
    */
  var id: js.UndefOr[String | Null] = js.native
  
  /** Pickle language */
  var language: js.UndefOr[String | Null] = js.native
  
  /** Pickle name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** Pickle steps */
  var steps: js.UndefOr[js.Array[IPickleStep] | Null] = js.native
  
  /**
    * One or more tags. If this pickle is constructed from a Gherkin document,
    * It includes inherited tags from the `Feature` as well.
    */
  var tags: js.UndefOr[js.Array[IPickleTag] | Null] = js.native
  
  /** Pickle uri */
  var uri: js.UndefOr[String | Null] = js.native
}
object IPickle {
  
  @scala.inline
  def apply(): IPickle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickle]
  }
  
  @scala.inline
  implicit class IPickleMutableBuilder[Self <: IPickle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAstNodeIds(value: js.Array[String]): Self = StObject.set(x, "astNodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNodeIdsNull: Self = StObject.set(x, "astNodeIds", null)
    
    @scala.inline
    def setAstNodeIdsUndefined: Self = StObject.set(x, "astNodeIds", js.undefined)
    
    @scala.inline
    def setAstNodeIdsVarargs(value: String*): Self = StObject.set(x, "astNodeIds", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageNull: Self = StObject.set(x, "language", null)
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSteps(value: js.Array[IPickleStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsNull: Self = StObject.set(x, "steps", null)
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: IPickleStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[IPickleTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsNull: Self = StObject.set(x, "tags", null)
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: IPickleTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriNull: Self = StObject.set(x, "uri", null)
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
