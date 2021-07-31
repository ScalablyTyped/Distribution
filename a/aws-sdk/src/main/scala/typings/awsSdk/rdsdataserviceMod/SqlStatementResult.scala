package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlStatementResult extends StObject {
  
  /**
    * The number of records updated by a SQL statement.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined
  
  /**
    * The result set of the SQL statement.
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.undefined
}
object SqlStatementResult {
  
  @scala.inline
  def apply(): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlStatementResult]
  }
  
  @scala.inline
  implicit class SqlStatementResultMutableBuilder[Self <: SqlStatementResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfRecordsUpdated(value: RecordsUpdated): Self = StObject.set(x, "numberOfRecordsUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecordsUpdatedUndefined: Self = StObject.set(x, "numberOfRecordsUpdated", js.undefined)
    
    @scala.inline
    def setResultFrame(value: ResultFrame): Self = StObject.set(x, "resultFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultFrameUndefined: Self = StObject.set(x, "resultFrame", js.undefined)
  }
}
