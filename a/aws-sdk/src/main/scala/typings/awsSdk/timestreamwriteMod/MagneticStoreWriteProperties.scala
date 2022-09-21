package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MagneticStoreWriteProperties extends StObject {
  
  /**
    * A flag to enable magnetic store writes.
    */
  var EnableMagneticStoreWrites: Boolean
  
  /**
    * The location to write error reports for records rejected asynchronously during magnetic store writes.
    */
  var MagneticStoreRejectedDataLocation: js.UndefOr[typings.awsSdk.timestreamwriteMod.MagneticStoreRejectedDataLocation] = js.undefined
}
object MagneticStoreWriteProperties {
  
  inline def apply(EnableMagneticStoreWrites: Boolean): MagneticStoreWriteProperties = {
    val __obj = js.Dynamic.literal(EnableMagneticStoreWrites = EnableMagneticStoreWrites.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStoreWriteProperties]
  }
  
  extension [Self <: MagneticStoreWriteProperties](x: Self) {
    
    inline def setEnableMagneticStoreWrites(value: Boolean): Self = StObject.set(x, "EnableMagneticStoreWrites", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreRejectedDataLocation(value: MagneticStoreRejectedDataLocation): Self = StObject.set(x, "MagneticStoreRejectedDataLocation", value.asInstanceOf[js.Any])
    
    inline def setMagneticStoreRejectedDataLocationUndefined: Self = StObject.set(x, "MagneticStoreRejectedDataLocation", js.undefined)
  }
}
