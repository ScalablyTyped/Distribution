package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixLevel extends StObject {
  
  /**
    * A container for the prefix-level storage metrics for S3 Storage Lens.
    */
  var StorageMetrics: PrefixLevelStorageMetrics
}
object PrefixLevel {
  
  inline def apply(StorageMetrics: PrefixLevelStorageMetrics): PrefixLevel = {
    val __obj = js.Dynamic.literal(StorageMetrics = StorageMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixLevel]
  }
  
  extension [Self <: PrefixLevel](x: Self) {
    
    inline def setStorageMetrics(value: PrefixLevelStorageMetrics): Self = StObject.set(x, "StorageMetrics", value.asInstanceOf[js.Any])
  }
}
