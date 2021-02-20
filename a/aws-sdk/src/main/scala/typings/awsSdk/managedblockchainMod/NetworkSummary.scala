package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkSummary extends StObject {
  
  /**
    * The date and time that the network was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * An optional description of the network.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The blockchain framework that the network uses.
    */
  var Framework: js.UndefOr[typings.awsSdk.managedblockchainMod.Framework] = js.native
  
  /**
    * The version of the blockchain framework that the network uses.
    */
  var FrameworkVersion: js.UndefOr[FrameworkVersionString] = js.native
  
  /**
    * The unique identifier of the network.
    */
  var Id: js.UndefOr[ResourceIdString] = js.native
  
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * The current status of the network.
    */
  var Status: js.UndefOr[NetworkStatus] = js.native
}
object NetworkSummary {
  
  @scala.inline
  def apply(): NetworkSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkSummary]
  }
  
  @scala.inline
  implicit class NetworkSummaryMutableBuilder[Self <: NetworkSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFramework(value: Framework): Self = StObject.set(x, "Framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "Framework", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: FrameworkVersionString): Self = StObject.set(x, "FrameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkVersionUndefined: Self = StObject.set(x, "FrameworkVersion", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: NetworkStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
