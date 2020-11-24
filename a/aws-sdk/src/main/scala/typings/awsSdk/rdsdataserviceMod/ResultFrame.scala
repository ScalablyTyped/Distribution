package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultFrame extends js.Object {
  
  /**
    * The records in the result set.
    */
  var records: js.UndefOr[Records] = js.native
  
  /**
    * The result-set metadata in the result set.
    */
  var resultSetMetadata: js.UndefOr[ResultSetMetadata] = js.native
}
object ResultFrame {
  
  @scala.inline
  def apply(): ResultFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultFrame]
  }
  
  @scala.inline
  implicit class ResultFrameOps[Self <: ResultFrame] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: Record*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: Records): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
    
    @scala.inline
    def setResultSetMetadata(value: ResultSetMetadata): Self = this.set("resultSetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSetMetadata: Self = this.set("resultSetMetadata", js.undefined)
  }
}
