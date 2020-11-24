package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleStep
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Pickle. */
@js.native
trait IPickle extends js.Object {
  
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
  implicit class IPickleOps[Self <: IPickle] (val x: Self) extends AnyVal {
    
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
    def setAstNodeIdsVarargs(value: String*): Self = this.set("astNodeIds", js.Array(value :_*))
    
    @scala.inline
    def setAstNodeIds(value: js.Array[String]): Self = this.set("astNodeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAstNodeIds: Self = this.set("astNodeIds", js.undefined)
    
    @scala.inline
    def setAstNodeIdsNull: Self = this.set("astNodeIds", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setStepsVarargs(value: IPickleStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[IPickleStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setStepsNull: Self = this.set("steps", null)
    
    @scala.inline
    def setTagsVarargs(value: IPickleTag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[IPickleTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTagsNull: Self = this.set("tags", null)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUriNull: Self = this.set("uri", null)
  }
}
