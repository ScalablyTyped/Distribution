package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFindings extends StObject {
  
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.undefined
  
  /**
    * The findings from the image scan.
    */
  var findings: js.UndefOr[ImageScanFindingList] = js.undefined
  
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.undefined
  
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.undefined
}
object ImageScanFindings {
  
  inline def apply(): ImageScanFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindings]
  }
  
  extension [Self <: ImageScanFindings](x: Self) {
    
    inline def setFindingSeverityCounts(value: FindingSeverityCounts): Self = StObject.set(x, "findingSeverityCounts", value.asInstanceOf[js.Any])
    
    inline def setFindingSeverityCountsUndefined: Self = StObject.set(x, "findingSeverityCounts", js.undefined)
    
    inline def setFindings(value: ImageScanFindingList): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: ImageScanFinding*): Self = StObject.set(x, "findings", js.Array(value :_*))
    
    inline def setImageScanCompletedAt(value: ScanTimestamp): Self = StObject.set(x, "imageScanCompletedAt", value.asInstanceOf[js.Any])
    
    inline def setImageScanCompletedAtUndefined: Self = StObject.set(x, "imageScanCompletedAt", js.undefined)
    
    inline def setVulnerabilitySourceUpdatedAt(value: VulnerabilitySourceUpdateTimestamp): Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilitySourceUpdatedAtUndefined: Self = StObject.set(x, "vulnerabilitySourceUpdatedAt", js.undefined)
  }
}
