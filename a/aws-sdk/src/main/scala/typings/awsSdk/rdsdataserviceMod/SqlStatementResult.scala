package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlStatementResult extends js.Object {
  
  /**
    * The number of records updated by a SQL statement.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.native
  
  /**
    * The result set of the SQL statement.
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.native
}
object SqlStatementResult {
  
  @scala.inline
  def apply(): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlStatementResult]
  }
  
  @scala.inline
  implicit class SqlStatementResultOps[Self <: SqlStatementResult] (val x: Self) extends AnyVal {
    
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
    def setNumberOfRecordsUpdated(value: RecordsUpdated): Self = this.set("numberOfRecordsUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRecordsUpdated: Self = this.set("numberOfRecordsUpdated", js.undefined)
    
    @scala.inline
    def setResultFrame(value: ResultFrame): Self = this.set("resultFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultFrame: Self = this.set("resultFrame", js.undefined)
  }
}
