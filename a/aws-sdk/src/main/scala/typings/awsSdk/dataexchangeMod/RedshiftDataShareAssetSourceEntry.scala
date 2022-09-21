package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDataShareAssetSourceEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the datashare asset.
    */
  var DataShareArn: string
}
object RedshiftDataShareAssetSourceEntry {
  
  inline def apply(DataShareArn: string): RedshiftDataShareAssetSourceEntry = {
    val __obj = js.Dynamic.literal(DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDataShareAssetSourceEntry]
  }
  
  extension [Self <: RedshiftDataShareAssetSourceEntry](x: Self) {
    
    inline def setDataShareArn(value: string): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
  }
}
