package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.CommissioningDate
import typings.consumerDataStandards.anon.ExportLimitKva
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyDerRecord
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var acConnections: js.Array[CommissioningDate]
  
  /**
    * Approved small generating unit capacity as agreed with NSP in the connection agreement, expressed in kVA. Value of 0 indicates no DER record exists for the given servicePointId
    */
  var approvedCapacity: Double
  
  /**
    * The number of phases available for the installation of DER. Acceptable values are 0, 1, 2 or 3. Value of 0 indicates no DER record exists for the given servicePointId
    */
  var availablePhasesCount: Double
  
  /**
    * For DER installations where NSPs specify the need for additional forms of protection above those inbuilt in an inverter.  If absent then assumed to be false
    */
  var hasCentralProtectionControl: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of phases that DER is connected to. Acceptable values are 0, 1, 2 or 3. Value of 0 indicates no DER record exists for the given servicePointId
    */
  var installedPhasesCount: Double
  
  /**
    * For identification of small generating units designed with the ability to operate in an islanded mode
    */
  var islandableInstallation: Boolean
  
  /**
    * Required only when the hasCentralProtectionAndControl flag is set to true.  One or more of the object fields will be provided to describe the protection modes in place
    */
  var protectionMode: js.UndefOr[ExportLimitKva | Null] = js.undefined
  
  /**
    * Tokenised ID of the service point to be used for referring to the service point in the CDR API suite.  To be created in accordance with CDR ID permanence requirements
    */
  var servicePointId: String
}
object EnergyDerRecord {
  
  inline def apply(
    acConnections: js.Array[CommissioningDate],
    approvedCapacity: Double,
    availablePhasesCount: Double,
    installedPhasesCount: Double,
    islandableInstallation: Boolean,
    servicePointId: String
  ): EnergyDerRecord = {
    val __obj = js.Dynamic.literal(acConnections = acConnections.asInstanceOf[js.Any], approvedCapacity = approvedCapacity.asInstanceOf[js.Any], availablePhasesCount = availablePhasesCount.asInstanceOf[js.Any], installedPhasesCount = installedPhasesCount.asInstanceOf[js.Any], islandableInstallation = islandableInstallation.asInstanceOf[js.Any], servicePointId = servicePointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyDerRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnergyDerRecord] (val x: Self) extends AnyVal {
    
    inline def setAcConnections(value: js.Array[CommissioningDate]): Self = StObject.set(x, "acConnections", value.asInstanceOf[js.Any])
    
    inline def setAcConnectionsVarargs(value: CommissioningDate*): Self = StObject.set(x, "acConnections", js.Array(value*))
    
    inline def setApprovedCapacity(value: Double): Self = StObject.set(x, "approvedCapacity", value.asInstanceOf[js.Any])
    
    inline def setAvailablePhasesCount(value: Double): Self = StObject.set(x, "availablePhasesCount", value.asInstanceOf[js.Any])
    
    inline def setHasCentralProtectionControl(value: Boolean): Self = StObject.set(x, "hasCentralProtectionControl", value.asInstanceOf[js.Any])
    
    inline def setHasCentralProtectionControlNull: Self = StObject.set(x, "hasCentralProtectionControl", null)
    
    inline def setHasCentralProtectionControlUndefined: Self = StObject.set(x, "hasCentralProtectionControl", js.undefined)
    
    inline def setInstalledPhasesCount(value: Double): Self = StObject.set(x, "installedPhasesCount", value.asInstanceOf[js.Any])
    
    inline def setIslandableInstallation(value: Boolean): Self = StObject.set(x, "islandableInstallation", value.asInstanceOf[js.Any])
    
    inline def setProtectionMode(value: ExportLimitKva): Self = StObject.set(x, "protectionMode", value.asInstanceOf[js.Any])
    
    inline def setProtectionModeNull: Self = StObject.set(x, "protectionMode", null)
    
    inline def setProtectionModeUndefined: Self = StObject.set(x, "protectionMode", js.undefined)
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
  }
}
