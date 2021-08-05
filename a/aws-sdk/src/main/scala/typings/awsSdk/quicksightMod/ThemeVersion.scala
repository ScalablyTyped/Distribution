package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.undefined
  
  /**
    * The Amazon QuickSight-defined ID of the theme that a custom theme inherits from. All themes initially inherit from a default QuickSight theme.
    */
  var BaseThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
  
  /**
    * The theme configuration, which contains all the theme display properties.
    */
  var Configuration: js.UndefOr[ThemeConfiguration] = js.undefined
  
  /**
    * The date and time that this theme version was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.undefined
  
  /**
    * The description of the theme.
    */
  var Description: js.UndefOr[VersionDescription] = js.undefined
  
  /**
    * Errors associated with the theme.
    */
  var Errors: js.UndefOr[ThemeErrorList] = js.undefined
  
  /**
    * The status of the theme version.
    */
  var Status: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The version number of the theme.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.undefined
}
object ThemeVersion {
  
  inline def apply(): ThemeVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeVersion]
  }
  
  extension [Self <: ThemeVersion](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setBaseThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "BaseThemeId", value.asInstanceOf[js.Any])
    
    inline def setBaseThemeIdUndefined: Self = StObject.set(x, "BaseThemeId", js.undefined)
    
    inline def setConfiguration(value: ThemeConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDescription(value: VersionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setErrors(value: ThemeErrorList): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: ThemeError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    inline def setStatus(value: ResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVersionNumber(value: VersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "VersionNumber", js.undefined)
  }
}
