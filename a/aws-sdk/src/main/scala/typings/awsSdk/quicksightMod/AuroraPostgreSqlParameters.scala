package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuroraPostgreSqlParameters extends StObject {
  
  /**
    * Database.
    */
  var Database: typings.awsSdk.quicksightMod.Database = js.native
  
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host = js.native
  
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port = js.native
}
object AuroraPostgreSqlParameters {
  
  @scala.inline
  def apply(Database: Database, Host: Host, Port: Port): AuroraPostgreSqlParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuroraPostgreSqlParameters]
  }
  
  @scala.inline
  implicit class AuroraPostgreSqlParametersMutableBuilder[Self <: AuroraPostgreSqlParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
