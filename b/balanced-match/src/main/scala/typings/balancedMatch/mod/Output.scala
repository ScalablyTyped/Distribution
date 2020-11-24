package typings.balancedMatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends js.Object {
  
  /**
    * The match, a and b not included
    */
  var body: String = js.native
  
  /**
    * The index of the matching b
    */
  var end: Double = js.native
  
  /**
    * The postscript, a and b not included
    */
  var post: String = js.native
  
  /**
    * The preamble, a and b not included
    */
  var pre: String = js.native
  
  /**
    * The index of the first match of a
    */
  var start: Double = js.native
}
object Output {
  
  @scala.inline
  def apply(body: String, end: Double, post: String, pre: String, start: Double): Output = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    
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
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost(value: String): Self = this.set("post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPre(value: String): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
