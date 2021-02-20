package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterOptionGroupStatus extends StObject {
  
  /**
    * Specifies the name of the DB cluster option group.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the status of the DB cluster option group.
    */
  var Status: js.UndefOr[String] = js.native
}
object DBClusterOptionGroupStatus {
  
  @scala.inline
  def apply(): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
  
  @scala.inline
  implicit class DBClusterOptionGroupStatusMutableBuilder[Self <: DBClusterOptionGroupStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterOptionGroupName(value: String): Self = StObject.set(x, "DBClusterOptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterOptionGroupNameUndefined: Self = StObject.set(x, "DBClusterOptionGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
