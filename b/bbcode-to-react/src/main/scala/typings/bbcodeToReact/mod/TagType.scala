package typings.bbcodeToReact.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface for class member in "Tag"
  */
@js.native
trait TagType extends js.Object {
  
  /**
    * The children of a tag object, with type ReactNode array
    */
  var children: js.Array[ReactNode] = js.native
  
  /**
    * Tag name, with type string
    */
  var name: String = js.native
  
  /**
    * A "params" object for inner processing
    */
  var params: js.Object = js.native
  
  /**
    * The parent of a tag object, with type ReactNode
    */
  var parent: ReactNode = js.native
  
  /**
    * The inner text of a tag object, with type string
    */
  var text: String = js.native
}
object TagType {
  
  @scala.inline
  def apply(children: js.Array[ReactNode], name: String, params: js.Object, text: String): TagType = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagType]
  }
  
  @scala.inline
  implicit class TagTypeOps[Self <: TagType] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ReactNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: ReactNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
