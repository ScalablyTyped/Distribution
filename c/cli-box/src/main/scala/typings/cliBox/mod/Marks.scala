package typings.cliBox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<cli-box.cli-box.MarksKeys, string> */
@js.native
trait Marks extends js.Object {
  
  var b: String = js.native
  
  var e: String = js.native
  
  var n: String = js.native
  
  @JSName("ne")
  var ne_FMarks: String = js.native
  
  var nw: String = js.native
  
  var s: String = js.native
  
  var se: String = js.native
  
  var sw: String = js.native
  
  var w: String = js.native
}
object Marks {
  
  @scala.inline
  def apply(
    b: String,
    e: String,
    n: String,
    ne: String,
    nw: String,
    s: String,
    se: String,
    sw: String,
    w: String
  ): Marks = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marks]
  }
  
  @scala.inline
  implicit class MarksOps[Self <: Marks] (val x: Self) extends AnyVal {
    
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
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNe(value: String): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNw(value: String): Self = this.set("nw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSe(value: String): Self = this.set("se", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSw(value: String): Self = this.set("sw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: String): Self = this.set("w", value.asInstanceOf[js.Any])
  }
}
