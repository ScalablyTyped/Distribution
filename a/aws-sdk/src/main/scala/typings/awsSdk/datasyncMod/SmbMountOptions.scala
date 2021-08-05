package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmbMountOptions extends StObject {
  
  /**
    * The specific SMB version that you want DataSync to use to mount your SMB share. If you don't specify a version, DataSync defaults to AUTOMATIC. That is, DataSync automatically selects a version based on negotiation with the SMB server.
    */
  var Version: js.UndefOr[SmbVersion] = js.undefined
}
object SmbMountOptions {
  
  inline def apply(): SmbMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmbMountOptions]
  }
  
  extension [Self <: SmbMountOptions](x: Self) {
    
    inline def setVersion(value: SmbVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
