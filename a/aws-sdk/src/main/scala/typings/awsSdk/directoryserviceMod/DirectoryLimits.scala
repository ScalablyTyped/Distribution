package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectoryLimits extends StObject {
  
  /**
    * The current number of cloud directories in the Region.
    */
  var CloudOnlyDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined
  
  /**
    * The maximum number of cloud directories allowed in the Region.
    */
  var CloudOnlyDirectoriesLimit: js.UndefOr[Limit] = js.undefined
  
  /**
    * Indicates if the cloud directory limit has been reached.
    */
  var CloudOnlyDirectoriesLimitReached: js.UndefOr[typings.awsSdk.directoryserviceMod.CloudOnlyDirectoriesLimitReached] = js.undefined
  
  /**
    * The current number of AWS Managed Microsoft AD directories in the region.
    */
  var CloudOnlyMicrosoftADCurrentCount: js.UndefOr[Limit] = js.undefined
  
  /**
    * The maximum number of AWS Managed Microsoft AD directories allowed in the region.
    */
  var CloudOnlyMicrosoftADLimit: js.UndefOr[Limit] = js.undefined
  
  /**
    * Indicates if the AWS Managed Microsoft AD directory limit has been reached.
    */
  var CloudOnlyMicrosoftADLimitReached: js.UndefOr[CloudOnlyDirectoriesLimitReached] = js.undefined
  
  /**
    * The current number of connected directories in the Region.
    */
  var ConnectedDirectoriesCurrentCount: js.UndefOr[Limit] = js.undefined
  
  /**
    * The maximum number of connected directories allowed in the Region.
    */
  var ConnectedDirectoriesLimit: js.UndefOr[Limit] = js.undefined
  
  /**
    * Indicates if the connected directory limit has been reached.
    */
  var ConnectedDirectoriesLimitReached: js.UndefOr[typings.awsSdk.directoryserviceMod.ConnectedDirectoriesLimitReached] = js.undefined
}
object DirectoryLimits {
  
  @scala.inline
  def apply(): DirectoryLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryLimits]
  }
  
  @scala.inline
  implicit class DirectoryLimitsMutableBuilder[Self <: DirectoryLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudOnlyDirectoriesCurrentCount(value: Limit): Self = StObject.set(x, "CloudOnlyDirectoriesCurrentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnlyDirectoriesCurrentCountUndefined: Self = StObject.set(x, "CloudOnlyDirectoriesCurrentCount", js.undefined)
    
    @scala.inline
    def setCloudOnlyDirectoriesLimit(value: Limit): Self = StObject.set(x, "CloudOnlyDirectoriesLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnlyDirectoriesLimitReached(value: CloudOnlyDirectoriesLimitReached): Self = StObject.set(x, "CloudOnlyDirectoriesLimitReached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnlyDirectoriesLimitReachedUndefined: Self = StObject.set(x, "CloudOnlyDirectoriesLimitReached", js.undefined)
    
    @scala.inline
    def setCloudOnlyDirectoriesLimitUndefined: Self = StObject.set(x, "CloudOnlyDirectoriesLimit", js.undefined)
    
    @scala.inline
    def setCloudOnlyMicrosoftADCurrentCount(value: Limit): Self = StObject.set(x, "CloudOnlyMicrosoftADCurrentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnlyMicrosoftADCurrentCountUndefined: Self = StObject.set(x, "CloudOnlyMicrosoftADCurrentCount", js.undefined)
    
    @scala.inline
    def setCloudOnlyMicrosoftADLimit(value: Limit): Self = StObject.set(x, "CloudOnlyMicrosoftADLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnlyMicrosoftADLimitReached(value: CloudOnlyDirectoriesLimitReached): Self = StObject.set(x, "CloudOnlyMicrosoftADLimitReached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudOnlyMicrosoftADLimitReachedUndefined: Self = StObject.set(x, "CloudOnlyMicrosoftADLimitReached", js.undefined)
    
    @scala.inline
    def setCloudOnlyMicrosoftADLimitUndefined: Self = StObject.set(x, "CloudOnlyMicrosoftADLimit", js.undefined)
    
    @scala.inline
    def setConnectedDirectoriesCurrentCount(value: Limit): Self = StObject.set(x, "ConnectedDirectoriesCurrentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedDirectoriesCurrentCountUndefined: Self = StObject.set(x, "ConnectedDirectoriesCurrentCount", js.undefined)
    
    @scala.inline
    def setConnectedDirectoriesLimit(value: Limit): Self = StObject.set(x, "ConnectedDirectoriesLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedDirectoriesLimitReached(value: ConnectedDirectoriesLimitReached): Self = StObject.set(x, "ConnectedDirectoriesLimitReached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedDirectoriesLimitReachedUndefined: Self = StObject.set(x, "ConnectedDirectoriesLimitReached", js.undefined)
    
    @scala.inline
    def setConnectedDirectoriesLimitUndefined: Self = StObject.set(x, "ConnectedDirectoriesLimit", js.undefined)
  }
}
