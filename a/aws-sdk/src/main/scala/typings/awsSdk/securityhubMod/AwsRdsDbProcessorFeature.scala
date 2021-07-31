package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbProcessorFeature extends StObject {
  
  /**
    * 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbProcessorFeature {
  
  @scala.inline
  def apply(): AwsRdsDbProcessorFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbProcessorFeature]
  }
  
  @scala.inline
  implicit class AwsRdsDbProcessorFeatureMutableBuilder[Self <: AwsRdsDbProcessorFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
