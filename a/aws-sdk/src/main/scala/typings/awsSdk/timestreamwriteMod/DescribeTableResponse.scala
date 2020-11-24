package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTableResponse extends js.Object {
  
  /**
    * The Timestream table.
    */
  var Table: js.UndefOr[typings.awsSdk.timestreamwriteMod.Table] = js.native
}
object DescribeTableResponse {
  
  @scala.inline
  def apply(): DescribeTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTableResponse]
  }
  
  @scala.inline
  implicit class DescribeTableResponseOps[Self <: DescribeTableResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTable(value: Table): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
  }
}
