package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.rdsMod.DBInstance] = js.undefined
}
object StartDBInstanceResult {
  
  @scala.inline
  def apply(): StartDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDBInstanceResult]
  }
  
  @scala.inline
  implicit class StartDBInstanceResultMutableBuilder[Self <: StartDBInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
