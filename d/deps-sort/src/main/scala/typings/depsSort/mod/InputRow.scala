package typings.depsSort.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input objects are file objects in the module-deps shape. They must at least have these properties:
  */
@js.native
trait InputRow extends js.Object {
  
  /**
    * dependencies for this file, mapping strings as used in require() to row IDs
    */
  var deps: js.Array[String] = js.native
  
  /**
    * a unique identifier for the file
    */
  var id: String = js.native
  
  /**
    * the file contents
    */
  var source: String = js.native
}
object InputRow {
  
  @scala.inline
  def apply(deps: js.Array[String], id: String, source: String): InputRow = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRow]
  }
  
  @scala.inline
  implicit class InputRowOps[Self <: InputRow] (val x: Self) extends AnyVal {
    
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
    def setDepsVarargs(value: String*): Self = this.set("deps", js.Array(value :_*))
    
    @scala.inline
    def setDeps(value: js.Array[String]): Self = this.set("deps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
