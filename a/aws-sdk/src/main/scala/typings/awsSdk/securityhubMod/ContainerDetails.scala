package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDetails extends StObject {
  
  /**
    * The identifier of the image related to a finding.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the image related to a finding.
    */
  var ImageName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the container started. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the container related to a finding.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object ContainerDetails {
  
  @scala.inline
  def apply(): ContainerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDetails]
  }
  
  @scala.inline
  implicit class ContainerDetailsMutableBuilder[Self <: ContainerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageId(value: NonEmptyString): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setImageName(value: NonEmptyString): Self = StObject.set(x, "ImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageNameUndefined: Self = StObject.set(x, "ImageName", js.undefined)
    
    @scala.inline
    def setLaunchedAt(value: NonEmptyString): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
