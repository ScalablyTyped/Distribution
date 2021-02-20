package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreDBInstanceFromS3Result extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.rdsMod.DBInstance] = js.native
}
object RestoreDBInstanceFromS3Result {
  
  @scala.inline
  def apply(): RestoreDBInstanceFromS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceFromS3Result]
  }
  
  @scala.inline
  implicit class RestoreDBInstanceFromS3ResultMutableBuilder[Self <: RestoreDBInstanceFromS3Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
