package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardDetail extends StObject {
  
  /**
    * The configuration details of the shard
    */
  var Configuration: js.UndefOr[ShardConfiguration] = js.undefined
  
  /**
    * The name of the shard
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the shard's snapshot
    */
  var Size: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the shard's snapshot was created
    */
  var SnapshotCreationTime: js.UndefOr[js.Date] = js.undefined
}
object ShardDetail {
  
  inline def apply(): ShardDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardDetail]
  }
  
  extension [Self <: ShardDetail](x: Self) {
    
    inline def setConfiguration(value: ShardConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSnapshotCreationTime(value: js.Date): Self = StObject.set(x, "SnapshotCreationTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreationTimeUndefined: Self = StObject.set(x, "SnapshotCreationTime", js.undefined)
  }
}
