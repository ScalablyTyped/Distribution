package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionAccessPointReport extends StObject {
  
  /**
    * The alias for the Multi-Region Access Point. For more information about the distinction between the name and the alias of an Multi-Region Access Point, see Managing Multi-Region Access Points.
    */
  var Alias: js.UndefOr[MultiRegionAccessPointAlias] = js.undefined
  
  /**
    * When the Multi-Region Access Point create request was received.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Multi-Region Access Point.
    */
  var Name: js.UndefOr[MultiRegionAccessPointName] = js.undefined
  
  var PublicAccessBlock: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
  
  /**
    * A collection of the Regions and buckets associated with the Multi-Region Access Point.
    */
  var Regions: js.UndefOr[RegionReportList] = js.undefined
  
  /**
    * The current status of the Multi-Region Access Point.  CREATING and DELETING are temporary states that exist while the request is propogating and being completed. If a Multi-Region Access Point has a status of PARTIALLY_CREATED, you can retry creation or send a request to delete the Multi-Region Access Point. If a Multi-Region Access Point has a status of PARTIALLY_DELETED, you can retry a delete request to finish the deletion of the Multi-Region Access Point.
    */
  var Status: js.UndefOr[MultiRegionAccessPointStatus] = js.undefined
}
object MultiRegionAccessPointReport {
  
  inline def apply(): MultiRegionAccessPointReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionAccessPointReport]
  }
  
  extension [Self <: MultiRegionAccessPointReport](x: Self) {
    
    inline def setAlias(value: MultiRegionAccessPointAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setName(value: MultiRegionAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPublicAccessBlock(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlock", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockUndefined: Self = StObject.set(x, "PublicAccessBlock", js.undefined)
    
    inline def setRegions(value: RegionReportList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    inline def setRegionsVarargs(value: RegionReport*): Self = StObject.set(x, "Regions", js.Array(value*))
    
    inline def setStatus(value: MultiRegionAccessPointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
