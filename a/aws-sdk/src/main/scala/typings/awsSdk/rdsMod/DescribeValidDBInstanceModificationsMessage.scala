package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeValidDBInstanceModificationsMessage extends StObject {
  
  /**
    * The customer identifier or the ARN of your DB instance. 
    */
  var DBInstanceIdentifier: String
}
object DescribeValidDBInstanceModificationsMessage {
  
  inline def apply(DBInstanceIdentifier: String): DescribeValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsMessage]
  }
  
  extension [Self <: DescribeValidDBInstanceModificationsMessage](x: Self) {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
  }
}
