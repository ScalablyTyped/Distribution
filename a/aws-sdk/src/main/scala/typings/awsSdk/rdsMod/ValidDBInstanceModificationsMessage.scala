package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidDBInstanceModificationsMessage extends StObject {
  
  /**
    * Valid storage options for your DB instance. 
    */
  var Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined
  
  /**
    * Valid processor features for your DB instance. 
    */
  var ValidProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
}
object ValidDBInstanceModificationsMessage {
  
  @scala.inline
  def apply(): ValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
  }
  
  @scala.inline
  implicit class ValidDBInstanceModificationsMessageMutableBuilder[Self <: ValidDBInstanceModificationsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorage(value: ValidStorageOptionsList): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
    @scala.inline
    def setStorageVarargs(value: ValidStorageOptions*): Self = StObject.set(x, "Storage", js.Array(value :_*))
    
    @scala.inline
    def setValidProcessorFeatures(value: AvailableProcessorFeatureList): Self = StObject.set(x, "ValidProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidProcessorFeaturesUndefined: Self = StObject.set(x, "ValidProcessorFeatures", js.undefined)
    
    @scala.inline
    def setValidProcessorFeaturesVarargs(value: AvailableProcessorFeature*): Self = StObject.set(x, "ValidProcessorFeatures", js.Array(value :_*))
  }
}
