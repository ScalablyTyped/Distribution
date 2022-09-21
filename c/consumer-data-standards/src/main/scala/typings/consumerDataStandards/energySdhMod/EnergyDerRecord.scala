package typings.consumerDataStandards.energySdhMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.CommissioningDate
import typings.consumerDataStandards.anon.ExportLimitkva
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyDerRecord
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var acConnections: js.Array[CommissioningDate]
  
  /**
    * Approved small generating unit capacity as agreed with NSP in the connection agreement, expressed in kVA
    */
  var approvedCapacity: Double
  
  /**
    * The number of phases available for the installation of DER
    */
  var availablePhasesCount: Double
  
  /**
    * For DER installations where NSPs specify the need for additional forms of protection above those inbuilt in an inverter.  If absent then assumed to be false
    */
  var hasCentralProtectionControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of phases that DER is connected to
    */
  var installedPhasesCount: Double
  
  /**
    * For identification of small generating units designed with the ability to operate in an islanded mode
    */
  var islandableInstallation: String
  
  /**
    * Required only when the hasCentralProtectionAndControl flag is set to true.  One or more of the object fields will be provided to describe the protection modes in place
    */
  var protectionMode: js.UndefOr[ExportLimitkva | Null] = js.undefined
  
  /**
    * The independent ID of the service point, known in the industry as the National Meter Identifier (NMI). Note that the servicePointId will be replaced with NMI for all interactions between Data Holder and AEMO.
    */
  var servicePointId: String
}
object EnergyDerRecord {
  
  inline def apply(
    acConnections: js.Array[CommissioningDate],
    approvedCapacity: Double,
    availablePhasesCount: Double,
    installedPhasesCount: Double,
    islandableInstallation: String,
    servicePointId: String
  ): EnergyDerRecord = {
    val __obj = js.Dynamic.literal(acConnections = acConnections.asInstanceOf[js.Any], approvedCapacity = approvedCapacity.asInstanceOf[js.Any], availablePhasesCount = availablePhasesCount.asInstanceOf[js.Any], installedPhasesCount = installedPhasesCount.asInstanceOf[js.Any], islandableInstallation = islandableInstallation.asInstanceOf[js.Any], servicePointId = servicePointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyDerRecord]
  }
  
  extension [Self <: EnergyDerRecord](x: Self) {
    
    inline def setAcConnections(value: js.Array[CommissioningDate]): Self = StObject.set(x, "acConnections", value.asInstanceOf[js.Any])
    
    inline def setAcConnectionsVarargs(value: CommissioningDate*): Self = StObject.set(x, "acConnections", js.Array(value*))
    
    inline def setApprovedCapacity(value: Double): Self = StObject.set(x, "approvedCapacity", value.asInstanceOf[js.Any])
    
    inline def setAvailablePhasesCount(value: Double): Self = StObject.set(x, "availablePhasesCount", value.asInstanceOf[js.Any])
    
    inline def setHasCentralProtectionControl(value: Boolean): Self = StObject.set(x, "hasCentralProtectionControl", value.asInstanceOf[js.Any])
    
    inline def setHasCentralProtectionControlNull: Self = StObject.set(x, "hasCentralProtectionControl", null)
    
    inline def setHasCentralProtectionControlUndefined: Self = StObject.set(x, "hasCentralProtectionControl", js.undefined)
    
    inline def setInstalledPhasesCount(value: Double): Self = StObject.set(x, "installedPhasesCount", value.asInstanceOf[js.Any])
    
    inline def setIslandableInstallation(value: String): Self = StObject.set(x, "islandableInstallation", value.asInstanceOf[js.Any])
    
    inline def setProtectionMode(value: ExportLimitkva): Self = StObject.set(x, "protectionMode", value.asInstanceOf[js.Any])
    
    inline def setProtectionModeNull: Self = StObject.set(x, "protectionMode", null)
    
    inline def setProtectionModeUndefined: Self = StObject.set(x, "protectionMode", js.undefined)
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
  }
}
