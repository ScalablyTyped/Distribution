package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeValidDBInstanceModificationsResult extends StObject {
  
  var ValidDBInstanceModificationsMessage: js.UndefOr[typings.awsSdk.rdsMod.ValidDBInstanceModificationsMessage] = js.undefined
}
object DescribeValidDBInstanceModificationsResult {
  
  @scala.inline
  def apply(): DescribeValidDBInstanceModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsResult]
  }
  
  @scala.inline
  implicit class DescribeValidDBInstanceModificationsResultMutableBuilder[Self <: DescribeValidDBInstanceModificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidDBInstanceModificationsMessage(value: ValidDBInstanceModificationsMessage): Self = StObject.set(x, "ValidDBInstanceModificationsMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidDBInstanceModificationsMessageUndefined: Self = StObject.set(x, "ValidDBInstanceModificationsMessage", js.undefined)
  }
}
