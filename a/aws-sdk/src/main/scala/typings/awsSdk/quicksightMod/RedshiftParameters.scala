package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftParameters extends StObject {
  
  /**
    * Cluster ID. This field can be blank if the Host and Port are provided.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.quicksightMod.ClusterId] = js.native
  
  /**
    * Database.
    */
  var Database: typings.awsSdk.quicksightMod.Database = js.native
  
  /**
    * Host. This field can be blank if ClusterId is provided.
    */
  var Host: js.UndefOr[typings.awsSdk.quicksightMod.Host] = js.native
  
  /**
    * Port. This field can be blank if the ClusterId is provided.
    */
  var Port: js.UndefOr[OptionalPort] = js.native
}
object RedshiftParameters {
  
  @scala.inline
  def apply(Database: Database): RedshiftParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftParameters]
  }
  
  @scala.inline
  implicit class RedshiftParametersMutableBuilder[Self <: RedshiftParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
    
    @scala.inline
    def setPort(value: OptionalPort): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
