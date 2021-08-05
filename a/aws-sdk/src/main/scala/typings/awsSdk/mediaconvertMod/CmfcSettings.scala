package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmfcSettings extends StObject {
  
  /**
    * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC XML (sccXml).
    */
  var Scte35Esam: js.UndefOr[CmfcScte35Esam] = js.undefined
  
  /**
    * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't want those SCTE-35 markers in this output.
    */
  var Scte35Source: js.UndefOr[CmfcScte35Source] = js.undefined
}
object CmfcSettings {
  
  inline def apply(): CmfcSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmfcSettings]
  }
  
  extension [Self <: CmfcSettings](x: Self) {
    
    inline def setScte35Esam(value: CmfcScte35Esam): Self = StObject.set(x, "Scte35Esam", value.asInstanceOf[js.Any])
    
    inline def setScte35EsamUndefined: Self = StObject.set(x, "Scte35Esam", js.undefined)
    
    inline def setScte35Source(value: CmfcScte35Source): Self = StObject.set(x, "Scte35Source", value.asInstanceOf[js.Any])
    
    inline def setScte35SourceUndefined: Self = StObject.set(x, "Scte35Source", js.undefined)
  }
}
