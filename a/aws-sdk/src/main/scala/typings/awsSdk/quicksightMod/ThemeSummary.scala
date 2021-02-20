package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The date and time that this theme was created.
    */
  var CreatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The last date and time that this theme was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp_] = js.native
  
  /**
    * The latest version number for the theme. 
    */
  var LatestVersionNumber: js.UndefOr[VersionNumber] = js.native
  
  /**
    * the display name for the theme.
    */
  var Name: js.UndefOr[ThemeName] = js.native
  
  /**
    * The ID of the theme. This ID is unique per AWS Region for each AWS account.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.native
}
object ThemeSummary {
  
  @scala.inline
  def apply(): ThemeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeSummary]
  }
  
  @scala.inline
  implicit class ThemeSummaryMutableBuilder[Self <: ThemeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Timestamp_): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp_): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setLatestVersionNumber(value: VersionNumber): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
    
    @scala.inline
    def setName(value: ThemeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeIdUndefined: Self = StObject.set(x, "ThemeId", js.undefined)
  }
}
