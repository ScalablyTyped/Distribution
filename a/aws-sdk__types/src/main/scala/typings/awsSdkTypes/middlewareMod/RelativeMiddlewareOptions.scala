package typings.awsSdkTypes.middlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @aws-sdk/types.@aws-sdk/types/dist/cjs/middleware.RelativeLocation & std.Omit<@aws-sdk/types.@aws-sdk/types/dist/cjs/middleware.HandlerOptions, 'step'> */
@js.native
trait RelativeMiddlewareOptions extends js.Object {
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specify the relation to be before or after a know middleware.
    */
  var relation: Relation = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A known middleware name to indicate inserting middleware's location.
    */
  var toMiddleware: String = js.native
}
object RelativeMiddlewareOptions {
  
  @scala.inline
  def apply(relation: Relation, toMiddleware: String): RelativeMiddlewareOptions = {
    val __obj = js.Dynamic.literal(relation = relation.asInstanceOf[js.Any], toMiddleware = toMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeMiddlewareOptions]
  }
  
  @scala.inline
  implicit class RelativeMiddlewareOptionsOps[Self <: RelativeMiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setRelation(value: Relation): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToMiddleware(value: String): Self = this.set("toMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
