package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Pickle.IPickleStep
import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Pickle.IPickleTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Pickle. */
trait IPickle extends StObject {
  
  /**
    * Points to the AST node locations of the pickle. The last one represents the unique
    * id of the pickle. A pickle constructed from `Examples` will have the first
    * id originating from the `Scenario` AST node, and the second from the `TableRow` AST node.
    */
  var astNodeIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique id for the pickle. This is a [SHA1](https://en.wikipedia.org/wiki/SHA-1) hash
    * from the source data and the `locations` of the pickle.
    * This ID will change if source the file is modified.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** Pickle language */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /** Pickle name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Pickle steps */
  var steps: js.UndefOr[js.Array[IPickleStep] | Null] = js.undefined
  
  /**
    * One or more tags. If this pickle is constructed from a Gherkin document,
    * It includes inherited tags from the `Feature` as well.
    */
  var tags: js.UndefOr[js.Array[IPickleTag] | Null] = js.undefined
  
  /** Pickle uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object IPickle {
  
  inline def apply(): IPickle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPickle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPickle] (val x: Self) extends AnyVal {
    
    inline def setAstNodeIds(value: js.Array[String]): Self = StObject.set(x, "astNodeIds", value.asInstanceOf[js.Any])
    
    inline def setAstNodeIdsNull: Self = StObject.set(x, "astNodeIds", null)
    
    inline def setAstNodeIdsUndefined: Self = StObject.set(x, "astNodeIds", js.undefined)
    
    inline def setAstNodeIdsVarargs(value: String*): Self = StObject.set(x, "astNodeIds", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSteps(value: js.Array[IPickleStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsNull: Self = StObject.set(x, "steps", null)
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: IPickleStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTags(value: js.Array[IPickleTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: IPickleTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
