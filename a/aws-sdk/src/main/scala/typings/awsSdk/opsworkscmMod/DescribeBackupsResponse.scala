package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupsResponse extends StObject {
  
  /**
    * Contains the response to a DescribeBackups request. 
    */
  var Backups: js.UndefOr[typings.awsSdk.opsworkscmMod.Backups] = js.undefined
  
  /**
    * This is not currently implemented for DescribeBackups requests.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeBackupsResponse {
  
  @scala.inline
  def apply(): DescribeBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBackupsResponse]
  }
  
  @scala.inline
  implicit class DescribeBackupsResponseMutableBuilder[Self <: DescribeBackupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackups(value: Backups): Self = StObject.set(x, "Backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupsUndefined: Self = StObject.set(x, "Backups", js.undefined)
    
    @scala.inline
    def setBackupsVarargs(value: Backup*): Self = StObject.set(x, "Backups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
