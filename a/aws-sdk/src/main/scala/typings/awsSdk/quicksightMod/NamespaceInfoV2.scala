package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceInfoV2 extends StObject {
  
  /**
    * The namespace ARN.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The namespace AWS Region.
    */
  var CapacityRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The creation status of a namespace that is not yet completely created.
    */
  var CreationStatus: js.UndefOr[NamespaceStatus] = js.undefined
  
  /**
    * The identity store used for the namespace.
    */
  var IdentityStore: js.UndefOr[typings.awsSdk.quicksightMod.IdentityStore] = js.undefined
  
  /**
    * The name of the error.
    */
  var Name: js.UndefOr[Namespace] = js.undefined
  
  /**
    * An error that occurred when the namespace was created.
    */
  var NamespaceError: js.UndefOr[typings.awsSdk.quicksightMod.NamespaceError] = js.undefined
}
object NamespaceInfoV2 {
  
  @scala.inline
  def apply(): NamespaceInfoV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceInfoV2]
  }
  
  @scala.inline
  implicit class NamespaceInfoV2MutableBuilder[Self <: NamespaceInfoV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCapacityRegion(value: String): Self = StObject.set(x, "CapacityRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityRegionUndefined: Self = StObject.set(x, "CapacityRegion", js.undefined)
    
    @scala.inline
    def setCreationStatus(value: NamespaceStatus): Self = StObject.set(x, "CreationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationStatusUndefined: Self = StObject.set(x, "CreationStatus", js.undefined)
    
    @scala.inline
    def setIdentityStore(value: IdentityStore): Self = StObject.set(x, "IdentityStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityStoreUndefined: Self = StObject.set(x, "IdentityStore", js.undefined)
    
    @scala.inline
    def setName(value: Namespace): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNamespaceError(value: NamespaceError): Self = StObject.set(x, "NamespaceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceErrorUndefined: Self = StObject.set(x, "NamespaceError", js.undefined)
  }
}
