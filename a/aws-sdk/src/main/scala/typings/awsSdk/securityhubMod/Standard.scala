package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Standard extends StObject {
  
  /**
    * A description of the standard.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the standard is enabled by default. When Security Hub is enabled from the console, if a standard is enabled by default, the check box for that standard is selected by default. When Security Hub is enabled using the EnableSecurityHub API operation, the standard is enabled by default unless EnableDefaultStandards is set to false.
    */
  var EnabledByDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the standard.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of a standard.
    */
  var StandardsArn: js.UndefOr[NonEmptyString] = js.native
}
object Standard {
  
  @scala.inline
  def apply(): Standard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Standard]
  }
  
  @scala.inline
  implicit class StandardMutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnabledByDefault(value: Boolean): Self = StObject.set(x, "EnabledByDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledByDefaultUndefined: Self = StObject.set(x, "EnabledByDefault", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStandardsArn(value: NonEmptyString): Self = StObject.set(x, "StandardsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsArnUndefined: Self = StObject.set(x, "StandardsArn", js.undefined)
  }
}
