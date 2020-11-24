package typings.betterSqlite3.mod

import typings.integer.mod.IntLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunResult extends js.Object {
  
  var changes: Double = js.native
  
  var lastInsertRowid: IntLike = js.native
}
object RunResult {
  
  @scala.inline
  def apply(changes: Double, lastInsertRowid: IntLike): RunResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  
  @scala.inline
  implicit class RunResultOps[Self <: RunResult] (val x: Self) extends AnyVal {
    
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
    def setChanges(value: Double): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastInsertRowid(value: IntLike): Self = this.set("lastInsertRowid", value.asInstanceOf[js.Any])
  }
}
