package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRestrictions extends StObject {
  
  /**
    * An array of strings that specify the compute types that are allowed for the batch build. See Build environment compute types in the AWS CodeBuild User Guide for these values. 
    */
  var computeTypesAllowed: js.UndefOr[ComputeTypesAllowed] = js.native
  
  /**
    * Specifies the maximum number of builds allowed.
    */
  var maximumBuildsAllowed: js.UndefOr[WrapperInt] = js.native
}
object BatchRestrictions {
  
  @scala.inline
  def apply(): BatchRestrictions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchRestrictions]
  }
  
  @scala.inline
  implicit class BatchRestrictionsMutableBuilder[Self <: BatchRestrictions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeTypesAllowed(value: ComputeTypesAllowed): Self = StObject.set(x, "computeTypesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputeTypesAllowedUndefined: Self = StObject.set(x, "computeTypesAllowed", js.undefined)
    
    @scala.inline
    def setComputeTypesAllowedVarargs(value: NonEmptyString*): Self = StObject.set(x, "computeTypesAllowed", js.Array(value :_*))
    
    @scala.inline
    def setMaximumBuildsAllowed(value: WrapperInt): Self = StObject.set(x, "maximumBuildsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBuildsAllowedUndefined: Self = StObject.set(x, "maximumBuildsAllowed", js.undefined)
  }
}
