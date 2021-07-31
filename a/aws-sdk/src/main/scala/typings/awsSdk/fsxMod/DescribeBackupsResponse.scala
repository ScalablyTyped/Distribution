package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBackupsResponse extends StObject {
  
  /**
    * Any array of backups.
    */
  var Backups: js.UndefOr[typings.awsSdk.fsxMod.Backups] = js.undefined
  
  /**
    * This is present if there are more backups than returned in the response (String). You can use the NextToken value in the later request to fetch the backups. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.fsxMod.NextToken] = js.undefined
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
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
